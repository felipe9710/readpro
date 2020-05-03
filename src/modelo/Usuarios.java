/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import control.BaseDatos;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuarios {
    
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String genero;
    String nombre_usuario;
    String correo_usuario;
    String contraseña_usuario;
    String fecha_nacimiento;
    String fecha_incripcion;
    int id_PaisUF;

    public Usuarios() {
    }

    public Usuarios(String nombre1, String nombre2, String apellido1, String apellido2, String genero, String nombre_usuario, String correo_usuario, String contraseña_usuario, String fecha_nacimiento, String fecha_incripcion, int id_PaisUF) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
        this.contraseña_usuario = contraseña_usuario;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_incripcion = fecha_incripcion;
        this.id_PaisUF = id_PaisUF;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_incripcion() {
        return fecha_incripcion;
    }

    public void setFecha_incripcion(String fecha_incripcion) {
        this.fecha_incripcion = fecha_incripcion;
    }

    public int getId_PaisUF() {
        return id_PaisUF;
    }

    public void setId_PaisUF(int id_PaisUF) {
        this.id_PaisUF = id_PaisUF;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", genero=" + genero + ", nombre_usuario=" + nombre_usuario + ", correo_usuario=" + correo_usuario + ", contrase\u00f1a_usuario=" + contraseña_usuario + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_incripcion=" + fecha_incripcion + ", id_PaisUF=" + id_PaisUF + '}';
    }

       public boolean insertar_Usuario(String sql) {

           
        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
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
