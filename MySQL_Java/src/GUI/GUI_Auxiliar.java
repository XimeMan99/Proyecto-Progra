/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Curso;
import Clases.Documento;
import Clases.EstadoDocumento;
import Clases.Mensaje;
import MySQL.Consultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Koka
 */
public class GUI_Auxiliar extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form GUI_Auxiliar
     */
    ArrayList<Mensaje> mensajes;
    
    public GUI_Auxiliar() {
        initComponents();
        this.setLocationRelativeTo(null);
        strip_seleccionarCurso.setVisible(false);
        strip_subirDocumento.setVisible(false);
        lbl_bienvenida.setText("Bienvenido "+Consultas.alumno_Loggeado.getNombre()+"!");
        ConsultarAux();
    }
    
    private void ConsultarAux()
    {
        if(!Consultas.AuxTieneCurso(Consultas.alumno_Loggeado))
        {
            strip_seleccionarCurso.setVisible(true);
            return;
        }
        strip_subirDocumento.setVisible(true);
        
        //CARGAR BANDEJA DE ENTRADA
        mensajes = new ArrayList<>();
        ArrayList<EstadoDocumento> estados = Consultas.ObtenerEstadosDelAux(Consultas.alumno_Loggeado);
        for (EstadoDocumento estado : estados) {
            
            Documento documento = Consultas.ObtenerDocumento(estado.getDocumento_cod_documento());
            JMenuItem item = new JMenuItem(Consultas.ObtenerAlumno(estado.getAlumno_cod_alumno(), "").getNombre());
            item.setVisible(false);
            item.addActionListener(this);
            
            if(estado.getEstado()==2)
            {
                item.setVisible(true);
            }
            strip_bandejaEntrada.add(item);
            Mensaje mensaje = new Mensaje();
            mensaje.setEstado(estado);
            mensaje.setMenuItem(item);
            mensajes.add(mensaje);
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

        lbl_bienvenida = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        strip_curso = new javax.swing.JMenu();
        strip_subirDocumento = new javax.swing.JMenuItem();
        strip_seleccionarCurso = new javax.swing.JMenuItem();
        strip_bandejaEntrada = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_bienvenida.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_bienvenida.setText("Bienvenido Nombre!");

        strip_curso.setText("Curso");

        strip_subirDocumento.setText("Subir Documento");
        strip_subirDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strip_subirDocumentoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                strip_subirDocumentoMousePressed(evt);
            }
        });
        strip_subirDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strip_subirDocumentoActionPerformed(evt);
            }
        });
        strip_curso.add(strip_subirDocumento);

        strip_seleccionarCurso.setText("Seleccionar Curso");
        strip_seleccionarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strip_seleccionarCursoActionPerformed(evt);
            }
        });
        strip_curso.add(strip_seleccionarCurso);

        jMenuBar1.add(strip_curso);

        strip_bandejaEntrada.setText("Bandeja de Entrada");
        jMenuBar1.add(strip_bandejaEntrada);

        jMenu1.setText("Cerrar Sesión");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(lbl_bienvenida)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_bienvenida)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void strip_subirDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strip_subirDocumentoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_strip_subirDocumentoMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        GUI_Login gui = new GUI_Login();
        gui.show();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void strip_subirDocumentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strip_subirDocumentoMousePressed
        // TODO add your handling code here:System.out.println("hola");
        
    }//GEN-LAST:event_strip_subirDocumentoMousePressed

    private void strip_subirDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strip_subirDocumentoActionPerformed
        // TODO add your handling code here:
        String documento = JOptionPane.showInputDialog(null,"Ingrese un documento");
        
        Consultas.EnviarDocumento(documento);
        
        JOptionPane.showMessageDialog(null, "Documento enviado con éxito");
    }//GEN-LAST:event_strip_subirDocumentoActionPerformed

    private void strip_seleccionarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strip_seleccionarCursoActionPerformed
        // TODO add your handling code here:
        GUI_CursoAux gui;
        try {
            gui = new GUI_CursoAux();
            gui.show();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Auxiliar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_strip_seleccionarCursoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Auxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Auxiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_bienvenida;
    private javax.swing.JMenu strip_bandejaEntrada;
    private javax.swing.JMenu strip_curso;
    private javax.swing.JMenuItem strip_seleccionarCurso;
    private javax.swing.JMenuItem strip_subirDocumento;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Mensaje mensaje : mensajes) {
            if((e.getSource().equals(mensaje.getMenuItem())))
            {
                JOptionPane.showMessageDialog(null, "Alumno: "+
                        Consultas.ObtenerAlumno(mensaje.getEstado().getAlumno_cod_alumno(), "").getNombre()
                        + "\nCurso: "+
                        Consultas.ObtenerCursoDelDocumento(mensaje.getEstado().getDocumento_cod_documento()).getNombre()+
                        "\nDocumento: "+
                        Consultas.ObtenerDocumento(mensaje.getEstado().getDocumento_cod_documento()).getDocumento());
                
                Consultas.MarcarLeido(mensaje.getEstado());
            }
        }
    }
}
