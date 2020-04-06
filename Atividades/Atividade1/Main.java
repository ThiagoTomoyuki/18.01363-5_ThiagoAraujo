//Thiago Tomoyuki Yara de Araujo  RA:18.01363-5

public class Main {

    public static void main(String[] args) {
    String j,k;

    Usuario usu1 = new Usuario("Thiago", "123"," xxx");
    Usuario usu2 = new Usuario("Jorge", "456", "yyy");
    Usuario usu3 = new Usuario("Matheus", "789", "zzz");

    Conta c1 = new Conta( usu1, 1000);
    Conta c2 = new Conta( usu2, 250);
    Conta c3 = new Conta( usu3, 3000);


    System.out.println("Estado Inicial:");
    System.out.println("Nome do Usuario: "+ c1.getUsuario().getNome() + "-" + "Saldo: " + c1.getSaldo());
    System.out.println("Nome do Usuario: "+ c2.getUsuario().getNome() + "-" + "Saldo: " + c2.getSaldo());
    System.out.println("Nome do Usuario: "+ c3.getUsuario().getNome() + "-" + "Saldo: " + c3.getSaldo());

    j = Transacao.qrcode(c1,250);
    Transacao.transferir(c1, j, c2);
    Transacao.transferir(c1, j, c3);
    Transacao.transferir(c1, j, c2);
    k = Transacao.qrcode(c2,1000);
    Transacao.transferir(c2, k, c3);

    System.out.println("Estado Final:");
    System.out.println("Nome do Usuario: "+ c1.getUsuario().getNome() + "-" + "Saldo: " + c1.getSaldo());
    System.out.println("Nome do Usuario: "+ c2.getUsuario().getNome() + "-" + "Saldo: " + c2.getSaldo());
    System.out.println("Nome do Usuario: "+ c3.getUsuario().getNome() + "-" + "Saldo: " + c3.getSaldo());


}
}