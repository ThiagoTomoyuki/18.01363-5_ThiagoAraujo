package sistema;


import models.Anime;
import models.Manga;


import java.util.Scanner;

public class Sistema {
    boolean alive = true;

    Scanner scanner = new Scanner(System.in);
    int opc;
    public void run() {
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


    }


    private  void manga(){
        System.out.println("Qual o nome do manga desejado:");
    }
/*
    private static void leituraJava11(String nome, String opcao) throws Exception{
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.jikan.moe/v3/search/"+ opcao +"?q=" +nome))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        if(opcao.equals("anime")){
            Anime anime = new Anime(
                    response.getString("url"),
                    response.getString("nome"),
                    response.getString("sinopse"),
                    response.getInt("quantEpisodios"),
                    response.getDouble("nota"));
            insereBanco();
            listaAnimes.add(anime);
        }else if(opcao.equals("manga")){
            Manga manga = new Manga(
                    response.getString("url"),
                    response.getString("nome"),
                    response.getInt("quantCap"),
                    response.getDouble("quantVolume"),
                    response.getString("tipo"),
                    response.getDouble("nota"));
            insereBanco(opcao);
            listaMangas.add(manga);
        }

        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Recebidos:");
        System.out.println(response.body());
    }

 */
    /*
    public void insereBanco(String opcao){
        if(opcao.equals("anime")){
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO "+opcao+" (nome, url, sinopse, quantEpisodios, nota) VALUES (?, ?, ?, ?, ?);");
            preparedStatement.setString(1, anime.getNome());
            preparedStatement.setString(2, produto.geturl());
            preparedStatement.setString(3, produto.getSinopse());
            preparedStatement.setDouble(4, produto.getCusto());
            preparedStatement.setDouble(5, produto.getValor());
            preparedStatement.setInt(6, produto.getQuantidade());
        }
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO "+opcao+" (codigo, nome, descricao, custo, valor, quantidade) VALUES (?, ?, ?, ?, ?, ?);");
        preparedStatement.setString(1, produto.getCodigo());
        preparedStatement.setString(2, produto.getNome());
        preparedStatement.setString(3, produto.getDescricao());
        preparedStatement.setDouble(4, produto.getCusto());
        preparedStatement.setDouble(5, produto.getValor());
        preparedStatement.setInt(6, produto.getQuantidade());
    }

     */
}