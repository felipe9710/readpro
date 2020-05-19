/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Pais_Narrador;

/**
 *
 * @author usuario
 */
public class ControlPais_Narrador {

    public boolean insertarPaises_narrador(String nombrePais_narrador) {

        boolean t = false;
        Pais_Narrador objpa = new Pais_Narrador();
        String sql = "insert into paises_narradores(nombrepais) value ('" + nombrePais_narrador + "')";
        t = objpa.insertarPaises_Narrador(sql);
        return t;

    }

    public LinkedList<Pais_Narrador> consultarpaisnarrador() {
        String sql = "Select * from paises_narradores;";
        Pais_Narrador objc = new Pais_Narrador();
        LinkedList<Pais_Narrador> listpn = objc.buscar_pais_narrador(sql);

        return listpn;
    }

    public boolean modificarPais_narrador(String selected, String nombrePaisNa) {

        boolean t1 = false;
        Pais_Narrador objmpa = new Pais_Narrador();
        String sql = "update paises_narradores set nombrePais = '" + nombrePaisNa + "' where id_PaisN =" + selected;
        t1 = objmpa.modificarPais_Narrador(sql);
        return t1;
    }

    public boolean eliminarPais_narrador(String select) {

        boolean t2 = false;
        Pais_Narrador objepa = new Pais_Narrador();
        String sql = "delete from paises_narradores where id_PaisN =" + select;
        t2 = objepa.eliminarPais_Narrador(sql);
        return t2;

    }

}
