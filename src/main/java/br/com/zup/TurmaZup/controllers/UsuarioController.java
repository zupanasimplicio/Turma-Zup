package br.com.zup.TurmaZup.controllers;

import br.com.zup.TurmaZup.dtos.CadastroUsuarioDTO;
import br.com.zup.TurmaZup.models.UsuarioModel;
import br.com.zup.TurmaZup.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel cadastrarContato(@RequestBody @Valid CadastroUsuarioDTO contato){
        UsuarioModel UsuarioModel = contato.converterDTOEmContatoModel();
        return usuarioService.salvarContato(UsuarioModel);

        }
    @GetMapping
    public List<UsuarioModel> visualizarContatos(){
        return usuarioService.exibirTodosContatos();
    }

    @PutMapping
    public UsuarioModel atualizarContato(@RequestBody @Valid UsuarioModel contato){
        return usuarioService.salvarContato(contato);
    }


}


