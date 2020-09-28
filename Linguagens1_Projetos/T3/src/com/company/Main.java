package com.company;

import sistema.Sistema;
import testes.AplicacaoDao;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        AplicacaoDao app = new AplicacaoDao();
        app.run();

    }
}
