/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Control_Editorial;

import javax.swing.JOptionPane;
import modelo.Editorial;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Home
 */
public class Vista_Crear_Editorial extends javax.swing.JFrame {

    LinkedList<Editorial> listaE;
   
    
    
    public Vista_Crear_Editorial() {
        initComponents();
        setLocationRelativeTo(null);
        
        listaE = new LinkedList<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextDireccionE = new javax.swing.JTextField();
        jTextTelefonoE = new javax.swing.JTextField();
        jTextCorreoE = new javax.swing.JTextField();
        jTextNombreE = new javax.swing.JTextField();
        jButtonInsertEditorial = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButtonBorrar = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Correo De La Editorial");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fecha De La Creacion Editorial");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nombre Editorial");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Telefono Editorial");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CREAR EDITORIAL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Direccion De La  Editorial");

        jTextCorreoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoEActionPerformed(evt);
            }
        });

        jTextNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreEActionPerformed(evt);
            }
        });

        jButtonInsertEditorial.setText("INSERTAR");
        jButtonInsertEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertEditorialActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("BORRAR");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("MOSTRAR");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonInsertEditorial)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonActualizar)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCorreoE, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jTextDireccionE, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jTextTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(219, 219, 219)
                            .addComponent(jLabel1))
                        .addComponent(jLabel8))
                    .addContainerGap(126, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jTextNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextDireccionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertEditorial)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel8)
                    .addContainerGap(366, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreEActionPerformed

    private void jButtonInsertEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertEditorialActionPerformed
      
        //------------BOTON-------------------
        
    Control_Editorial objcE=new Control_Editorial();
        
    String nombre_editorial=jTextNombreE.getText();
    String telefono_E = jTextTelefonoE.getText();
    String direccion_E = jTextDireccionE.getText();
    String correo_E = jTextCorreoE.getText();
    
    Date Fecha_Creacion_Editorial2 = jDateChooser1.getDate();
    
    long d=Fecha_Creacion_Editorial2.getTime();
    
    java.sql.Date Fecha_Creacion_Editorial= new java.sql.Date(d);//Se hace esto por que date entrega sabado domigo lunes etc, aqui se acomoda el formato con d al ponerle get time
    
        boolean t = objcE.insertar_Editorial(nombre_editorial,telefono_E,direccion_E,correo_E, Fecha_Creacion_Editorial );

        if (t == true) {
            JOptionPane.showMessageDialog(this, "Se inserto la Editorial");
        } else {
            JOptionPane.showMessageDialog(this, "No se inserto la Editorial");
        }
    }//GEN-LAST:event_jButtonInsertEditorialActionPerformed

    private void jTextCorreoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoEActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        // TODO add your handling code here:
 // TODO add your handling code here:
        String buscar = jTextNombreE.getText();
        Control_Editorial  objpn = new Control_Editorial();
        int ncol;
        Object [] fila;
        
        if (buscar.equals("")) {
            listaE = objpn.consultarEditorial();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);
            
                      modelo.addColumn("id_editorial");
                      modelo.addColumn("nombre_editorial");
                      modelo.addColumn("telefono_E");
                      modelo.addColumn("direccion_E");
                      modelo.addColumn("correo_E");
                      modelo.addColumn("Fecha_Creacion_Editorial");
            
            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaE.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaE.get(i).getId_editorial();
                fila[1] = listaE.get(i).getNombre_editorial();
                fila[2] = listaE.get(i).getTelefono_E();
                fila[3] = listaE.get(i).getDireccion_E();
                fila[4] = listaE.get(i).getCorreo_E();
                fila[5] = listaE.get(i).getFecha_Creacion_Editorial();
                modelo.addRow(fila);
            }

        }    
                                        
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    /**     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Crear_Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Crear_Editorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonInsertEditorial;
    private javax.swing.JButton jButtonMostrar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCorreoE;
    private javax.swing.JTextField jTextDireccionE;
    private javax.swing.JTextField jTextNombreE;
    private javax.swing.JTextField jTextTelefonoE;
    // End of variables declaration//GEN-END:variables
}
