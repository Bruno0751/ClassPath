package view;

import DAO.TextoDAO;
import controller.Banco;
import java.net.URI;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version beta
 * @since 19/12/2020
 */
public class Main {
    
    protected static Banco objBanco = new Banco();
    protected static TextoDAO objAgenciaDAO = new TextoDAO();
   
    public static void main(String[] args) {
        
        
        try {
            objBanco.cadastrarTexto();
            objBanco.carregarTexto();
            
            new GUILogin().setVisible(true);
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO\n"
                    + "Tipo:" + e);
        }
    }
    
}
