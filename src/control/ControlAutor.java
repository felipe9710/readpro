/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import modelo.Autor;

import java.util.LinkedList;
import modelo.Pais_autor;

/**
 *
 * @author usuario
 */
public class ControlAutor {
    
    public boolean insertar_Autor(Autor objAutor){
        
        boolean t = false;
        Autor objpE = new Autor();
       String sql="";
       sql = "INSERT INTO autores (nombre_autor1,nombre_autor2,apellido_autor1,apellido_autor2,fecha_nacimiento_Autor,id_PaisAF) VALUES (?,?,?,?,?,?)";
        t = objpE.insertarAutor(objAutor,sql);//Name of Model
        return t;
        
        
    }
    public LinkedList<Autor> consultarAutor() {
        LinkedList<Autor> lpu = new LinkedList<>();
        String sql = "select * from autores";
        Autor objpu= new Autor();
        lpu = objpu.consultarAutores(sql);
    
        return lpu;
    }
 public boolean modificarAutor(String selected,String nombre_autor1, String nombre_autor2, String apellido_autor1, String apellido_autor2, Date fecha_nacimiento_Autor,int idpais) {

        boolean t1 = false;
        Autor objmpa = new Autor();
        String sql = "update autores set nombre_autor1 = '"+nombre_autor1+"',nombre_autor2='"+nombre_autor2+"',apellido_autor1='"+apellido_autor1+"',apellido_autor2='"+apellido_autor2+"',fecha_nacimiento_Autor='"+fecha_nacimiento_Autor+"',id_PaisAF='"+idpais+"' where id_autor="+selected;
        t1 = objmpa.modificarAutor(sql);
        return t1;
    }

    public boolean eliminarAutor(String select) {

        boolean t2 = false;
        Autor objepa = new Autor();
        String sql = "delete from autores where id_autor =" + select;
        t2 = objepa.eliminarAutor(sql);
        return t2;

    }

}
