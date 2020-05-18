/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
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
    
}