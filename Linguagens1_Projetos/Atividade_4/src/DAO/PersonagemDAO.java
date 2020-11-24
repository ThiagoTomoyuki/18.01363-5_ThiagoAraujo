package DAO;

import models.Personagem;

import java.util.List;

public class PersonagemDAO implements DAO<Personagem>{
    @Override
    public List<Personagem> getAll() {
        return null;
    }

    @Override
    public void create(Personagem personagem) {

    }

    @Override
    public Personagem select(String nome) {
        return null;
    }

    @Override
    public void delete(String nome) {

    }
}
