package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Agencia;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version beta
 * @since 19/12/2020
 */
public class Arquivo {
    
    public static boolean escreverOUCriarArquivo(Path caminho, String linha){
        if(!linha.endsWith("\n"))
        linha += "\n";
        
        try {
            Files.write(caminho, linha.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO\n"
                    + "Tipo: " + e);
            return false;
        }
    }
    
    public static String retornarRegistroDEArquivo(Agencia agencia){
        String registro = "";
        registro += agencia.getNumeroDAAgencia() + "; \n";
        return registro;
    }
    
    public static List<String> lerRegistroDEArquivo(Path caminho){
        try{
            if (!Files.exists(caminho)) 
                return new ArrayList<String>();
            return Files.readAllLines(caminho);
        }catch(IOException ex){
            return null;
        }
    }
    
}
