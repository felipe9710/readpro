/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

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

    public Narrador() {
    }

//    public Narrador(int id_narrador, String nombre_narrador1, String apellido_narrador1) {
//        this.id_narrador = id_narrador;
//        this.nombre_narrador1 = nombre_narrador1;
//        this.apellido_narrador1 = apellido_narrador1;
//    }
//    public Narrador(int id_narrador, String nombre_narrador1, String apellido_narrador1, Date fecha_nacimiento_narrador) {
//        this.id_narrador = id_narrador;
//        this.nombre_narrador1 = nombre_narrador1;
//        this.apellido_narrador1 = apellido_narrador1;
//        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
//    }

    public Narrador(int id_narrador, String nombre_narrador1, String apellido_narrado1, Date fecha_nacimiento_narrador) {
        this.id_narrador = id_narrador;
        this.nombre_narrador1 = nombre_narrador1;
        this.apellido_narrado1 = apellido_narrado1;
        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
    }
    
    

//    public Narrador(int id_narrador, String nombre_narrador1, String nombre_narrado2, String apellido_narrador1, String apellido_narrador2, Date fecha_nacimiento_narrador) {
//        this.id_narrador = id_narrador;
//        this.nombre_narrador1 = nombre_narrador1;
//        this.nombre_narrado2 = nombre_narrado2;
//        this.apellido_narrador1 = apellido_narrador1;
//        this.apellido_narrador2 = apellido_narrador2;
//        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
//    }
    
    

    public Narrador(int id_narrador, String nombre_narrador1, String nombre_narrado2, String apellido_narrado1, String apellido_narrado2, Date fecha_nacimiento_narrador) {
        this.id_narrador = id_narrador;
        this.nombre_narrador1 = nombre_narrador1;
        this.nombre_narrado2 = nombre_narrado2;
        this.apellido_narrado1 = apellido_narrado1;
        this.apellido_narrado2 = apellido_narrado2;
        this.fecha_nacimiento_narrador = fecha_nacimiento_narrador;
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

    @Override
    public String toString() {
        return "Narrador{" + "id_narrador=" + id_narrador + ", nombre_narrador1=" + nombre_narrador1 + ", nombre_narrado2=" + nombre_narrado2 + ", apellido_narrado1=" + apellido_narrado1 + ", apellido_narrado2=" + apellido_narrado2 + ", fecha_nacimiento_narrador=" + fecha_nacimiento_narrador + '}';
    }
    
    
    public boolean insertarNarrador(String sql) {

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

    public LinkedList<Narrador> buscarnarrador(String sql) {
        ResultSet rs = null;
        LinkedList<Narrador> ln = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();
        String idn;
        String nombre1n;
        String nombre2n = "";
        String apellido1n;
        String apellido2n = "";
        Date fechaNaN;

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idn = rs.getString("id_narrador");
                    nombre1n = rs.getString("nombre_narrador1");
                    fechaNaN = rs.getDate("fecha_nacimiento_narrador");
                    try {
                        nombre2n = rs.getString("nombre_narrado2");
                    } catch (NullPointerException n) {
                    }
                    if (nombre2n == null) {
                        nombre2n = "";
                    }

                    apellido1n = rs.getString("apellido_narrado1");
                    try {
                        apellido2n = rs.getString("apellido_narrado2");
                    } catch (NullPointerException n) {
                    }
                    if (apellido2n == null) {
                        apellido2n = "";
                    }

                    ln.add(new Narrador(Integer.parseInt(idn), nombre1n, nombre2n, apellido1n, apellido2n, fechaNaN));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return ln;
    }
    
    public boolean eliminarnarrador(String sql) {

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
