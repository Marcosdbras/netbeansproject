/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author marcosbras
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date relogio = new Date();
        System.out.println("A hora do sistema é "+relogio.toString());
        
        Locale locale = Locale.getDefault();
        System.out.println("O idioma do seu sistema é "+locale.getDisplayLanguage()+" ou seja "+locale.getLanguage());
       
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tela = toolkit.getScreenSize();        
        int width = (int)tela.getWidth();
        int heigth = (int)tela.getHeight();
        
        
        System.out.println("Tamanho da tela é "+width+" X "+heigth );
        
        System.out.println("Seu sistema operacional é "+System.getProperty("os.name"));
        
        
    }
    
}
