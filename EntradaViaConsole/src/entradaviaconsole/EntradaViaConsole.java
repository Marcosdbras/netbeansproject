/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaviaconsole;

import java.util.Scanner;

/**
 *
 * @author marcosbras
 */
public class EntradaViaConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Entrada de Dados (System.in) = dispositivo que será monitorado
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro aluno: ");
        String sn1 = teclado.nextLine();

        System.out.print("Digite a nota do primeiro aluno: ");
        float fn1 = teclado.nextFloat();

        System.out.printf("O Aluno 1 é %s e sua nota é %.2f \n", sn1, fn1);
        
        //Format da String
        String resultado = String.format("%.2f", fn1);        
        System.out.println(""+resultado);
    }
    
}
