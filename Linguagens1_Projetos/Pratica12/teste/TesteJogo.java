package teste;

import models.Jogo;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("PC","LOL");
        System.out.println("Jogo: "+jogo.toString());
        jogo.setStatusJogando();
        System.out.println("Jogo: "+jogo.toString());
    }
}