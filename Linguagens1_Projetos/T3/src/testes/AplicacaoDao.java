package testes;

import DAO.AnimeDAO;
import models.Anime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


import static Helpers.NetworkHelper.NetworkHelperAnime;

public class AplicacaoDao {
    String nome;
    private List<Anime> listAnimes;
    private AnimeDAO animeDao;
    private Scanner scanner;

    public AplicacaoDao() {
        listAnimes = new ArrayList<>();
        animeDao = new AnimeDAO();
        scanner = new Scanner(System.in);
    }

    boolean continuar = true;

    int opc;

    public void run() throws IOException, InterruptedException {
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

    private void anime() throws IOException, InterruptedException {
        Anime anime;
        System.out.println("Qual nome do Anime:");
        nome = scanner.nextLine();
        //System.out.println(nome);
        //nome = toCamelCase(nome);
        //System.out.println(nome);
        anime = animeDao.select(nome);


        if (anime == null) {
            System.out.println("Dentro do null");
            requestAPI(nome);
        } else {
            System.out.println(anime);
        }
    }

    private int menu() {
        System.out.println("Qual opção deseja:");
        System.out.println("1 - Anime");
        System.out.println("2 - Manga");
        System.out.println("0 - Sair");
        int opc = Integer.parseInt(scanner.nextLine());
        return opc;
    }

    public void requestAPI(String nome) throws IOException, InterruptedException {
        String retornaStringAPI = NetworkHelperAnime(nome);
        try {
            JSONObject jsonObject = new JSONObject(retornaStringAPI);
            JSONArray result = jsonObject.getJSONArray("results");
            Anime anime = new Anime(
                    ((JSONObject) result.get(0)).getString("url"),
                    ((JSONObject) result.get(0)).getString("title"),
                    ((JSONObject) result.get(0)).getString("synopsis"),
                    ((JSONObject) result.get(0)).getInt("episodes"),
                    ((JSONObject) result.get(0)).getDouble("score")
            );
            animeDao.create(anime);
            animeDao.getAll();


        } catch (JSONException err) {
            System.out.println(err);
        }
    }

//    public static String toCamelCase(String strData) {
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(strData, " ", false);
//        while (st.hasMoreTokens()) {
//            String strWord = st.nextToken();
//            sb.append(Character.toUpperCase(strWord.charAt(0)));
//            sb.append(strWord.substring(1).toLowerCase());
//            sb.append(" ");
//        }
//
//        return sb.toString();
//    }
}