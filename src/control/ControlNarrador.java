/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import java.util.LinkedList;
import modelo.Narrador;
import modelo.Pais_Narrador;

/**
 *
 * @author usuario
 */
public class ControlNarrador {

    public boolean insertar_Narrador(String nombre_narrador1, String nombre_narrado2, String apellido_narrado1, String apellido_narrado2, Date fecha_nacimiento_narrador) {

        boolean t = false;
        Narrador objpE = new Narrador();

        String sql = "insert into narradores(nombre_narrador1,nombre_narrado2,apellido_narrado1,apellido_narrado2,fecha_nacimiento_narrador) VALUES ('" + nombre_narrador1 + "','" + nombre_narrado2 + "','" + apellido_narrado1 + "','" + apellido_narrado2 + "','" + fecha_nacimiento_narrador + "')";

        t = objpE.insertarNarrador(sql);//Name of Model
        return t;

    }
    
    public LinkedList<Narrador> consultarNarrador() {
        String sql="Select * from narradores;";
        Narrador objc=new Narrador();
        LinkedList<Narrador> listn=objc.buscarnarrador(sql);
        
        return listn;
    }
    
    public boolean eliminarNarrador(String select) {

        boolean t2 = false;
        Narrador objepa = new Narrador();
        String sql = "delete from narradores where id_narrador =" + select;
        t2 = objepa.eliminarnarrador(sql);
        return t2;

    }

}
