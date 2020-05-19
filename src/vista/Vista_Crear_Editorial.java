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

        idpn = new javax.swing.JTextField();
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
        jButtoNBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        idpn.setEditable(false);

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

        jButtoNBorrar.setText("BORRAR");
        jButtoNBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoNBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("MOSTRAR");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        idE.setEditable(false);
        idE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEActionPerformed(evt);
            }
        });

        jLabel5.setText("Id: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonInsertEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)
                                    .addComponent(jButtoNBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonModificar)
                                    .addGap(22, 22, 22)
                                    .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(idE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextDireccionE, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(jLabel1)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDireccionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtoNBorrar)
                    .addComponent(jButtonInsertEditorial))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel1)
                    .addContainerGap(496, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtoNBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoNBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoNBorrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        
         String nombre_editorial = jTextNombreE.getText();
         String telefono_E=jTextTelefonoE.getText();
         String direccion_E=jTextDireccionE.getText();
         String correo_E = jTextCorreoE.getText();
         
         //Date Fecha_Creacion_Editorial=jDateChooser1.getDate();
         
         Date Fecha_Creacion_Editorial3 = jDateChooser1.getDate();
    
         long f=Fecha_Creacion_Editorial3.getTime();
    
         java.sql.Date Fecha_Creacion_Editoria4= new java.sql.Date(f);
         
        Control_Editorial objmpn = new Control_Editorial();
        String selected = idE.getText();
        
        boolean t1 = objmpn.modificarEditorial( selected,nombre_editorial,telefono_E,direccion_E,correo_E,Fecha_Creacion_Editoria4);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se modifico la editorial");
        } else {
            JOptionPane.showMessageDialog(this, "No se modifico la editorial");
        }
        
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        
        
        Control_Editorial objpn = new Control_Editorial();
        int ncol;
        Object[] fila;

        listaE = objpn.consultarEditoriales();

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
   
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jTextCorreoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoEActionPerformed

    private void jTextNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreEActionPerformed

    private void idEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int seleccion = jTable1.rowAtPoint(evt.getPoint());
        jTextNombreE.setText(String.valueOf(jTable1.getValueAt(seleccion, 1)));
        jTextTelefonoE.setText(String.valueOf(jTable1.getValueAt(seleccion, 2)));
        jTextDireccionE.setText(String.valueOf(jTable1.getValueAt(seleccion, 3)));
        jTextCorreoE.setText(String.valueOf(jTable1.getValueAt(seleccion, 4)));
        
        jDateChooser1.setDateFormatString(String.valueOf(jTable1.getValueAt(seleccion, 5)));
            
        
        idE.setText(String.valueOf(jTable1.getValueAt(seleccion, 0)));
                                       
    }//GEN-LAST:event_jTable1MouseClicked
                                    


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
    private javax.swing.JTextField idE;
    private javax.swing.JTextField idpn;
    private javax.swing.JButton jButtoNBorrar;
    private javax.swing.JButton jButtonInsertEditorial;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
