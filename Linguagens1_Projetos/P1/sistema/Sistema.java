package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import models.*;

import enums.EstadoDoPedido; 

public class Sistema {
    String descricao, id;
    double valor;
    int op = 1;
    int numeroDoPedido,senhaColocada;
    int senha = 0;
    Usuario usuario = new Usuario("Pizzaria Rato que Ri", "EmailQualquer@hotmail.com");
    List <Pedido> pedidos = new ArrayList<>(); 
    public void run(){
        if(autenticacao()){
        }else{
            System.out.println("Senha errada!");
        }
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
                    pedidos.add(new Pedido(id, descricao, valor));
                }
                
            }else if(op == 2){
                System.out.println("Pedidos:");
                for(int i = 0; i< pedidos.size();i++){
                    pedidos.get(i).printarPedidos(i);
                }
            }else if(op == 3){
                if(autenticacao()){
                    System.out.println("Qual o numero do pedido deseja alterar:");
                    numeroDoPedido = Integer.parseInt(scanner.nextLine());
                    pedidos.get(numeroDoPedido-1).AlterarEstadoDoPedido();
                }
                
            }else if(op != 0){
                System.out.println("Digite uma opção valida!");
            }
        }    
    }
    public boolean autenticacao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque a senha:");
        senhaColocada = Integer.parseInt(scanner.nextLine());        
        while(!(usuario.testarSenha(senhaColocada))){
            System.out.println("Senha errada!");
            System.out.println("Coloque a senha:");
            senhaColocada = Integer.parseInt(scanner.nextLine());
        }
        return true;
    }

    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}