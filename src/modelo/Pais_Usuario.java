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
 * @author Home
 */
public class Pais_Usuario {
    
    private String nombrePaisU;

    public Pais_Usuario() {
    }

    public Pais_Usuario(String nombrePaisU) {
        this.nombrePaisU = nombrePaisU;
    }

    public String getNombrePaisU() {
        return nombrePaisU;
    }

    public void setNombrePaisU(String nombrePaisU) {
        this.nombrePaisU = nombrePaisU;
    }

    @Override
    public String toString() {
        return "Pais_Usuario{" + "nombrePaisU=" + nombrePaisU + '}';
    }
    public boolean insertarPaises_Usuario(String sql){
        
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
