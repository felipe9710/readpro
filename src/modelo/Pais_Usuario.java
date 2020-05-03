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
    
        private int id_PaisU;
        private String nombrePaisU;

    public Pais_Usuario() {
    }

    public Pais_Usuario(int id_PaisU, String nombrePaisU) {
        this.id_PaisU = id_PaisU;
        this.nombrePaisU = nombrePaisU;
    }

    public Pais_Usuario(String nombrePaisU) {
        this.nombrePaisU = nombrePaisU;
    }

    /**
     * Get the value of id_PaisU
     *
     * @return the value of id_PaisU
     */
    public int getId_PaisU() {
        return id_PaisU;
    }

    /**
     * Set the value of id_PaisU
     *
     * @param id_PaisU new value of id_PaisU
     */
    public void setId_PaisU(int id_PaisU) {
        this.id_PaisU = id_PaisU;
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
        LinkedList<Pais_Usuario> lp = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        
        int id_PaisU1;
        String nombrePaisU1 = "";

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    id_PaisU1 = rs.getInt("id_PaisU");
                    nombrePaisU1 = rs.getString("nombrePaisU");
                    lp.add(new Pais_Usuario(id_PaisU1,nombrePaisU1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Pais_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lp;

    }
    
    
    
    
    
}
