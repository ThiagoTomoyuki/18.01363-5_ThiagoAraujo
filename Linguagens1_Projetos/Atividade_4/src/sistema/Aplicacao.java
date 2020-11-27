package sistema;

import DAO.PersonagemDAO;
import enums.Prof;
import enums.Raca;
import models.Personagem;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private List<Personagem> listPersonagens;
    private Scanner scanner;
    private PersonagemDAO personagemDAO;
    int i=0;
    public void run() throws IOException, InterruptedException, SQLException {
        boolean continuar = true;
        int opc;
        personagemDAO = new PersonagemDAO();
        scanner = new Scanner(System.in);
        do {
            opc = menu();
            switch (opc) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    criarPeronagem();
                    break;
                case 2:
                    alterar();
                    System.out.println("To no alterar");
                    break;
                case 3:
                    personagemDAO.getAll();
                    break;
                case 4:
                    deletar();
                    break;
                default:
                    System.out.println("Opcao Invalida! Digite uma opção valida");
            }

        } while (continuar);
    }

    private void alterar() throws SQLException {
        personagemDAO.getAll();
        System.out.println("Qual nome do personagem que deseja alterar:");
        String nome = scanner.nextLine();
        String coluna;
        int valor = 0;
        System.out.println(personagemDAO.select(nome));
        System.out.println("O que deseja alterar neles:");
        System.out.println("1-raca");
        System.out.println("2-prof");
        System.out.println("3-exp");
        System.out.println("4-nivel");
        int opc = Integer.parseInt(scanner.nextLine());
        switch (opc) {
            case 1:
                System.out.println("Para qual raça deseja alterar:");
                System.out.println("1-HUMANO\n2-ELFO\n3-FADA\n4-ANIMALOS\n5-VAMPIRO\n6-MAGO\n7-LUTADOR");
                opc = Integer.parseInt(scanner.nextLine());
                coluna="raca";
                Raca raca;
                switch (opc) {
                    case 1:
                        raca = Raca.HUMANO;
                        personagemDAO.UPDATE(nome,raca,coluna,valor);
                        break;
                    case 2:
                        raca = Raca.ELFO;
                        personagemDAO.UPDATE(nome,raca,coluna,valor);
                        break;
                    case 3:
                        raca = Raca.FADA;
                        personagemDAO.UPDATE(nome,raca,coluna,valor);
                        break;
                    case 4:
                        raca = Raca.ANIMALOS;
                        personagemDAO.UPDATE(nome,raca,coluna,valor);
                        break;
                    case 5:
                        raca = Raca.VAMPIRO;
                        personagemDAO.UPDATE(nome,raca,coluna,valor);
                        break;
                    case 6:
                        raca = Raca.MAGO;
                        personagemDAO.UPDATE(nome,raca,coluna,valor);
                        break;
                    case 7:
                        raca = Raca.LUTADOR;
                        personagemDAO.UPDATE(nome,raca,coluna,valor);
                        break;
                }
                break;
            case 2:
                System.out.println("Para qual prof deseja alterar:");
                System.out.println("1-DESEMPREGADO\n2-CACADOR\n3-PESCADOR\n4-GARI\n5-MEDICO\n6-ENGENHEIRO\n7-PADRE\n8-BOMBEIRO");
                opc = Integer.parseInt(scanner.nextLine());
                coluna="prof";
                Prof prof;
                switch (opc) {
                    case 1:
                        prof = Prof.DESEMPREGADO;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                    case 2:
                        prof = Prof.CACADOR;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                    case 3:
                        prof = Prof.PESCADOR;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                    case 4:
                        prof = Prof.GARI;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                    case 5:
                        prof = Prof.MEDICO;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                    case 6:
                        prof = Prof.ENGENHEIRO;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                    case 7:
                        prof = Prof.PADRE;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                    case 8:
                        prof = Prof.BOMBEIRO;
                        personagemDAO.UPDATE(nome,prof,coluna,valor);
                        break;
                }
                break;
            case 3:
                System.out.println("Qual o novo valor da exp:");
                valor = Integer.parseInt(scanner.nextLine());
                coluna = "exp";
                personagemDAO.UPDATE(nome,null,coluna,valor);
                break;
            case 4:
                System.out.println("Qual o novo valor do novo nivel do personagem:");
                valor = Integer.parseInt(scanner.nextLine());
                coluna = "nivel_atual";
                personagemDAO.UPDATE(nome,null,coluna,valor);
                break;
        }
        System.out.println("Personagem alterado:"+personagemDAO.select(nome));
    }

    private void deletar() {
        personagemDAO.getAll();
        System.out.println("Qual personagem deseja deletar:");
        String nome = scanner.nextLine();
        personagemDAO.delete(nome);
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

    private void criarPeronagem() throws SQLException {
        Personagem personagem;
        Raca raca;
        Prof prof;
        int mana;
        int ataque,ataque_magico,defesa,defesa_magica,velocidade,destreza;
        int exp=0,nivel_atual=1;
        scanner = new Scanner(System.in);
        System.out.println("Qual o nome do personagem:");
        String nome = scanner.nextLine();
        System.out.println("Qual a raca do personagem:");
        System.out.println("1-HUMANO\n2-ELFO\n3-FADA\n4-ANIMALOS\n5-VAMPIRO\n6-MAGO\n7-LUTADOR");
        int opcRaca = Integer.parseInt(scanner.nextLine());
        switch (opcRaca) {
            case 1:
                raca = Raca.HUMANO;
                mana = 20;
                ataque = 12;
                ataque_magico = 3;
                defesa = 20;
                defesa_magica = 5;
                velocidade = 2;
                destreza = 5;
                break;
            case 2:
                raca = Raca.ELFO;
                mana = 30;
                ataque = 10;
                ataque_magico = 5;
                defesa = 15;
                defesa_magica = 6;
                velocidade = 4;
                destreza = 6;
                break;
            case 3:
                raca = Raca.FADA;
                mana = 60;
                ataque = 5;
                ataque_magico = 10;
                defesa = 5;
                defesa_magica = 3;
                velocidade = 5;
                destreza = 3;
                break;
            case 4:
                raca = Raca.ANIMALOS;
                mana = 5;
                ataque = 10;
                ataque_magico = 2;
                defesa = 25;
                defesa_magica = 25;
                velocidade = 2;
                destreza = 2;
                break;
            case 5:
                raca = Raca.VAMPIRO;
                mana = 6;
                ataque = 5;
                ataque_magico = 15;
                defesa = 10;
                defesa_magica = 5;
                velocidade = 7;
                destreza = 6;
                break;
            case 6:
                raca = Raca.MAGO;
                mana = 100;
                ataque = 3;
                ataque_magico = 25;
                defesa = 5;
                defesa_magica = 6;
                velocidade = 4;
                destreza = 8;
                break;
            case 7:
                raca = Raca.LUTADOR;
                mana = 10;
                ataque = 25;
                ataque_magico = 3;
                defesa = 15;
                defesa_magica = 10;
                velocidade = 6;
                destreza = 4;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + opcRaca);
        }
        System.out.println("Qual a Profissao do personagem:");
        System.out.println("1-DESEMPREGADO\n2-CACADOR\n3-PESCADOR\n4-GARI\n5-MEDICO\n6-ENGENHEIRO\n7-PADRE\n8-BOMBEIRO");
        int opcProf = Integer.parseInt(scanner.nextLine());
        switch (opcProf) {
            case 1:
                prof = Prof.DESEMPREGADO;
                break;
            case 2:
                prof = Prof.CACADOR;
                break;
            case 3:
                prof = Prof.PESCADOR;
                break;
            case 4:
                prof = Prof.GARI;
                break;
            case 5:
                prof = Prof.MEDICO;
                break;
            case 6:
                prof = Prof.ENGENHEIRO;
                break;
            case 7:
                prof = Prof.PADRE;
                break;
            case 8:
                prof = Prof.BOMBEIRO;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcProf);
        }
        personagem = new Personagem(nome,raca,prof,mana,ataque,ataque_magico,defesa,defesa_magica,velocidade,destreza,exp,nivel_atual);
        System.out.println("Personagem criado: "+personagem);

        personagemDAO.create(personagem);
    }
}
