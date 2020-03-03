//Diferença de idade

import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome1, nome2;
        int idade1,idade2, DifIdade;
        System.out.print("Informe os nomes: ");
        nome1 = scanner.nextLine();
        nome2 = scanner.nextLine();
        System.out.print("Informe as idades: ");
        idade1 = scanner.nextInt();
        idade2 = scanner.nextInt();
        DifIdade = idade1 - idade2;
        System.out.println("Diferença= "+Math.abs(DifIdade));
    } 
        
}