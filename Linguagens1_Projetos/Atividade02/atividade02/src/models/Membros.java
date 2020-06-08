package models;

import enums.MembrosEnum;

public class Membros{
    String nome;
    String email;
    MembrosEnum funcao;
    public Membros(String nome,String email,int funcao){
        this.nome = nome;
        this.email = email;
        if(funcao==1){
            this.funcao = MembrosEnum.MOBILE_MEMBERS;
        }else if(funcao==2){
            this.funcao = MembrosEnum.HEAVY_LIFTER;
        }else if(funcao==3){
            this.funcao = MembrosEnum.SCRIPT_GUYS;
        }else if(funcao==4){
            this.funcao = MembrosEnum.BIG_BROTHERS;
        }
    }
    public String getNome(){
        return nome;
    }
    public String getemail(){
        return email;
    }
}