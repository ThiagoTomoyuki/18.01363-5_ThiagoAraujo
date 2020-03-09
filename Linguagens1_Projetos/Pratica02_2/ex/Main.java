import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String A;
        int resultado = 0;
        Jogador J1 = new Jogador();
        Jogador J2 = new Jogador();
        Jogo J = new Jogo();
        System.out.println("Jogadas:\n1-Pedra\n2-Papel\n3-Tesoura\n");
        Scanner scanner = new Scanner(System.in);
        //Entrada nome dos Jogadores
        System.out.print("De o nome do jogador1: ");
        J1.nome = scanner.nextLine();
        System.out.print("De o nome do jogador2: ");
        J2.nome = scanner.nextLine();
        //Entrada Jogadas
        System.out.print("Jogada do jogador 1: ");
        J1.Jogada.Escolha = scanner.nextInt();
        System.out.print("Jogada do jogador 2: ");
        J2.Jogada.Escolha = scanner.nextInt();
        resultado = J.Batalha(J1, J2);

        if(resultado==0){
            System.out.println("Ganhador: "+J1.nome+" !!");
        }else if(resultado==1){
            System.out.println("Ganhador: "+J2.nome+" !!");
        }else{
            System.out.println("Empate!!");
        }

    }
}