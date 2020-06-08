package sistema;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sun.tools.jar.resources.jar;

public class Sistema extends Membros{
    public static void run(){
        int op;
        System.out.println("Bem vindo ao nosso sistema!");
        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Cadastras novo membro");
        System.out.println("2 - Apresentacao dos membro cadastrados");
        System.out.println("3 - Deixar um colaborador ir");
        System.out.println("4 - Trocar a jornada de trabalho");
        System.out.println("5 - Postar mensagem");
        System.out.println("0 - Sair do sistema");
        System.out.println("Jornada de trabalho: ");
        Scanner scanner = new Scanner(System.in);
        List<Membros> membros = new ArrayList<>():
        op = scanner.nextInt();
        if(op==1){

        }else if(op==2){
            
        }else if(op==3){
            
        }else if(op==4){
            
        }else if(op==5){
            
        }else if(op==0){
            
        }else{
            System.out.println("Digite um numero valido!");
        }
    }
    private static void CadastrarMembros(List<Membros> membros){
        
    }

    private static void ApresentacaoMembros() {
        
    }
    private static  void DeixarIr(){
            
    }

    private static void TrocarJornada(int Jornada) {
        
    }
}