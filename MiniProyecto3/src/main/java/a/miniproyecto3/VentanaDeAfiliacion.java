/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a.miniproyecto3;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author JHOIMAR
 */

public class VentanaDeAfiliacion extends javax.swing.JFrame {
    
    ArrayList<Paciente> UsuarioPacientes = new ArrayList(); 
    public VentanaDeAfiliacion() {
        initComponents();
        setSize(668, 420);
        setLocationRelativeTo(null);
        setResizable(false);
        setMinimumSize(new Dimension(200,200));
        this.getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        BoxTipoDocumento = new javax.swing.JComboBox<>();
        TFielNombre = new javax.swing.JTextField();
        TfielApellido = new javax.swing.JTextField();
        LabelDocumento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        LabelBarrio = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        Tfieldireccion = new javax.swing.JTextField();
        Tfielbarrio = new javax.swing.JTextField();
        Tfielcorreo = new javax.swing.JTextField();
        Tfieltelefono = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LabelGenero = new javax.swing.JLabel();
        BoxGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TfielNdocumento = new javax.swing.JTextField();
        TFielFecha = new javax.swing.JTextField();

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

        BoxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA CIUDADANA", "TARJETA DE IDENTIDAD", "CEDULA EXTRANJERA", "REGISTRO CIVIL" }));
        BoxTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxTipoDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(BoxTipoDocumento);
        BoxTipoDocumento.setBounds(150, 130, 150, 20);

        TFielNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFielNombreActionPerformed(evt);
            }
        });
        TFielNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFielNombreKeyTyped(evt);
            }
        });
        jPanel1.add(TFielNombre);
        TFielNombre.setBounds(70, 100, 230, 22);

        TfielApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfielApellidoActionPerformed(evt);
            }
        });
        TfielApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TfielApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(TfielApellido);
        TfielApellido.setBounds(380, 100, 270, 22);

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

        Tfieldireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfieldireccionActionPerformed(evt);
            }
        });
        jPanel1.add(Tfieldireccion);
        Tfieldireccion.setBounds(80, 220, 260, 22);

        Tfielbarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfielbarrioActionPerformed(evt);
            }
        });
        jPanel1.add(Tfielbarrio);
        Tfielbarrio.setBounds(410, 220, 190, 22);

        Tfielcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfielcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(Tfielcorreo);
        Tfielcorreo.setBounds(150, 250, 240, 22);

        Tfieltelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfieltelefonoActionPerformed(evt);
            }
        });
        Tfieltelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TfieltelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(Tfieltelefono);
        Tfieltelefono.setBounds(480, 250, 120, 22);

        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonGuardar);
        BotonGuardar.setBounds(280, 300, 100, 30);

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 300, 90, 30);

        jButton3.setText("ATRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(390, 300, 90, 30);

        LabelGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        LabelGenero.setText("GENERO: ");
        jPanel1.add(LabelGenero);
        LabelGenero.setBounds(10, 160, 60, 20);

        BoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOMBRE", "MUJER" }));
        jPanel1.add(BoxGenero);
        BoxGenero.setBounds(80, 160, 220, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DOCUMENTO: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 130, 90, 16);

        TfielNdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfielNdocumentoActionPerformed(evt);
            }
        });
        TfielNdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TfielNdocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(TfielNdocumento);
        TfielNdocumento.setBounds(400, 130, 250, 22);

        TFielFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFielFechaActionPerformed(evt);
            }
        });
        TFielFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFielFechaKeyTyped(evt);
            }
        });
        jPanel1.add(TFielFecha);
        TFielFecha.setBounds(460, 160, 190, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfieldireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfieldireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfieldireccionActionPerformed

    private void TfielbarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfielbarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfielbarrioActionPerformed

    private void TfielcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfielcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfielcorreoActionPerformed

    private void TfielApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfielApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfielApellidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Aca va el boton de limpiar
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // Aca va el boton de guardar
        
        Paciente persona;
           String nombre;
           String apellido;
           int documento;
           String tipoDocumento = "";
           String genero = "";
           int fecha;
           String direccion;
           String barrio;
           String correo;
           int telefono;  
           
        nombre = TFielNombre.getText();
        apellido = TfielApellido.getText();
        documento = Integer.parseInt(TfielNdocumento.getText());
        tipoDocumento = BoxTipoDocumento.getSelectedItem().toString();
        genero = BoxGenero.getSelectedItem().toString();
        fecha = Integer.parseInt(TFielFecha.getText());
        direccion = Tfieldireccion.getText();
        barrio = Tfielbarrio.getText();
        correo = Tfielcorreo.getText();
        telefono = Integer.parseInt(Tfieltelefono.getText());
        
        if(evt.getSource()==BotonGuardar){
            persona = new Paciente(nombre, apellido, documento, tipoDocumento,genero,fecha,direccion,barrio,correo,telefono);
            UsuarioPacientes.add(persona);
            JOptionPane.showMessageDialog(rootPane, "SE HA GUARDADO CORRECTAMENTE");
            Limpiar();
        }
        
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Aca va el boton de atras
        VentanaInicio v1Inicio = new VentanaInicio();
        v1Inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TfieltelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfieltelefonoKeyTyped
        // Aca para que solo valide numeros
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SOLO INGRESE NÚMEROS");
        }
    }//GEN-LAST:event_TfieltelefonoKeyTyped

    private void TfielNdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfielNdocumentoActionPerformed
        // Aca el numero del documento
        
    }//GEN-LAST:event_TfielNdocumentoActionPerformed

    private void TfieltelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfieltelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfieltelefonoActionPerformed

    private void TfielNdocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfielNdocumentoKeyTyped
        // Aca solo se permiten numeros en el documento
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SOLO INGRESE NÚMEROS");
        }
    }//GEN-LAST:event_TfielNdocumentoKeyTyped

    private void TFielNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFielNombreKeyTyped
        // Valido que solo ingrese texto
        char validartxt = evt.getKeyChar();
        
        if(Character.isDigit(validartxt)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO TEXTO");
        }
                
    }//GEN-LAST:event_TFielNombreKeyTyped

    private void TfielApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfielApellidoKeyTyped
        // Valido que solo ingrese texto
        char validartxt = evt.getKeyChar();
        
        if(Character.isDigit(validartxt)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO TEXTO");
        }
    }//GEN-LAST:event_TfielApellidoKeyTyped

    private void TFielFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFielFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFielFechaActionPerformed

    private void TFielFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFielFechaKeyTyped
        // Valido que solo sean caracteres numericos
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SOLO INGRESE NÚMEROS");
        }
    }//GEN-LAST:event_TFielFechaKeyTyped

    private void TFielNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFielNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFielNombreActionPerformed

    private void BoxTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxTipoDocumentoActionPerformed
    
    public void Limpiar(){
        TFielNombre.setText("");
        TfielApellido.setText("");
        Tfieldireccion.setText("");
        Tfielbarrio.setText("");
        Tfielcorreo.setText("");
        Tfieltelefono.setText("");
        TfielNdocumento.setText("");
        TFielFecha.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDeAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDeAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDeAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDeAfiliacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaDeAfiliacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JComboBox<String> BoxGenero;
    private javax.swing.JComboBox<String> BoxTipoDocumento;
    private javax.swing.JLabel LabelApellido;
    private javax.swing.JLabel LabelBarrio;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelDocumento;
    private javax.swing.JLabel LabelGenero;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel Labelnombre;
    private javax.swing.JTextField TFielFecha;
    private javax.swing.JTextField TFielNombre;
    private javax.swing.JTextField TfielApellido;
    private javax.swing.JTextField TfielNdocumento;
    private javax.swing.JTextField Tfielbarrio;
    private javax.swing.JTextField Tfielcorreo;
    private javax.swing.JTextField Tfieldireccion;
    private javax.swing.JTextField Tfieltelefono;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
