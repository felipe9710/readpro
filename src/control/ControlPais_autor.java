/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Pais_Narrador;
import modelo.Pais_autor;

/**
 *
 * @author felipe
 */
public class ControlPais_autor {

    public boolean insertarPaises_autor(String nombrePais_autor) {
        
        boolean t = false;
        Pais_autor objpa = new Pais_autor();
        
        String sql = "insert into paises_autores(nombrepaisA) value ('"+nombrePais_autor+"')";
        
        t = objpa.insertarPais_autor(sql);
        return t;
        
        
    }
    
    public LinkedList<Pais_autor> consultarpaisautor() {
        String sql="Select * from paises_autores;";
        Pais_autor objc=new Pais_autor();
        LinkedList<Pais_autor> listpa=objc.buscar_pais_autor(sql);
        
        return listpa;
    }
    
}
