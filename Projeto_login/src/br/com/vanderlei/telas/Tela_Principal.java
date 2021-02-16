/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vanderlei.telas;

import java.text.DateFormat;
import java.util.Date;
import javafx.scene.input.DataFormat;
import javax.swing.JOptionPane;
import sun.util.calendar.LocalGregorianCalendar;

/**
 *
 * @author vande
 */
public class Tela_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        data_hora = new javax.swing.JLabel();
        id_nome_usu = new javax.swing.JLabel();
        menus = new javax.swing.JMenuBar();
        _cadastro_main_cad = new javax.swing.JMenu();
        cadastro_main_clientes = new javax.swing.JMenuItem();
        _os_main_cad = new javax.swing.JMenuItem();
        _usuario_main_cad = new javax.swing.JMenuItem();
        _relatorio_main = new javax.swing.JMenu();
        _relatorio_servocos_ = new javax.swing.JMenuItem();
        _ajuda_sobre_ = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        _opcoes_main = new javax.swing.JMenu();
        opcoes_sair_main = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela pricipal");
        setBackground(new java.awt.Color(255, 255, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vanderlei/icones/img_amarela.png"))); // NOI18N

        data_hora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        data_hora.setText("Data");

        id_nome_usu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_nome_usu.setText("Usuario");

        _cadastro_main_cad.setText("cadastro ");
        _cadastro_main_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cadastro_main_cadActionPerformed(evt);
            }
        });

        cadastro_main_clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        cadastro_main_clientes.setText("Cliente");
        _cadastro_main_cad.add(cadastro_main_clientes);

        _os_main_cad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        _os_main_cad.setText("Os");
        _os_main_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _os_main_cadActionPerformed(evt);
            }
        });
        _cadastro_main_cad.add(_os_main_cad);

        _usuario_main_cad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        _usuario_main_cad.setText("Usuarios");
        _usuario_main_cad.setEnabled(false);
        _usuario_main_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _usuario_main_cadActionPerformed(evt);
            }
        });
        _cadastro_main_cad.add(_usuario_main_cad);

        menus.add(_cadastro_main_cad);

        _relatorio_main.setText("relatorio");
        _relatorio_main.setEnabled(false);

        _relatorio_servocos_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        _relatorio_servocos_.setText("Serviços");
        _relatorio_main.add(_relatorio_servocos_);

        menus.add(_relatorio_main);

        _ajuda_sobre_.setText("ajuda");
        _ajuda_sobre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ajuda_sobre_ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Sobre");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        _ajuda_sobre_.add(jMenuItem4);

        menus.add(_ajuda_sobre_);

        _opcoes_main.setText("Opções");

        opcoes_sair_main.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opcoes_sair_main.setText("Sair");
        opcoes_sair_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoes_sair_mainActionPerformed(evt);
            }
        });
        _opcoes_main.add(opcoes_sair_main);

        menus.add(_opcoes_main);

        setJMenuBar(menus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_nome_usu)
                            .addComponent(data_hora))
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(id_nome_usu)
                .addGap(62, 62, 62)
                .addComponent(data_hora)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(889, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _os_main_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__os_main_cadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__os_main_cadActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date data = new Date();
        data_hora.setText(data.toString());
        DateFormat formaat = DateFormat.getDateInstance(DateFormat.SHORT);
        data_hora.setText(formaat.format(data));

    }//GEN-LAST:event_formWindowActivated

    private void opcoes_sair_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoes_sair_mainActionPerformed
        // TODO add your handling code here:

        int saindo = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (saindo == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_opcoes_sair_mainActionPerformed

    private void _ajuda_sobre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ajuda_sobre_ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event__ajuda_sobre_ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Tela_sobre sobre = new Tela_sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void _usuario_main_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__usuario_main_cadActionPerformed
        // TODO add your handling code here:
        Tela_usuarios _usuario = new Tela_usuarios();
        _usuario.setVisible(true);
        desktop.add(_usuario);

    }//GEN-LAST:event__usuario_main_cadActionPerformed

    private void _cadastro_main_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cadastro_main_cadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event__cadastro_main_cadActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu _ajuda_sobre_;
    private javax.swing.JMenu _cadastro_main_cad;
    private javax.swing.JMenu _opcoes_main;
    private javax.swing.JMenuItem _os_main_cad;
    public static javax.swing.JMenu _relatorio_main;
    private javax.swing.JMenuItem _relatorio_servocos_;
    public static javax.swing.JMenuItem _usuario_main_cad;
    private javax.swing.JMenuItem cadastro_main_clientes;
    private javax.swing.JLabel data_hora;
    private javax.swing.JDesktopPane desktop;
    public static javax.swing.JLabel id_nome_usu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menus;
    private javax.swing.JMenuItem opcoes_sair_main;
    // End of variables declaration//GEN-END:variables
}
