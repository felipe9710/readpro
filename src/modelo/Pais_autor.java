/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felipe
 */
public class Pais_autor {

    private int id_paisA;
    private String nombrePaisA;

    public Pais_autor() {
    }

    public Pais_autor(int id_paisA, String nombrePaisA) {
        this.id_paisA = id_paisA;
        this.nombrePaisA = nombrePaisA;
    }

    public Pais_autor(String nombrePaisA) {
        this.nombrePaisA = nombrePaisA;
    }

    /**
     * Get the value of nombrePaisA
     *
     * @return the value of nombrePaisA
     */
    public String getNombrePaisA() {
        return nombrePaisA;
    }

    /**
     * Set the value of nombrePaisA
     *
     * @param nombrePaisA new value of nombrePaisA
     */
    public void setNombrePaisA(String nombrePaisA) {
        this.nombrePaisA = nombrePaisA;
    }

    /**
     * Get the value of id_paisA
     *
     * @return the value of id_paisA
     */
    public int getId_paisA() {
        return id_paisA;
    }

    /**
     * Set the value of id_paisA
     *
     * @param id_paisA new value of id_paisA
     */
    public void setId_paisA(int id_paisA) {
        this.id_paisA = id_paisA;
    }

    @Override
    public String toString() {
        return "Pais_autor{" + "id_paisA=" + id_paisA + ", nombrePaisA=" + nombrePaisA + '}';
    }

    public boolean insertarPais_autor(String sql) {

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
