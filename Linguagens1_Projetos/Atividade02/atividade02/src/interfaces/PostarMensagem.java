package interfaces;

import enums.JornadaEnum;

public class PostarMensagem {
    JornadaEnum jornada;
    public PostarMensagem(int jornada) {
            if(jornada == 0){
                System.out.println(jornada == 1);
            }else if(jornada == 1){
                System.out.println("1-");
            }else{
                System.out.println("Fudeu!");
            }
    }
}