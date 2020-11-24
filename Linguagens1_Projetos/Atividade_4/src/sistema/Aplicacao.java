package sistema;

import models.Personagem;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private List<Personagem> listPersonagens;
    private Scanner scanner;
    public void run() throws IOException, InterruptedException {
        boolean continuar = true;
        int opc;
        scanner = new Scanner(System.in);
        do {
            opc = menu();
            switch (opc) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    System.out.println("To no criar");
                    break;
                case 2:
                    System.out.println("To no alterar");
                    break;
                case 3:
                    System.out.println("To no consultar");
                    break;
                case 4:
                    System.out.println("To no deletar");
                    break;
                default:
                    System.out.println("Opcao Invalida! Digite uma opção valida");
            }

        } while (continuar);
    }

    private int menu() {
        System.out.println("Qual opção deseja:");
        System.out.println("1 - Criar um novo personagem");
        System.out.println("2 - Alterar um personagem existente");
        System.out.println("3 - Consultar os personagens existente");
        System.out.println("4 - Deletar algum personagem");
        System.out.println("0 - Sair");
        int opc = Integer.parseInt(scanner.nextLine());
        return opc;
    }
}
