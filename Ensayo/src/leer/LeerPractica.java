package leer;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LeerPractica {

    public static void main(String[] args) {
        File archivo;
        FileReader lectura;
        String cadena;
        String ventana = "";
        
        archivo = new File("ejemploLectura.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(LeerPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            lectura = new FileReader(archivo);
            BufferedReader almacenamiento = new BufferedReader(lectura);
            cadena = "";
            
            while(cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    if(cadena != null){
                        System.out.println(cadena);
                        ventana = ventana + cadena + "\n";
                    }
                } catch (IOException ex) {
                    Logger.getLogger(LeerPractica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                almacenamiento.close();
                lectura.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerPractica.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, ventana, "Datos del Sistema", 1);
    }
}
