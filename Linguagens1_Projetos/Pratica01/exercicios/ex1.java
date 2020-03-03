import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, email, cidade,RA,telefone;
        int idade;
        System.out.println("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o RA: ");
        RA = scanner.nextLine();
        System.out.println("Informe o Cidade: ");
        cidade = scanner.nextLine();
        System.out.println("Informe o Email: ");
        email = scanner.nextLine();
        System.out.println("Informe o Telefone: ");
        telefone = scanner.nextLine();
        System.out.println("Informe a idade: ");
        idade = scanner.nextInt();
        System.out.println("Nome: "+nome+"\nRA: "+RA+"\nCidade: "+cidade+ "\nEmail: "+email+"\nTelefone: "+telefone+"\nIdade: "+idade);
    } 
        
}