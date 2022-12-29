package a.miniproyecto3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author JHOIMAR
 */
public class txt {

    File archivo;

    public void crearArchivo() {
        try {
            archivo = new File("Datos.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo creado correctamente");
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public void EscribirArchivo(Paciente paciente) {
        try {
            FileWriter escritura = new FileWriter(archivo, true);
            escritura.write(paciente.toString() + "\r\n");
            escritura.close();
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public void MostrarArchivos() {
        try {
            BufferedReader escritura = new BufferedReader(new FileReader(archivo));
            escritura.readLine();
            System.out.println(escritura.readLine());
            escritura.close();
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public boolean ValidarUsuario(String Id) {
        boolean i = false;
        
        try {
            BufferedReader escritura = new BufferedReader(new FileReader(archivo));
            String posicion = "";

            while ((posicion = escritura.readLine()) != null) {
                if (posicion.indexOf(Id) != -1) {
                    System.out.println("Se encontró el registro" + posicion);
                    i = true;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        
        return i;
    }

}
