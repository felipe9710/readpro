/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class Usuario {

    private int id_usuario;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String genero;
    private String nombre_usuario;
    private String correo_usuario;
    private String contraseña_usuario;
    private String fecha_nacimiento;
    private String fecha_inscripicion;
    private int id_PaisUF;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre1, String nombre2, String apellido1, String apellido2, String genero, String nombre_usuario, String correo_usuario, String contraseña_usuario, String fecha_nacimiento, String fecha_inscripicion, int id_PaisUF) {
        this.id_usuario = id_usuario;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
        this.contraseña_usuario = contraseña_usuario;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_inscripicion = fecha_inscripicion;
        this.id_PaisUF = id_PaisUF;
    }

    public Usuario(String nombre1, String nombre2, String apellido1, String apellido2, String genero, String nombre_usuario, String correo_usuario, String contraseña_usuario, String fecha_nacimiento, String fecha_inscripicion, int id_PaisUF) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
        this.contraseña_usuario = contraseña_usuario;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_inscripicion = fecha_inscripicion;
        this.id_PaisUF = id_PaisUF;
    }

    /**
     * Get the value of id_PaisUF
     *
     * @return the value of id_PaisUF
     */
    public int getId_PaisUF() {
        return id_PaisUF;
    }

    /**
     * Set the value of id_PaisUF
     *
     * @param id_PaisUF new value of id_PaisUF
     */
    public void setId_PaisUF(int id_PaisUF) {
        this.id_PaisUF = id_PaisUF;
    }

    /**
     * Get the value of fecha_inscripicion
     *
     * @return the value of fecha_inscripicion
     */
    public String getFecha_inscripicion() {
        return fecha_inscripicion;
    }

    /**
     * Set the value of fecha_inscripicion
     *
     * @param fecha_inscripicion new value of fecha_inscripicion
     */
    public void setFecha_inscripicion(String fecha_inscripicion) {
        this.fecha_inscripicion = fecha_inscripicion;
    }

    /**
     * Get the value of fecha_nacimiento
     *
     * @return the value of fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Set the value of fecha_nacimiento
     *
     * @param fecha_nacimiento new value of fecha_nacimiento
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Get the value of contraseña_usuario
     *
     * @return the value of contraseña_usuario
     */
    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    /**
     * Set the value of contraseña_usuario
     *
     * @param contraseña_usuario new value of contraseña_usuario
     */
    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    /**
     * Get the value of correo_usuario
     *
     * @return the value of correo_usuario
     */
    public String getCorreo_usuario() {
        return correo_usuario;
    }

    /**
     * Set the value of correo_usuario
     *
     * @param correo_usuario new value of correo_usuario
     */
    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    /**
     * Get the value of nombre_usuario
     *
     * @return the value of nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * Set the value of nombre_usuario
     *
     * @param nombre_usuario new value of nombre_usuario
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * Get the value of genero
     *
     * @return the value of genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Set the value of genero
     *
     * @param genero new value of genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Get the value of apellido2
     *
     * @return the value of apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Set the value of apellido2
     *
     * @param apellido2 new value of apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Get the value of apellido1
     *
     * @return the value of apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Set the value of apellido1
     *
     * @param apellido1 new value of apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Get the value of nombre2
     *
     * @return the value of nombre2
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * Set the value of nombre2
     *
     * @param nombre2 new value of nombre2
     */
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    /**
     * Get the value of nombre1
     *
     * @return the value of nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * Set the value of nombre1
     *
     * @param nombre1 new value of nombre1
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * Get the value of id_usuario
     *
     * @return the value of id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * Set the value of id_usuario
     *
     * @param id_usuario new value of id_usuario
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", genero=" + genero + ", nombre_usuario=" + nombre_usuario + ", correo_usuario=" + correo_usuario + ", contrase\u00f1a_usuario=" + contraseña_usuario + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_inscripicion=" + fecha_inscripicion + ", id_PaisUF=" + id_PaisUF + '}';
    }

    public boolean insertarUsuario(Usuario objUsuario, String sql) {

        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objUsuario.getNombre1());
                ps.setString(2, objUsuario.getNombre2());
                ps.setString(3, objUsuario.getApellido1());
                ps.setString(4, objUsuario.getApellido2());
                ps.setString(5, objUsuario.getGenero());
                ps.setString(6, objUsuario.getNombre_usuario());
                ps.setString(7, objUsuario.getCorreo_usuario());
                ps.setString(8, objUsuario.getContraseña_usuario());
                ps.setString(9, objUsuario.getFecha_nacimiento());
                ps.setString(10,objUsuario.getFecha_inscripicion());
                ps.setInt(11, objUsuario.getId_PaisUF());
        
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

}
