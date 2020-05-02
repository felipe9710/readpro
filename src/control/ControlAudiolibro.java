/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import modelo.Audiolibro;

/**
 *
 * @author usuario
 */
public class ControlAudiolibro {
    
    public boolean insertar_Audiolibro(String titulo, Date fecha_creacion, int num_paginas, int duracion, String sinopsis, String numCapitulos, String idioma){
        
        boolean t = false;
        Audiolibro objpE = new Audiolibro();
       
        String sql = "insert into audiolibros(titulo, fecha_creacion, num_paginas, duracion, sinopsis, numCapitulos, idioma) VALUES ('"+titulo+"','"+fecha_creacion+"','"+num_paginas+"','"+duracion+"','"+sinopsis+"','"+numCapitulos+"','"+idioma+"')";
        
        t = objpE.insertarAudiolibro(sql);//Name of Model
        return t;
        
        
    }
    
}
