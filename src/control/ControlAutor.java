/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import java.util.LinkedList;
import modelo.Autor;
import modelo.Autores_Libros;

/**
 *
 * @author usuario
 */
public class ControlAutor {
    
    public boolean insertar_Autor(String nombre_autor1, String nombre_autor2, String apellido_autor1, String apellido_autor2, Date fecha_nacimiento_Autor){
        
        boolean t = false;
        Autor objpE = new Autor();
       
        String sql = "insert into autores(nombre_autor1,nombre_autor2,apellido_autor1,apellido_autor2,fecha_nacimiento_Autor) VALUES ('"+nombre_autor1+"','"+nombre_autor2+"','"+apellido_autor1+"','"+apellido_autor2+"','"+fecha_nacimiento_Autor+"')";
        
        t = objpE.insertarAutor(sql);//Name of Model
        return t;
        
        
    }

    public LinkedList<Autor> consultarAutores() {
        
        LinkedList<Autor> listaA = new LinkedList<>();
        Autor obja= new Autor();
        String sql = "select * from Autores";
        listaA = obja.consultarAutores(sql);
        
        return listaA;
        
    }

}