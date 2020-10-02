package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Manga;


public class MangaDAO implements  DAO<Manga>{
    private Connection connection;
    private  String myDBConnection = "jdbc:sqlite:sqlite.db";
    public MangaDAO() {
        try{
            connection = DriverManager.getConnection(myDBConnection);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Manga> getAll() {
        List<Manga> listManga = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultManga = statement.executeQuery("SELECT * FROM Manga");
            while (resultManga.next()) {
                Manga anime = new Manga(
                        resultManga.getString("url"),
                        resultManga.getString("nome"),
                        resultManga.getString("sinopse"),
                        resultManga.getInt("quantCap"),
                        resultManga.getDouble("quantVolume"),
                        resultManga.getString("tipo"),
                        resultManga.getDouble("nota"));
                System.out.println(anime.toString());
                listManga.add(anime);
            }
            resultManga.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listManga;
    }

    @Override
    public void create(Manga manga) {
        System.out.println("pre conection");
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Manga(nome,url,sinopse,quantCap,quantVolume,tipo,nota) VALUES (?,?,?,?,?,?,?);");
            preparedStatement.setString(1, manga.getNome());
            preparedStatement.setString(2, manga.getUrl());
            preparedStatement.setString(3, manga.getSinopse());
            preparedStatement.setInt(4, manga.getQuantCap());
            preparedStatement.setDouble(5, manga.getQuantVolume());
            preparedStatement.setString(6, manga.getTipo());
            preparedStatement.setDouble(7, manga.getNota());
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            if(e.getMessage().contains("SQLITE_CONSTRAINT")){
                select(manga.getNome());
                System.out.println(manga);
            }
        }
    }

    @Override
    public Manga select( String nome) {
        System.out.println("to no selectManga");
        System.out.println(nome);
        try{
            System.out.println("to no try");
            Statement statement = connection.createStatement();
            //statement.executeQuery("SELECT * FROM Manga WHERE nome LIKE '%" +nome+ "%'");
            //PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Anime WHERE nome LIKE '%" +nome+ "%'");
            ResultSet resultManga = statement.executeQuery("SELECT * FROM Manga WHERE nome LIKE '%" +nome+ "%'");
            System.out.println(resultManga);
            while (resultManga.next()) {
                Manga manga = new Manga(
                        resultManga.getString("url"),
                        resultManga.getString("nome"),
                        resultManga.getString("sinopse"),
                        resultManga.getInt("quantCap"),
                        resultManga.getDouble("quantVolume"),
                        resultManga.getString("tipo"),
                        resultManga.getDouble("nota"));
                System.out.println(manga);
                return manga;
            }
            resultManga.close();
        }catch (NullPointerException | SQLException e){
            System.out.println("dentro do null");
            return null;
        }catch (Exception e){
            System.out.println("dentro do exception");
            return null;
        }
        return null;
    }

    @Override
    public void delete( String nome) {
        try {
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Manga WHERE nome = ?");
            int retorno = preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
