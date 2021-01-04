package cajero;
/**
 *
 * @author alfre
 */
import java.util.Scanner;
public class Cajero {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        Cuenta cuenta=new Cuenta();
        int a;
        cuenta.depositar(500);
        System.out.println("ingrese monto a retirar");
        a=teclado.nextInt();
        try {
            cuenta.retirar(300);
            cuenta.retirar(100);
            cuenta.retirar(80);
            cuenta.retirar(a);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("saldo insuficiente");
        }
      
    }
}
