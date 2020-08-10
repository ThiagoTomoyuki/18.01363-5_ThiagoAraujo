import projeto.model.Jogo;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("PC", "LoL");
        System.out.println("Jogo:" + jogo);
        jogo.setStatusJogando();
        System.out.println("Jogo:" + jogo);
    }
}