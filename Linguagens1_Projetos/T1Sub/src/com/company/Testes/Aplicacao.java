package com.company.Testes;

import com.company.Carta;

import java.sql.*;
import java.util.ArrayList;

public class Aplicacao {
    public void run(){
        ArrayList<Carta> deck = new ArrayList<Carta>();
        try{
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlite.db");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM deck");
            while (result.next()){
                Carta carta = new Carta(
                        result.getString("URL"),
                        result.getString("ID"),
                        result.getString("nome"),
                        result.getString("raridade"),
                        result.getString("serieCarta"),
                        result.getString("colecao")
                        );
                System.out.println(carta);
            }
            result.close();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
