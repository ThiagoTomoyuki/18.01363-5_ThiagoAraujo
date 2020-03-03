import java.util.Scanner;

public class ex7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;
        int Y=0,X=0;
        System.out.print("Informe um valor: ");
        numero = scanner.nextLine();
        for(int i = 0; i < numero.length() ; i++){
            Y = Character.getNumericValue(numero.charAt(i));
            X += Y;            
        }
        System.out.println(X);   
    }
}