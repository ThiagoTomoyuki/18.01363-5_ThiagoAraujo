package br.maua;

import pacote.Qualquercoisa;
//import pacote.Dog;

public class Main{
        public static void main(String[] args) {
            Qualquercoisa mQualquercoisa = new Qualquercoisa();
            Dog dog1 = new Dog(30);
            pacote.java.Dog dog2 = new pacote.java.Dog(3);
            dog1.bark();
            mQualquercoisa.ola();
            dog2.bark();
        }
}