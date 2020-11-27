package DAO;

import enums.Raca;
import models.Personagem;
import enums.Prof;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonagemDAO implements DAO<Personagem>{
    private Connection connection;
    private  String myDBConnection = "jdbc:sqlite:sqlite.db";


    public PersonagemDAO() throws SQLException {
        try{
            connection = DriverManager.getConnection(myDBConnection);
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
                Raca enumRaca = Raca.valueOf(raca);

                String prof = resultPersonagem.getString("prof");
                Prof enumProf = Prof.valueOf(prof);

                Personagem personagem = new Personagem(
                        resultPersonagem.getString("nome"),
                        enumRaca,
                        enumProf,
                        resultPersonagem.getInt("mana"),
                        resultPersonagem.getInt("ataque"),
                        resultPersonagem.getInt("ataque_magico"),
                        resultPersonagem.getInt("defesa"),
                        resultPersonagem.getInt("defesa_magica"),
                        resultPersonagem.getInt("velocidade"),
                        resultPersonagem.getInt("destreza"),
                        resultPersonagem.getInt("exp"),
                        resultPersonagem.getInt("nivel_atual"));
                System.out.println(personagem);
                listPersonagens.add(personagem);
            }
            resultPersonagem.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPersonagens;


   }

    @Override
    public void create(Personagem personagem) throws SQLException {
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
    public Personagem select(String nome) throws SQLException {
        try{
            Statement statement = connection.createStatement();
            ResultSet resultPersonagem = statement.executeQuery("SELECT * FROM Personagens WHERE nome LIKE '%" +nome+ "%'");

            while (resultPersonagem.next()) {
                String raca = resultPersonagem.getString("raca");
                Raca enumRaca = Raca.valueOf(raca);

                String prof = resultPersonagem.getString("prof");
                Prof enumProf = Prof.valueOf(prof);
                Personagem personagem = new Personagem(
                        resultPersonagem.getString("nome"),
                        enumRaca,
                        enumProf,
                        resultPersonagem.getInt("mana"),
                        resultPersonagem.getInt("ataque"),
                        resultPersonagem.getInt("ataque_magico"),
                        resultPersonagem.getInt("defesa"),
                        resultPersonagem.getInt("defesa_magica"),
                        resultPersonagem.getInt("velocidade"),
                        resultPersonagem.getInt("destreza"),
                        resultPersonagem.getInt("exp"),
                        resultPersonagem.getInt("nivel_atual"));
                return personagem;
            }
            resultPersonagem.close();


        }catch (Exception e){
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public void UPDATE(String nome,Enum enums,String coluna,int valor) {
        try {
            Statement statement = connection.createStatement();
            if(coluna.equals("raca")|| coluna.equals("prof")){
                int resultPersonagem = statement.executeUpdate("UPDATE Personagens SET "+coluna+" = "+ "'" + enums+ "'" + " WHERE nome = "+ "'"+nome+ "'");
            }else{
                int resultPersonagem = statement.executeUpdate("UPDATE Personagens SET "+coluna+" = "+valor+" WHERE nome = "+ "'"+ nome+ "'");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String nome) {
        try{
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Personagens WHERE nome = "+"'"+nome+"'");
            int retorno = preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
