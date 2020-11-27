package models;

public class Personagem {
    String nome;

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", raca=" + raca +
                ", prof=" + prof +
                ", mana=" + mana +
                ", ataque=" + ataque +
                ", ataque_magico=" + ataque_magico +
                ", defesa=" + defesa +
                ", defesa_magica=" + defesa_magica +
                ", velocidade=" + velocidade +
                ", destreza=" + destreza +
                ", exp=" + exp +
                ", nivel_atual=" + nivel_atual +
                '}';
    }

    Enum raca,prof;
    int mana;
    int ataque,ataque_magico,defesa,defesa_magica,velocidade,destreza;
    int exp,nivel_atual;



    public Personagem(String nome, Enum raca, Enum prof, int mana, int ataque, int ataque_magico, int defesa, int defesa_magica, int velocidade, int destreza, int exp, int nivel_atual) {
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
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return "" + raca;
    }

    public String getProf() {
        return "" + prof;
    }

    public int getMana() {
        return mana;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaque_magico() {
        return ataque_magico;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDefesa_magica() {
        return defesa_magica;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getDestreza() {
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

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setAtaque_magico(int ataque_magico) {
        this.ataque_magico = ataque_magico;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setDefesa_magica(int defesa_magica) {
        this.defesa_magica = defesa_magica;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setNivel_atual(int nivel_atual) {
        this.nivel_atual = nivel_atual;
    }
}
