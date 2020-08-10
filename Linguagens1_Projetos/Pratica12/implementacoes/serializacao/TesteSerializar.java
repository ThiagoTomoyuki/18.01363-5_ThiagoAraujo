
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TesteSerializar {
    public static void main(String[] args) {
        System.out.println("Teste de serializacao: ");
        Pessoa p1 = new Pessoa("Thiago", 20);
        Pessoa p2 = new Pessoa("Matheus", 21);
        
        System.out.println("Pessoas" + p1 + p2);
        try {
            //Cria uma forma de escrever arquivos no SO
            FileOutputStream fileOutputStream = new FileOutputStream("ecm251.maua");
            //Cria objeto q faz a conversao em bits do objeto
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            //Escreve os objetos no arquivo
            outputStream.writeObject(p1);
            outputStream.writeObject(p2);

            //Fechar os fluxos
            outputStream.close();
            fileOutputStream.close();

        } catch (Exception exception) {
            System.out.println("Deu ruim!");
            exception.printStackTrace();
        }

        System.out.println("Objetos salvos!");
    }
}