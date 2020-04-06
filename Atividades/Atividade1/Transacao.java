import java.util.Random;

//Thiago Tomoyuki Yara de Araujo  RA:18.01363-

public class Transacao {
    private static int getRandomNumberInRange(int min,int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static void transferir( Conta contadestino , String qrcode, Conta contadestinatario){
        int id, nrandom;
        String nome;
        double valor;
        String[] dados = qrcode.split(";");
        id = Integer.parseInt(dados[0]);
        nome = dados[1];
        valor = Double.parseDouble(dados[2]);
        nrandom = Integer.parseInt(dados[3]);
        if(contadestinatario.sacar(valor)){
            contadestino.depositar(valor);
        }
    }

    public  static String qrcode(Conta conta, double valor){
        String s;
        s = conta.getid() + ";" + conta.getUsuario().getNome() + ";" + valor + ";" + getRandomNumberInRange(1000, 9999);
        return s;
    }



}