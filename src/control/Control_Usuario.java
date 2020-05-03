/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import modelo.Editorial;
import modelo.Usuarios;

/**
 *
 * @author Home
 */
public class Control_Usuario {
    
    public boolean insertar_Usuario(String nombre1, String nombre2, String apellido1, String apellido2, String genero, String nombre_usuario, String correo_usuario, String contraseña_usuario, String fecha_nacimiento, String fecha_incripcion, int id_PaisUF) {
        
        boolean t = false;
        Usuarios objpE = new Usuarios();
       
        String sql = "insert into editoriales(nombre1,nombre2,apellido1,apellido2,genero,nombre_usuario,correo_usuario,contraseña_usuario,fecha_nacimiento,fecha_incripcion,id_PaisUF) VALUES ('"+nombre1+"','"+nombre2+"','"+apellido1+"','"+apellido2+"','"+genero+"','"+nombre_usuario+"','"+correo_usuario+"','"+contraseña_usuario+"','"+fecha_nacimiento+"','"+fecha_incripcion+"','"+id_PaisUF+"',)";
        
        t = objpE.insertar_Usuario(sql);//Name of Model
        return t;
        
        
    }
    
}