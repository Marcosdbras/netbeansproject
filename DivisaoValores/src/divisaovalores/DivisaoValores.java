/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 */
package divisaovalores;

import java.util.Scanner;

/**
 *
 * @author marcosbras
 */
public class DivisaoValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o numerador: ");
        int n1 = s.nextInt();
        
        System.out.print("Digite o denominador: ");
        int n2 = s.nextInt();
        
        System.out.printf("%d \\ %d = %d \n",n1,n2,n1/n2);
        System.out.printf("o resto da divisão entre %d \\ %d = %d \n",n1,n2,n1%n2);
    }
    
}
