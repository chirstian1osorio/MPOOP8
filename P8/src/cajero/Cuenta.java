package cajero;

/**
 *
 * @author alfre
 */
public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo=0;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double monto){
        System.out.println("depositando: "+monto+" pesos");
        saldo=saldo+monto;
    }
    
    public void retirar(double monto)
            throws SaldoInsuficienteException{
        System.out.println("retirando monto");
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        else{
            saldo-=monto;
        }
        System.out.println("nuevo saldo es: "+saldo+" pesos");
    }
}
