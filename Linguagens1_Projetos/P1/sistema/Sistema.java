package sistema;
import java.util.Scanner; 

public class Sistema {
    public void run(){
        int op = 1;
        Usuario usuario = new Usuario("Pizzaria Rato que Ri", "EmailQualquer@hotmail.com");
        while(op!=0){
            System.out.println("Pizzaria o Rato que Ri:");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Verificar pedidos");
            System.out.println("3 - Alterar pedidos");
            System.out.println("0 - Sair");
            Scanner scanner = new Scanner(System.in);
            op = scanner.nextInt();
            if(op == 1){
                
            }else if(op == 2){

            }else if(op == 3){

            }else if(op != 0){
                System.out.println("Digite uma opção valida!");
            }
        }

    }
}