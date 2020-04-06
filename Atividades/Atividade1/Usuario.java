//Thiago Tomoyuki Yara de Araujo  RA:18.01363-5

public class Usuario {
    private String nome, senha, email;
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
   public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }

}