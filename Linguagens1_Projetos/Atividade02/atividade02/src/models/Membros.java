package models;

import enums.JornadaEnum;
import enums.MembrosEnum;
import interfaces.*;

public class Membros implements PostarMensagem{
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
    public String getEmail(){
        return email;
    }
    public void CriarMensagem(JornadaEnum jornada,MembrosEnum tipo) {
        if(jornada== JornadaEnum.REGULAR){
            if(tipo == MembrosEnum.BIG_BROTHERS){
                System.out.println("Sempre ajudando as pessoas membros ou não S2!");
            }else if(tipo == MembrosEnum.MOBILE_MEMBERS){
                System.out.println("Happy Coding!");
            }else if(tipo == MembrosEnum.HEAVY_LIFTER){
                System.out.println("Podem contar conosco!");
            }else if(tipo == MembrosEnum.SCRIPT_GUYS){
                System.out.println("Prazer em ajudar novos amigos de código!");
            }
        }else if(jornada== JornadaEnum.EXTRA){
            if(tipo == MembrosEnum.BIG_BROTHERS){
                System.out.println("...");
            }else if(tipo == MembrosEnum.MOBILE_MEMBERS){
                System.out.println("MAsK_S0c13ty");
            }else if(tipo == MembrosEnum.HEAVY_LIFTER){
                System.out.println("N00b_qu3_n_Se_r3pita.bat");
            }else if(tipo == MembrosEnum.SCRIPT_GUYS){
                System.out.println("QU3Ro_S3us_r3curs0s.py");
            }
        }
}    
}