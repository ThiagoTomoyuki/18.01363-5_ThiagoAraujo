package Exemplo1;

import java.sql.ClientInfoStatus;

public class Conta{
    //Atributos da classe
    public int numero;
    public Cliente cliente;
    public double saldo;
    //Metodos das classes
    boolean sacar(double valor){
        if(valor > this.saldo)
            return false;
        else{
            this.saldo -= valor;
            return true;
        }
    }
    void  depositar(double valor){
        this.saldo += valor;
    }
    void  vizualisarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    boolean trasferirDinheiro( Conta destino, double valor){
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }else
            return false;
    }
}