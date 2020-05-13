/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Login;

/**
 *
 * @author felipe
 */
public class ControlLogin {

    public boolean buscarUsuarioRegistrado(Login objLogin) {
        
        boolean t = false;
        Login objl2 = new Login();
        String sql = "";
        sql = "select nombre_usuario, contraseña_usuario from usuarios where nombre_usuario ='" +objLogin.getUsuario()+"' && contraseña_usuario ='"+objLogin.getContraseña()+"';";
        t = objl2.buscarUsuarioRegistrado(objLogin,sql);
        return t;
        
    }
    
    
    
}
