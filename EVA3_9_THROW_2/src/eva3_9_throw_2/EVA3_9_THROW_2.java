package eva3_9_throw_2;

public class EVA3_9_THROW_2 {

   public static void main(String[] args) {
      Persona perso = null;
      try{
         perso = new Persona("Luis", "Guerrero", -1);
      }catch (Exception ex){
         ex.printStackTrace();
      }
      System.out.println("");
      
   }
   
   
   }
class Persona{
   private String nombre;
   private String apellido;
   private int edad;

   
   public Persona() {
      nombre = "";
      apellido = "";
      edad = 0;
   }
   
   public Persona(String nombre, String apellido, int edad) throws Exception {
      this.nombre = nombre;
      this.apellido = apellido;
      setEdad(edad);
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) throws Exception {
      if (edad < 0)
         throw new Exception("La edad no puede ser negativa!!");
      else
         this.edad = edad;
   }
   
   
   public String toString(){
      return "Datos de la Persona" + "\n" +
              "Nombre: " + nombre + "\n" + 
              "Apellido: " + apellido + "\n" +
              "Edad: " + edad;
      
   }
}
