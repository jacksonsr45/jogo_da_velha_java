package com.uninter;

import java.util.Scanner;

public class Jogador {
    /**
     * @var movimento
    */
    private String[] movimento = new String[2];

    /**
     * @return movimento
    */
    public String[] getMovimento() {
        return movimento;
    }

    /**
     * Entrando com valor a movimento pelo Scanner
    */
    public void setMovimento()
    {
        /**
         * Como é só em formato de testo
         * Somente chamando scanner para ler dados de entrada de jogador
         * retornando a array movimento para ser impresso em tela
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor da coluna entre (A, B, C): ");
        String coluna = scanner.next();
        System.out.println("Entre com o valor da linha entre (1, 2, 3): ");
        String linha = scanner.next();
        this.movimento[0] = coluna;
        this.movimento[1] = linha;
    }
}
