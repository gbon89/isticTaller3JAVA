package Vista;

import estacionamiento.Auto;
import estacionamiento.Garaje;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
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
        btnSalida.setBackground(new Color(43, 81, 175));
        txtPatente.setBackground(new Color(43, 81, 175));
        jList1.setBackground(new Color(43, 81, 175));
        jLabel2.setForeground(new Color(247, 249, 249));
        
      
        jButtonPrincipal.setBackground(new Color(43, 81, 175));
        panelOculto.setVisible(false);
        
        this.setLocationRelativeTo(null);
        
        this.cargarListado();
        /*
        
          ArrayList Patentes = Garaje.retornarListadoSoloPatentes();
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
     */
       
    }
    
    
    
    public void cargarListado(){
        
        
         ArrayList Patentes;
        try {
            Patentes = Garaje.retornarListadoSoloPatentes();
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
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
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
        jButtonPrincipal = new javax.swing.JButton();
        txtImporte = new javax.swing.JTextField();
        panelOculto = new javax.swing.JPanel();
        salidaCoche = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(770, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(770, 650));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(108, 11, 0, 0);

        jPanel2.setForeground(new java.awt.Color(0, 120, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(790, 680));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 650));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalida.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSalida.setText("Salida");
        btnSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
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
        jPanel2.add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 700, 60));

        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jList1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 700, 280));

        txtPatente.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtPatente.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });
        jPanel2.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 700, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText(" Egreso de automóviles:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 700, -1));

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
        jPanel2.add(jButtonPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 140, 60));

        txtImporte.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel2.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 150, -1));

        salidaCoche.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        salidaCoche.setText("Si usted desea retirar su vehículo por favor haga click sobre el botón Salida ");
        panelOculto.add(salidaCoche);

        jPanel2.add(panelOculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 530, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wall_paper_azul.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(770, 750));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -60, 860, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 0, 790, 650);

        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(366, 139, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
     
        /**** principio verificar auto   */
                                boolean existeAuto = false;
                                String patenteIngresada = this.txtPatente.getText();
                               Auto autito = new Auto(patenteIngresada);
                                try {
                                    existeAuto = Garaje.autoExiste(autito);
                                    /*
                                    if(existeAuto){
                                        System.out.println("Existe");
                                    } else{
                                        System.out.println("No existe");
                                    }
                                    */
                                    // cambiar por ventana hemergente o similar
                                } catch (IOException ex) {
                                    Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                                }

         /**** fin de veificar auto 
          si existe auto la variable "existeAuto" va a ser true         
          */
         
         if (existeAuto) 
         {
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
                  DATOS = unaPatente.toString().split("=>");/// devuelve un array 
                  
                  /*
                  System.out.println("solo patente: "+DATOS[0]);  
                  System.out.println("solo hora: "+DATOS[1]);  
                  System.out.println("solo fecha: "+DATOS[2]);  
                  */
                  
                  
                /*** si el la misma patente , calculo el costo */
                if(autito.Patente.equals(DATOS[0]) )
                {
                        LocalTime horaActual = LocalTime.now();
                        LocalTime HoraEstacionado= LocalTime.parse(DATOS[1]);

                        System.out.println("solo horaActual: "+horaActual);  
                        System.out.println("solo HoraEstacionado: "+HoraEstacionado);  
                        
                        int resultado= horaActual.getHour()-HoraEstacionado.getHour();

                        System.out.println("cantidad de horas: "+resultado ); 

                        float importe= (resultado)*170;
                        System.out.println("importe: "+importe );
                            if (importe == 0) {

                                    importe = importe + 70;
                                  
                        } 
                            if(importe < 0){
                               importe = importe * (-1); 
                            }
                        
                        
                       FileWriter Archivo = null;
                      try {
                          Archivo = new FileWriter("Facturados.txt", true);
                      } catch (IOException ex) {
                          Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                      }

                       PrintWriter Escritor;
                       Escritor = new PrintWriter(Archivo);
                       Escritor.println(DATOS[0] + "=>" + DATOS[1] + "=>" + DATOS[2]+ "=>" + importe + "=>" + horaActual      );
                      try {
                          // Escritor.println(unAuto.Patente + "=>" + new Date());
                          Archivo.close();
                      } catch (IOException ex) {
                          Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
                      }

                       System.out.println(DATOS[0] + "Estoy en facturado ");
                        
                    
                }
                       // System.out.println(unaPatente);
                      

                        
             /* fin    si el la misma patente , calculo el costo               *///
            }
            try {
                
                //busca el auto lo elimina del array, guardando el array nuevamente en el archivo
              Garaje.SacarAuto(autito);
                System.out.println("sacar");
            } catch (IOException ex) {
                Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtPatente.setText(null);  
         
      this.cargarListado();
        frmPrincipal regreso = new frmPrincipal();
            regreso.setVisible(true);
            this.setVisible(false);  
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseEntered
        // TODO add your handling code here:
        btnSalida.setBackground(new Color(111, 149, 241  ));
        panelOculto.setVisible(true);
        panelOculto.setBackground(new  Color(43, 81, 175));
        salidaCoche.setForeground(new Color(46, 64, 83 ));
    }//GEN-LAST:event_btnSalidaMouseEntered

    private void btnSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseExited
        // TODO add your handling code here:
        btnSalida.setBackground(new Color(43, 81, 175));
        panelOculto.setVisible(false);
    }//GEN-LAST:event_btnSalidaMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(166, 172, 175));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new Color(247, 249, 249));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jButtonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrincipalActionPerformed
        // TODO add your handling code here:
        frmPrincipal regreso = new frmPrincipal();
        regreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPrincipalActionPerformed

    private void jButtonPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrincipalMouseEntered
        // TODO add your handling code here:
        jButtonPrincipal.setBackground(new Color(111, 149, 241  ));
    }//GEN-LAST:event_jButtonPrincipalMouseEntered

    private void jButtonPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPrincipalMouseExited
        // TODO add your handling code here:
        jButtonPrincipal.setBackground(new Color(43, 81, 175));
    }//GEN-LAST:event_jButtonPrincipalMouseExited

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatenteActionPerformed
    private Auto retornarAutodelListado(String patente){
        Auto autodeRetorno= null;
        ArrayList listado = null;
        try {
            listado = Garaje.retornarListado();
            for (Object patenteYtiempo:listado) {
                
                     String[] DATOS ; 
                     DATOS = patenteYtiempo.toString().split("=>");   
                
                     if (DATOS[0].equals(patente)) {
                         autodeRetorno = new Auto(patente);
                         autodeRetorno.fechaIngreso = LocalTime.parse(DATOS[1]);
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    
        return autodeRetorno;
    }
    private int calcularImporte(String patente){
        Auto autito = new Auto(patente);
        int retorno = 0;
        try {
            if (Garaje.autoExiste(autito)) {
                
               autito = this.retornarAutodelListado(patente);
                if (autito!= null) {
                     LocalTime horaActual = (LocalTime.now());
                     int resultado= (horaActual.getHour())-autito.fechaIngreso.getHour();
                     retorno = (resultado) * 170 ;
                        if (retorno == 0) {
                        
                             retorno = resultado + 70 ;
                            
                    }
                        if(retorno < 0){
                                System.out.println("es igual a cero");
                               retorno = retorno * (-2); 
                            }
                        if((horaActual.getHour())-autito.fechaIngreso.getHour() > 24) {
                                                           retorno = retorno * (24); 
  
                    }
                }
            }   } catch (IOException ex) {
            Logger.getLogger(frmSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        return retorno;
}

    





    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        //System.out.println(jList1.getSelectedValue());
       
        this.txtPatente.setText((jList1.getSelectedValue()));
        int importeApagar = this.calcularImporte(txtPatente.getText());
       // System.out.println("Este es el impporte a pagar" + importeApagar);
        
        
        this.txtImporte.setText( "$"+Integer.toString(importeApagar));
        
    }//GEN-LAST:event_jList1ValueChanged

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
    private javax.swing.JButton jButtonPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelOculto;
    private javax.swing.JLabel salidaCoche;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
