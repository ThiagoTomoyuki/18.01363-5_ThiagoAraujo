//Sequência de Fibonnacci.

import java.util.Scanner;

import javax.sql.XAConnection;

public class ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Informe qual numero de Fibonnacci deseja: ");
        numero = scanner.nextInt();
        double[] sequencia;
        sequencia = new double[numero];
        sequencia[0] = 0;
        sequencia[1] = 1;
        if(numero == 0){
            System.out.println(numero);
        }else if(numero == 1){
            System.out.println(numero);
        }else if(numero == 2){
            System.out.println("1.0");
        }else{   
            System.out.println("0.0");
            System.out.println("1.0");
            System.out.println("1.0");        
            for(int i = 2; i < numero ; i++){
                sequencia[i] = sequencia[i-1] + sequencia[i-2];
                System.out.println(sequencia[i]);
            }
        }
    }
}
//        for(int i = 2; i >= numero ; i++) {
//           if (numero == 0){
//                System.out.println("x0"+numero);
//            }else if((numero == 1){
//                System.out.println("x1"+numero);
//           }else{
//                sequencia[i] = sequencia[i-1] + sequencia[i-2];
//                System.out.println();
//            }
//            }
//            }
//        }