/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class Audiolibro {
    
    String titulo;
    Date fecha_creacion;
    int num_paginas;
    int duracion;
    String sinopsis;
    String numCapitulos;
    String idioma;

    public Audiolibro(String titulo, Date fecha_creacion, int num_paginas, int duracion, String sinopsis, String numCapitulos, String idioma) {
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.num_paginas = num_paginas;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.numCapitulos = numCapitulos;
        this.idioma = idioma;
    }

    public Audiolibro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(String numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
        @Override
    public String toString() {
        return "Audiolibro{" + "titulo=" + titulo + ", fecha_creacion=" + fecha_creacion + ", num_paginas=" + num_paginas + ", duracion=" + duracion + 
                ", sinopsis=" + numCapitulos + ", numCapitulos=" + sinopsis + ", idioma=" + idioma +'}';
    }
    
        public boolean insertarAudiolibro(String sql){
        
        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        
        if (objCon.crearConexion()){
            
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }
        return t;
    }
}
