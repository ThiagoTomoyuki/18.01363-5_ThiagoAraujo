package models;

public class Usuario {
    String nome,email;
    private String senha = "123456";
    
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    /**
    * Função que Retorna o nome
    */
    public String getName(){
        return nome;
    }
    /**
    * Função que Retorna o email
    */
    public String getEmail() {
        return email;
    }
    /**
    * Função que Testa a senha colocada pelo usuario
    */
    public boolean testarSenha(String senhaColocada){
        if(senhaColocada.equals(senha)){
            return true;
        }else{
            return false;
        }
        
    }
}