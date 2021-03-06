/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.File;
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
    private Date fecha_nacimiento;
    private Date fecha_inscripicion;
    private int id_PaisUF;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre1, String nombre2, String apellido1, String apellido2, String genero, String nombre_usuario, String correo_usuario, String contraseña_usuario, Date fecha_nacimiento, Date fecha_inscripicion, int id_PaisUF) {
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

    public Usuario(String nombre1, String nombre2, String apellido1, String apellido2, String genero, String nombre_usuario, String correo_usuario, String contraseña_usuario, Date fecha_nacimiento, Date fecha_inscripicion, int id_PaisUF) {
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

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_inscripicion() {
        return fecha_inscripicion;
    }

    public void setFecha_inscripicion(Date fecha_inscripicion) {
        this.fecha_inscripicion = fecha_inscripicion;
    }

    public int getId_PaisUF() {
        return id_PaisUF;
    }

    public void setId_PaisUF(int id_PaisUF) {
        this.id_PaisUF = id_PaisUF;
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
                ps.setDate(9, objUsuario.getFecha_nacimiento());
                ps.setDate(10, objUsuario.getFecha_inscripicion());
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

    public LinkedList<Usuario> consultarUsuario(String sql) {

        ResultSet rs = null;
        LinkedList<Usuario> lu = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();
        String idu;
        String nombre1 = "";
        String nombre2 = "";
        String apellido = "";
        String apellido2 = "";
        String genero = "";
        String nombre_usuario = "";
        String contraseña = "";
        String correo = "";
        Date fecha_nac;
        Date fecha_insc;
        String idPaisuf;

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idu = rs.getString("id_Usuario");
                    nombre1 = rs.getString("nombre1");
                    nombre2 = rs.getString("nombre2");
                    apellido = rs.getString("apellido1");
                    apellido2 = rs.getString("apellido2");
                    genero = rs.getString("genero");
                    nombre_usuario = rs.getString("nombre_usuario");
                    correo = rs.getString("correo_usuario");
                    contraseña = rs.getString("contraseña_usuario");
                    fecha_nac = rs.getDate("fecha_nacimiento");
                    fecha_insc = rs.getDate("fecha_incripcion");
                    idPaisuf = rs.getString("id_PaisUF");

                    lu.add(new Usuario(Integer.parseInt(idu), nombre1, nombre2, apellido, apellido2, genero, nombre_usuario, correo, contraseña, fecha_nac, fecha_insc, Integer.parseInt(idPaisuf)));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lu;

    }

    public boolean modificarUsuario(String sql) {

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

    public boolean eliminarUsuario(String sql) {

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
