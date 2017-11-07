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
        String cadena, nombre = "", carrera = "", universidad = "";
        int registro = 1;

        archivo = new File("datos.txt");

        try {
            lectura = new FileReader(archivo);
            almacenamiento = new BufferedReader(lectura);
            cadena = "";
            while (cadena != null) {
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    carrera = cadena;
                    cadena = almacenamiento.readLine();
                    universidad = cadena;

                    if (cadena != null) {
                        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n"
                                + "Carrera: " + carrera + "\n"
                                + "Universidad: " + universidad, "Entrada #" + registro, 1);
                        registro++;
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
