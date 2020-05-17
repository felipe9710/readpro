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
 * @author felipe
 */
public class Login {

    private String usuario;
    private String contraseña;

    public Login() {
    }

    public Login(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * Get the value of contraseña
     *
     * @return the value of contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Set the value of contraseña
     *
     * @param contraseña new value of contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set the value of usuario
     *
     * @param usuario new value of usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Login{" + "usuario=" + usuario + ", contraseña=" + contraseña + '}';
    }

    public boolean buscarUsuarioRegistrado(Login objLogin, String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        String usuario = "";
        String contraseña = "";
        ResultSet rs = null;
        if (objCon.crearConexion()) {
            try {
                rs = objCon.getSt().executeQuery(sql);
                while (rs.next()) {

                    usuario = rs.getString("nombre_usuario");
                    contraseña = rs.getString("contraseña_usuario");

                    if(objLogin.getUsuario().equals(usuario) && objLogin.getContraseña().equals(contraseña)){
                    
                        t = true;
                        
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return t;

    }

}
