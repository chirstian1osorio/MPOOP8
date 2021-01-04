package cajero;

/**
 *
 * @author alfre
 */
public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException() {
        super("saldo insuficiente");
    }

    
}
