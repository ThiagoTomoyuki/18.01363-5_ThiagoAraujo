package DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T> {
    List<T> getAll();

    void create(T t) throws SQLException;

    T select(String nome) throws SQLException;

    void UPDATE(String nome,Enum raca,String coluna,int valor);

    void delete(String nome);
}


