/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author marcosbras
 */
public class VerificaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento: ");
        
        int anoNasc = teclado.nextInt();
        
        int idade = anoAtual - anoNasc;
        
        System.out.println("Sua idade é "+idade);
        if (idade < 18){
            
            System.out.println("Você é menor de idade"); 
            
        }else{
            
            System.out.println("Você é maior de idade");
            
        }
        
    }
    
}
