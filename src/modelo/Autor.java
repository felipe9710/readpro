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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Autor {

    private int id_autor;
    private String nombre_autor1;
    private String nombre_autor2;
    private String apellido_autor1;
    private String apellido_autor2;
    private Date fecha_nacimiento_Autor; 
    private int id_PaisAF; 

    public Autor() {
    }

    public Autor(int id_autor, String nombre_autor1, String nombre_autor2, String apellido_autor1, String apellido_autor2, Date fecha_nacimiento_Autor, int id_PaisAF) {
        this.id_autor = id_autor;
        this.nombre_autor1 = nombre_autor1;
        this.nombre_autor2 = nombre_autor2;
        this.apellido_autor1 = apellido_autor1;
        this.apellido_autor2 = apellido_autor2;
        this.fecha_nacimiento_Autor = fecha_nacimiento_Autor;
        this.id_PaisAF = id_PaisAF;
    }

    public Autor(String nombre_autor1, String nombre_autor2, String apellido_autor1, String apellido_autor2, Date fecha_nacimiento_Autor, int id_PaisAF) {
        this.nombre_autor1 = nombre_autor1;
        this.nombre_autor2 = nombre_autor2;
        this.apellido_autor1 = apellido_autor1;
        this.apellido_autor2 = apellido_autor2;
        this.fecha_nacimiento_Autor = fecha_nacimiento_Autor;
        this.id_PaisAF = id_PaisAF;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre_autor1() {
        return nombre_autor1;
    }

    public void setNombre_autor1(String nombre_autor1) {
        this.nombre_autor1 = nombre_autor1;
    }

    public String getNombre_autor2() {
        return nombre_autor2;
    }

    public void setNombre_autor2(String nombre_autor2) {
        this.nombre_autor2 = nombre_autor2;
    }

    public String getApellido_autor1() {
        return apellido_autor1;
    }

    public void setApellido_autor1(String apellido_autor1) {
        this.apellido_autor1 = apellido_autor1;
    }

    public String getApellido_autor2() {
        return apellido_autor2;
    }

    public void setApellido_autor2(String apellido_autor2) {
        this.apellido_autor2 = apellido_autor2;
    }

    public Date getFecha_nacimiento_Autor() {
        return fecha_nacimiento_Autor;
    }

    public void setFecha_nacimiento_Autor(Date fecha_nacimiento_Autor) {
        this.fecha_nacimiento_Autor = fecha_nacimiento_Autor;
    }

    public int getId_PaisAF() {
        return id_PaisAF;
    }

    public void setId_PaisAF(int id_PaisAF) {
        this.id_PaisAF = id_PaisAF;
    }

    @Override
    public String toString() {
        return "Autor{" + "id_autor=" + id_autor + ", nombre_autor1=" + nombre_autor1 + ", nombre_autor2=" + nombre_autor2 + ", apellido_autor1=" + apellido_autor1 + ", apellido_autor2=" + apellido_autor2 + ", fecha_nacimiento_Autor=" + fecha_nacimiento_Autor + ", id_PaisAF=" + id_PaisAF + '}';
    }

    
    
    public boolean insertarAutor(Autor objAutor, String sql) {

        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                
                ps.setString(1, objAutor.getNombre_autor1());
                ps.setString(2, objAutor.getNombre_autor2());
                ps.setString(3, objAutor.getApellido_autor1());
                ps.setString(4, objAutor.getApellido_autor2());
                ps.setDate(5, objAutor.getFecha_nacimiento_Autor());
                ps.setInt(6, objAutor.getId_PaisAF());

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

    public LinkedList<Autor> consultarAutores(String sql) {
        
        LinkedList<Autor> la = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        ResultSet rs = null;
        
     String id_autorT;
     String nombre_autor1T="";
     String nombre_autor2T="";
     String apellido_autor1T="";
     String apellido_autor2T="";
     Date fecha_nacimiento_AutorT;
     String id_PaisAFT;
  
     if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    
                    id_autorT = rs.getString("id_autor");
                     nombre_autor1T=rs.getString("nombre_autor1");
                     nombre_autor2T=rs.getString("nombre_autor2");
                     apellido_autor1T=rs.getString("apellido_autor1");
                     apellido_autor2T=rs.getString("apellido_autor2");
                     fecha_nacimiento_AutorT=rs.getDate("fecha_nacimiento_Autor");
                     id_PaisAFT= rs.getString("id_PaisAF");
                    
                    la.add(new Autor(Integer.parseInt(id_autorT),nombre_autor1T,nombre_autor2T,apellido_autor1T,apellido_autor2T,fecha_nacimiento_AutorT,Integer.parseInt(id_PaisAFT) ));
                 }
            } catch (SQLException ex) {
                Logger.getLogger(Autor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return la;
        
    }


public boolean modificarAutor(String sql) {

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

    public boolean eliminarAutor(String sql) {

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
