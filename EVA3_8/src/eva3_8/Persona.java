package eva3_8;

public class Persona {
   private String nombre;
   private String apellido;
   private int edad;

   
   public Persona() {
      nombre = "";
      apellido = "";
      edad = 0;
   }
   
   public Persona(String nombre, String apellido, int edad) {
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

   public void setEdad(int edad) {
      if (edad < 0)
         throw new RuntimeException("La edad no puede ser negativa!!");
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
