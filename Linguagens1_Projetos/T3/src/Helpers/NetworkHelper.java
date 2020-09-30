package Helpers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public  class NetworkHelper {
    public static String NetworkHelperAnime(String nome,String opcao) throws IOException, InterruptedException {
        nome = nome.replace(" ","%20");
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.jikan.moe/v3/search/"+ opcao +"?q="+nome))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        return (response.body());
    }
}
