package conservando;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conservando {

    public static void main(String[] args) {
        File archivo;
        FileWriter escribir; //Para escribir en el archivo
        PrintWriter linea; // Para escribir en el archivo
        String nombre = "", dir = "", email = "";

        archivo = new File("usuarios.txt");  //Crear una instancia
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ", "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa la direccion: ", "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa el e-mail: ", "Solicitando datos", 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el Archivo
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(Conservando.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ", "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa la direccion: ", "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa el e-mail: ", "Solicitando datos", 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el Archivo
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(Conservando.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
