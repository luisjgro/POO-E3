package eva3_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5 {

   public static void main(String[] args) {
      try{
         
         int[] datos = new int[5];
         datos[7] = 0;
         
         int x = 7, y = 0;
         int resu = x / y;
         
         Scanner captu = new Scanner(System.in);
         System.out.println("Introduce un numero: ");
         int nume = captu.nextInt();
         
      }catch(ArrayIndexOutOfBoundsException e){
         
      }catch(ArithmeticException e){
         e.printStackTrace();
      }catch(InputMismatchException e){
         e.printStackTrace();
      }
   }
   
}
