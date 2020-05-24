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
    
        public boolean insertarCategoria(String categoria) {
        
        boolean t = false;
        Categoria objpc = new Categoria();
        
<<<<<<< HEAD
        String sql = "insert into categorias(categoria) value ('"+objC.getCategoria()+"')";
=======
        String sql = "insert into categorias(categoria) value ('"+categoria+"')";
>>>>>>> parent of b930b45... Merge branch 'master' of https://github.com/felipe9710/readpro
        
        t = objpc.insertarCategoria(sql);
        return t;
     
    }
        
    public LinkedList<Categoria> consultarCategoria() {
        String sql="Select * from Categorias;";
        Categoria objc=new Categoria();
        LinkedList<Categoria> listc=objc.buscarCategoria(sql);
        
        return listc;
    }
        public boolean modificarCategoria(String selected, String categoria) {

        boolean t1 = false;
        Categoria objmpa = new Categoria();
        String sql = "update categorias set categoria = '" + categoria + "' where id_categoria =" + selected;
        t1 = objmpa.modificarCategoria(sql);
        return t1;
    }
        
        public boolean eliminarCategoria(String select) {

        boolean t2 = false;
        Categoria objepa = new Categoria();
        String sql = "delete from paises_narradores where id_PaisN =" + select;
        t2 = objepa.eliminarCategoria(sql);
        return t2;

    }
    
}
