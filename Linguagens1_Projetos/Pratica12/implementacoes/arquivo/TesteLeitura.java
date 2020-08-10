import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TesteLeitura {
    public static void main(String[] args) {
        File file = new File("nome.txt");

        try {
            //cria o fluxo de leitura
            FileReader fileReader = new FileReader(file);

            //buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.lines().forEach(linha->{
                System.out.println("Linha lida: " + linha);
            });

            //fecahr tudo
            bufferedReader.close();
            fileReader.close();
            
        } catch (Exception e) {
            System.out.println("Algo deu errado!!");
            e.printStackTrace();
        }
    }
}