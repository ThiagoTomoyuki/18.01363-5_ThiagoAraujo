import java.util.ArrayList;
import java.util.List;
import models.Jogo;

public class ListaDeJogos{
    private List<Jogo> minhaListaDeJogos;

    public ListaDeJogos(){
        this.minhaListaDeJogos = new ArrayList<>();
    }

    public void addJogo(Jogo jogo){
        this.minhaListaDeJogos.add(jogo);
    }

    @Override
    public String toString(){
        return " ListaDejogos {" +
                "MinhaListDeJogo ='" + minhaListaDeJogos +
                '}';
    }
}