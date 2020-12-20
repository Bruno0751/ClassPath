package model;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version beta
 * @since 19/12/2020
 */
public class Agencia {

    private int numeroDAAgencia;

    public Agencia(int numeroDAAgencia) {
        this.numeroDAAgencia = numeroDAAgencia;
    }
    
    public int getNumeroDAAgencia() {
        return numeroDAAgencia;
    }

    public void setNumeroDAAgencia(int numeroDAAgencia) {
        this.numeroDAAgencia = numeroDAAgencia;
    }
    
}
