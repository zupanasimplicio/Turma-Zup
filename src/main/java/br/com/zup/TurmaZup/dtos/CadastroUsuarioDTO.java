package br.com.zup.TurmaZup.dtos;

import br.com.zup.TurmaZup.models.UsuarioModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class CadastroUsuarioDTO {
    @Size(message = "Minimo 2 letras", min = 2)
    private String nome;
    private String sobrenome;
    @Email(message = "Olá mundo")
    private String email;
    private String cargo;

    public CadastroUsuarioDTO() {

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

    public UsuarioModel converterDTOEmContatoModel() {
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setEmail(email);
        usuarioModel.setNome(nome);
        usuarioModel.setSobrenome(sobrenome);
        usuarioModel.setCargo(cargo);
        return usuarioModel;



    }
}

