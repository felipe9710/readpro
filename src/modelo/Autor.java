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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Autor {

    private int id_autor;
    private String nombre_autor1;

    public Autor() {
    }

    public Autor(String nombre_autor1) {
        this.nombre_autor1 = nombre_autor1;
    }

    public Autor(int id_autor, String nombre_autor1) {
        this.id_autor = id_autor;
        this.nombre_autor1 = nombre_autor1;
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

    @Override
    public String toString() {
        return "Autor{" + "id_autor=" + id_autor + ", nombre_autor1=" + nombre_autor1 + '}';
    }



    public boolean insertarAutor(String sql) {

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

    public LinkedList<Autor> consultarAutores(String sql) {
        
        LinkedList<Autor> la = new LinkedList<>();
        BaseDatos objb = new BaseDatos();

        int id_autor1=0;
        String nombre_autor1 = "";
        ResultSet rs = null;
        
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    id_autor1 = rs.getInt("id_autor");
                    nombre_autor1 = rs.getString("nombre_autor1");
                    la.add(new Autor(id_autor1, nombre_autor1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Autor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return la;
        
    }


}
