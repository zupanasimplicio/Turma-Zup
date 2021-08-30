package br.com.zup.TurmaZup.dtos;

import br.com.zup.TurmaZup.models.UsuarioModel;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioResumidoDto {

        private int id;
        private String nome;
        private String email;
        private String cargo;

        public UsuarioResumidoDto() {

        }


        public UsuarioResumidoDto(int id, String nome, String email, String cargo) {
            super();
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.cargo = cargo;
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

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }




        public String getEmail() {
            return email;
        }


        public void setEmail(String email) {
            this.email = email;
        }


        public static List<UsuarioResumidoDto> converterListaDeModelParaDTO (List<UsuarioModel> usuarios){
            return usuarios.stream()
                    .map(usuario -> new UsuarioResumidoDto(
                            usuario.getId(),
                            usuario.getNome(),
                            usuario.getEmail(),
                            usuario.getCargo())
                    ).collect(Collectors.toList());
        }


    }




