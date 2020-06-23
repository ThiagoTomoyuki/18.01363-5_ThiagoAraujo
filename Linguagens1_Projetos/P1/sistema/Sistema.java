package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import enums.FormaPagamento;
import models.*;
import interfaces.autenticacao;

/**
 * Classe que roda o sistema e implementa autenticação
 * 
 * @author Thiago T. Y. de Araujo - thiagotomoyuki@hotmail.com
 * @since 14/06/2020
 * @version 1.0
 */

public class Sistema implements autenticacao{
    String descricao, id,senhaColocada;
    double valor;
    int op = 1;
    int numeroDoPedido;
    int senha = 0;
    FormaPagamento formaPagamento;
    Usuario usuario = new Usuario("Pizzaria Rato que Ri", "EmailQualquer@hotmail.com");
    List <Pedido> pedidos = new ArrayList<>(); 
    /**
    * Função que roda o programa<br><br>
    *     Ela é responsavel por rodar o programa
    */
    public void run(){
        if(autenticacao()){
            while(op!=0){
                System.out.println("Pizzaria o Rato que Ri:");
                System.out.println("1 - Nova venda");
                System.out.println("2 - Verificar pedidos");
                System.out.println("3 - Alterar pedidos");
                System.out.println("0 - Sair");
                Scanner scanner = new Scanner(System.in);
                op = Integer.parseInt(scanner.nextLine());
            
                if(op == 1){
                    if(autenticacao()){
                        System.out.println("Qual a descricao: ");
                        descricao = scanner.nextLine();
                        System.out.println("Qual valor: ");
                        valor = Double.parseDouble(scanner.nextLine());
                        id = geradorId();                        
                        Pedido ped = new Pedido(id, descricao, valor);
                        ped.formaDePagamento();                        
                        pedidos.add(ped);
                    }
                    
                }else if(op == 2){
                    System.out.println("Pedidos:");
                    for(int i = 0; i< pedidos.size();i++){
                        pedidos.get(i).printarPedidos(i);
                    }
                }else if(op == 3){
                    if(autenticacao()){
                        for(int i = 0; i< pedidos.size();i++){
                            pedidos.get(i).printarPedidos(i);
                        }
                        System.out.println("Qual o numero do pedido deseja alterar:");
                        numeroDoPedido = Integer.parseInt(scanner.nextLine());
                        pedidos.get(numeroDoPedido-1).AlterarEstadoDoPedido();
                    }
                    
                }else if(op != 0){
                    System.out.println("Digite uma opção valida!");
                }
            }
        }    
    }
    /**
    * Pergunta e autentica a senha colocada pelo usuario
    */
    @Override
    public boolean autenticacao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque a senha:");
        senhaColocada = scanner.nextLine();        
        while(!(usuario.testarSenha(senhaColocada))){
            System.out.println("Senha errada!");
            System.out.println("Coloque a senha:");
            senhaColocada = scanner.nextLine();
        }
        return true;
    }
    /**
    * Gera um Id randomico para o pedido
    */
    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}