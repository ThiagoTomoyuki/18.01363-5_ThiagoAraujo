package models;

import enums.EstadoDoPedido;

public class Pedido {
    String id, descricao;
    double valor;
    EstadoDoPedido estadoDoPedido;
    public Pedido(String id,String descricao, double valor){
        this.id = id;
        this.descricao = descricao;
    }
    public void AlterarEstadoDoPedido(int estadoDoPedido){
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