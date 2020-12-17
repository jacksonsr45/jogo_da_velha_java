package com.uninter;

public class Tabuleiro {
    /**
     * tamanho tabuleiro
     * @var MAX_SICE 
    */
    private int MAX_SICE = 8;
    /**
     * Contador para impressão de tabuleiro
     * @var count
    */
    private int count = 1;
    /**
     * matrix tabuleiro
     * @var tabuleiro
    */
    private String[][] tabuleiro = new String[MAX_SICE][MAX_SICE];
    /**
     * para definir fim de jogo
     * @var fim
    */
    private boolean fim;
    /**
     * para definir jogador vencedor
     * @var jogadorVencedor
    */
    private int jogadorVencedor;

    /**
     * Não utilização de um construtor, neste caso uma classe run deixando livre uma
     * instância sem depender de parâmetros
     */

    /**
     * @param printTabuleiro
     */
    public void run(String[][] printTabuleiro) {
        /**
         * Chamando método para criar tabuleiro passando valor de campos jogáveis e ou
         * já preenchidos
         */
        this.criarTabuleiro(printTabuleiro);
        this.printTabuleiro();
        this.testeGame(this.tabuleiro);
    }

    /**
     * @param void
     * @return new tabuleiro
     */
    public void criarTabuleiro(String[][] printTabuleiro)
    {
        /**
         * Iniciando valor a tabuleiro
         * Cria a iteração inicial de uma matrix para campo
         * de jogo
         * Sendo iniciado no run() 
        */
        for (int l = 0; l < this.tabuleiro.length; l++) 
        {
            for (int c = 0; c < this.tabuleiro.length; c++) 
            {
                /**
                 * Iterando matrix e adicionando a cada linha e coluna 
                 * um valor inicial com iteração de 2 for 
                */
                if (l == 0 && c == 2){this.tabuleiro[l][c] = "1";}
                else if (l == 0 && c == 4){this.tabuleiro[l][c] = "2";}
                else if (l == 0 && c == 6){this.tabuleiro[l][c] = "3";}
                else if (l == 2 && c == 0){this.tabuleiro[l][c] = "A";}
                else if (l == 4 && c == 0){this.tabuleiro[l][c] = "B";}
                else if (l == 6 && c == 0){this.tabuleiro[l][c] = "C";}
                else if (l == 1 && c > 0){this.tabuleiro[l][c] = "-";}
                else if (l == 3 && c > 0){this.tabuleiro[l][c] = "-";}
                else if (l == 5 && c > 0){this.tabuleiro[l][c] = "-";}
                else if (l == 7 && c > 0){this.tabuleiro[l][c] = "-";}
                else if (l > 0 && c == 1){this.tabuleiro[l][c] = "|";}
                else if (l > 0 && c == 3){this.tabuleiro[l][c] = "|";}
                else if (l > 0 && c == 5){this.tabuleiro[l][c] = "|";}
                else if (l > 0 && c == 7){this.tabuleiro[l][c] = "|";}
                /**
                 * Pegando valor de campos jogáveis recebido no run()
                 * pela classe InGame
                */
                else {this.tabuleiro[l][c] = printTabuleiro[l][c];}
            }
        }
    }

    public void printTabuleiro()
    {
        /**
         * Imprimindo tabuleiro 
        */
        for (int l = 0; l < this.tabuleiro.length; l++) 
        {
            for (int c = 0; c < this.tabuleiro.length; c++) 
            {
                if (count <= MAX_SICE) 
                {
                    System.out.print(this.tabuleiro[l][c]);
                    count += 1; 
                }
                if (count > MAX_SICE)
                {
                    System.out.print("\n");
                    count = 1;
                }
            }
        }
    }

    /**
     * Executa testes
     * seta true em setFim()
     * seta jogador vencedor em setJogadorVencedor()
     * @param tabuleiro
    */
    public void testeGame(String[][] tabuleiro)
    {
        if(tabuleiro[2][2] == "O" && tabuleiro[2][4] == "O" && tabuleiro[2][6] == "O")
        {         
            this.setFim(true);         
            this.setJogadorVencedor(2);  
        } else if(tabuleiro[4][2] == "O" && tabuleiro[4][4] == "O" && tabuleiro[4][6] == "O")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        }else if(tabuleiro[6][2] == "O" && tabuleiro[6][4] == "O" && tabuleiro[6][6] == "O")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        } else if(tabuleiro[2][2] == "O" && tabuleiro[4][2] == "O" && tabuleiro[6][2] == "O")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        } else if(tabuleiro[2][4] == "O" && tabuleiro[4][4] == "O" && tabuleiro[6][4] == "O")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        } else if(tabuleiro[2][6] == "O" && tabuleiro[4][6] == "O" && tabuleiro[6][6] == "O")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        } else if(tabuleiro[2][2] == "O" && tabuleiro[4][4] == "O" && tabuleiro[6][6] == "O")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        } else if(tabuleiro[2][6] == "O" && tabuleiro[4][4] == "O" && tabuleiro[6][2] == "O")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        }

        else if(tabuleiro[2][2] == "X" && tabuleiro[2][4] == "X" && tabuleiro[2][6] == "X")
        {         
            this.setFim(true);         
            this.setJogadorVencedor(1);  
        } else if(tabuleiro[4][2] == "X" && tabuleiro[4][4] == "X" && tabuleiro[4][6] == "X")
        {
            this.setFim(true);
            this.setJogadorVencedor(1);
        }else if(tabuleiro[6][2] == "X" && tabuleiro[6][4] == "X" && tabuleiro[6][6] == "X")
        {
            this.setFim(true);
            this.setJogadorVencedor(2);
        } else if(tabuleiro[2][2] == "X" && tabuleiro[4][2] == "X" && tabuleiro[6][2] == "X")
        {
            this.setFim(true);
            this.setJogadorVencedor(1);
        } else if(tabuleiro[2][4] == "X" && tabuleiro[4][4] == "X" && tabuleiro[6][4] == "X")
        {
            this.setFim(true);
            this.setJogadorVencedor(1);
        } else if(tabuleiro[2][6] == "X" && tabuleiro[4][6] == "X" && tabuleiro[6][6] == "X")
        {
            this.setFim(true);
            this.setJogadorVencedor(1);
        } else if(tabuleiro[2][2] == "X" && tabuleiro[4][4] == "X" && tabuleiro[6][6] == "X")
        {
            this.setFim(true);
            this.setJogadorVencedor(1);
        } else if(tabuleiro[2][6] == "X" && tabuleiro[4][4] == "X" && tabuleiro[6][2] == "X")
        {
            this.setFim(true);
            this.setJogadorVencedor(1);
        }
    }

    /**
     * Métodos getters and setters 
    */

    /**
     * @return tabuleiro
    */
    public String[][] getTabuleiro()
    {
        return tabuleiro;
    }

    /**
     * @return fim
    */
    public boolean getFim() {
        return fim;
    }

    /**
     * @param fim
    */
    public void setFim(boolean fim) {
        this.fim = fim;
    }

    /**
     * @return jogadorVencedor
    */
    public int getJogadorVencedor() {
        return jogadorVencedor;
    }

    /**
     * @param jogadorVencedor
    */
    public void setJogadorVencedor(int jogadorVencedor) {
        this.jogadorVencedor = jogadorVencedor;
    }
}
