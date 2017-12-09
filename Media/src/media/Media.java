/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.util.Scanner;

/**
 *
 * @author marcosbras
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       //print comum, pois o próprio usuario tecla enter que acarreta a ida pra linha debaixo 
       
       System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1+n2)/2;
        System.out.printf("Sua média é: %.2f \n",m);
        
        if (m > 9) {
            System.out.println("Parabéns!");
        }
    }
    
}
