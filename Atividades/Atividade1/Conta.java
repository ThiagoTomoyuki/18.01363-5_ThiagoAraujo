//Thiago Tomoyuki Yara de Araujo  RA:18.01363-5

public class Conta {
    private Usuario user;
    private double saldo;
    private int id;
    private static int numeroContas;

    public Conta(Usuario user, double saldo){
        this.user = user;
        this.saldo = saldo;
        numeroContas += 1;
        id = numeroContas;
    }

    public int getid(){
        return id;
    }

    public Usuario getUsuario(){
        return this.user;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean sacar(double valor){
    if( saldo >= valor){
        saldo -= valor;
        return true;
    }else{
        return false;
    }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
}