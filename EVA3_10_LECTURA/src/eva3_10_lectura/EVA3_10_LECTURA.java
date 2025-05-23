package eva3_10_lectura;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.imageio.stream.FileImageInputStream;

public class EVA3_10_LECTURA {

   public static void main(String[] args) {
        String ruta= "C:\\Users\\invitado\\Desktop\\simon\\texto.txt";
        try{
            //readUsingScanner(ruta);
                ////System.out.println("");
            //readUsingFiles(ruta);
            readUsingBufferedReader(ruta);
            writeUsingFiles(ruta, "Hola mundo! \n Escribiendo.. ");
            writeUsingFileWriter(ruta, "Hello mundo yo soy giovanni giorgio but everybody calls me giorgio");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
   
   public static void readUsingFiles(String ruta){
      System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
      Path path = Paths.get(ruta);
      //String cade = Files.
}
   
   public static void readUsingScanner (String ruta) throws IOException{
       System.out.println("Lectura de archivos usando Scanner");
        Path path= Paths.get(ruta);
        //String cade= Files.readString(path);
        //System.out.println(cade);
        File source = new File(ruta);
        Scanner leerArch = new Scanner(source);
        leerArch.nextLine();
        while (leerArch.hasNextLine()){
            //cade= leerArch.nextLine();
            //System.out.println(cade);
        }
        
   }
   
   public static void readUsingBufferedReader(String ruta) throws FileNotFoundException, IOException{
      System.out.println("LECUTRA USANDO BUFFERER READER");
      File file = new File(ruta);
      FileInputStream inStream = new FileInputStream(file);
      InputStreamReader in = new InputStreamReader(inStream);
      BufferedReader leerTxt = new BufferedReader(in);
      String cade;
      while((cade = leerTxt.readLine()) != null){
      System.out.println(cade);
   }
      leerTxt.close();
   }
   
   public static void writeUsingFiles(String ruta, String texto) throws IOException{
      System.out.println("LECTURA USANDO FILES");
      Path path = Paths.get(ruta + "files.txt");
      Files.write(path, texto.getBytes());
   }
   
   public static void writeUsingFileWriter(String ruta, String texto) throws IOException{
      System.out.println("ESCRIBIR USANDO FILEWRITER");
      File file = new File(ruta + "filewriter.txt");
      FileWriter escArch = new FileWriter(file);
      escArch.write(texto);
      escArch.close();
   }
}
