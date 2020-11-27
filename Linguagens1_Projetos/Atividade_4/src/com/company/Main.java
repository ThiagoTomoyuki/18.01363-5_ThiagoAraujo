package com.company;

import sistema.Aplicacao;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        Aplicacao aplicacao = new Aplicacao();
        aplicacao.run();
    }
}
