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

    public boolean insertarPaises_Usuario(String Pais_Usuario) {
        boolean t = false;
        Pais_Usuario objpU = new Pais_Usuario();

        String sql = "insert into paises_usuarios(nombrePaisU) value ('" + Pais_Usuario + "')";

        t = objpU.insertarPaises_Usuario(sql);

        return t;
    }

    public LinkedList<Pais_Usuario> consultarPaises_Usuario() {
        LinkedList<Pais_Usuario> lpu = new LinkedList<>();
        String sql = "select * from paises_usuarios";
        Pais_Usuario objpu= new Pais_Usuario();
        lpu = objpu.consultarPaises(sql);
    
        return lpu;
    }


    public boolean modificarPais_Usuario(String selected, String nombrePaisU) {

        boolean t1 = false;
        Pais_Usuario objmpa = new Pais_Usuario();
        String sql = "update paises_usuarios set nombrePaisU = '" + nombrePaisU + "' where id_PaisU =" + selected;
        t1 = objmpa.modificarPais_Usuario(sql);
        return t1;
    }

    public boolean eliminarPais_Usuario(String select) {

        boolean t2 = false;
        Pais_Usuario objepa = new Pais_Usuario();
        String sql = "delete from paises_usuarios where id_PaisU =" + select;
        t2 = objepa.eliminarPais_Usuario(sql);
        return t2;

    }
    
    
    
    
}
