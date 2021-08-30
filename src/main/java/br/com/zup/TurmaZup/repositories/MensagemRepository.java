package br.com.zup.TurmaZup.repositories;

import br.com.zup.TurmaZup.chat.Chat;
import br.com.zup.TurmaZup.models.MensagemModel;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface MensagemRepositories extends CrudRepository<MensagemModel,Integer> {
    List<MensagemModel> findAllByVisualizado(boolean visualizado);
    List<MensagemModel> findAllByUsuarioDestinoEmailContains(String email);


}
