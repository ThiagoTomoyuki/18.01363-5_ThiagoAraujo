package sistema;


import models.Anime;
import models.Manga;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Scanner;

public class Sistema {
    boolean alive = true;

    Scanner scanner = new Scanner(System.in);
    int opc;
    public void run() throws IOException, InterruptedException {
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

    private  void anime() throws IOException, InterruptedException {
        requestAPI();

    }


    private  void manga(){
        System.out.println("Qual o nome do manga desejado:");
    }


    public void requestAPI() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://wordsapiv1.p.mashape.com/words/pizza/definitions"))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Recebidos:");
        System.out.println(response.body());
    }
}
