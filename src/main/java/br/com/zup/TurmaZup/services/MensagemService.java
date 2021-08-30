package br.com.zup.TurmaZup.services;

import br.com.zup.TurmaZup.chat.Chat;
import br.com.zup.TurmaZup.models.MensagemModel;
import br.com.zup.TurmaZup.models.UsuarioModel;
import br.com.zup.TurmaZup.repositories.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MensagemService {
    private MensagemRepository mensagemRepository;
    private UsuarioService usuarioService;

    @Autowired
    public MensagemService(MensagemRepository mensagemRepository, UsuarioService usuarioService) {
        this.mensagemRepository = mensagemRepository;
        this.usuarioService = usuarioService;

    }

     public MensagemModel cadastrarMensagem (String emailOrigem, String emailDestino,MensagemModel mensagem){
        UsuarioModel usuarioOrigem = usuarioService.buscarUsuarioPorEmail(emailOrigem);
         UsuarioModel usuarioDestino = usuarioService.buscarUsuarioPorEmail(emailDestino);
        mensagem.setUsuarioOrigem(usuarioOrigem);
        mensagem.setUsuarioDestino(usuarioDestino);
        mensagem.setDataDeEnvio(LocalDateTime.now());
        mensagem.setVisualizado(false);

        return mensagemRepository.save(mensagem);


    }

    public List<MensagemModel> filtrarMengensPor(String emailUsuario, Boolean visualizado){
        if(emailUsuario != null){
            return mensagemRepository.findAllByUsuarioDestinoEmailContains(emailUsuario);
        }if(visualizado != null){
            return mensagemRepository.findAllByVisualizado(visualizado);
        }

        return (List<MensagemModel>) mensagemRepository.findAll();
    }
}
