package controller;

import DAO.TextoDAO;
import java.util.ArrayList;
import java.util.List;
import model.Agencia;

/**
 *
 * @author Bruno Gressler da Silveira
 * @version beta
 * @since 19/12/2020
 */
public class Banco {
    
    private static List<Agencia> agencias;
    private int proximaAgencia = 1;
    public static int agenciaAutenticada = 0;
    
    public Banco() {
        this.agencias = new ArrayList<>();
    }
    
    public void carregarTexto(){
        this.agencias = TextoDAO.retornarRegistroDETexto();
    }
    
    public Agencia buscarAgencia(int agencia) throws Exception{
        return this.agencias.stream().filter(a -> a.getNumeroDAAgencia() == agencia).findFirst().get();
    }
    
    public boolean verificarCliente(int agencia) throws Exception{
        Agencia agencias = buscarAgencia(agencia);

        if (agencias != null){
            this.agenciaAutenticada = agencias.getNumeroDAAgencia();
            
            return true;
        }else
            return false;
    }
    
    public boolean cadastrarTexto(){
        
        Agencia agencia = new Agencia(this.proximaAgencia++);
        this.agencias.add(agencia);
        TextoDAO.salvarTexto(agencia);
        return true;
    }
    

    
}
