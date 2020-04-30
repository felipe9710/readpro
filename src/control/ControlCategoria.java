/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Categoria;

/**
 *
 * @author usuario
 */
public class ControlCategoria {
    
        public boolean insertarCategoria(String categoria) {
        
        boolean t = false;
        Categoria objpc = new Categoria();
        
        String sql = "insert into categorias(categoria) value ('"+categoria+"')";
        
        t = objpc.insertarCategoria(sql);
        return t;
        
        
    }
}
