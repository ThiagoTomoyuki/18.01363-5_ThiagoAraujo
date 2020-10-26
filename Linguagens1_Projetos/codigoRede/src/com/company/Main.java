package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  Exception{
        run();
    }

    public static void run() throws  Exception{

        System.out.println("1 - Magic\n2 - Pokemon\n3 - Yu-Gi-Oh\n4 - Futebol\n5 - F1\n6 - Overwatch\n");
        System.out.println("Qual api deseja:");
        Scanner scn = new Scanner(System.in);

        int opc = Integer.parseInt(scn.nextLine());
        if(opc==1){

        }else if(opc==2){
            leituraJava11(pokemon());
        }else if(opc==3){

        }else if(opc==4){

        }else if(opc==5){

        }else if(opc==6){

        }else{
            System.out.println("Digite um numero valido!");
        }



    }

    private static void leituraJava11(String URL) throws Exception{
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(URL))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Recebidos:");
        System.out.println(response.body());
    }

    private  static  String pokemon(){
        System.out.println("Qual nome do pokemon:");
        Scanner scn = new Scanner(System.in);
        String nomePokemon = scn.nextLine();
        return ("https://api.pokemontcg.io/v1/cards?name="+nomePokemon);
    }

    private  static  String magic(){
        System.out.println("Qual nome da carta:");
        Scanner scn = new Scanner(System.in);
        String nomePokemon = scn.nextLine();
        return ("https://api.pokemontcg.io/v1/cards?name="+nomePokemon);
    }

    private static void leituraJavaAte8() throws  Exception{
        //Cria url
        URL url = new URL("https://viacep.com.br/ws/02533010/json/");
        //Abre a conecao com a url pedida em cima
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        //Estabelece uma coneção
        con.setRequestMethod("GET");
        //ve se deu bom ou deu ruim
        int statusCode = con.getResponseCode();
        System.out.println("Status Code: "+ statusCode);
        //Pega a resposta pedida
        BufferedReader in = new BufferedReader(
          new InputStreamReader(
                  con.getInputStream()
          )
        );
        //Pega tudo q venho de resposta e armazena
        String result;
        StringBuffer content = new StringBuffer();
        while((result = in.readLine())!= null){
            content.append(result);
        }
        in.close();
        System.out.println("Recebidos: "+ content);
    }
}
