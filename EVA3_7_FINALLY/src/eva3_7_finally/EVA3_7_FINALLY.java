package eva3_7_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_7_FINALLY {

   public static void main(String[] args) {
      try{
      Scanner captu = new Scanner(System.in);
      System.out.println("Introduce valor enter: ");
      int valor = captu.nextInt();
      System.out.println("Valor capturado: " + valor);
      }catch(InputMismatchException e){
         System.out.println("El valor introducido no es un entero");
      }finally{
         System.out.println("Esta linea siempre se va a ejecutar");
      }
      System.out.println("Fin del programa!!");
      
   }
   
}
