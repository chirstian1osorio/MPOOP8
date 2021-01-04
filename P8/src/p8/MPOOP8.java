package p8;

/**
 *
 * @author alfre
 */
import java.util.Scanner;
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //    c = teclado.nextLine();
        System.out.println("1********************");
        try{
        String mensajes[]={"antonio","javier","gabriel"};
        for (int i = 0; i < 4; i++) {
            System.out.println(mensajes[i]);
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de rango");
        }
        
        System.out.println("2*******************");
        
        try{
        float a,b,c;
        System.out.println("ingresa a");
        a=teclado.nextFloat();
        System.out.println("ingresa b");
        b=teclado.nextFloat();
        c=a/b;
        System.out.println("division con teclado: c= "+c);
        float equis=5/0;//5/2
        System.out.println("equis = "+equis);
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre cero");
        }finally{
            System.out.println("a pesar de todo se ejecuta finally");
        }
        System.out.println("duera de try-catch");
        
        System.out.println("3************************");
        //catch anidados
        try{
        float a,b,c;
        System.out.println("ingresa a");
        a=teclado.nextFloat();
        System.out.println("ingresa b");
        b=teclado.nextFloat();
        c=a/b;
        System.out.println("divison con teclado: c= "+c);
        float equis=5/0;//5/2
        System.out.println("equis = "+equis);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de rango");
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre cero");
        }catch(Exception  e){
            System.out.println("excepcion general");
        }finally{
            System.out.println("a pesar de todo se ejecuta finally");
        }
        
        System.out.println("4*******************************");
        //propagacion de exception
        try{
        int a,b;
        System.out.println("ingresa a");
        a=teclado.nextInt();
        System.out.println("ingresa b");
        b=teclado.nextInt();
        int c=division(a,b);
        System.out.println("division con teclado: c= "+c);
        int division=division(8,0);
        System.out.println("division = "+division);
        }catch(ArithmeticException e){
            System.out.println("excepcion aritmetica");
            //e.printStackTrace();
        }
        
        System.out.println("5*******************************");
        //propagacion de exception
        try{
        int a,b;
            System.out.println("ingresa a");
        a=teclado.nextInt();
            System.out.println("ingres b");
        b=teclado.nextInt();
        int c=division2(a,b);
        System.out.println("division con teclado, c= "+c);
        int division=division2(8,0);
        System.out.println("division = "+division);
        }catch(ArithmeticException e){
            System.out.println("excepcion aritmetica");
            //e.printStackTrace();
        }
    }
    
    public static int division(int a, int b)
            throws ArithmeticException{
        int c;
        /*try{
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println("excepcion aritmetica");
            c=0;
        }*/
        c=a/b;
        return a/b;
    }
    
    public static int division2(int a, int b)
            throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        int c= a/b;
        return c;
    }
}
