package DAO;

import models.Anime;

import java.util.List;

public interface DAO <T>{
    List<T> getAll();
    void create(T t);
    T select(String nome);


}
