/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

http://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275
 */

//sout + <<tab>> para completar
package helloworld;

/**
 *
 * @author marcosbras
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tipo primitivo
        int idade = 3;
        float sal = 1825.54f;
        char letra = 'G'; //só aceita uma letra
        boolean casado = true;
        
        //type cast
        int id = (int) 3;
        float salario = (float) 1825.54;
        char l = (char) 'G';
        boolean c = (boolean) false;
        
        //wrapper class (invólocro)
        Integer ids = new Integer(3);
        Float sals = new Float(1825.54);
        Character ls = new Character('G');
        Boolean cs = new Boolean(false);
        
        
        System.out.println("Olá mundo");
        
        //Exemplo: o tipo de dados padrão para 8.5 é double, por esta razão deve ser feito o cast type
        float nota1 = 8.5f;
        
        float nota2 = (float) 7.5;
        
        System.out.println("Nota 1 é "+nota1);
        
        
        
        System.out.printf("A nota 2 é %f \n",nota2);
        
        System.out.printf("A nota 1 é %.2f \n", nota1);
        
         String nome = "Marcos";
         
         System.out.printf("A nota 1 de %s é %.2f \n",nome,nota1);
         
         System.out.format("A nota 2 de %s é %.2f \n",nome,nota2);
    }
    
}