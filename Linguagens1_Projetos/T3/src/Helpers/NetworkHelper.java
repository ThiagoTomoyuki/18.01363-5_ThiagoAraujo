package Helpers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public  class NetworkHelper {
    public static String NetworkHelperAnime(String nome) throws IOException, InterruptedException {
        nome = nome.replace(" ","%20");
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.jikan.moe/v3/search/anime?q="+nome))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Recebidos:");
        return (response.body());
    }
}
