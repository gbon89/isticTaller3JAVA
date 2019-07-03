package Vista;

import estacionamiento.Auto;
import estacionamiento.Garaje;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmIngreso extends javax.swing.JFrame {

    public frmIngreso() {
        initComponents();
        jPanel2.setBackground(new Color(19, 141, 117  ));
       // jPanel1.disable();
        btnEntrada.setBackground(new Color(43, 81, 175 ));
        jLabelPatente.setForeground(new Color(229, 231, 233 ));
        jButtonPrincipal.setBackground(new Color(43, 81, 175  ));
        jLabel1.setForeground(new Color(229, 231, 233 ));
        panelOculto1.setVisible(false);
        txtPatente.setBackground(new Color(43, 81, 175  ));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEntrada = new javax.swing.JButton();
        txtPatente = new javax.swing.JTextField();
        jLabelPatente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPrincipal = new javax.swing.JButton();
        panelOculto1 = new javax.swing.JPanel();
        registroPatente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setForeground(new java.awt.Color(0, 120, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(690, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrada.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntradaMouseExited(evt);
            }
        });
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 530, 80));

        txtPatente.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtPatente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });
        jPanel2.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 530, 80));

        jLabelPatente.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelPatente.setText("              Ingrese el número de patente");
        jLabelPatente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelPatente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPatenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPatenteMouseExited(evt);
            }
        });
        jPanel2.add(jLabelPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 530, 80));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Ingreso de automóviles");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 550, -1));

        jButtonPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButtonPrincipal.setText("Principal");
        jButtonPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPrincipalMouseExited(evt);
            }
        });
        jButtonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, 60));

        panelOculto1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroPatente.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        registroPatente.setText("Aquí registrará su patente");
        panelOculto1.add(registroPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 30));

        jPanel2.add(panelOculto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 310, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wall_paper_azul.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        String posiblePatente = this.txtPatente.getText();
        if (Auto.ValidarPatente(posiblePatente)) {
             Auto autoEntrante = new Auto(this.txtPatente.getText().toUpperCase());
        try {
            //System.out.println(this.txtPatente.getText());
            Garaje.ingresarAuto(autoEntrante);
            frmPrincipal regreso = new frmPrincipal();
            regreso.setVisible(true);
            this.setVisible(false); 
        } catch (IOException ex) {
            Logger.getLogger(frmIngreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
         txtPatente.setText(null);
        } else{
            txtPatente.setText("Vuelva a ingresar su patente");
        }
         
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseEntered
        // TODO add your handling code here:
        btnEntrada.setBackground(new Color(43, 81, 175));
        panelOculto1.setBackground(new  Color(43, 81, 175));
        panelOculto1.setVisible(true);
        registroPatente.setForeground(new  Color(46, 64, 83  ));
    }//GEN-LAST:event_btnEntradaMouseEntered

    private void btnEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseExited
        // TODO add your handling code here:
        btnEntrada.setBackground(new Color(43, 81, 175));
        panelOculto1.setVisible(false);
    }//GEN-LAST:event_btnEntradaMouseExited

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtPatenteActionPerformed

    private void jLabelPatenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPatenteMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabelPatenteMouseEntered

    private void jLabelPatenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPatenteMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabelPatenteMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(new Color(166, 172, 175));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
      jLabel1.setForeground(new Color(229, 231, 233 ));  
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButtonPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrincipalMouseEntered
        // TODO add your handling code here:
         jButtonPrincipal.setBackground(new Color(111, 149, 241 ));
    }//GEN-LAST:event_jButtonPrincipalMouseEntered

    private void jButtonPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrincipalMouseExited
        // TODO add your handling code here:
      jButtonPrincipal.setBackground(new Color(111, 149, 241 ));
    }//GEN-LAST:event_jButtonPrincipalMouseExited

    private void jButtonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrincipalActionPerformed
        // TODO add your handling code here:
        frmPrincipal regreso = new frmPrincipal();
        regreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton jButtonPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPatente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelOculto1;
    private javax.swing.JLabel registroPatente;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
