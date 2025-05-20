package eva3_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_6 {

   
   public static void main(String[] args) {
      
      int nume = 0;
      while(true){
         try{
            Scanner captu = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            nume = captu.nextInt();
            break;
         }catch(InputMismatchException e){
            
         }
      }

      System.out.println("El valor capturado es = " + nume);
      
      
   
      
   }
   
}
