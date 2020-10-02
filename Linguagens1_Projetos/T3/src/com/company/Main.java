package com.company;


import testes.AplicacaoDao;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        AplicacaoDao app = new AplicacaoDao();
        app.run();

    }
}
