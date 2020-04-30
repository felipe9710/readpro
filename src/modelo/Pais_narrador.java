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
 * @author FrankDCastillo
 */
public class Pais_narrador {
    
    private int id_PaisN;
    private String nombrePaisN;

    public Pais_narrador() {
    }

    public Pais_narrador(int id_PaisN, String nombrePaisN) {
        this.id_PaisN = id_PaisN;
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
        return "Pais_narrador{" + "id_PaisN=" + id_PaisN + ", nombrePaisN=" + nombrePaisN + '}';
    }
    
    public boolean insertarPais_narrador(String sql){
        
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
