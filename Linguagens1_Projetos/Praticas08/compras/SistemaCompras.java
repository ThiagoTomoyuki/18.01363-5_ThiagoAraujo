package compras;
import models.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SistemaCompras {
    private final List<Produto> produtos;
    private final ListaCompras listaCompras;
    public SistemaCompras() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Final Fantasy 7", 299.00));
        produtos.add(new Produto(2, "Zelda - BOTW", 299.00));
        produtos.add(new Produto(3, "Mario - Odyssey", 299.00));
        produtos.add(new Produto(4, "Animal Crossing", 399.00));
        
        listaCompras = new ListaCompras();

    }

    public void exibirListaProdutos(){
        System.out.println("Lista de Produtos Disponíveis:");
        produtos.forEach((produto) -> System.out.println(produto));
    }

    public void run(){
        int opcao = 0; 
        int quantidade = 0;
        int item = 0;
        exibirListaProdutos();
        
        while(opcao != 4){
            System.out.println("0 - Adicionar iten na lista de compras");
            System.out.println("1 - Remover iten na lista de compras");
            System.out.println("2 - Exibir lista de compras");
            System.out.println("3 - Editar quantidade de produtos na lista de compras");
            System.out.println("4 - Finalizar lista de compras");
            System.out.println("Qual opção deseja: ");
            Scanner sc1 = new Scanner(System.in);
            opcao = sc1.nextInt();
            if(opcao == 0){
                System.out.println("Qual codigo do produto que deseja adicionar: ");
                Scanner sc2 = new Scanner(System.in);
                listaCompras.adicionarItem(produtos.get(sc2.nextInt()-1));
            }else if(opcao ==1){
                System.out.println("Qual item deseja excuir: ");
                Scanner sc4 = new Scanner(System.in);
                listaCompras.removerItem(sc4.nextInt()-1);
            }else if(opcao == 2){
                listaCompras.printListaDeCompras();
            }else if(opcao == 3){
                System.out.println("Qual iten deseja aumentar a quantidade: ");
                item = sc1.nextInt();
                System.out.println("Qual quantidade deseja: ");
                quantidade = sc1.nextInt();
                listaCompras.getListaDeCompras().get(item-1).modificarQuantidadeItem(quantidade);;
            }else if(opcao != 4){
                System.out.println("Insira um numero valido!");
            }
        }
        double soma = 0;
        int qtd = 0;
        for(int i =0; i<listaCompras.getListaDeCompras().size();i++){  
            qtd = listaCompras.getListaDeCompras().get(i).getQuantidade();          
            soma += qtd*(listaCompras.getListaDeCompras().get(i).getValor());
            
        }  
        System.out.println("Sua compra ficou no valor de R$ "+soma);
    }
}