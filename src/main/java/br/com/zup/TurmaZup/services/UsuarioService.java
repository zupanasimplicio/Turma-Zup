package br.com.zup.TurmaZup.services;

import br.com.zup.TurmaZup.models.UsuarioModel;
import br.com.zup.TurmaZup.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel salvarContato(UsuarioModel contato){
        return usuarioRepository.save(contato);
    }

    public List<UsuarioModel> exibirTodosContatos(){
        return (List<UsuarioModel>) usuarioRepository.findAll();
    }

}
