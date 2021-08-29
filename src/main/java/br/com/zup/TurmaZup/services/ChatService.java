package br.com.zup.TurmaZup.services;

import br.com.zup.TurmaZup.models.UsuarioModel;
import br.com.zup.TurmaZup.repositories.ChatRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private ChatRepositories chatRepositories;
    private UsuarioModel usuarioModel;

    @Autowired
    public ChatService(ChatRepositories chatRepositories, UsuarioModel usuarioModel) {
        this.chatRepositories = chatRepositories;
        this.usuarioModel = usuarioModel;

    }


}
