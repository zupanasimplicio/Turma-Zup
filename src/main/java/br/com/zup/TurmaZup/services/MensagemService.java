package br.com.zup.TurmaZup.services;

import br.com.zup.TurmaZup.chat.Chat;
import br.com.zup.TurmaZup.models.UsuarioModel;
import br.com.zup.TurmaZup.repositories.ChatRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ChatService {
    private ChatRepositories chatRepositories;
    private UsuarioService usuarioService;

    @Autowired
    public ChatService(ChatRepositories chatRepositories,UsuarioService usuarioService) {
        this.chatRepositories = chatRepositories;
        this.usuarioService = usuarioService;

    }

     public Chat cadastrarChat(int usuarioId,Chat chat ){
        UsuarioModel usuarioModel = usuarioService.exibirTodosContatos(usuarioId);
        chat.setMensagem(chat.mensagem);
        chat.setDataDeEnvio(LocalDate.now());
        chat.setDataDeEnvio(false);

        return chatRepositories.save(chat);
     }
}
