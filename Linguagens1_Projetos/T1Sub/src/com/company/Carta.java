package com.company;

public class Carta {
    private String URL;
    private String ID;
    private String nome;
    private String raridade;
    private String serieCarta;
    private String colecao;


    public Carta(String URL, String ID, String nome, String raridade, String serieCarta, String colecao) {
        this.URL = URL;
        this.ID = ID;
        this.nome = nome;
        this.raridade = raridade;
        this.serieCarta = serieCarta;
        this.colecao = colecao;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "URL='" + URL + '\'' +
                ", ID='" + ID + '\'' +
                ", nome='" + nome + '\'' +
                ", raridade='" + raridade + '\'' +
                ", serieCarta='" + serieCarta + '\'' +
                ", colecao='" + colecao + '\'' +
                '}';
    }

    public String getURL() {
        return URL;
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public String getSerieCarta() {
        return serieCarta;
    }

    public String getColecao() {
        return colecao;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public void setSerieCarta(String serieCarta) {
        this.serieCarta = serieCarta;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }
}
