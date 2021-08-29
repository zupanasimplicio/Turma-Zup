package br.com.zup.TurmaZup.chat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
    @Table(name = "chat")
    public class Chat{

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Integer id;
        public String mensagem;
        public LocalDate dataDeEnvio;
        public boolean visualizado;

        @ManyToMany
        @JoinColumn(name = "contatos id",nullable = false)
        private Chat chat;

    public Chat() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(LocalDate dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }
}




