/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import control.Control_Editorial;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        jScrollPane2 = new javax.swing.JScrollPane();
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
        idE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnmp = new javax.swing.JButton();

        idpn.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Correo De La Editorial:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fecha De La Creacion Editorial:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nombre Editorial:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Telefono Editorial:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("INSERTAR EDITORIAL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Direccion De La  Editorial:");

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

        jButtonInsertEditorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonInsertEditorial.setText("Insertar");
        jButtonInsertEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertEditorialActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy/MM/d");

        jButtoNBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtoNBorrar.setText("Eliminar");
        jButtoNBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoNBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonMostrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        idE.setEditable(false);
        idE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Id: ");

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

        jScrollPane4.setViewportView(jScrollPane1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ir al menu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("principal");

        btnmp.setText("jButton1");
        btnmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInsertEditorial)
                .addGap(93, 93, 93)
                .addComponent(jButtoNBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButtonModificar)
                .addGap(102, 102, 102)
                .addComponent(jButtonMostrar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextCorreoE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDireccionE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTelefonoE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(btnmp))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTextNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(171, 171, 171))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextDireccionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInsertEditorial)
                            .addComponent(jButtoNBorrar)
                            .addComponent(jButtonModificar)
                            .addComponent(jButtonMostrar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(btnmp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
                Control_Editorial objeu = new Control_Editorial();
        String selected = idE.getText();
        boolean t1 = objeu.eliminarEditorial(selected);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se elimino la editorial con exito");
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino la editorial");
        }

   
        
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
        
      
        
        //obtenemos la fecha de dicha fila
        String fecha = jTable1.getValueAt(seleccion, 5).toString();
        //creamos el formato en el que deseamos mostrar la fecha
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-mm-dd");
        //creamos una variable tipo Date y la ponemos NULL
        Date fechaN = null;
        try {
            //parseamos de String a Date usando el formato
            fechaN = formatoDelTexto.parse(fecha);
            //seteamos o mostramos la fecha en el JDateChooser
            jDateChooser1.setDate(fechaN);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
          
       //jDateChooser1.setDateFormatString(String.valueOf(jTable1.getModel().getValueAt(seleccion, 5)));
         //jDateChooser1.setDateFormatString(String.valueOf(jTable1.getValueAt(seleccion, 5)));
        
       // jDateChooser1.setName(String.valueOf(jTable1.getValueAt(seleccion, 5)));//---> funciona modificar
        idE.setText(String.valueOf(jTable1.getValueAt(seleccion, 0)));
            
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmpActionPerformed
        
        VistaMenu vmp = new VistaMenu();
        this.dispose();
        vmp.setVisible(true);
        
    }//GEN-LAST:event_btnmpActionPerformed
                                    


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
    private javax.swing.JButton btnmp;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCorreoE;
    private javax.swing.JTextField jTextDireccionE;
    private javax.swing.JTextField jTextNombreE;
    private javax.swing.JTextField jTextTelefonoE;
    // End of variables declaration//GEN-END:variables
}
