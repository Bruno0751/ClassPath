package DAO;

import controller.Arquivo;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import model.Agencia;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version beta
 * @since 19/12/2020
 */
public class TextoDAO {
    
    private static Path caminhoArquivo = Paths.get(System.getProperty("user.dir"), "arquivoTeste.csv");
    
    private static Agencia retornarTexto(String linha){
        String colunas[] = linha.split(";");      
        int numero = Integer.parseInt(colunas[0]);
        return new Agencia(numero);
    }
    
    public static List<Agencia> retornarRegistroDETexto(){
        List<String> linhas = Arquivo.lerRegistroDEArquivo(caminhoArquivo);
        List<Agencia> agencias = new ArrayList<Agencia>();
        for(String linha : linhas)
            agencias.add(retornarTexto(linha));
        return agencias;
    }
        
    public static boolean salvarTexto(Agencia agencia){
        String linha = Arquivo.retornarRegistroDEArquivo(agencia);
        return Arquivo.escreverOUCriarArquivo(caminhoArquivo, linha);
    }
}
