import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class TesteDesserializar {
    public static void main(String[] args) {
        Pessoa p1, p2;

        try {
            //acessa o arquivo
            FileInputStream fileInputStream = new FileInputStream("ecm251.maua");
            //acessa os dados do arquivo
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //Ler os objetos do arquivo
            p1 = (Pessoa)objectInputStream.readObject();    
            p2 = (Pessoa)objectInputStream.readObject(); 
            System.out.println("Pessoas: "+p1 + p2);
            
            //fecha os fluxos
            objectInputStream.close();
            fileInputStream.close();
            
        } catch (Exception exception) {
            System.out.println("Deu ruim!!");
            exception.printStackTrace();
        }
        
    }
}