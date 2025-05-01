package eva3_3;

public class EVA3_3 {

    public static void main(String[] args) {
        
        try{//Bloque que intenta ejecutar un codigo
            //Que potencialmente genera una excepción
           int x = 5, y = 0;
           int resu = x / y;
           System.out.println("Resultado = " + resu);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Termina programa");
        
    }
    
}
