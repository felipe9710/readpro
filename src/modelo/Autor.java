/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class Autor {
    
    String nombre_autor1;
    String nombre_autor2;
    String apellido_autor1;
    String apellido_autor2;
    Date fecha_nacimiento_Autor;

    public Autor(String nombre_autor1, String nombre_autor2, String apellido_autor1, String apellido_autor2, Date fecha_nacimiento_Autor) {
        this.nombre_autor1 = nombre_autor1;
        this.nombre_autor2 = nombre_autor2;
        this.apellido_autor1 = apellido_autor1;
        this.apellido_autor2 = apellido_autor2;
        this.fecha_nacimiento_Autor = fecha_nacimiento_Autor;
    }

    public Autor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
        @Override
    public String toString() {
        return "Autor{{" + "nombre_autor1=" + nombre_autor1 + ", nombre_autor2=" + nombre_autor2 + ", apellido_autor1=" + apellido_autor1 + ", apellido_autor2=" + apellido_autor2 + ", fecha_nacimiento_Autor=" + fecha_nacimiento_Autor + '}';
    }
    
        public boolean insertarAutor(String sql){
        
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
    
}
