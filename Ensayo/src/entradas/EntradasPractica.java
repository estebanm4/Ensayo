package entradas;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EntradasPractica {

    public static void main(String[] args) {
        File archivo;
        FileReader lectura;
        BufferedReader almacenamiento;
        String cadena, nombre = "", dir = "", email = "";
        int registros = 1;
        archivo = new File("usuarios.txt");
        
        try {
            lectura = new FileReader(archivo);
            almacenamiento = new BufferedReader(lectura);
            cadena = "";
            
            while(cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    dir = cadena;
                    cadena = almacenamiento.readLine();
                    email = cadena;
                    
                    if(cadena != null){
                        JOptionPane.showMessageDialog(null, "Nombre; " + nombre + "\n" + 
                                "Dirección: " + dir + "\n" + 
                                "E-Mail: " + email + "\n", "Mostrando datos de la entrada #" + registros, 1);
                        registros ++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(EntradasPractica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                almacenamiento.close();
                lectura.close();
            } catch (IOException ex) {
                Logger.getLogger(EntradasPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EntradasPractica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
