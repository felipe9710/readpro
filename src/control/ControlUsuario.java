/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Pais_Usuario;
import modelo.Usuario;

/**
 *
 * @author felipe
 */
public class ControlUsuario {

    public boolean insertarUsuario(Usuario objUsuario) {

        boolean t = false;
        Usuario obju2 = new Usuario();
        String sql = "";
        sql = "INSERT INTO usuarios (nombre1,nombre2,apellido1,apellido2,genero,nombre_usuario,correo_usuario,contraseña_usuario,fecha_nacimiento,fecha_incripcion,id_PaisUF) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        t = obju2.insertarUsuario(objUsuario, sql);
        return t;

    }

    public LinkedList<Usuario> consultarUsuario() {

        String sql = "Select * from usuarios;";
        Usuario objcu = new Usuario();
        LinkedList<Usuario> listau = objcu.consultarUsuario(sql);

        return listau;

    }

    public boolean modificarUsuario(String select, String nombre1, String nombre2, String apellido, String apellido2, String genero, String nombre_usuario, String correo, String contraseña, String fecha_nac, String fecha_insc, int idpais) {

        boolean t1 = false;
        Usuario objmpa = new Usuario();
        String sql = "update usuarios set nombre1 = '" + nombre1 + "',nombre2 = '"+nombre2+ "',apellido1 = '"+apellido+ "',apellido2 = '"+apellido2+ "',genero = '"+genero+ "',nombre_usuario = '"+nombre_usuario+ "',correo_usuario = '"+correo+ "',contraseña_usuario = '"+contraseña+"',fecha_nacimiento = '"+fecha_nac+"',fecha_incripcion = '"+fecha_insc+"',id_PaisUF = '"+ idpais +"'where id_usuario =" + select;
        t1 = objmpa.modificarUsuario(sql);
        return t1;

    }

    public boolean eliminarPais_narrador(String selected) {
        
        boolean t2 = false;
        Usuario objepa = new Usuario();
        String sql = "delete from usuarios where id_usuario =" + selected;
        t2 = objepa.eliminarUsuario(sql);
        return t2;
        
    }

}
