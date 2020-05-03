/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Pais_Narrador;

/**
 *
 * @author usuario
 */
public class ControlPais_Narrador {
    
        public boolean insertarPaises_narrador(String nombrePais_narrador) {
        
        boolean t = false;
        Pais_Narrador objpa = new Pais_Narrador();
        
        String sql = "insert into paises_narrador(nombrepaisN) value ('"+nombrePais_narrador+"')";
        
        t = objpa.insertarPaises_Narrador(sql);
        return t;
        
        
    }
    
}
