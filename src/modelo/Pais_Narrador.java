/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class Pais_Narrador {

    private int id_PaisN;
    private String nombrePaisN;

    public Pais_Narrador() {
    }

    public Pais_Narrador(int id_PaisN, String nombrePaisN) {
        this.id_PaisN = id_PaisN;
        this.nombrePaisN = nombrePaisN;
    }

    public Pais_Narrador(String nombrePaisN) {
        this.nombrePaisN = nombrePaisN;
    }

    public int getId_PaisN() {
        return id_PaisN;
    }

    public void setId_PaisN(int id_PaisN) {
        this.id_PaisN = id_PaisN;
    }

    public String getNombrePaisN() {
        return nombrePaisN;
    }

    public void setNombrePaisN(String nombrePaisN) {
        this.nombrePaisN = nombrePaisN;
    }

    @Override
    public String toString() {
        return "Pais_Narrador{" + "id_PaisN=" + id_PaisN + ", nombrePaisN=" + nombrePaisN + '}';
    }

    public boolean insertarPaises_Narrador(String sql) {

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

    public LinkedList<Pais_Narrador> buscar_pais_narrador(String sql) {
        ResultSet rs = null;
        LinkedList<Pais_Narrador> lpn = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();
        String idpn;
        String nombrepn = "";

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idpn = rs.getString("id_PaisN");
                    nombrepn = rs.getString("nombrePais");

                    lpn.add(new Pais_Narrador(Integer.parseInt(idpn), nombrepn));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lpn;
    }

    public boolean modificarPais_Narrador(String sql) {

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

    public boolean eliminarPais_Narrador(String sql) {

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
