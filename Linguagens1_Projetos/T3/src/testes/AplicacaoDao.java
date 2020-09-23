package testes;

import DAO.AnimeDAO;
import models.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoDao {
    String nome;
    private List<Anime> listAnimes;
    private AnimeDAO animeDao;
    private Scanner scanner;
    public AplicacaoDao(){
        listAnimes = new ArrayList<>();
        animeDao = new AnimeDAO();
        scanner = new Scanner(System.in);
    }
    boolean continuar = true;

    int opc;
    public void run() {
        do {
            opc = menu();
            switch (opc) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    anime();
                    break;
                case 2:
                    manga();
                    break;
                default:
                    System.out.println("Opcao Invalida! Digite uma opção valida");
            }

        } while (continuar);
    }

    private void manga() {
    }

    private void anime() {
        Anime anime;
        System.out.println("Qual nome do Anime:");
        nome = scanner.next();
        anime = animeDao.select(nome);
        if(anime==null){
            System.out.println("Dentro do null");
        }else {
            System.out.println(anime);
        }
    }

    private int menu() {
        System.out.println("Qual opção deseja:");
        System.out.println("1 - Anime");
        System.out.println("2 - Manga");
        System.out.println("0 - Sair");
        int opc = Integer.parseInt(scanner.next());
        return opc;
    }
}
