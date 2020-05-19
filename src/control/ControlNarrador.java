/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import modelo.Narrador;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class ControlNarrador {
    
    public boolean insertar_Narrador(String nombre_narrador1, String nombre_narrador2, String apellido_narrador1, String apellido_narrador2, Date fecha_nacimiento_narrador){
        
        boolean t = false;
        Narrador objpE = new Narrador();
       
        String sql = "insert into narradores(nombre_narrador1,nombre_narrador2,apellido_narrador1,apellido_narrador2,fecha_nacimiento_narrador) VALUES ('"+nombre_narrador1+"','"+nombre_narrador2+"','"+apellido_narrador1+"','"+apellido_narrador2+"','"+fecha_nacimiento_narrador+"')";
        
        t = objpE.insertarNarrador(sql);//Name of Model
        return t;
        
        
    }
    public boolean modificarNarrador(String selected, String nombre_narrador1, String nombre_narrador2, String apellido_narrador1, String apellido_narrador2, Date fecha_nacimiento_narrador) {

        boolean t1 = false;
        Narrador objmpa = new Narrador();
        String sql = "update narradores set nombre_narrador1 = '"+nombre_narrador1+"',nombre_narrador2='"+nombre_narrador2+"',apellido_narrador1='"+apellido_narrador1+"',apellido_narrador2='"+apellido_narrador2+"',fecha_nacimiento_narrador='"+fecha_nacimiento_narrador+"' where id_narrador="+selected;
        t1 = objmpa.modificarNarrador(sql);
        return t1;
    }
    public boolean eliminarNarrador(String select) {

        boolean t2 = false;
        Narrador objepa = new Narrador();
        String sql = "delete from narradores where id_narrador =" + select;
        t2 = objepa.eliminarNarrador(sql);
        return t2;

    }
}
