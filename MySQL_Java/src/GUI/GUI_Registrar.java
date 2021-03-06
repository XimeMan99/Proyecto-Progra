/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MySQL.Consultas;
import Clases.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GUI_Registrar extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Registrar
     */
    public GUI_Registrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            Consultas.ComboTipoAlumno(combo_tipo);
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_carnet = new javax.swing.JTextField();
        txt_contra = new javax.swing.JPasswordField();
        btn_iniciarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_contra2 = new javax.swing.JPasswordField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_nombre1 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("REGISTRARSE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Carnet:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña:");

        txt_carnet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_contra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_iniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_iniciarSesion.setText("REGISTRAR");
        btn_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarSesionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Confirmar Contraseña:");

        txt_contra2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_nombre.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbl_nombre1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_nombre1.setText("Tipo:");

        combo_tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_regresar.setText("←");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_nombre1))
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_contra2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txt_contra)
                            .addComponent(txt_carnet))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(btn_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btn_regresar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_contra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre1)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_iniciarSesion)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarSesionActionPerformed
        // TODO add your handling code here:
        if(!txt_contra.getText().equals(txt_contra2.getText()))
        {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, Intentelo de nuevo!");
            return;
        }
        if(combo_tipo.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de Alumno para el registro!");
            return;
        }
        
        Alumno alumno = new Alumno();
        alumno.setCarnet(txt_carnet.getText());
        alumno.setContraseña(txt_contra.getText());
        alumno.setNombre(txt_nombre.getText());
        ComboBoxItem sel = (ComboBoxItem)combo_tipo.getSelectedItem();
        alumno.setTipo_alumno_cod_tipo(sel.valor);
        
        if(Consultas.ExisteAlumno(alumno))
        {
            JOptionPane.showMessageDialog(null, "Ya existe un alumno registrado con este numero de carnet \nIntentelo de nuevo");
            return;
        }
        
        if(!Consultas.RegistrarAlumno(alumno))
        {
            JOptionPane.showMessageDialog(null,"Error al registrar Alumno");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Alumno registrado con éxito!!");
        LimpiarCampos();
    }//GEN-LAST:event_btn_iniciarSesionActionPerformed

    private void LimpiarCampos()
    {
        txt_carnet.setText("");
        txt_nombre.setText("");
        txt_contra.setText("");
        txt_contra2.setText("");
    }
    
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        this.hide();
        GUI_Principal n = new GUI_Principal();
        n.show();
    }//GEN-LAST:event_btn_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciarSesion;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<ComboBoxItem> combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JTextField txt_carnet;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JPasswordField txt_contra2;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
