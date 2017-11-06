package entradas;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Entradas {
    
    public static void main(String[] args) {
        File archivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena, nombre = "", dir = "", email = "";
        archivo = new File("usuarios.txt");
        int registros = 1;
        
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            cadena = "";
            while (cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    dir = cadena;
                    cadena = almacenamiento.readLine();
                    email = cadena;
                    
                    if (cadena != null){
                        JOptionPane.showMessageDialog(null, "Nombre : " + nombre + "\n"
                        + "Dirección : " + dir + "\n"
                        + "E-mail : " + email, "Mostrando datos del Registro #" + registros, 1);
                        registros ++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Entradas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                almacenamiento.close();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(Entradas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Entradas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
