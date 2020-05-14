package compras;

import models.Item;
import models.Produto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaCompras {
    public ListaCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    private final List<Item> listaDeCompras;

    public void adicionarItem(Produto produto){
        this.listaDeCompras.add(
                new Item(1, produto)
        );
    }
    public void removerItem(int codigo){
        this.listaDeCompras.remove(codigo);
    }

    public void printListaDeCompras(){
        for (int i =0; i<listaDeCompras.size() ;i++) {
            System.out.print((i+1)+" - ");
            System.out.println(listaDeCompras.get(i));
        }

    }

    //Apenas para testar
    public List<Item> getListaDeCompras(){
        return this.listaDeCompras;
    }
}