import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import jdk.jfr.events.FileWriteEvent;

public class TesteEscrita {
    public static void main(String[] args) {
        //cria um arquivo
        File file = new File("nome.txt");

        try {   
            //cria uma conexao para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //cria um buffer de escrita
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            //escrever algo no arquivo
            bufferedWriter.write("ola mundo\n");
            bufferedWriter.write("lala 2+2 = "+ (2+2)+"\n");
            bufferedWriter.write("Jorge lalal\n");

            //Forca escrita na hora
            //bufferedWriter.flush();

            //fecha o buffer e es reve no arquivo
            bufferedWriter.close();

            //fecha o fluxo
            fileWriter.close();
            
        } catch (Exception e) {
            System.out.println("Deu ruim!!");
            e.printStackTrace();
        } 
    }
}