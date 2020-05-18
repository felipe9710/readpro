/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.cj.protocol.Resultset;
import control.BaseDatos;
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
 * @author Home
 */
public class Autores_Libros {

    private int id_AutorLibro;
    private String Nombre_Autor;
    private int id_LibroF;

    public Autores_Libros() {
    }

    public Autores_Libros(String Nombre_Autor, int id_LibroF) {
        this.Nombre_Autor = Nombre_Autor;
        this.id_LibroF = id_LibroF;
    }

    public Autores_Libros(int id_AutorLibro, String Nombre_Autor, int id_LibroF) {
        this.id_AutorLibro = id_AutorLibro;
        this.Nombre_Autor = Nombre_Autor;
        this.id_LibroF = id_LibroF;
    }

    @Override
    public String toString() {
        return "Autores_Libros{" + "id_AutorLibro=" + id_AutorLibro + ", Nombre_Autor=" + Nombre_Autor + ", id_LibroF=" + id_LibroF + '}';
    }

    public int getId_AutorLibro() {
        return id_AutorLibro;
    }

    public void setId_AutorLibro(int id_AutorLibro) {
        this.id_AutorLibro = id_AutorLibro;
    }

    public String getNombre_Autor() {
        return Nombre_Autor;
    }

    public void setNombre_Autor(String Nombre_Autor) {
        this.Nombre_Autor = Nombre_Autor;
    }

    public int getId_LibroF() {
        return id_LibroF;
    }

    public void setId_LibroF(int id_LibroF) {
        this.id_LibroF = id_LibroF;
    }

    public boolean insertarAutores_Libros(String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        Resultset rs = null;
                        PreparedStatement ps = null;
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
        public LinkedList<Autores_Libros> consultarAutor(String sql) {
        LinkedList<Autores_Libros> lp = new LinkedList<>();
        BaseDatos objb = new BaseDatos();

        int id_autorL=0;
        String nombre_autor1L = "";

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    id_autorL = rs.getInt("id_autor");
                    nombre_autor1L = rs.getString("nombre_autor1");
                    lp.add(new Autores_Libros(nombre_autor1L,id_autorL));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Autor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lp;

    }
}
