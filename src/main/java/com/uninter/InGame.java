package com.uninter;

public class InGame {
    /**
     * valor default para tabuleiro
     * @var MAX_SICE
    */
    private int MAX_SICE = 8;
    /**
     * @var jogadaValida
    */
    private boolean jogadaValida;
    /**
     * @var printInTabuleiro 
    */
    private String[][] printInTabuleiro = new String[MAX_SICE][MAX_SICE];

    /**
     * @param jogador
     * @param movimento
    */
    public void getValues(int jogador, String[] movimento) {
        /**
         * Chamando função setPrintTabuleiro nesta classe como Helper para tabuleiro
         * passando o jogador e o movimento para ser impresso
        */
        this.setPrintTabuleiro(jogador, movimento);
    }

    /**
     * @param jogador
     * @param movimento
    */
    public void setPrintTabuleiro(int jogador, String[] movimento)
    {
        for (int l = 0; l < this.printInTabuleiro.length; l++) 
        {
            for (int c = 0; c < this.printInTabuleiro.length; c++) 
            {
                if (this.printInTabuleiro[l][c] != null)
                {

                }
                else if (this.printInTabuleiro[l][c] == null)
                {
                    this.printInTabuleiro[l][c] = " ";
                }
            }
        }
        if ( jogador == 1 )
        {
            switch (movimento[0]) {
                case "A":
                case "a":
                    switch (movimento[1]) {
                        case "1":
                            this.printInTabuleiro[2][2] = "X";
                            this.setJogadaValida(true);
                            break;
                        case "2":
                            this.printInTabuleiro[2][4] = "X";
                            this.setJogadaValida(true);
                            break;
                        case "3":
                            this.printInTabuleiro[2][6] = "X";
                            this.setJogadaValida(true);
                            break;
                        default:
                            System.out.println("Opção invalida");
                            this.setJogadaValida(false);
                            break;
                    }
                    break;
                case "B":
                case "b":
                    switch (movimento[1]) {
                        case "1":
                            this.printInTabuleiro[4][2] = "X";
                            break;
                        case "2":
                            this.printInTabuleiro[4][4] = "X";
                            break;
                        case "3":
                            this.printInTabuleiro[4][6] = "X";
                            break;
                        default:
                            System.out.println("Opção invalida");
                            this.setJogadaValida(false);
                            break;
                    }
                    break;
                case "C":
                case "c":
                    switch (movimento[1]) {
                        case "1":
                            this.printInTabuleiro[6][2] = "X";
                            break;
                        case "2":
                            this.printInTabuleiro[6][4] = "X";
                            break;
                        case "3":
                            this.printInTabuleiro[6][6] = "X";
                            break;
                        default:
                            System.out.println("Opção invalida");
                            this.setJogadaValida(false);
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção invalida");
                    this.setJogadaValida(false);
                    break;
            }
        }
        else
        {
            switch (movimento[0]) {
                case "A":
                case "a":
                    switch (movimento[1]) {
                        case "1":
                            this.printInTabuleiro[2][2] = "O";
                            break;
                        case "2":
                            this.printInTabuleiro[2][4] = "O";
                            break;
                        case "3":
                            this.printInTabuleiro[2][6] = "O";
                            break;
                        default:
                            System.out.println("Opção invalida");
                            this.setJogadaValida(false);
                            break;
                    }
                    break;
                case "B":
                case "b":
                    switch (movimento[1]) {
                        case "1":
                            this.printInTabuleiro[4][2] = "O";
                            break;
                        case "2":
                            this.printInTabuleiro[4][4] = "O";
                            break;
                        case "3":
                            this.printInTabuleiro[4][6] = "O";
                            break;
                        default:
                            System.out.println("Opção invalida");
                            this.setJogadaValida(false);
                            break;
                    }
                    break;
                case "C":
                case "c":
                    switch (movimento[1]) {
                        case "1":
                            this.printInTabuleiro[6][2] = "O";
                            break;
                        case "2":
                            this.printInTabuleiro[6][4] = "O";
                            break;
                        case "3":
                            this.printInTabuleiro[6][6] = "O";
                            break;
                        default:
                            System.out.println("Opção invalida");
                            this.setJogadaValida(false);
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção invalida");
                    this.setJogadaValida(false);
                    break;
            }
        }
    }

    /**
     * @return printInTabuleiro
    */
    public String[][] getPrintInTabuleiro() {
        return printInTabuleiro;
    }

    /**
     * @return jogadaValida
    */
    public boolean getJogadaValida() {
        return jogadaValida;
    }

    /**
     * @return setJogadaValida
    */
    public void setJogadaValida(boolean jogadaValida) {
        this.jogadaValida = jogadaValida;
    }
}
