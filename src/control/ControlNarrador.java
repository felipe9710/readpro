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
    
    public boolean insertar_Narrador(Narrador objNarrador){
        
        boolean t = false;
       Narrador objpE = new Narrador();
       String sql="";
       sql = "INSERT INTO narradores (nombre_narrador1,nombre_narrado2,apellido_narrado1,apellido_narrado2,fecha_nacimiento_narrador,id_PaisNF) VALUES (?,?,?,?,?,?)";
        t = objpE.insertarNarrador(objNarrador,sql);//Name of Model
        return t;
        
        
    }
        public LinkedList<Narrador> consultarNarrador() {
        LinkedList<Narrador> lpu = new LinkedList<>();
        String sql = "select * from narradores";
        Narrador objpu= new Narrador();
        lpu = objpu.consultarNarrador(sql);
    
        return lpu;
    }
    public boolean modificarNarrador(String selected, String nombre_narrador1, String nombre_narrado2, String apellido_narrado1, String apellido_narrado2, Date fecha_nacimiento_narrador) {

        boolean t1 = false;
        Narrador objmpa = new Narrador();
        String sql = "update narradores set nombre_narrador1 = '"+nombre_narrador1+"',nombre_narrado2='"+nombre_narrado2+"',apellido_narrado1='"+apellido_narrado1+"',apellido_narrado2='"+apellido_narrado2+"',fecha_nacimiento_narrador='"+fecha_nacimiento_narrador+"' where id_narrador="+selected;
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
