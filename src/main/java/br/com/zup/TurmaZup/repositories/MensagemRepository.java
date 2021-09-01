package br.com.zup.TurmaZup.repositories;

import br.com.zup.TurmaZup.models.MensagemModel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MensagemRepository extends CrudRepository<MensagemModel,Integer> {
    List<MensagemModel> findAllByVisualizado(boolean visualizado);
    List<MensagemModel> findAllByUsuarioDestinoEmailContains(String email);


    Object findAllById(int idMesamgem);
}
