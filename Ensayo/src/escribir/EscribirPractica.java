package escribir;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class EscribirPractica {
    
    public static void main(String[] args) {
        File archivo;
        PrintWriter escribir;
        String nombre;
        String mensaje;
        
        archivo = new File("ejemploLectura.txt");
        
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(EscribirPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                escribir = new PrintWriter (archivo, "utf-8");
                nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
                escribir.println("Hola " + nombre + ", ¡Bienvenido al Himalaya!");
                mensaje = JOptionPane.showInputDialog(null, "Ingrese su búsqueda: ");
                escribir.println("Quisiste decir ; " + mensaje + "?");
                escribir.close();
            } catch (Exception e) {
                e.printStackTrace();
            } 
            
        }
        
  }
}
