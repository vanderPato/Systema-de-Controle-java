/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vanderlei.telas;

import br.com.vanderlei.dal.Modulo_de_conexao;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author vande
 */
public class Tela_login extends javax.swing.JFrame {
    
    Tela_Principal principal = new Tela_Principal();
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet sr = null;
    
    public void logar() {
        
        String sql = "select * from tbusuario where login =? and senha = ?";
        try {
            pst = conexao.prepareCall(sql);
            pst.setString(1, id_campo_usuario.getText());
            pst.setString(2, id_campo_senha.getText());
            sr = pst.executeQuery();
            
            if (sr.next()) {
                
                String perfil = sr.getString(6);
//                    System.out.println(perfil);
                if (perfil.equals("admin")) {
                    principal._relatorio_main.setEnabled(true);
                    principal._usuario_main_cad.setEnabled(true);
                    principal.id_nome_usu.setText(sr.getString(2));
                    principal.id_nome_usu.setForeground(Color.green);
                }else{
                    principal.id_nome_usu.setText(sr.getString(2));
                    principal.id_nome_usu.setForeground(Color.blue);

                    principal.setVisible(true);
                    this.dispose();
                }
                principal.setVisible(true);
                this.dispose();
                conexao.close();
                
            } else {
                JOptionPane.showMessageDialog(null, "usuario e/ou senha invalodo(s)");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }

    /**
     * Creates new form Tela_login
     */
    public Tela_login() {
        initComponents();
        conexao = Modulo_de_conexao.conector();
        if (conexao != null) {
            lbl_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vanderlei/icones/true_icon.png")));
        } else {
            lbl_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vanderlei/icones/false_icon.png")));
        }
        //System.out.println(conexao);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_campo_usuario = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        id_campo_senha = new javax.swing.JPasswordField();
        lbl_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");
        setPreferredSize(new java.awt.Dimension(350, 300));
        setResizable(false);

        jLabel1.setText("usuario");

        jLabel2.setText("senha");

        id_campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_campo_usuarioActionPerformed(evt);
            }
        });

        btn_login.setText("login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        id_campo_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_campo_senhaActionPerformed(evt);
            }
        });

        lbl_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vanderlei/icones/false_icon.png"))); // NOI18N
        lbl_status.setPreferredSize(new java.awt.Dimension(290, 256));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_campo_usuario)
                            .addComponent(id_campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_login)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_login)
                    .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(369, 305));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_campo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_campo_usuarioActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        logar();
        

    }//GEN-LAST:event_btn_loginActionPerformed

    private void id_campo_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_campo_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_campo_senhaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPasswordField id_campo_senha;
    private javax.swing.JTextField id_campo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_status;
    // End of variables declaration//GEN-END:variables
}
