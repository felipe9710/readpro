/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlPais_autor;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pais_autor;

/**
 *
 * @author felipe
 */
public class VistaPais_autorI extends javax.swing.JFrame {

    LinkedList<Pais_autor> listaPais_autores;

    /**
     * Creates new form VistaPais_autorI
     */
    public VistaPais_autorI() {
        initComponents();

        setLocationRelativeTo(null);

        listaPais_autores = new LinkedList<>();
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlbIdPaisAutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PAIS AUTOR");

        jLabel2.setText("Nombre pais autor:");

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Id pais autor:");

        jlbIdPaisAutor.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbIdPaisAutor))
                            .addComponent(jTextField1))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlbIdPaisAutor))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar)
                    .addComponent(btnmodificar)
                    .addComponent(btnbuscar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //El metodo jButton1ActionPerformed es el metodo del botón insertar que 
    //se encarga de insertar cada uno de los paises del autor en la base de datos 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombrePais_autor = jTextField1.getText();

        ControlPais_autor objcpa = new ControlPais_autor();

        boolean t = objcpa.insertarPaises_autor(nombrePais_autor);

        if (t == true) {
            JOptionPane.showMessageDialog(this, "Se inserto el pais del autor");
        } else {
            JOptionPane.showMessageDialog(this, "No se inserto el pais del autor");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //El metodo  btnbuscarActionPerformed es el metodo del botón buscar que
    //se encarga de buscar el pais del autor en la base de datos
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String buscar = jTextField1.getText();
        ControlPais_autor objpn = new ControlPais_autor();
        int ncol;
        Object[] fila;

        if (buscar.equals("")) {
            listaPais_autores = objpn.consultarpaisautor();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("id Pais Autor");
            modelo.addColumn("Nombre Pais A");
            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaPais_autores.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaPais_autores.get(i).getId_paisA();
                fila[1] = listaPais_autores.get(i).getNombrePaisA();
                modelo.addRow(fila);
            }

        }

    }//GEN-LAST:event_btnbuscarActionPerformed
    //El metodo jTable1MouseClicked es un evento del mouse que se genera para que cuando el usuario
    //de un click en alguna de las filas del jTable1, automaticamente tome los valores y los asigne al jTextField1
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccion = jTable1.rowAtPoint(evt.getPoint());
        jTextField1.setText(String.valueOf(jTable1.getValueAt(seleccion, 1)));
        jlbIdPaisAutor.setText(String.valueOf(jTable1.getValueAt(seleccion, 0)));
    }//GEN-LAST:event_jTable1MouseClicked
    //El metodo btneliminarActionPerformed es el metodo del botón eliminar, que se encarga
    //de tomar los valores del jTextField1 para posteriormente eliminarlos
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        ControlPais_autor objepa = new ControlPais_autor();
        String select = jlbIdPaisAutor.getText();
        boolean t1 = objepa.eliminarPais_autor(select);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se elimino el pais del autor");
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino el pais del autor");
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    //El metodo btnModificarActionPerformed es el metodo del boton modificar, que se encarga
    //de tomar lo valores del txtNombrePaisNarrador y los cambia
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        String nombrePaisA = jTextField1.getText();
        ControlPais_autor objmpa = new ControlPais_autor();
        String selected = jlbIdPaisAutor.getText();
        boolean t1 = objmpa.modificarPais_autor(selected, nombrePaisA);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se modifico el pais del autor");
        } else {
            JOptionPane.showMessageDialog(this, "No se modifico el pais del autor");
        }

    }//GEN-LAST:event_btnmodificarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPais_autorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPais_autorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPais_autorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPais_autorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPais_autorI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlbIdPaisAutor;
    // End of variables declaration//GEN-END:variables
}
