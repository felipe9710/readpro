/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Pais_autor;
import java.util.LinkedList;

/**
 *
 * @author felipe
 */
public class ControlPais_autor {

    public boolean insertarPaises_autor(String nombrePais_autor) {
        
        boolean t = false;
        Pais_autor objpa = new Pais_autor();
        
        String sql = "insert into paises_autores(nombrePaisA) value ('"+nombrePais_autor+"')";
        
        t = objpa.insertarPais_autor(sql);
        return t;
        
        
    }
    public LinkedList<Pais_autor> consultarPaisesA() {
        LinkedList<Pais_autor> lpu = new LinkedList<>();
        String sql = "select * from paises_autores";
        Pais_autor objpu= new Pais_autor();
        lpu = objpu.consultarPaisesA(sql);
    
        return lpu;
    }
}
