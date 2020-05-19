/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlAutor;
import control.ControlPais_autor;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Pais_autor;
import modelo.Autor;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author usuario
 */
public class VistaAutor extends javax.swing.JFrame {

    LinkedList<Pais_autor> listapu;
    LinkedList<Autor> listaAU;
    
    /**
     * Creates new form VistaAutor
     */
    public VistaAutor() {
        initComponents();
        setLocationRelativeTo(null);
        listapu = new LinkedList<>();
        listaAU = new LinkedList<>();
           }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreAutor1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreAutor2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidoAutor1 = new javax.swing.JTextField();
        apellidoAutor2 = new javax.swing.JTextField();
        btnAgregarAutor = new javax.swing.JButton();
        btnEliminarAutor = new javax.swing.JButton();
        btnModificarAutor = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        idu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Primer Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Segundo Nombre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Insertar Autor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Primer Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Segundo Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");

        btnAgregarAutor.setText("Insertar");
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });

        btnEliminarAutor.setText("Eliminar");
        btnEliminarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAutorActionPerformed(evt);
            }
        });

        btnModificarAutor.setText("Modificar");
        btnModificarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAutorActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Pais Autor");

        idu.setEditable(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(apellidoAutor2)
                                            .addComponent(apellidoAutor1)
                                            .addComponent(nombreAutor2)
                                            .addComponent(nombreAutor1)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarAutor)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarAutor)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarAutor)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrar))
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombreAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nombreAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidoAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidoAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAutor)
                    .addComponent(btnEliminarAutor)
                    .addComponent(btnModificarAutor)
                    .addComponent(btnMostrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
       
        
    String nombre_autor1=nombreAutor1.getText();
    String nombre_autor2=nombreAutor2.getText();
    String apellido_autor1=apellidoAutor1.getText();
    String apellido_autor2=apellidoAutor2.getText();
    String nombrePais = jComboBox2.getSelectedItem().toString();
     Date fecha_nacimiento_Autor2 = jDateChooser1.getDate();
    
    long d=fecha_nacimiento_Autor2.getTime();
    
    java.sql.Date fecha_nacimiento_Autor= new java.sql.Date(d);//Se hace esto por que date entrega sabado domigo lunes etc, aqui se acomoda el formato con d al ponerle get time
       
    int idp = 0;

        for (int j = 0; j < listapu.size(); j++) {
            Pais_autor pais = listapu.get(j);
            if (nombrePais.equals(pais.getNombrePaisA())) {
                idp = pais.getId_paisA();

            }
        }
    
        Autor objAutor = new Autor(nombre_autor1, nombre_autor2, apellido_autor1, apellido_autor2, fecha_nacimiento_Autor, idp);
        ControlAutor objcu = new ControlAutor();
        boolean t = objcu.insertar_Autor(objAutor);
        if (t == true) {
            JOptionPane.showMessageDialog(this, "Se inserto el autor");
        } else {
            JOptionPane.showMessageDialog(this, "No se inserto el autor");
        }
        
    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        ControlPais_autor objpu = new ControlPais_autor();
        listapu = objpu.consultarPaisesA();
        for (int i = 0; i < listapu.size(); i++) {

            Pais_autor objetoPaisA = listapu.get(i);
            jComboBox2.addItem(objetoPaisA.getNombrePaisA());

        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
         ControlAutor obju = new ControlAutor();
        int ncolu;
        Object[] fila2;

        listaAU = obju.consultarAutor();
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);
        
        modelo.addColumn("id Autor");
        modelo.addColumn("Nombre Autor1");
        modelo.addColumn("nombre Autor2");
        modelo.addColumn("ApellidoAutor1");
        modelo.addColumn("Apellido Autor2");
        modelo.addColumn("Fecha Nacimiento Autor");
        modelo.addColumn("Id Pais Autor");
        ncolu = modelo.getColumnCount();

        for (int i = 0; i < listaAU.size(); i++) {

            fila2 = new Object[ncolu];
            fila2[0] = listaAU.get(i).getId_autor();
            fila2[1] = listaAU.get(i).getNombre_autor1();
            fila2[2] = listaAU.get(i).getNombre_autor2();
            fila2[3] = listaAU.get(i).getApellido_autor1();
            fila2[4] = listaAU.get(i).getApellido_autor2();
            fila2[5] = listaAU.get(i).getFecha_nacimiento_Autor();
            fila2[6] = listaAU.get(i).getId_PaisAF();
            
            modelo.addRow(fila2);
        }

              
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int selected = jTable1.rowAtPoint(evt.getPoint());
         
        idu.setText(String.valueOf(jTable1.getValueAt(selected, 0)));
        nombreAutor1.setText(String.valueOf(jTable1.getValueAt(selected, 1)));
        nombreAutor2.setText(String.valueOf(jTable1.getValueAt(selected, 2)));
        apellidoAutor1.setText(String.valueOf(jTable1.getValueAt(selected, 3)));
        apellidoAutor2.setText(String.valueOf(jTable1.getValueAt(selected, 4)));
        jDateChooser1.setDateFormatString(String.valueOf(jTable1.getValueAt(selected, 5)));
        jComboBox2.setSelectedItem(jTable1.getValueAt(selected, 6));   
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAutorActionPerformed
        // TODO add your handling code here:
        ControlAutor objeu = new ControlAutor();
        String selected = idu.getText();
        boolean t1 = objeu.eliminarAutor(selected);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se elimino el Autor con exito");
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino el Autor");
        }
        
        
    }//GEN-LAST:event_btnEliminarAutorActionPerformed

    private void btnModificarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAutorActionPerformed
        // TODO add your handling code here:
        
        String select = idu.getText();
        String nombre1 = nombreAutor1.getText();
        String nombre2 = nombreAutor2.getText();
        String apellido = apellidoAutor1.getText();
        String apellido2 = apellidoAutor2.getText();
        //Date fecha_nacimiento = jDateChooser1.getDate();
        String pais = jComboBox2.getSelectedItem().toString();
        
        Date fecha_nacimiento2 = jDateChooser1.getDate();
    
         long f=fecha_nacimiento2.getTime();
    
         java.sql.Date fecha_nacimiento= new java.sql.Date(f);
        
        
        ControlAutor objmu = new ControlAutor();
        
        boolean t1 = objmu.modificarAutor(select, nombre1, nombre2, apellido, apellido2, fecha_nacimiento, pais);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se modifico el usuario con exito");
        } else {
            JOptionPane.showMessageDialog(this, "No se modifico el usuario con exito");
        }
        
        
        
        
    }//GEN-LAST:event_btnModificarAutorActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoAutor1;
    private javax.swing.JTextField apellidoAutor2;
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnEliminarAutor;
    private javax.swing.JButton btnModificarAutor;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JTextField idu;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreAutor1;
    private javax.swing.JTextField nombreAutor2;
    // End of variables declaration//GEN-END:variables
}
