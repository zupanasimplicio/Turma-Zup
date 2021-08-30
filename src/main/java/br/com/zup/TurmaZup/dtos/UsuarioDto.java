package br.com.zup.TurmaZup.dtos;

import br.com.zup.TurmaZup.models.UsuarioModel;


    public class UsuarioDto {

        private int id;
        private String nome;
        private String email;
        private String cargo;

        public UsuarioDto() {

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

        public static UsuarioDto converterModelParaDTO(UsuarioModel usuario){
            UsuarioDto usuarioDto = new UsuarioDto();
            usuarioDto.setNome(usuario.getNome());
            usuarioDto.setEmail(usuario.getEmail());
            usuarioDto.setCargo(usuario.getCargo());
            usuarioDto.setId(usuario.getId());

            return usuarioDto;





    }
}
