/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Pais_Usuario;

/**
 *
 * @author Home
 */
public class Control_Paises_Usuario {
    
    public boolean insertarPaises_Usuario(String Pais_Usuario){
        boolean t = false;
        Pais_Usuario objpU = new Pais_Usuario();
        
        String sql = "insert into paises_usuarios(nombrePaisU) value ('"+Pais_Usuario+"')";
        
        t =  objpU.insertarPaises_Usuario(sql);
        
        return t;
    }

    public LinkedList<Pais_Usuario> consultarPaises() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
