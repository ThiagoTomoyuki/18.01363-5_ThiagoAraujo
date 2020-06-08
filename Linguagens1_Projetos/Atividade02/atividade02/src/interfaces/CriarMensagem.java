package interfaces;

import enums.JornadaEnum;
import enums.MembrosEnum;
import models.Membros;

public class CriarMensagem {
    JornadaEnum jornada;
    public CriarMensagem(JornadaEnum jornada,MembrosEnum tipo) {
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