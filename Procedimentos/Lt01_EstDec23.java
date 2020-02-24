/*Objetivo: receber 3 valores obrigatoriamente em ordem crescente e um 4º valor aleatório. Mostrar os 4 números em ordem crescente.
Programador: Gabriel Rocha
Data: 01/07/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec23{
    
    static int N1, N2, N3, N4;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite os 3 primeiros números NECESSARIAMENTE em ordem crescente...\n");
        
        System.out.println("Digite o primeiro número:");
        N1 = input.nextInt();
        
        System.out.println("Digite o segundo número:");
        N2 = input.nextInt();
        
        System.out.println("Digite o terceiro número:");
        N3 = input.nextInt();
        
        System.out.println("Digite o quarto número:");
        N4 = input.nextInt();
        
        Ordem_Crescente();
    }
    
    public static void Ordem_Crescente(){
        
        if (N4 > N2){
            if (N4 > N3){
                System.out.println("\n" + N1 + " < " + N2 + " < " + N3 + " < " + N4);
            }else{
                System.out.println("\n" + N1 + " < " + N2 + " < " + N4 + " < " + N3);
            }
        }else{
            if (N4 > N1){
                System.out.println("\n" + N1 + " < " + N4 + " < " + N2 + " < " + N3);
            }else{
                System.out.println("\n" + N4 + " < " + N1 + " < " + N2 + " < " + N3);
            }
        }
    }
}