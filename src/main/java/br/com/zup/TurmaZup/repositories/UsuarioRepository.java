package br.com.zup.TurmaZup.repositories;

import br.com.zup.TurmaZup.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

    Optional<UsuarioModel> findByEmail(String email);
}
