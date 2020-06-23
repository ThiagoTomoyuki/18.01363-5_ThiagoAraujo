package models;
import java.util.Scanner;
import enums.EstadoDoPedido;
import enums.FormaPagamento;

public class Pedido {
    String id, descricao;
    double valor;
    EstadoDoPedido estadoDoPedido = EstadoDoPedido.REALIZADO;
    FormaPagamento formaPagamento ;
    public Pedido(String id,String descricao, double valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    /**
    * Função que altera o estado do pedido
    */
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

    public void formaDePagamento(){
        Scanner scanner = new Scanner(System.in);
        int formaDePagamento;
        System.out.println("Qual sua forma de pagamento:");
        System.out.println("1- DINHEIRO");
        System.out.println("2- DEBITO");
        System.out.println("3- CREDITO");
        System.out.println("4- VALE_ALIMENTACAO");
        System.out.println("5- VALE_REFEICAO");
        formaDePagamento = Integer.parseInt(scanner.nextLine());
        if(formaDePagamento == 1){
            this.formaPagamento = FormaPagamento.DINHEIRO;
        }else if(formaDePagamento == 2){
            this.formaPagamento = FormaPagamento.DEBITO;
        }else if(formaDePagamento == 3){
            this.formaPagamento = FormaPagamento.CREDITO;
        }else if(formaDePagamento == 4){
            this.formaPagamento = FormaPagamento.VALE_ALIMENTACAO;
        }else if(formaDePagamento == 5){
            this.formaPagamento = FormaPagamento.VALE_REFEICAO;
        }
    }
    /**
    * Função que printa os pedidos cadastrados
    */
    public void printarPedidos(int i){
        System.out.println("\u001b[41m " + (i+1)+"º Pedido \u001b[0m ");
        System.out.println("Id do pedido: " + getId());
        System.out.println("Descricao: "+ getDescricao());
        System.out.println("Valor: "+ getValor());
        System.out.println("Estado do pedido: " + estadoDoPedido);
        System.out.println("Forma de pagamento: " + formaPagamento);
    }
    /**
    * Função que Retorna o Id do pedido
    */
    public String getId(){
        return id;
    }
    /**
    * Função que Retorna a descrição do pedido
    */
    public String getDescricao(){
        return descricao;
    }
    /**
    * Função que Retorna o valor do pedido
    */
    public double getValor(){
        return valor;
    }
}