package Exemplo1;


public class ContaTesteDrive{
    public static void main(String[] args) {
        //Declara C1, ainda sem nada dentro(nullPointer)
        Conta c1;
        //Instancia conta - coloca a referencia de um novo objeto
        c1 = new Conta();
        //Acesso titular da conta
        c1.cliente = new Cliente();
        c1.cliente.nome = "Odair";
        System.out.println("Titular C1: " +c1.cliente.nome);
        Conta c2 = new Conta();
//        c2.titular = "Goku";
//        System.out.println("Titular C2:" + c2.titular);
        c1.saldo = 2000;
        c1.vizualisarSaldo();
        c2.vizualisarSaldo();
        c1.sacar(300);
        c1.vizualisarSaldo();
        c1.trasferirDinheiro(c2,1000);
        c1.vizualisarSaldo();
        c2.vizualisarSaldo();
    }
}