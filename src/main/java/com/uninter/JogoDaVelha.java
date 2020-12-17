package com.uninter;

public class JogoDaVelha 
{
    /**
     * Instanciando tabuleiro 
    */
    private Tabuleiro tabuleiro = new Tabuleiro();
    
    /**
     * Instanciando classe InGame helper para tabuleiro 
    */
    private InGame inGame = new InGame();
    
    /**
     * Instanciando jogador 
    */
    private Jogador jogador = new Jogador();
    
    /**
     * Instanciando computador 
    */
    private Computador computador = new Computador();
    
    /**
     * Contador de rodadas  
     * @var count  
    */
    private int count = 0;
    
    /**
     * @var player 
    */
    private int player;
    
    /**
     * @var movimento
    */
    private String[] movimento = new String[2];

    /**
     * Pega valor de contador de rodadas
     * Rodadas ímpares jogador 2
     * Rodadas pares jogador 1
    */
    public void selectJogador() 
    {
        if (count % 2 == 0) 
        {
            this.setPlayer(1);
            System.out.println("Jogar: "+getPlayer());
            jogador.setMovimento();
            this.setMovimento(jogador.getMovimento());
        } 
        else if (count % 2 != 0)
        {
            this.setPlayer(2);
            System.out.println("Jogar: "+getPlayer());
            computador.setMovimento(tabuleiro.getTabuleiro(), count);
            this.setMovimento(computador.getMovimento());
        }
    }
    
    /**
     * Estrutura run do projeto para o main
    */
    public void runGame()
    {
        do {
            this.selectJogador();
            this.inGame.getValues(this.getPlayer(), this.getMovimento());
            this.tabuleiro.run(inGame.getPrintInTabuleiro());
            if (inGame.getJogadaValida())
            {
                /**
                 * Conta quantidade de jogadas
                 * É utilizada a caso de números ímpares ou pares para troca de jogador 
                 * @var count 
                */
                count ++;
            }
        } while (!tabuleiro.getFim());
        /**
         * Retorno de jogador vencedor 
         * @param this.tabuleiro.getJogadorVencedor()
        */
        System.out.println("\n Jogador: "+this.tabuleiro.getJogadorVencedor()+ " é o vencedor!");
    }
    
    public static void main(String[] args) 
    {
        JogoDaVelha inGame = new JogoDaVelha();
        inGame.runGame();    
    }
    
    /**
     * Métodos getters and setters 
    */

    /**
     * @return player
    */
    public int getPlayer() 
    {
        return player;
    }

    /**
     * @param player
    */
    public void setPlayer(int player) 
    {
        this.player = player;
    }
    
    /**
     * @return movimento
    */
    public String[] getMovimento() 
    {
        return movimento;
    }

    /**
     * @param movimento
    */
    public void setMovimento(String[] movimento) 
    {
        this.movimento = movimento;
    }
}
