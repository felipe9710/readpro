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
public class Categoria {
    
    private String categoria;

    public Categoria() {
    }

    public Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "categoria=" + categoria + '}';
    }
    
        public boolean insertarCategoria(String sql){
        
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
        
        
            public LinkedList<Categoria> buscarCategoria(String sql) {
        ResultSet rs = null;
        LinkedList<Categoria> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        String categoria;


        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                   
                    categoria = rs.getNString("categoria");
                   
                 
                    lc.add(new Categoria(categoria));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }
    
}

