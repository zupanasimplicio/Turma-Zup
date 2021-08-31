package br.com.zup.TurmaZup.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "mensagens")
public class MensagemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mensagem;
    @ManyToOne
    @JoinColumn(name = "usuario_origem",nullable = false)
    private UsuarioModel usuarioOrigem;
    @ManyToOne
    @JoinColumn(name = "usuario_destino",nullable = false)
    private UsuarioModel usuarioDestino;
    private boolean visualizado;
    private LocalDateTime dataDeEnvio;

    public MensagemModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public UsuarioModel getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public void setUsuarioOrigem(UsuarioModel usuarioOrigem) {
        this.usuarioOrigem = usuarioOrigem;
    }

    public UsuarioModel getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(UsuarioModel usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }

    public LocalDateTime getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(LocalDateTime dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }
}
