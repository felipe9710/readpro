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
public class Narrador {
    
    String nombre_narrador1;
    String nombre_narrador2;
    String apellido_narrador1;
    String apellido_narrador2;
    Date fecha_nacimiento_narrador;

    public Narrador() {
    }

    public Narrador(String nombre_narrador1, String nombre_narrador2, String apellido_narrador1, String apellido_narrador2, Date fecha_nacimiento_narrador) {
        this.nombre_narrador1 = nombre_narrador1;
        this.nombre_narrador2 = nombre_narrador2;
        this.apellido_narrador1 = apellido_narrador1;
        this.apellido_narrador2 = apellido_narrador2;
        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
    }

    public String getNombre_narrador1() {
        return nombre_narrador1;
    }

    public void setNombre_narrador1(String nombre_narrador1) {
        this.nombre_narrador1 = nombre_narrador1;
    }

    public String getNombre_narrador2() {
        return nombre_narrador2;
    }

    public void setNombre_narrador2(String nombre_narrador2) {
        this.nombre_narrador2 = nombre_narrador2;
    }

    public String getApellido_narrador1() {
        return apellido_narrador1;
    }

    public void setApellido_narrador1(String apellido_narrador1) {
        this.apellido_narrador1 = apellido_narrador1;
    }

    public String getApellido_narrador2() {
        return apellido_narrador2;
    }

    public void setApellido_narrador2(String apellido_narrador2) {
        this.apellido_narrador2 = apellido_narrador2;
    }

    public Date getFecha_nacimiento_narrador() {
        return fecha_nacimiento_narrador;
    }

    public void setFecha_nacimiento_narrador(Date fecha_nacimiento_narrador) {
        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
    }
    
    @Override
    public String toString() {
        return "Autor{{" + "nombre_narrador1=" + nombre_narrador1 + ", nombre_narrador2=" + nombre_narrador2 + ", apellido_narrador1=" + apellido_narrador1 + ", apellido_narrador2=" + apellido_narrador2 + ", fecha_nacimiento_narrador=" + fecha_nacimiento_narrador + '}';
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
