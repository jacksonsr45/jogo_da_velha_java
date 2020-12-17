package com.uninter;

public class Computador {
    /**
     * @param movimento
    */
    private String[] movimento = new String[2];
    
    /**
     * @return movimento
    */
    public String[] getMovimento() 
    {
        return movimento;
    }

    /**
     * Entrando com valor de movimento de Computador
     * @var tab é para verificar o campo a ser jogado
     * @var count para saber em qual jogada estamos
     * @param tab
     * @param count
    */
    public void setMovimento(String[][] tab, int count) 
    { 
        if(tab[2][2] == "O" && tab[2][4] == "O" && tab[2][6] != "O")
        {                    
            this.movimento[0] = "A";
            this.movimento[1] = "3";              
        }
        else if(tab[6][2] == "O" && tab[4][4] =="O" && tab[2][6] != "O")
        { 
            this.movimento[0] = "A";
            this.movimento[1] = "3"; 
        }  
        else if(tab[6][6] == "O" && tab[4][6] == "O" && tab[2][6] != "O")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "3";
        } 
        else if(tab[4][4] == "O" && tab[6][2] == "O" && tab[2][4] != "O")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "2";
        }
        else if(tab[2][2] =="O" && tab[2][6] == "O" && tab[2][4] != "O")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "2";
        }
        else if (tab[2][4] == "O" && tab[2][6] == "O" && tab[2][2] !="O")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "1";                      
        } 
        else if(tab[4][2] == "O" && tab[6][2] == "O" && tab[2][2] != "O")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "1";
        } 
        else if(tab[4][4] == "O" && tab[6][6] == "O" && tab[2][2] != "O")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "1";
        }  
        else if(tab[2][2] == "O" && tab[6][2] == "O" && tab[4][2] != "O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "1";
        }  
        else if(tab[4][4] == "O" && tab[4][6] == "O" && tab[4][2] != "O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "1";       
        }        
        else if(tab[2][2] == "O" && tab[6][6] == "O" && tab[4][4] != "O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[2][6] == "O" && tab[6][2] == "O" && tab[4][4] !="O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[2][4] == "O" && tab[6][4] == "O" && tab[4][4] !="O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[4][2] == "O" && tab[4][6] == "O" && tab[4][4] != "O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[4][6] == "O" && tab[6][6] == "O" && tab[4][6] != "O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "3";
        }  
        else if(tab[4][2] == "O" && tab[4][4] == "O" && tab[4][6] != "O")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "3";
        }  
        else if(tab[2][2] == "O" && tab[4][2] == "O" && tab[6][2] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "1";
        }  
        else if(tab[6][4] == "O" && tab[6][6] == "O" && tab[6][2] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "1";
        }  
        else if(tab[4][4] == "O" && tab[2][6] == "O" && tab[6][2] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "1";
        }  
        else if(tab[2][4] == "O" && tab[4][4] == "O" && tab[6][4] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "2";
        }  
        else if(tab[6][2] == "O" && tab[6][6] == "O" && tab[6][4] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "2";
        }  
        else if(tab[2][2] == "O" && tab[4][4] == "O" && tab[6][6] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "3";
        }  
        else if(tab[6][2] == "O" && tab[6][4] == "O" && tab [6][6] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "3";
        }  
        else if(tab[2][6] == "O" && tab[4][6] == "O" && tab[6][6] != "O")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "3";
        } else if(tab[2][6] == "O" && tab[4][4] == "O" && tab[6][2] != "O")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "2";
        }
        else if(tab[2][2] == "X" && tab[2][4] == "X" && tab[2][6] != "X")
        {                    
            this.movimento[0] = "A";
            this.movimento[1] = "3";              
        }
        else if(tab[6][2] == "X" && tab[4][4] =="X" && tab[2][6] != "X")
        { 
            this.movimento[0] = "A";
            this.movimento[1] = "3"; 
        }  
        else if(tab[6][6] == "X" && tab[4][6] == "X" && tab[2][6] != "X")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "3";
        } 
        else if(tab[4][4] == "X" && tab[6][2] == "X" && tab[2][4] != "X")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "2";
        }
        else if(tab[2][2] =="X" && tab[2][6] == "X" && tab[2][4] != "X")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "2";
        }
        else if (tab[2][4] == "X" && tab[2][6] == "X" && tab[2][2] !="X")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "1";                      
        } 
        else if(tab[4][2] == "X" && tab[6][2] == "X" && tab[2][2] != "X")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "1";
        } 
        else if(tab[4][4] == "X" && tab[6][6] == "X" && tab[2][2] != "X")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "1";
        }  
        else if(tab[2][2] == "X" && tab[6][2] == "X" && tab[4][2] != "X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "1";
        }  
        else if(tab[4][4] == "X" && tab[4][6] == "X" && tab[4][2] != "X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "1";       
        }        
        else if(tab[2][2] == "X" && tab[6][6] == "X" && tab[4][4] != "X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[2][6] == "X" && tab[6][2] == "X" && tab[4][4] !="X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[2][4] == "X" && tab[6][4] == "X" && tab[4][4] !="X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[4][2] == "X" && tab[4][6] == "X" && tab[4][4] != "X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "2";
        }  
        else if(tab[4][6] == "X" && tab[6][6] == "X" && tab[4][6] != "X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "3";
        }  
        else if(tab[4][2] == "X" && tab[4][4] == "X" && tab[4][6] != "X")
        {
            this.movimento[0] = "B";
            this.movimento[1] = "3";
        }  
        else if(tab[2][2] == "X" && tab[4][2] == "X" && tab[6][2] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "1";
        }  
        else if(tab[6][4] == "X" && tab[6][6] == "X" && tab[6][2] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "1";
        }  
        else if(tab[4][4] == "X" && tab[2][6] == "X" && tab[6][2] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "1";
        }  
        else if(tab[2][4] == "X" && tab[4][4] == "X" && tab[6][4] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "2";
        }  
        else if(tab[6][2] == "X" && tab[6][6] == "X" && tab[6][4] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "2";
        }  
        else if(tab[2][2] == "X" && tab[4][4] == "X" && tab[6][6] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "3";
        }  
        else if(tab[6][2] == "X" && tab[6][4] == "X" && tab [6][6] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "3";
        }  
        else if(tab[2][6] == "X" && tab[4][6] == "X" && tab[6][6] != "X")
        {
            this.movimento[0] = "C";
            this.movimento[1] = "3";
        } else if(tab[2][6] == "X" && tab[4][4] == "X" && tab[6][2] != "X")
        {
            this.movimento[0] = "A";
            this.movimento[1] = "2";
        }
        else 
        {
            /**
             * Verificação caso não seja satisfatório as opções acima 
             */            
            this.jogadaCpuA(tab, count);                 
        }
    }

    /**
     * Recebe tab verifica campo se já esta com jogada 
     * Utilizando do count para saber em qual número de jogada estamos 
     * @param tab
     * @param count
    */
    public void jogadaCpuA(String[][] tab,int count){
        switch (count) {
            case 1:
                if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                } else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                }
                break;
            case 2:
                if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                } else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                }
            case 3:
                if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                } else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                }
                break;
            case 4:
                if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                } else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                }
            case 5:
                if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                } else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                }
            case 6:
                if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                }  else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                }
            case 7:
                if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                }
            case 8:
                if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                } else if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                } else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                }
            case 9:
                if (tab[2][2] != "X" && tab[2][2] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "1";     
                } else if (tab[6][6] != "X" && tab[6][6] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "3";     
                } else if (tab[2][4] != "X" && tab[2][4] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "2";     
                } else if (tab[2][6] != "X" && tab[2][6] != "O"){
                    this.movimento[0] = "A";
                    this.movimento[1] = "3";     
                } else if (tab[4][2] != "X" && tab[4][2] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][2] != "X" && tab[6][2] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "1";     
                } else if (tab[4][6] != "X" && tab[4][6] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "3";     
                } else if (tab[4][4] != "X" && tab[4][4] != "O"){
                    this.movimento[0] = "B";
                    this.movimento[1] = "2";     
                } else if (tab[6][4] != "X" && tab[6][4] != "O"){
                    this.movimento[0] = "C";
                    this.movimento[1] = "2";     
                }
                break;
            default:
                break;
        }
    }
}
