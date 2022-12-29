/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package a.miniproyecto3;

/**
 *
 * @author JHOIMAR
 */
public class MiniProyecto3 {

    public static void main(String[] args) {

        Almacenamiento almacenamiento = new Almacenamiento();
       
        VentanaAdministracion administracion = new VentanaAdministracion(almacenamiento);
        VentanaLogin login = new VentanaLogin(administracion);
        VentanaAgendarCitas citas = new VentanaAgendarCitas(almacenamiento);
        VentanaDeAfiliacion afiliacion = new VentanaDeAfiliacion(almacenamiento);

        VentanaInicio inicio = new VentanaInicio(
                afiliacion,
                citas,
                login
        );
        
        inicio.setVisible(true);
    }
}
