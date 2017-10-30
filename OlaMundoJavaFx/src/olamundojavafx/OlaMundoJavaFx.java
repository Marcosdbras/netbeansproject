/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

O scene builder deve estar instalado previamente
no javaFX não tem janela e sim painel de ancoragem (anchor painel)



1) Criar projeto novo 
2) javaFX / Aplicação FXML do javaFX
3) criar controle, labels, entre outros
4) vai em code e modifica nomeia o ID 
5) vai em code do botão e nomeia on Action 
6) salvar documento
7) alterar document controller que fa a ligação do fxml 

o executável está sendo gerado em:
clique em limpar e construir projeto 
C:\Users\marcosbras\Documents\NetBeansProjects\OlaMundoJavaFx\dist

 */
package olamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author marcosbras
 */
public class OlaMundoJavaFx extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
