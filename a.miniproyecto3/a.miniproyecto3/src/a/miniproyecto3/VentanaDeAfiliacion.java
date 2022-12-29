/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a.miniproyecto3;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author JHOIMAR
 */
public class VentanaDeAfiliacion extends javax.swing.JFrame {

    private Almacenamiento almacenamiento;
    private VentanaInicio padre;

    public VentanaDeAfiliacion(
            Almacenamiento almacenamiento
    ) {
        initComponents();
        setSize(668, 420);
        setLocationRelativeTo(null);
        setResizable(false);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.almacenamiento = almacenamiento;
    }

    public void setPadre(VentanaInicio padre) {
        this.padre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Labelnombre = new javax.swing.JLabel();
        LabelApellido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FieldTipoDocumento = new javax.swing.JComboBox<>();
        FieldNombre = new javax.swing.JTextField();
        FieldApellido = new javax.swing.JTextField();
        LabelDocumento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        LabelBarrio = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        FieldDireccion = new javax.swing.JTextField();
        FieldBarrio = new javax.swing.JTextField();
        FieldCorreo = new javax.swing.JTextField();
        FieldTelefono = new javax.swing.JTextField();
        ButtonGuardar = new javax.swing.JButton();
        ButtonLimpiar = new javax.swing.JButton();
        ButtonAtras = new javax.swing.JButton();
        LabelGenero = new javax.swing.JLabel();
        FieldGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        FieldDocumento = new javax.swing.JTextField();
        FieldFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 500));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FORMULARIO DE AFILIACIÓN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 360, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DATOS PERSONALES");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 150, 20);

        Labelnombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Labelnombre.setForeground(new java.awt.Color(0, 0, 0));
        Labelnombre.setText("NOMBRE:");
        jPanel1.add(Labelnombre);
        Labelnombre.setBounds(10, 100, 60, 20);

        LabelApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelApellido.setForeground(new java.awt.Color(0, 0, 0));
        LabelApellido.setText("APELLIDOS:");
        jPanel1.add(LabelApellido);
        LabelApellido.setBounds(310, 100, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("FECHA DE NACIMIENTO:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 160, 150, 20);

        FieldTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA CIUDADANA", "TARJETA DE IDENTIDAD", "CEDULA EXTRANJERA", "REGISTRO CIVIL" }));
        FieldTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTipoDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(FieldTipoDocumento);
        FieldTipoDocumento.setBounds(150, 130, 150, 20);

        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });
        FieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldNombreKeyTyped(evt);
            }
        });
        jPanel1.add(FieldNombre);
        FieldNombre.setBounds(70, 100, 230, 25);

        FieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldApellidoActionPerformed(evt);
            }
        });
        FieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(FieldApellido);
        FieldApellido.setBounds(380, 100, 270, 25);

        LabelDocumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelDocumento.setForeground(new java.awt.Color(0, 0, 0));
        LabelDocumento.setText("TIPO DE DOCUMENTO:");
        jPanel1.add(LabelDocumento);
        LabelDocumento.setBounds(10, 130, 140, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DATOS PARA LA COMUNICACIÓN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 190, 240, 20);

        LabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        LabelDireccion.setText("DIRECCIÓN:");
        jPanel1.add(LabelDireccion);
        LabelDireccion.setBounds(10, 220, 80, 20);

        LabelBarrio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelBarrio.setForeground(new java.awt.Color(0, 0, 0));
        LabelBarrio.setText("BARRIO:");
        jPanel1.add(LabelBarrio);
        LabelBarrio.setBounds(350, 220, 60, 20);

        LabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        LabelTelefono.setText("TELEFONO: ");
        jPanel1.add(LabelTelefono);
        LabelTelefono.setBounds(400, 250, 80, 20);

        LabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        LabelCorreo.setText("CORREO ELECTRONICO:  ");
        jPanel1.add(LabelCorreo);
        LabelCorreo.setBounds(10, 250, 150, 20);

        FieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(FieldDireccion);
        FieldDireccion.setBounds(80, 220, 260, 25);

        FieldBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldBarrioActionPerformed(evt);
            }
        });
        jPanel1.add(FieldBarrio);
        FieldBarrio.setBounds(410, 220, 190, 25);

        FieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(FieldCorreo);
        FieldCorreo.setBounds(150, 250, 240, 25);

        FieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTelefonoActionPerformed(evt);
            }
        });
        FieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(FieldTelefono);
        FieldTelefono.setBounds(480, 250, 120, 25);

        ButtonGuardar.setText("GUARDAR");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonGuardar);
        ButtonGuardar.setBounds(280, 300, 100, 30);

        ButtonLimpiar.setText("LIMPIAR");
        ButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonLimpiar);
        ButtonLimpiar.setBounds(180, 300, 90, 30);

        ButtonAtras.setText("ATRAS");
        ButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAtras);
        ButtonAtras.setBounds(390, 300, 90, 30);

        LabelGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        LabelGenero.setText("GENERO: ");
        jPanel1.add(LabelGenero);
        LabelGenero.setBounds(10, 160, 60, 20);

        FieldGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOMBRE", "MUJER" }));
        jPanel1.add(FieldGenero);
        FieldGenero.setBounds(80, 160, 220, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DOCUMENTO: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 130, 90, 16);

        FieldDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDocumentoActionPerformed(evt);
            }
        });
        FieldDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldDocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(FieldDocumento);
        FieldDocumento.setBounds(400, 130, 250, 25);

        FieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldFechaActionPerformed(evt);
            }
        });
        FieldFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldFechaKeyTyped(evt);
            }
        });
        jPanel1.add(FieldFecha);
        FieldFecha.setBounds(460, 160, 190, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDireccionActionPerformed

    private void FieldBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldBarrioActionPerformed

    private void FieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCorreoActionPerformed

    private void FieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldApellidoActionPerformed

    private void ButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpiarActionPerformed
        //Aca va el boton de limpiar
        Limpiar();
    }//GEN-LAST:event_ButtonLimpiarActionPerformed

    public static Almacenamiento DatosAlmacenar = new Almacenamiento();
    public static int largoLista;

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        // Aca va el boton de guardar

        Paciente persona;
        txt archivo = new txt();
        archivo.crearArchivo();
        archivo.MostrarArchivos();

        TipoDocumento tipoDocumento;

        switch (FieldTipoDocumento.getSelectedItem().toString()) {
            default:
                tipoDocumento = TipoDocumento.CedulaCiudadania;
        }

        if (evt.getSource() == ButtonGuardar) {

            Paciente paciente = new Paciente(
                    FieldNombre.getText(), FieldApellido.getText(),
                    Integer.parseInt(FieldDocumento.getText()),
                    tipoDocumento, FieldGenero.getSelectedItem().toString(),
                    Integer.parseInt(FieldFecha.getText()),
                    FieldDireccion.getText(), FieldBarrio.getText(),
                    FieldCorreo.getText(),
                    Integer.parseInt(FieldTelefono.getText())
            );

            archivo.EscribirArchivo(paciente);

            almacenamiento.getPacientes().add(paciente);            

            JOptionPane.showMessageDialog(rootPane, "SE HA GUARDADO CORRECTAMENTE");

            System.out.println(largoLista);
            System.out.println(almacenamiento.getPacientes().get(0).getNombre());

            Limpiar();
        }
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void ButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtrasActionPerformed
        // Aca va el boton de atras
        this.padre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonAtrasActionPerformed

    private void FieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldTelefonoKeyTyped
        // Aca para que solo valide numeros
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SOLO INGRESE NÚMEROS");
        }
    }//GEN-LAST:event_FieldTelefonoKeyTyped

    private void FieldDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDocumentoActionPerformed
        // Aca el numero del documento

    }//GEN-LAST:event_FieldDocumentoActionPerformed

    private void FieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTelefonoActionPerformed

    private void FieldDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldDocumentoKeyTyped
        // Aca solo se permiten numeros en el documento
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SOLO INGRESE NÚMEROS");
        }
    }//GEN-LAST:event_FieldDocumentoKeyTyped

    private void FieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNombreKeyTyped
        // Valido que solo ingrese texto
        char validartxt = evt.getKeyChar();

        if (Character.isDigit(validartxt)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO TEXTO");
        }

    }//GEN-LAST:event_FieldNombreKeyTyped

    private void FieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldApellidoKeyTyped
        // Valido que solo ingrese texto
        char validartxt = evt.getKeyChar();

        if (Character.isDigit(validartxt)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO TEXTO");
        }
    }//GEN-LAST:event_FieldApellidoKeyTyped

    private void FieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldFechaActionPerformed

    private void FieldFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldFechaKeyTyped
        // Valido que solo sean caracteres numericos
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SOLO INGRESE NÚMEROS");
        }
    }//GEN-LAST:event_FieldFechaKeyTyped

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void FieldTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTipoDocumentoActionPerformed

    public void Limpiar() {
        FieldNombre.setText("");
        FieldApellido.setText("");
        FieldDireccion.setText("");
        FieldBarrio.setText("");
        FieldCorreo.setText("");
        FieldTelefono.setText("");
        FieldDocumento.setText("");
        FieldFecha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtras;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldBarrio;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldDocumento;
    private javax.swing.JTextField FieldFecha;
    private javax.swing.JComboBox<String> FieldGenero;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JComboBox<String> FieldTipoDocumento;
    private javax.swing.JLabel LabelApellido;
    private javax.swing.JLabel LabelBarrio;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelDocumento;
    private javax.swing.JLabel LabelGenero;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel Labelnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
