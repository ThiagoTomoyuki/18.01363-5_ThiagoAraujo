package sistema;
import java.util.Scanner;

import enums.EstadoDoPedido; 

public class Sistema {
    EstadoDoPedido estadoDoPedido = EstadoDoPedido.REALIZADO;
    int op = 1;
    int senha = 0;
    Usuario usuario = new Usuario("Pizzaria Rato que Ri", "EmailQualquer@hotmail.com");
    public void run(){

        while(op!=0){
            System.out.println("Pizzaria o Rato que Ri:");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Verificar pedidos");
            System.out.println("3 - Alterar pedidos");
            System.out.println("0 - Sair");
            Scanner scanner = new Scanner(System.in);
            op = scanner.nextInt();
            if(op == 1){
                while(senha != usuario.senha){
                    System.out.println("Digite a senha para prosseguir: ");
                    senha = scanner.nextInt();
                    if(senha == usuario.senha){
                        CadastrarPedido();
                    }else{
                        System.out.println("Senha Incorreta!");
                    }
                }
            }else if(op == 2){
                while(senha != usuario.senha){
                    System.out.println("Digite a senha para prosseguir: ");
                    senha = scanner.nextInt();
                    if(senha == usuario.senha){

                    }else{
                        System.out.println("Senha Incorreta!");
                    }
                }

            }else if(op == 3){
                while(senha != usuario.senha){
                    System.out.println("Digite a senha para prosseguir: ");
                    senha = scanner.nextInt();
                    if(senha == usuario.senha){

                    }else{
                        System.out.println("Senha Incorreta!");
                    }
                }

            }else if(op != 0){
                System.out.println("Digite uma opção valida!");
            }
        }    
    }
    private void CadastrarPedido(){
    }
}