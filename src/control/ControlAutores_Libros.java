/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.LinkedList;
import modelo.Autor;
import modelo.Autores_Libros;/**
 *
 * @author Home
 */
public class ControlAutores_Libros {

    public boolean insertarAutores_Libros(int id_autorAF,int id_audiolibroAF) {
        boolean t = false;
        Autores_Libros objpU = new Autores_Libros();

        String sql = "insert into autores_libros(id_autorAF,id_audiolibroAF) value ('" + id_autorAF + "','"+id_audiolibroAF+"')";

        t = objpU.insertarAutores_Libros(sql);

        return t;
    }

    public LinkedList<Autores_Libros> consultarAutores_Libros() {
        LinkedList<Autores_Libros> lpu = new LinkedList<>();
        String sql = "select * from autores";
        Autores_Libros objpu= new Autores_Libros();
        lpu = objpu.consultarAutor(sql);
    
        return lpu;
    }

}
