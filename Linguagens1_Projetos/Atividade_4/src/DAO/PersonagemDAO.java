package DAO;

import models.Personagem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonagemDAO implements DAO<Personagem>{
    private Connection connection;
    private  String myDBConnection = "jdbc:sqlite:sqlite.db";


    public PersonagemDAO() throws SQLException {
        try{
            connection = DriverManager.getConnection(myDBConnection);
            System.out.println("dasdasd");
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
  @Override
   public List<Personagem> getAll() {
        List<Personagem> listPersonagens = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultPersonagem = statement.executeQuery("SELECT * FROM Personagens");
            while (resultPersonagem.next()) {
                String raca = resultPersonagem.getString("raca");
                System.out.println(raca);
//                Personagem personagem = new Personagem(
//                        resultPersonagem.getString("nome"),
//                        resultPersonagem.getString("raca"),
//                        resultPersonagem.getString("prof"),
//                        resultPersonagem.getInt("mana"),
//                        resultPersonagem.getInt("ataque"),
//                        resultPersonagem.getInt("ataque_magico"),
//                        resultPersonagem.getInt("defesa"),
//                        resultPersonagem.getInt("defesa_magica"),
//                        resultPersonagem.getInt("velocidade"),
//                        resultPersonagem.getInt("destreza"),
//                        resultPersonagem.getInt("exp"),
//                        resultPersonagem.getInt("nivel_atual"));
//                System.out.println(personagem);
//                listPersonagens.add(personagem);
            }
            resultPersonagem.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPersonagens;


   }

    @Override
    public void create(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Personagens(nome,raca,prof,mana,ataque,ataque_magico,defesa,defesa_magica,velocidade,destreza,exp,nivel_atual) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1, personagem.getNome());
            preparedStatement.setString(2, personagem.getRaca());
            preparedStatement.setString(3, personagem.getProf());
            preparedStatement.setInt(4, personagem.getMana());
            preparedStatement.setInt(5, personagem.getAtaque());
            preparedStatement.setInt(6, personagem.getAtaque_magico());
            preparedStatement.setInt(7, personagem.getDefesa());
            preparedStatement.setInt(8, personagem.getDefesa_magica());
            preparedStatement.setInt(9, personagem.getVelocidade());
            preparedStatement.setInt(10, personagem.getDestreza());
            preparedStatement.setInt(11, personagem.getExp());
            preparedStatement.setInt(12, personagem.getNivel_atual());
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            if(e.getMessage().contains("SQLITE_CONSTRAINT")){
                select(personagem.getNome());
                System.out.println(personagem);
            }

        }
    }

    @Override
    public Personagem select(String nome) {
        return null;
    }

    @Override
    public void delete(String nome) {

    }
}