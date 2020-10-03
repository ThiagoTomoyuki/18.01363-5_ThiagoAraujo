package DAO;

import models.Anime;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimeDAO implements DAO<Anime>{
    private Connection connection;
    private  String myDBConnection = "jdbc:sqlite:sqlite.db";
    public AnimeDAO() {
        try{
            connection = DriverManager.getConnection(myDBConnection);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Anime> getAll() {
        List<Anime> listAnimes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultAnime = statement.executeQuery("SELECT * FROM Anime");
            while (resultAnime.next()) {
                Anime anime = new Anime(
                        resultAnime.getString("url"),
                        resultAnime.getString("nome"),
                        resultAnime.getString("sinopse"),
                        resultAnime.getInt("quantEpisodios"),
                        resultAnime.getDouble("nota"));
                System.out.println(anime.toString());
                listAnimes.add(anime);
            }
            resultAnime.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listAnimes;
    }

    @Override
    public void create(Anime anime) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Anime(nome,url,sinopse,quantEpisodios,nota) VALUES (?,?,?,?,?);");
            preparedStatement.setString(1, anime.getNome());
            preparedStatement.setString(2, anime.getUrl());
            preparedStatement.setString(3, anime.getSinopse());
            preparedStatement.setInt(4, anime.getQuantEpisodios());
            preparedStatement.setDouble(5, anime.getNota());
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            if(e.getMessage().contains("SQLITE_CONSTRAINT")){
                select(anime.getNome());
                System.out.println(anime);
            }

        }
    }

    @Override
    public Anime select( String nome) {
        try{
            Statement statement = connection.createStatement();
            //statement.executeQuery("SELECT * FROM Anime WHERE nome LIKE '%" +nome+ "%'");
            //PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Anime WHERE nome LIKE '%" +nome+ "%'");
            ResultSet resultAnime = statement.executeQuery("SELECT * FROM Anime WHERE nome LIKE '%" +nome+ "%'");
            while (resultAnime.next()) {
                Anime anime = new Anime(
                        resultAnime.getString("url"),
                        resultAnime.getString("nome"),
                        resultAnime.getString("sinopse"),
                        resultAnime.getInt("quantEpisodios"),
                        resultAnime.getDouble("nota"));
                return anime;
            }
            resultAnime.close();


        }catch (Exception e){
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public void delete( String nome) {
        try{
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Anime WHERE nome = ?");
            int retorno = preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();

        }
    }



}
