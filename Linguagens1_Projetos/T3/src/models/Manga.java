package models;

public class Manga {
    private String url;
    private String nome;
    private String sinopse;
    private int quantCap;
    private double quantVolume;
    private String tipo;
    private double nota;

    public Manga(String url, String nome, String sinopse, int quantCap, double quantVolume, String tipo, double nota) {
        this.url = url;
        this.nome = nome;
        this.sinopse = sinopse;
        this.quantCap = quantCap;
        this.quantVolume = quantVolume;
        this.tipo = tipo;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "url='" + url + '\'' +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", quantCap=" + quantCap +
                ", quantVolume=" + quantVolume +
                ", tipo='" + tipo + '\'' +
                ", nota=" + nota +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public String getNome() {
        return nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getQuantCap() {
        return quantCap;
    }

    public double getQuantVolume() {
        return quantVolume;
    }

    public String getTipo() {
        return tipo;
    }

    public double getNota() {
        return nota;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setQuantCap(int quantCap) {
        this.quantCap = quantCap;
    }

    public void setQuantVolume(double quantVolume) {
        this.quantVolume = quantVolume;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
