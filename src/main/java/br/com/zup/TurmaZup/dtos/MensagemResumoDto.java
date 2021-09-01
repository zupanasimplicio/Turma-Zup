package br.com.zup.TurmaZup.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MensagemResumoDto {

    private int id;
    private String mensagem;
    private LocalDateTime dataDeEnvio;
    private boolean visualizado;

    public MensagemResumoDto() {

    }

    public MensagemResumoDto(int id, String mensagem, LocalDateTime dataDeEnvio, boolean visualizado) {
        super();
        this.id = id;
        this.mensagem = mensagem;
        this.dataDeEnvio = dataDeEnvio;
        this.visualizado = visualizado;
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

    public LocalDateTime getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(LocalDateTime dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }




}
