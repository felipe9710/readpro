/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import java.util.LinkedList;
import modelo.Editorial;//EL METODO ES COMO SE LLAMA EL MODELO


/**
 *
 * @author Home
 */
public class Control_Editorial {
    
    public boolean insertar_Editorial( String nombre_editorial,String telefono_E,String direccion_E,String correo_E,Date Fecha_Creacion_Editorial) {
        
        boolean t = false;
        Editorial objpE = new Editorial();
       
        String sql = "insert into editoriales(nombre_editorial,telefono_E,direccion_E,correo_E,Fecha_Creacion_Editorial) VALUES ('"+nombre_editorial+"','"+telefono_E+"','"+direccion_E+"','"+correo_E+"','"+Fecha_Creacion_Editorial+"')";
        
        t = objpE.insertarEditorial(sql);//Name of Model
        return t;
        
        
    }
     public LinkedList<Editorial> consultarEditoriales() {
        String sql = "Select * from editoriales;";
        Editorial objc = new Editorial();
        LinkedList<Editorial> listpn = objc.buscar_Editorial(sql);

        return listpn;
    }
    public boolean modificarEditorial(String selected, String nombre_editorial,String telefono_E,String direccion_E,String correo_E,Date Fecha_Creacion_Editorial) {

        boolean t1 = false;
        Editorial objmpa = new Editorial();
        String sql = "update editoriales set nombre_editorial = '"+nombre_editorial+"',telefono_E='"+telefono_E+"',direccion_E='"+direccion_E+"',correo_E='"+correo_E+"',Fecha_Creacion_Editorial='"+Fecha_Creacion_Editorial+"' where id_editorial="+selected;
        t1 = objmpa.modificarEditorial(sql);
        return t1;
    }

    public boolean eliminarEditorial(String select) {

        boolean t2 = false;
        Editorial objepa = new Editorial();
        String sql = "delete from editoriales where id_editorial =" + select;
        t2 = objepa.eliminarEditorial(sql);
        return t2;

    }

}