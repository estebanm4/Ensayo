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
        String nombre = "", dir = "", email = "";

        archivo = new File("usuarios.txt");

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Igrese el nombre: ", "Datos del Sistema", 3);
                dir = JOptionPane.showInputDialog(null, "Igrese la direccion: ", "Datos del Sistema", 3);
                email = JOptionPane.showInputDialog(null, "Igrese el e-mail: ", "Datos del Sistema", 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(nombre);
                linea.println(dir);
                linea.println(email);

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(ConservandoPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Igrese el nombre: ", "Datos del Sistema", 3);
                dir = JOptionPane.showInputDialog(null, "Igrese la direccion: ", "Datos del Sistema", 3);
                email = JOptionPane.showInputDialog(null, "Igrese el e-mail: ", "Datos del Sistema", 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(nombre);
                linea.println(dir);
                linea.println(email);

                linea.close();
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(ConservandoPractica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
