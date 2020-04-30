/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Pais_narrador;

/**
 *
 * @author FrankDCastillo
 */
public class ControlPais_narrador {
    
    public boolean insertarPaises_narrador(String nombrePais_narrador){
        boolean t = false;
        Pais_narrador objpn = new Pais_narrador();
        String sql = "insert into paises_autores(nombrepaisA) value ('"+nombrePais_narrador+"')";
        t = objpn.insertarPais_narrador(sql);
        
        return t;
    }
    
}
