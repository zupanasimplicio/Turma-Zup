package br.com.zup.TurmaZup.dtos;

import br.com.zup.TurmaZup.models.MensagemModel;

import java.time.LocalDateTime;

public class MensagemDto {
    private int id;
    private String mensagem;
    private LocalDateTime dataDeEnvio;
    private boolean visualizado;

    private UsuarioDto usuarioDtoOrigem;
    private UsuarioDto usuarioDtoDestino;

    public MensagemDto() {

    }


    public MensagemDto(int id, String mensagem, LocalDateTime dataDeEnvio, boolean visualizado, UsuarioDto usuarioDtoOrigem,
                       UsuarioDto usuarioDtoDestino) {
        super();
        this.id = id;
        this.mensagem = mensagem;
        this.dataDeEnvio = dataDeEnvio;
        this.visualizado = visualizado;
        this.usuarioDtoOrigem = usuarioDtoOrigem;
        this.usuarioDtoDestino = usuarioDtoDestino;
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


    public UsuarioDto getUsuarioDtoOrigem() {
        return usuarioDtoOrigem;
    }


    public void setUsuarioDtoOrigem(UsuarioDto usuarioDtoOrigem) {
        this.usuarioDtoOrigem = usuarioDtoOrigem;
    }


    public UsuarioDto getUsuarioDtoDestino() {
        return usuarioDtoDestino;
    }


    public void setUsuarioDtoDestino(UsuarioDto usuarioDtoDestino) {
        this.usuarioDtoDestino = usuarioDtoDestino;
    }


    public static MensagemDto converterModelParaDTO(MensagemModel mensagem){
        MensagemDto mensagDto = new MensagemDto();
        UsuarioDto usuarioDtoOrigem = UsuarioDto.converterModelParaDTO(mensagem.getUsuarioOrigem());
        UsuarioDto usuarioDtoDestino = UsuarioDto.converterModelParaDTO(mensagem.getUsuarioDestino());
        mensagDto.setUsuarioDtoOrigem(usuarioDtoOrigem);
        mensagDto.setUsuarioDtoDestino(usuarioDtoDestino);
        mensagDto.setMensagem(mensagem.getMensagem());
        mensagDto.setVisualizado(mensagem.isVisualizado());
        mensagDto.setDataDeEnvio(mensagem.getDataDeEnvio());
        mensagDto.setId(mensagem.getId());

        return mensagDto;
    }



}
