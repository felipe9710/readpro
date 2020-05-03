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
import java.util.logging.Level;
import java.util.logging.Logger;

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
        public LinkedList<Pais_Usuario> consultarPaises(String sql) {
        LinkedList<Pais_Usuario> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        
        String nombrePaisU = "";

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    nombrePaisU = rs.getString("nombrePaisU");

                    lc.add(new Pais_Usuario(nombrePaisU));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Pais_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;

    }
    
    
    
    
    
}
