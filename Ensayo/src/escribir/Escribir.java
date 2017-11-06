package escribir;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Escribir {

    public static void main(String[] args) {
        File miArchivo;//Para manipular el archivo  
        PrintWriter escribir;// Para escribir en el archivo
        String nombre;
        miArchivo = new File("ejemploLectura.txt"); //Praparando el archivo (Crear una instancia)
        
        //Verificar que el archivo no existe
        
        if( !miArchivo.exists()){
            try {
                //Código donde pueden ocurrir errores
                miArchivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                escribir = new PrintWriter(miArchivo, "utf-8");
                nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre:");
                escribir.println("Hola " + nombre + ", Bienvenido al Himalaya");
                escribir.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
    
}
