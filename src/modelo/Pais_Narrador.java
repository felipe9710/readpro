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
 * @author usuario
 */
public class Pais_Narrador {
    
    private String nombrePaisN;

    public Pais_Narrador() {
    }

    public Pais_Narrador(String nombrePaisN) {
        this.nombrePaisN = nombrePaisN;
    }

    public String getNombrePaisN() {
        return nombrePaisN;
    }

    public void setNombrePaisN(String nombrePaisN) {
        this.nombrePaisN = nombrePaisN;
    }
    
    @Override
    public String toString() {
        return "Pais_Narrador{" + "nombrePaisN=" + nombrePaisN + '}';
    }
    public boolean insertarPaises_Narrador(String sql){
        
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
