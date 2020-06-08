package sistema;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.JornadaEnum;
import jdk.nashorn.internal.ir.FunctionCall;
import models.Membros;

public class Sistema {
    List<Membros> membros = new ArrayList<>();
    JornadaEnum jornada = JornadaEnum.REGULAR;
    public void run(){
        int op = 1;
        System.out.println("Bem vindo ao nosso sistema!");
        while(op!=0){
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Cadastras novo membro");
            System.out.println("2 - Apresentacao dos membro cadastrados");
            System.out.println("3 - Deixar um colaborador ir");
            System.out.println("4 - Trocar a jornada de trabalho");
            System.out.println("5 - Postar mensagem");
            System.out.println("0 - Sair do sistema");
            System.out.println("Jornada de trabalho: ");
            Scanner scanner = new Scanner(System.in);
            op = scanner.nextInt();
            if(op==1){
                CadastrarMembros();
            }else if(op==2){
                ApresentacaoMembros();
            }else if(op==3){
                
            }else if(op==4){
                TrocarJornada();
            }else if(op==5){
                
            }else if (op != 0){
                System.out.println("Digite um numero valido!");
            }
        }
        

    }

    private void CadastrarMembros(){  
        String nome,email;
        int funcao;
        Scanner scanner = new Scanner(System.in);      
        System.out.println("Nome:");
        nome = scanner.nextLine();
        System.out.println("Email:");
        email = scanner.nextLine();
        System.out.println("Cargo:");
        System.out.println("1- MOBILE_MEMBERS");
        System.out.println("2- HEAVY_LIFTER");
        System.out.println("3- SCRIPT_GUYS");
        System.out.println("4- BIG_BROTHERS");
        funcao = Integer.parseInt(scanner.nextLine());
        membros.add(new Membros(nome,email,funcao));
    }

    private void ApresentacaoMembros() {
        System.out.println("Membros cadastrados: ");
        for(int i = 0; i < membros.size(); i++){
            System.out.println("Nome: " + membros.get(i).getNome());
            System.out.println("Email: " + membros.get(i).getEmail());
            System.out.println("Email: " + membros.get(i).getEmail());
        } 
    }

    private  void DeixarIr(){
            
    }

    private void TrocarJornada() {

        if(jornada == JornadaEnum.EXTRA){
            jornada = JornadaEnum.REGULAR;
        }else if(jornada == JornadaEnum.REGULAR)
        jornada = JornadaEnum.EXTRA;
    }
}