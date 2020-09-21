package sistema;


import models.Anime;
import models.Manga;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    boolean alive = true;
    private List<Anime> listaAnimes;
    private List<Manga> listaMangas;
    Scanner scanner = new Scanner(System.in);
    int opc;

    public void run() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlite.db");
            Statement statement = connection.createStatement();
            ResultSet resultAnime = statement.executeQuery("SELECT * FROM Anime");
            while(resultAnime.next()){
                Anime anime = new Anime(
                        resultAnime.getString("url"),
                        resultAnime.getString("nome"),
                        resultAnime.getString("sinopse"),
                        resultAnime.getInt("quantEpisodios"),
                        resultAnime.getDouble("nota"));
                System.out.println(anime.toString());
                listaAnimes.add(anime);
            }
            resultAnime.close();
            ResultSet resultManga = statement.executeQuery("SELECT * FROM Manga");
            while(resultManga.next()){
                Manga manga = new Manga(
                        resultManga.getString("url"),
                        resultManga.getString("nome"),
                        resultManga.getString("sinopse"),
                        resultManga.getInt("quantCap"),
                        resultManga.getDouble("quantVolume"),
                        resultManga.getString("tipo"),
                        resultManga.getDouble("nota"));
                listaMangas.add(manga);
            }
            resultManga.close();
        } catch(SQLException throwables){
            throwables.printStackTrace();
        }

        do {
            opc = menu();
            switch (opc) {
                case 0:
                    alive = false;
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

        } while (alive);
    }

    private int menu() {
        System.out.println("Qual opção deseja:");
        System.out.println("1 - Anime");
        System.out.println("2 - Manga");
        System.out.println("0 - Sair");
        int opc = Integer.parseInt(scanner.next());
        return opc;
    }

    private  void anime(){
        String nome;
        System.out.println("Qual o nome do anime desejado:");
        nome = scanner.next();
        System.out.println(listaAnimes);


    }


    private  void manga(){
        System.out.println("Qual o nome do manga desejado:");
    }
}