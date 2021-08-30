package br.com.zup.TurmaZup.services;

import br.com.zup.TurmaZup.models.UsuarioModel;
import br.com.zup.TurmaZup.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public UsuarioModel buscarUsuarioPorEmail(String email) {
        Optional<UsuarioModel> usuOptional = usuarioRepository.findByEmail(email);

        if (usuOptional.isPresent()) {
            return usuOptional.get();
        }
        return null;
    }

}
