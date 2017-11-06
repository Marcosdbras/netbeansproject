/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 http://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275
 */
//sout + <<tab>> para completar
package helloworld;

import java.util.Scanner;

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
        boolean bc = (boolean) false;

        //wrapper class (invólocro)
        Integer ids = new Integer(3);
        Float sals = new Float(1825.54);
        Character ls = new Character('G');
        Boolean cs = new Boolean(false);
        
        //No Java, se vc dividir um número inteiro por outro número inteiro ele subentende que vc só vai quer a parte inteira do resultado, por exemplo: 8/3 = 2

        System.out.println("Olá mundo");

        //Exemplo: o tipo de dados padrão para 8.5 é double, por esta razão deve ser feito o cast type
        float nota1 = 8.5f;
        float nota2 = (float) 7.5;

        //Tipos de dados incompatíveis para compatível
        int i = 30;
        String v = Integer.toString(i);

        String valor = "30";
        i = Integer.parseInt(valor);

        String v1 = "30.5";
        float i1 = Float.parseFloat(v1);

        //Operações aritméticas
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        float precedencia = n1 + n2 / 2;
        
        //Operador Unário
        //a++ / ++a / a-- / --a
        int numeral = 5;
        numeral++;
       
        int na = 5;
        int vlr = 5 + na++; //pós incremento
        
        int na1 = 5;
        int vlr1 = 5 + ++na1; //pré incremento
        
        int d = 10;
        int vlrd = 4 + d--; //pós decremento
        
        
        int d1 = 10;
        int vlrd1 = 4 + --d1; //pré decremento
        
        //Operador de atribuição
        //a +=b / a -=b / a *=b / "a /=b" / a %=b
        
        int x = 4;
        x += 2; //x = x + 2;
        System.out.println("o valor de x é "+x);
        
        
        int x1 = 4;
        x1 *= 2; //x = x * 2
        System.out.println("o valor de x1 é "+x1);
        
        
        /*Para outras operações matemáticas podemos utilizar a classe Math do java
        tais como, potenciação, conversão pra grau, radiano, raiz quadrada, seno, coseno, tangente, entre outros.
        existe no java constantes e métodos que realizaão este cálculos mais complexos da matemática
        */
        
        double x2 = Math.PI;
        
        double x3 = Math.pow(5, 2);
        
        
        
        double x4 = Math.sqrt(25);
        
        //type cast
        float x6 = (float) Math.sqrt(81);
        
        double x5 = Math.cbrt(27); //raiz cúbica
        
        
        Math.abs(-10);
        
        Math.floor(3.9); //arredonda para baixo ou truncar
        
        Math.ceil(4.2); //arredonda para cima
        
        Math.round(5.6); //Faz o arredondamento de acordo com a regra da matemática
        
        Math.random(); //gerador de número aleatório de 0.000000 até 1.000000
        
        //Para gerar número inteiro dentro de um intervalo pode ser feito
        
        int x7 = (int) (5 + Math.random() * (10 - 5));
        /*              menor + random * (maior - menor)  limite do intervalo */
        
        System.out.println("valor aleatório entre 5 e 10 : "+x7);

        //Operador Ternário
        
       
        int ivalor1,ivalor2,r;
        ivalor1 = 4;
        ivalor2 = 8;
        
        r = (ivalor1 > ivalor2) ?0:1;
        System.out.println("valor r é"+r);
        
        r = (ivalor1 > ivalor2) ? n1+n2 : n1 - n2;
        System.out.println("Agora valor de r é "+r);
 
        //Operadores relacionais
        // >, <, >=, <=, ==,  !=
        
        //Comparação String - foi criado objetos ao invés de variável
        String nome1 = "Marcos";
        String nome2 = "Marcos";
        String nome3 = new String("Marcos");
        
        String res;
        
        //Compara direta do conteúdo do objeto String com outro
        res = (nome1==nome2)?"Igual":"diferente";
        System.out.println("Nome 1 é "+ res + " a nome 2");
        
        //Compara a referência de um objeto com outro
        res = (nome1==nome3)?"Igual":"diferente";
        System.out.println("Nome 1 é "+res+" nome 3");
        
        //Compara o conteúdo de um objeto com outro conteúdo
        res = (nome1.equals(nome3))?"Igual":"diferente";
        System.out.println("Nome 1 é "+res+" Nome 3");   
        
        //Operadores lógicos
        // && = .E. / || = .OU. / ^ = .XOU. ou exclusivo / ! = .NAO.
        
        int a,b,c;
        boolean bResult;
        
        a = 4;
        b = 7;
        c = 12;
        
        bResult = (a < b && b < c)?true:false;
        System.out.println(bResult);
        
        bResult = (a < b && b == c)?true:false;
        System.out.println(bResult);

        bResult = (a < b || b < c)?true:false;
        System.out.println(bResult);
        
        bResult = (a < b ^ b < c)?true:false;
        System.out.println(bResult);
        
        
        //Saída de dados
        
        System.out.println("Nota 1 é " + nota1);

        System.out.printf("A nota 2 é %f \n", nota2);

        System.out.printf("A nota 1 é %.2f \n", nota1);

        String nome = "Marcos";

        System.out.printf("A nota 1 de %s é %.2f \n", nome, nota1);

        System.out.format("A nota 2 de %s é %.2f \n", nome, nota2);

        System.out.println("A média é: " + m);

        System.out.println("Calculo por ordem de precedencia: " + precedencia);

         System.out.println("Numeral é "+numeral);
         
         System.out.println("Pós incremento "+vlr);
         
         System.out.println("Pré incremento "+vlr1);
         
         System.out.println("Pós decremento "+vlrd);
         
         System.out.println("Pré decremento "+vlrd1);
    }

}
