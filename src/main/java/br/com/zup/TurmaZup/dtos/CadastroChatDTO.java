package br.com.zup.TurmaZup.dtos;

import br.com.zup.TurmaZup.chat.Chat;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CadastroChatDTO {


    @NotBlank
    @Size(max = 250)
    private String chat;

    public CadastroChatDTO() {
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public Chat converteDtoParaModel(){
        Chat chat = new Chat();
        chat.setMensagem(this.chat);

        return chat;
    }


}
