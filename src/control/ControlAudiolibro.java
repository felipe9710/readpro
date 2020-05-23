/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Blob;
import java.sql.Date;
import java.util.LinkedList;
import modelo.Audiolibro;

/**
 *
 * @author usuario
 */
public class ControlAudiolibro {
    
    public boolean insertar_Audiolibro( Audiolibro objAL){
        
        boolean t = false;
        Audiolibro objpE = new Audiolibro();
       
        String sql = "insert into audiolibros(titulo, fecha_creacion,num_paginas, duracion_total, portada, contraportada,calificacion, sipnosis, numCapitulos, idioma, reproducciones, id_narradorAF, id_editorialAF,id_categoriaAF) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        t = objpE.insertarAudiolibro(objAL,sql);//Name of Model
        return t;
        
        
    }
    
        public LinkedList<Audiolibro> consultarAudioLibro() {

        String sql = "Select * from audiolibros;";
        Audiolibro objcu = new Audiolibro();
        LinkedList<Audiolibro> listau = objcu.consultarAudioLibro(sql);

        return listau;

    }

    public boolean modificarAudioLibro(String select, String titulo, Date fecha_creacion, int num_paginas, int duracion_total, Blob portada, Blob contraportada, String calificacion, String sipnosis, String numCapitulos, String idioma, int reproducciones, int id_narradorAF, int id_editorialAF, int id_categoriaAF) {

        boolean t1 = false;
        Audiolibro objmpa = new Audiolibro();
        String sql = "update audiolibros set titulo = '" + titulo + "',fecha_creacion = '"+fecha_creacion+ "',num_paginas = '"+num_paginas+ "',duracion_total = '"+duracion_total+ "',portada = '"+portada+ "',contraportada = '"+contraportada+ "',calificacion = '"+calificacion+ "',sipnosis = '"+sipnosis+"',numCapitulos = '"+numCapitulos+"',idioma = '"+idioma+"',reproducciones = '"+ reproducciones +"',id_narradorAF = '"+ id_narradorAF +"',id_editorialAF = '"+ id_editorialAF +"',id_categoriaAF = '"+ id_categoriaAF +"'where id_audiolibro =" + select;
        t1 = objmpa.modificarAudioLibro(sql);
        return t1;

    }

    public boolean eliminarAudioLibro(String selected) {
        
        boolean t2 = false;
        Audiolibro objepa = new Audiolibro();
        String sql = "delete from audiolibros where id_audiolibro =" + selected;
        t2 = objepa.eliminarAudioLibro(sql);
        return t2;
        
    }
    
    
    
    
}
