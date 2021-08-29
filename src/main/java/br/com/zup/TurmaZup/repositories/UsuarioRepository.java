package br.com.zup.TurmaZup.repositories;

import br.com.zup.TurmaZup.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
