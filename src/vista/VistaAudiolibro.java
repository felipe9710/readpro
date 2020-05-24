/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlAudiolibro;
import control.ControlCategoria;
import control.ControlNarrador;
import control.Control_Editorial;
import java.io.File;
import java.util.LinkedList;
import modelo.Audiolibro;
import modelo.Categoria;
import modelo.Editorial;
import modelo.Narrador;
import modelo.Pais_Usuario;
import modelo.Usuario;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class VistaAudiolibro extends javax.swing.JFrame {

    LinkedList<Audiolibro> listAuL;
    
    LinkedList<Narrador> listN;
    LinkedList<Editorial> listaE;
    LinkedList<Categoria> listaC;
    
    
    
    /**
     * Creates new form VistaAudiolibro
     */
    public VistaAudiolibro() {
        initComponents();
        
        listAuL = new LinkedList<>();
        listN = new LinkedList<>();
        listaE = new LinkedList<>();
        listaC = new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldnumCap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxNarrador = new javax.swing.JComboBox<>();
        jComboBoxEditorial = new javax.swing.JComboBox<>();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        JSinopsis = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldNPaginas = new javax.swing.JTextField();
        jTextFieldDuracion = new javax.swing.JTextField();
        jTextFieldIDIOMA = new javax.swing.JTextField();
        btnAgregarAudiolibro = new javax.swing.JButton();
        btnEliminarAudiolibro = new javax.swing.JButton();
        btnModificarAudiolibro = new javax.swing.JButton();
        btnLimpiarAudiolibro = new javax.swing.JButton();
        jTextFieldPortada = new javax.swing.JTextField();
        jTextFieldContrportada = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldReproducciones = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxClasificacion = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btSeleccionar = new javax.swing.JButton();
        btSeleccionar2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Idioma");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Narrador");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Insertar Audiolibro");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Editorial");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Número de Páginas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Portada");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Contraportada");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Duración");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Sinopsis");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Número de Capitulos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Titulo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Fecha Creación");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Categoría");

        jComboBoxEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEditorialActionPerformed(evt);
            }
        });

        JSinopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSinopsisActionPerformed(evt);
            }
        });

        btnAgregarAudiolibro.setText("Agregar");
        btnAgregarAudiolibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAudiolibroActionPerformed(evt);
            }
        });

        btnEliminarAudiolibro.setText("Eliminar");
        btnEliminarAudiolibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAudiolibroActionPerformed(evt);
            }
        });

        btnModificarAudiolibro.setText("Modificar");

        btnLimpiarAudiolibro.setText("Mostrar");
        btnLimpiarAudiolibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAudiolibroActionPerformed(evt);
            }
        });

        jTextFieldPortada.setEditable(false);

        jTextFieldContrportada.setEditable(false);

        jLabel14.setText("ID: ");

        jTextField1.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Reproducciones");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Calificacion");

        jComboBoxClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buena", "Regular", "Mala" }));
        jComboBoxClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClasificacionActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy/MM/d");

        btSeleccionar.setText("Seleccionar");
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        btSeleccionar2.setText("Seleccionar");
        btSeleccionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionar2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNPaginas, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jTextFieldnumCap)
                                    .addComponent(jTextFieldPortada, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jTextFieldContrportada, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarAudiolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarAudiolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarAudiolibro)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiarAudiolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSeleccionar)
                                    .addComponent(btSeleccionar2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(109, 109, 109)
                                        .addComponent(jComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldIDIOMA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldReproducciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel16))
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxNarrador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxEditorial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxClasificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JSinopsis)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(195, 195, 195))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldPortada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldContrportada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSeleccionar)
                                .addGap(18, 18, 18)
                                .addComponent(btSeleccionar2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldIDIOMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldReproducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBoxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBoxNarrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBoxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldnumCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarAudiolibro)
                            .addComponent(btnEliminarAudiolibro)
                            .addComponent(btnModificarAudiolibro)
                            .addComponent(btnLimpiarAudiolibro)))
                    .addComponent(JSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        //-------------------NARADORES-------------------
        
        ControlNarrador objpu = new ControlNarrador();
        listN = objpu.consultarNarrador();
        for (int i = 0; i < listN.size(); i++) {

            Narrador objetoPaisU = listN.get(i);
            jComboBoxNarrador.addItem(objetoPaisU.getNombre_narrador1());

        }
        
        //-------------------EDITORIALES-----------------
        
        Control_Editorial objpu2 = new Control_Editorial();
        listaE = objpu2.consultarEditoriales();
        for (int j = 0; j < listaE.size(); j++) {

            Editorial objetoPaisU2 = listaE.get(j);
            jComboBoxEditorial.addItem(objetoPaisU2.getNombre_editorial());

        }
        //------------------CATEGORIAS-------------------
        
        ControlCategoria objpu3 = new ControlCategoria();
        listaC = objpu3.consultarCategoria();
        for (int k = 0; k < listaC.size(); k++) {

            Categoria objetoPaisU3 = listaC.get(k);
            jComboBoxCategoria.addItem(objetoPaisU3.getCategoria());

        }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarAudiolibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAudiolibroActionPerformed
        
        String titulo = jTextFieldTitulo.getText();
        //String fecha_creacion = jDateChooser1.getText();
         Date fecha_creacion2 = jDateChooser1.getDate();
    
         long d=fecha_creacion2.getTime();
    
         java.sql.Date fecha_creacion= new java.sql.Date(d);//Se hace esto por que date entrega sabado domigo lunes etc, aqui se acomoda el formato con d al ponerle get time
            
        String num_paginas = jTextFieldNPaginas.getText();
            int num = Integer.parseInt (num_paginas);
        String duracion_total = jTextFieldDuracion.getText();
            int dur=Integer.parseInt (duracion_total);
        
            
        String portada = jTextFieldPortada.getText();
        String contraportada = jTextFieldContrportada.getText();
        
        
        
        String calificacion = jComboBoxClasificacion.getSelectedItem().toString();
        String sipnosis =JSinopsis.getText();
        String numCapitulos = jTextFieldnumCap.getText();
        String idioma = jTextFieldIDIOMA.getText();
        String reproducciones = jTextFieldReproducciones.getText();
            int repr=Integer.parseInt (reproducciones);
        String id_narradorAF = jComboBoxNarrador.getSelectedItem().toString();
        String id_editorialAF = jComboBoxEditorial.getSelectedItem().toString();
        String id_categoriaAF = jComboBoxCategoria.getSelectedItem().toString();
     
        int idN = 0;
        int idE = 0;
        int idC = 0;
        
        //----------NARRADOR-----------
        
            for (int x = 0; x < listN.size(); x++) {
            Narrador narradorsito = listN.get(x);
            if (id_narradorAF.equals(narradorsito.getNombre_narrador1())) {
                idN = narradorsito.getId_narrador();

            }
        }
            
            //----------Editorial----------
            for (int l = 0; l < listaE.size(); l++) {
            Editorial editoriales = listaE.get(l);
            if (id_editorialAF.equals(editoriales.getNombre_editorial())) {
                idE = editoriales.getId_editorial();

            }
        }
            
             
        //---------Categoria-----------
        
            for (int j = 0; j < listaC.size(); j++) {
            Categoria Categoria2 = listaC.get(j);
            if (id_categoriaAF.equals(Categoria2.getCategoria())) {
                idC = Categoria2.getId_categoria();

            }
        }
               

            
        Audiolibro objAL = new Audiolibro(titulo,fecha_creacion,num,dur,portada,contraportada,calificacion,sipnosis,numCapitulos,idioma,repr,idN,idE,idC);
        
        ControlAudiolibro objcu = new ControlAudiolibro();
        boolean t = objcu.insertar_Audiolibro(objAL);
        if (t == true) {
            JOptionPane.showMessageDialog(rootPane, "Se inserto el AudioLibro con exito");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se Inserto el AudioLibro");
        }    
                  
    }//GEN-LAST:event_btnAgregarAudiolibroActionPerformed

    private void jComboBoxClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClasificacionActionPerformed

    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        // TODO add your handling code here:
        
        
        
        JFileChooser archivo=new JFileChooser();
        int ventana= archivo.showOpenDialog(null);
        if(ventana==JFileChooser.APPROVE_OPTION){
        
            File file=archivo.getSelectedFile();
            jTextFieldPortada.setText(String.valueOf(file));
            
        }
    }//GEN-LAST:event_btSeleccionarActionPerformed

    private void btSeleccionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionar2ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser archivo2=new JFileChooser();
        int ventana2= archivo2.showOpenDialog(null);
        if(ventana2==JFileChooser.APPROVE_OPTION){
        
            File file2=archivo2.getSelectedFile();
            jTextFieldContrportada.setText(String.valueOf(file2));
            
        }
        
        
    }//GEN-LAST:event_btSeleccionar2ActionPerformed

    private void jComboBoxEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEditorialActionPerformed

    private void btnEliminarAudiolibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAudiolibroActionPerformed
        // TODO add your handling code here:
        
        
        ControlAudiolibro objeu = new ControlAudiolibro();
        String selected = jTextField1.getText();
        boolean t1 = objeu.eliminarAudioLibro(selected);

        if (t1 == true) {
            JOptionPane.showMessageDialog(this, "Se elimino la Categoria");
        } else {
            JOptionPane.showMessageDialog(this, "No se la Categoria");
        }        
        
        
        
    }//GEN-LAST:event_btnEliminarAudiolibroActionPerformed

    private void btnLimpiarAudiolibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAudiolibroActionPerformed
        // TODO add your handling code here:
        
        ControlAudiolibro obju = new ControlAudiolibro();
        int ncolu;
        Object[] fila2;

        listAuL = obju.consultarAudioLibro();
        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable2.setModel(modelo);
        modelo.addColumn("id_audiolibro");
        modelo.addColumn("titulo");
        modelo.addColumn("fecha_creacion");
        modelo.addColumn("num_paginas");
        modelo.addColumn("duracion_total");
        modelo.addColumn("portada");
        modelo.addColumn("contraportada");
        modelo.addColumn("calificacion");
        modelo.addColumn("sipnosis");
        modelo.addColumn("numCapitulos");
        modelo.addColumn("idioma");
        modelo.addColumn("reproducciones");
        modelo.addColumn("id_narradorAF");
        modelo.addColumn("id_editorialAF");
        modelo.addColumn("id_categoriaAF");
        ncolu = modelo.getColumnCount();

        for (int i = 0; i < listAuL.size(); i++) {

            fila2 = new Object[ncolu];
            fila2[0] = listAuL.get(i).getId_audiolibro();
            fila2[1] = listAuL.get(i).getTitulo();
            fila2[2] = listAuL.get(i).getFecha_creacion();
            fila2[3] = listAuL.get(i).getNum_paginas();
            fila2[4] = listAuL.get(i).getDuracion_total();
            fila2[5] = listAuL.get(i).getPortada();
            fila2[6] = listAuL.get(i).getContraportada();
            fila2[7] = listAuL.get(i).getCalificacion();
            fila2[8] = listAuL.get(i).getSipnosis();
            fila2[9] = listAuL.get(i).getNumCapitulos();
            fila2[10] = listAuL.get(i).getIdioma();
            fila2[11] = listAuL.get(i).getReproducciones();
            fila2[12] = listAuL.get(i).getId_narradorAF();
            fila2[13] = listAuL.get(i).getId_editorialAF();
            fila2[14] = listAuL.get(i).getId_categoriaAF();
            
            modelo.addRow(fila2);
        }
               
        
    }//GEN-LAST:event_btnLimpiarAudiolibroActionPerformed

    private void JSinopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSinopsisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JSinopsisActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAudiolibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAudiolibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAudiolibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAudiolibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAudiolibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JSinopsis;
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JButton btSeleccionar2;
    private javax.swing.JButton btnAgregarAudiolibro;
    private javax.swing.JButton btnEliminarAudiolibro;
    private javax.swing.JButton btnLimpiarAudiolibro;
    private javax.swing.JButton btnModificarAudiolibro;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxClasificacion;
    private javax.swing.JComboBox<String> jComboBoxEditorial;
    private javax.swing.JComboBox<String> jComboBoxNarrador;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldContrportada;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldIDIOMA;
    private javax.swing.JTextField jTextFieldNPaginas;
    private javax.swing.JTextField jTextFieldPortada;
    private javax.swing.JTextField jTextFieldReproducciones;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldnumCap;
    // End of variables declaration//GEN-END:variables
}
