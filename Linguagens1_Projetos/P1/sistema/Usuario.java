package sistema;

public class Usuario {
    String nome,email;
    int senha = 123456;
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
        public String getName(){
            return nome;
        }
        public String getEmail() {
            return email;
        }
}