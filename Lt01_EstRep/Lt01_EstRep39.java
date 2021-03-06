/*Objetivo: Calcular a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

public class Lt01_EstRep39{
    
    public static void main(String[] args){
        
        int Casa, Exp = -1;
        double Graos, Total = 0;
        
        for(Casa = 1; Casa <= 64; Casa++){
            Exp++;
            Graos = Math.pow(2, (double)Exp);
            System.out.println("Na casa " + Casa + ", há " + Graos + " grãos");
            Total = Total + Graos;
        }
        
        System.out.println("\nTotal de grãos neste tabuleiro: " + Total);
    }
}