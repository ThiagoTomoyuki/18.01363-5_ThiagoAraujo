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
    EstadoDoPedido estadoDoPedido = EstadoDoPedido.REALIZADO;
    int op = 1;
    int senha = 0;
    Usuario usuario = new Usuario("Pizzaria Rato que Ri", "EmailQualquer@hotmail.com");
    List <Pedido> pedidos = new ArrayList<>(); 
    public void run(){

        while(op!=0){
            System.out.println("Pizzaria o Rato que Ri:");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Verificar pedidos");
            System.out.println("3 - Alterar pedidos");
            System.out.println("0 - Sair");
            Scanner scanner = new Scanner(System.in);
            op = Integer.parseInt(scanner.nextLine());
            if(op == 1){
                System.out.println("Qual a descricao: ");
                descricao = scanner.nextLine();
                System.out.println("Qual valor: ");
                valor = Double.parseDouble(scanner.nextLine());
                id = geradorId();
                pedidos.add(new Pedido(id, descricao, valor));
            }else if(op == 2){
                
            }else if(op == 3){
                
            }else if(op != 0){
                System.out.println("Digite uma opção valida!");
            }
        }    
    }
    private void CadastrarPedido(){
    }
    private String geradorId(){
        Random random = new Random();
        String idGerado = null;
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}