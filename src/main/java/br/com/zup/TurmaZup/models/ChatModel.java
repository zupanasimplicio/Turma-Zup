package br.com.zup.TurmaZup.models;

public class ChatModel {

    private String mensagem;
    private String ContatoModelorigem;
    private String ContatoModelDestino;

    public ChatModel() {
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getContatoModelorigem() {
        return ContatoModelorigem;
    }

    public void setContatoModelorigem(String contatoModelorigem) {
        ContatoModelorigem = contatoModelorigem;
    }

    public String getContatoModelDestino() {
        return ContatoModelDestino;
    }

    public void setContatoModelDestino(String contatoModelDestino) {
        ContatoModelDestino = contatoModelDestino;
    }
}
