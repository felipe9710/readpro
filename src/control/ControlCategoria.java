/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Categoria;

/**
 *
 * @author usuario
 */
public class ControlCategoria {
    
        public boolean insertarCategoria(Categoria objC) {
        
        boolean t = false;
        Categoria objpc = new Categoria();
        
        String sql = "insert into categorias(categoria) value (?)";
        
        t = objpc.insertarCategoria(objC,sql);
        return t;
     
    }
        
    public LinkedList<Categoria> consultarCategoria() {
        String sql="Select * from categorias;";
        Categoria objc=new Categoria();
        LinkedList<Categoria> listc=objc.consultarCategoria(sql);
        
        return listc;
    }
        public boolean modificarCategoria(String selected, String categoria) {

        boolean t1 = false;
        Categoria objmpa = new Categoria();
        String sql = "update categorias set categoria = '" + categoria + "' where id_categoria =" + selected;
        t1 = objmpa.modificarCategoria(sql);
        return t1;
    }
        
        public boolean eliminarCategoria(String selected) {

        boolean t2 = false;
        Categoria objepa = new Categoria();
        String sql = "delete from categorias where id_categoria =" + selected;
        t2 = objepa.eliminarCategoria(sql);
        return t2;

    }
    
}
