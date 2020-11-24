package models;

public class Personagem {
    String nome;
    Enum raca,prof;
    int mana;
    double ataque,ataque_magico,defesa,defesa_magica,velocidade,destreza;
    int exp,nivel_atual;

    public Personagem(String nome, Enum raca, Enum prof, int mana, double ataque, double ataque_magico, double defesa, double defesa_magica, double velocidade, double destreza, int exp, int nivel_atual) {
        this.nome = nome;
        this.raca = raca;
        this.prof = prof;
        this.mana = mana;
        this.ataque = ataque;
        this.ataque_magico = ataque_magico;
        this.defesa = defesa;
        this.defesa_magica = defesa_magica;
        this.velocidade = velocidade;
        this.destreza = destreza;
        this.exp = exp;
        this.nivel_atual = nivel_atual;
    }
    public Enum getRaca() {
        return raca;
    }

    public Enum getProf() {
        return prof;
    }

    public int getMana() {
        return mana;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getAtaque_magico() {
        return ataque_magico;
    }

    public double getDefesa() {
        return defesa;
    }

    public double getDefesa_magica() {
        return defesa_magica;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getDestreza() {
        return destreza;
    }

    public int getExp() {
        return exp;
    }

    public int getNivel_atual() {
        return nivel_atual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(Enum raca) {
        this.raca = raca;
    }

    public void setProf(Enum prof) {
        this.prof = prof;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setAtaque_magico(double ataque_magico) {
        this.ataque_magico = ataque_magico;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public void setDefesa_magica(double defesa_magica) {
        this.defesa_magica = defesa_magica;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setDestreza(double destreza) {
        this.destreza = destreza;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setNivel_atual(int nivel_atual) {
        this.nivel_atual = nivel_atual;
    }
}
