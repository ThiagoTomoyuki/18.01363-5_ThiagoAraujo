import java.sql.ResultSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  Modo;
        int resultado = 0;
        Jogador J1 = new Jogador();
        Jogador J2 = new Jogador();
        Jogo1 G1 = new Jogo1();
        Jogo2 G2 = new Jogo2();
        System.out.print("Escolha o modo Tradicional(T) ou o modo Big Bang Theory(B): ");
        Modo = scanner.nextLine();
        Modo = Modo.toUpperCase();
        if((Modo).equals("T")){
            System.out.println("Jogadas:\n1-Pedra\n2-Papel\n3-Tesoura\n");
        }else{
            System.out.println("Jogadas:\n1-Rock\n2-Paper\n3-Scissor\n4-Lizard\n5-Spoke");
        } 
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
        if((Modo).equals("T")){
            resultado = G1.Batalha(J1, J2);
        }else{
            resultado = G2.Batalha(J1, J2);
        }       

        if(resultado==0){
            System.out.println("Ganhador: "+J1.nome+" !!");
        }else if(resultado==1){
            System.out.println("Ganhador: "+J2.nome+" !!");
        }else if (resultado==2){
            System.out.println("Empate!!");
        }else{
            System.out.println("Erro Inesperado!!");
        }

    }
}