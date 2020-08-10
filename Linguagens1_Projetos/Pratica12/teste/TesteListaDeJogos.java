import models.Jogo;
import models.ListaDeJogos;

public class TesteListaDeJogos {
    public static void main(String[] args) {
        ListaDeJogos jogos = new ListaDeJogos();
        System.out.println("Lista atual: "+ jogos);

        Jogo jogo1 = new Jogo("PC", "LOL");
        Jogo jogo2 = new Jogo("PC", "Diablo");
        Jogo jogo3 = new Jogo("PC", "Hallo");

        jogos.addJogo(jogo1);
        jogos.addJogo(jogo2);
        jogos.addJogo(jogo3);

        System.out.println("Lista atual: "+ jogos);
    }
}