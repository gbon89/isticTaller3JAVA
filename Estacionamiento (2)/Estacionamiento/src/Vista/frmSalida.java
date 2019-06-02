package Vista;

import estacionamiento.Garaje;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.jcp.xml.dsig.internal.dom.Utils;

/**
 *
 * @author PC
 */
public class frmSalida extends javax.swing.JFrame {

    public frmSalida() throws IOException
    {
        initComponents();
        jPanel2.setBackground(new Color(19, 141, 117  ));
        btnSalida.setBackground(new Color(22, 160, 133));
        jPanel4.setBackground(new Color(19, 141, 117  ));
        jLabel2.setForeground(new Color(247, 249, 249));
        jLabel3.setForeground(new Color(247, 249, 249));
        ArrayList Patentes = Garaje.retornarListado();
        //Garaje.retornarListado();
        
        DefaultListModel Modelo;
        Modelo = new DefaultListModel();
        jList1.setModel(Modelo);
        ArrayList Vector = new ArrayList();
       // Vector.add("hola");
        //Vector.add("chau");
        for(Object unaPatente:Patentes)
        {
           //Vector.add(unaPatente);
            Modelo.addElement(unaPatente);
        }
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtPatente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(108, 11, 0, 0);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalida.setText("Out");
        btnSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalidaMouseExited(evt);
            }
        });
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 30));

        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 360, 60));

        txtPatente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText(" Salida de automóviles:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("      Ingrese su patente");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 220, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Axion-Logo-web-250x100.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 250, 100));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(280, 0, 380, 330);

        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(366, 139, 0, 0);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/auto.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 330));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 280, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
     String patenteIngresada = this.txtPatente.getText();
        System.out.println(patenteIngresada);
        ArrayList patenteYfecha = null;
        try {
            patenteYfecha = Garaje.retornarListado();
        } catch (IOException ex) {
            Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Object unaPatente:patenteYfecha)
        {
            String[] DATOS ; 
            DATOS = unaPatente.toString().split("May",2);
           // System.out.println(DATOS[]);  
        }
        
        
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseEntered
        // TODO add your handling code here:
        btnSalida.setBackground(new Color(46, 204, 113));
    }//GEN-LAST:event_btnSalidaMouseEntered

    private void btnSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseExited
        // TODO add your handling code here:
        btnSalida.setBackground(new Color(22, 160, 133));
    }//GEN-LAST:event_btnSalidaMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(166, 172, 175));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(247, 249, 249));
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmSalida().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
