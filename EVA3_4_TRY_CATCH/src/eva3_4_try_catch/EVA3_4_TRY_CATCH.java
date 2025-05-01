package eva3_4_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_TRY_CATCH {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        try{
        System.out.println("Introduce un valor entero");
        int valor = captu.nextInt();
        System.out.println("El valor es = " + valor);
        }catch(InputMismatchException e){
            System.out.println("ERROR ESTA MAL!!");
            e.printStackTrace();
        }
        System.out.println("TERMINA PROGRAMA");
        
    }
    
}
