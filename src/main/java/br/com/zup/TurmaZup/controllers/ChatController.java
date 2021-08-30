package br.com.zup.TurmaZup.controllers;

import br.com.zup.TurmaZup.dtos.ChatDto;
import br.com.zup.TurmaZup.dtos.MensagemDto;
import br.com.zup.TurmaZup.dtos.MensagemEmResumoDto;
import br.com.zup.TurmaZup.models.MensagemModel;
import br.com.zup.TurmaZup.services.MensagemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("chat")
public class ChatController {

    @Autowired
    MensagemService mensagemService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping()
    public MensagemDto cadastrarMensagem(@RequestBody @Valid ChatDto chatDto) {
        MensagemModel mensagem = chatDto.converterDTOemMensagem();
        mensagem = mensagemService.cadastrarMensagem(chatDto.getOrigem(), chatDto.getDestino(), mensagem);
        return MensagemDto.converterModelParaDTO(mensagem);
    }

    @GetMapping("/usuario/perfil/{emailUsuario}")
    public List<MensagemEmResumoDto.MensagemResumoDto> pesquisarMensagens(@PathVariable String emailUsuario,
                                                                          @RequestParam(required = false) Boolean visualizado){
        List<MensagemModel> mensagens = mensagemService.filtrarMengensPor(emailUsuario, visualizado);
        List<MensagemEmResumoDto.MensagemResumoDto> mensagemResumoDtos = mensagens.stream()
                .map(mensagem -> modelMapper.map(mensagem, MensagemEmResumoDto.MensagemResumoDto.class)).collect(Collectors.toList());
        return mensagemResumoDtos;
    }

}
