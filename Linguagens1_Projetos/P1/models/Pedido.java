package models;
import java.util.Scanner;
import enums.EstadoDoPedido;

public class Pedido {
    String id, descricao;
    double valor;
    EstadoDoPedido estadoDoPedido = EstadoDoPedido.REALIZADO;
    public Pedido(String id,String descricao, double valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    public void AlterarEstadoDoPedido(){
        Scanner scanner = new Scanner(System.in);
        int estadoDoPedido;
        System.out.println("Para qual estado deseja alterar:");
        System.out.println("1- REALIZADO");
        System.out.println("2- PREPARACAO");
        System.out.println("3- SAIU_PARA_ENTREGA");
        System.out.println("4- ENTREGUE");
        System.out.println("5- DEVOLVIDO");
        estadoDoPedido = Integer.parseInt(scanner.nextLine());
        if(estadoDoPedido == 1){
            this.estadoDoPedido = EstadoDoPedido.REALIZADO;
        }else if(estadoDoPedido == 2){
            this.estadoDoPedido = EstadoDoPedido.PREPARACAO;
        }else if(estadoDoPedido == 3){
            this.estadoDoPedido = EstadoDoPedido.SAIU_PARA_ENTREGA;
        }else if(estadoDoPedido == 4){
            this.estadoDoPedido = EstadoDoPedido.ENTREGUE;
        }else if(estadoDoPedido == 5){
            this.estadoDoPedido = EstadoDoPedido.DEVOLVIDO;
        }
    }
    public void printarPedidos(int i){
        System.out.println("Pedidos:");
            System.out.println((i+1)+"º Pedido");
            System.out.println("Id do pedido: " + getId());
            System.out.println("Descricao: "+ getDescricao());
            System.out.println("Valor: "+ getValor());
            System.out.println("Estado do pedido: " + estadoDoPedido);

    }
    
    public String getId(){
        return id;
    }
    public String getDescricao(){
        return descricao;
    }
    public double getValor(){
        return valor;
    }
}