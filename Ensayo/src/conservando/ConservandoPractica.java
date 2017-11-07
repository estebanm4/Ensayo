package conservando;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConservandoPractica {

    public static void main(String[] args) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre="", carrera="", universidad ="";
        
        archivo = new File("datos.txt");
        
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Escriba su nombre: ", "Datos del Sistema", 3);
                carrera = JOptionPane.showInputDialog(null, "Escriba su carrera: ", "Datos del Sistema", 3);
                universidad = JOptionPane.showInputDialog(null, "Escriba su universidad: ", "Datos del Sistema", 3);
                
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                
                linea.println(nombre);
                linea.println(carrera);
                linea.println(universidad);
                
                linea.close();
                escribir.close();               
                
            } catch (IOException ex) {
                Logger.getLogger(ConservandoPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                
                nombre = JOptionPane.showInputDialog(null, "Escriba su nombre: ", "Datos del Sistema", 3);
                carrera = JOptionPane.showInputDialog(null, "Escriba su carrera: ", "Datos del Sistema", 3);
                universidad = JOptionPane.showInputDialog(null, "Escriba su universidad: ", "Datos del Sistema", 3);
                
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                
                linea.println(nombre);
                linea.println(carrera);
                linea.println(universidad);
                
                linea.close();
                escribir.close();               
                
            } catch (IOException ex) {
                Logger.getLogger(ConservandoPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
}
