import java.util.Scanner;

public class ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2, soma=0, produto =1;
        System.out.print("Informe os numeros: ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        for(int i=numero1; i<=numero2;i++){
            soma += i;
            produto *= i;

        }
        System.out.println("Soma: "+soma);
        System.out.println("Produto: "+ produto);
    } 
        
}