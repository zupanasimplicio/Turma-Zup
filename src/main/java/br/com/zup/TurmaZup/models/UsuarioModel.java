package br.com.zup.TurmaZup.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "usuarios")
    public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String sobrenome;
    @Column(unique = true, nullable = false)
    private String email;
    private String cargo;

    @OneToMany(mappedBy = "usuarioOrigem")
    private List<MensagemModel> mensagensRecebidas;
    @OneToMany(mappedBy = "usuarioDestino")
    private List<MensagemModel> mensagensEnviadas;


    public UsuarioModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<MensagemModel> getMensagensRecebidas() {
        return mensagensRecebidas;
    }

    public void setMensagensRecebidas(List<MensagemModel> mensagensRecebidas) {
        this.mensagensRecebidas = mensagensRecebidas;
    }

    public List<MensagemModel> getMensagensEnviadas() {
        return mensagensEnviadas;
    }

    public void setMensagensEnviadas(List<MensagemModel> mensagensEnviadas) {
        this.mensagensEnviadas = mensagensEnviadas;
    }
}
