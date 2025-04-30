
import java.util.Scanner;

public class EVA3_1_EXCEPTIONS {

    public static void main(String[] args) {
        int x = 5, y = 0;
        //int resu = x / y;
        
        //Arithmetic Exceptions
        //System.out.println("Resultado = " + resu);
        
        //Indexoutofbounds Exceptions
        //Arreglos: Leer una posicion que no existe
        //int[] arreglo = new int[5];//0, 1, 2, 3, 4
        //System.out.println(arreglo[10]);
        
        //Null Pointer Exception
        
        
        //Inputmismatch Exception
        // Piden un dato de un tipo y les mandan de otro diferente
        
        Scanner captu = new Scanner(System.in);
        int valor = captu.nextInt();
        System.out.println("Valor = " + valor);
    }
    
}
