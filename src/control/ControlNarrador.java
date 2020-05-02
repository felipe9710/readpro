/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import modelo.Narrador;

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
    
}
