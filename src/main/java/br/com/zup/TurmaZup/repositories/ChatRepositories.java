package br.com.zup.TurmaZup.repositories;

import br.com.zup.TurmaZup.chat.Chat;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ChatRepositories extends CrudRepository<Chat, CriteriaBuilder.In>{


}
