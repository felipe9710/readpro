/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.FileInputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author usuario
 */
public class Narrador {
    
    private int id_narrador;
    private String nombre_narrador1;
    private String nombre_narrado2;
    private String apellido_narrado1;
    private String apellido_narrado2;
    private Date fecha_nacimiento_narrador;
    private int id_PaisNF;

    public Narrador() {
    }

    public Narrador(int id_narrador, String nombre_narrador1, String nombre_narrado2, String apellido_narrado1, String apellido_narrado2, Date fecha_nacimiento_narrador, int id_PaisNF) {
        this.id_narrador = id_narrador;
        this.nombre_narrador1 = nombre_narrador1;
        this.nombre_narrado2 = nombre_narrado2;
        this.apellido_narrado1 = apellido_narrado1;
        this.apellido_narrado2 = apellido_narrado2;
        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
        this.id_PaisNF = id_PaisNF;
    }

    public Narrador(String nombre_narrador1, String nombre_narrado2, String apellido_narrado1, String apellido_narrado2, Date fecha_nacimiento_narrador, int id_PaisNF) {
        this.nombre_narrador1 = nombre_narrador1;
        this.nombre_narrado2 = nombre_narrado2;
        this.apellido_narrado1 = apellido_narrado1;
        this.apellido_narrado2 = apellido_narrado2;
        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
        this.id_PaisNF = id_PaisNF;
    }

    public int getId_narrador() {
        return id_narrador;
    }

    public void setId_narrador(int id_narrador) {
        this.id_narrador = id_narrador;
    }

    public String getNombre_narrador1() {
        return nombre_narrador1;
    }

    public void setNombre_narrador1(String nombre_narrador1) {
        this.nombre_narrador1 = nombre_narrador1;
    }

    public String getNombre_narrado2() {
        return nombre_narrado2;
    }

    public void setNombre_narrado2(String nombre_narrado2) {
        this.nombre_narrado2 = nombre_narrado2;
    }

    public String getApellido_narrado1() {
        return apellido_narrado1;
    }

    public void setApellido_narrado1(String apellido_narrado1) {
        this.apellido_narrado1 = apellido_narrado1;
    }

    public String getApellido_narrado2() {
        return apellido_narrado2;
    }

    public void setApellido_narrado2(String apellido_narrado2) {
        this.apellido_narrado2 = apellido_narrado2;
    }

    public Date getFecha_nacimiento_narrador() {
        return fecha_nacimiento_narrador;
    }

    public void setFecha_nacimiento_narrador(Date fecha_nacimiento_narrador) {
        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
    }

    public int getId_PaisNF() {
        return id_PaisNF;
    }

    public void setId_PaisNF(int id_PaisNF) {
        this.id_PaisNF = id_PaisNF;
    }

    @Override
    public String toString() {
        return "Narrador{" + "id_narrador=" + id_narrador + ", nombre_narrador1=" + nombre_narrador1 + ", nombre_narrado2=" + nombre_narrado2 + ", apellido_narrado1=" + apellido_narrado1 + ", apellido_narrado2=" + apellido_narrado2 + ", fecha_nacimiento_narrador=" + fecha_nacimiento_narrador + ", id_PaisNF=" + id_PaisNF + '}';
    }

    public boolean insertarNarrador(Narrador objNarrador, String sql) {

        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                
                ps.setString(1, objNarrador.getNombre_narrador1());
                ps.setString(2, objNarrador.getNombre_narrado2());
                ps.setString(3, objNarrador.getApellido_narrado1());
                ps.setString(4, objNarrador.getApellido_narrado2());
                ps.setDate(5, objNarrador.getFecha_nacimiento_narrador());
                ps.setInt(6, objNarrador.getId_PaisNF());

                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;

    }
    
        public boolean insertarNarrador(String sql){
        
        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        
        if (objCon.crearConexion()){
            
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }
        return t;
    }
        public LinkedList<Narrador> consultarNarrador(String sql) {
        
        LinkedList<Narrador> la = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        ResultSet rs = null;
        
     String id_narradorT;
     String nombre_narrador1T="";
     String nombre_narrado2T="";
     String apellido_narrado1T="";
     String apellido_narrado2T="";
     Date fecha_nacimiento_narradorT;
     String id_PaisNFT;
  
     if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    
                    id_narradorT = rs.getString("id_narrador");
                     nombre_narrador1T=rs.getString("nombre_narrador1");
                     nombre_narrado2T=rs.getString("nombre_narrado2");
                     apellido_narrado1T=rs.getString("apellido_narrado1");
                     apellido_narrado2T=rs.getString("apellido_narrado2");
                     fecha_nacimiento_narradorT=rs.getDate("fecha_nacimiento_narrador");
                     id_PaisNFT= rs.getString("id_PaisNF");
                    
                    la.add(new Narrador(Integer.parseInt(id_narradorT),nombre_narrador1T,nombre_narrado2T,apellido_narrado1T,apellido_narrado2T,fecha_nacimiento_narradorT,Integer.parseInt(id_PaisNFT)));
                 }
            } catch (SQLException ex) {
                Logger.getLogger(Autor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return la;
        
    }
        public boolean modificarNarrador(String sql) {

        boolean t1 = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {

            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t1 = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t1 = false;
            }
        }
        return t1;

    }
        public boolean eliminarNarrador(String sql) {

        boolean t2 = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {

            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t2 = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t2 = false;
            }
        }
        return t2;

    }
}
