/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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

}
