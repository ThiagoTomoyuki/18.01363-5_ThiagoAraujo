package DAO;

import java.util.List;

public interface DAO <T> {
    List<T> getAll();

    void create(T t);

    T select(String nome);

    void delete(String nome);
}


