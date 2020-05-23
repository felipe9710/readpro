/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.mysql.cj.MysqlType.LONGBLOB;
import control.BaseDatos;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Audiolibro {
    
    private int id_audiolibro;
    private String titulo;
    private Date fecha_creacion;
    private int num_paginas;
    private int duracion_total;
    private String portada;
    private String contraportada;
    private String calificacion;
    private String sipnosis;
    private String numCapitulos;
    private String idioma;
    private int reproducciones;
    
    private int id_narradorAF;
    private int id_editorialAF;
    private int id_categoriaAF;

    public Audiolibro() {
    }

    public Audiolibro(int id_audiolibro, String titulo, Date fecha_creacion, int num_paginas, int duracion_total, String portada, String contraportada, String calificacion, String sipnosis, String numCapitulos, String idioma, int reproducciones, int id_narradorAF, int id_editorialAF, int id_categoriaAF) {
        this.id_audiolibro = id_audiolibro;
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.num_paginas = num_paginas;
        this.duracion_total = duracion_total;
        this.portada = portada;
        this.contraportada = contraportada;
        this.calificacion = calificacion;
        this.sipnosis = sipnosis;
        this.numCapitulos = numCapitulos;
        this.idioma = idioma;
        this.reproducciones = reproducciones;
        this.id_narradorAF = id_narradorAF;
        this.id_editorialAF = id_editorialAF;
        this.id_categoriaAF = id_categoriaAF;
    }

    public Audiolibro(String titulo, Date fecha_creacion, int num_paginas, int duracion_total, String portada, String contraportada, String calificacion, String sipnosis, String numCapitulos, String idioma, int reproducciones, int id_narradorAF, int id_editorialAF, int id_categoriaAF) {
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.num_paginas = num_paginas;
        this.duracion_total = duracion_total;
        this.portada = portada;
        this.contraportada = contraportada;
        this.calificacion = calificacion;
        this.sipnosis = sipnosis;
        this.numCapitulos = numCapitulos;
        this.idioma = idioma;
        this.reproducciones = reproducciones;
        this.id_narradorAF = id_narradorAF;
        this.id_editorialAF = id_editorialAF;
        this.id_categoriaAF = id_categoriaAF;
    }

    public int getId_audiolibro() {
        return id_audiolibro;
    }

    public void setId_audiolibro(int id_audiolibro) {
        this.id_audiolibro = id_audiolibro;
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

    public int getDuracion_total() {
        return duracion_total;
    }

    public void setDuracion_total(int duracion_total) {
        this.duracion_total = duracion_total;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getContraportada() {
        return contraportada;
    }

    public void setContraportada(String contraportada) {
        this.contraportada = contraportada;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
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

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getId_narradorAF() {
        return id_narradorAF;
    }

    public void setId_narradorAF(int id_narradorAF) {
        this.id_narradorAF = id_narradorAF;
    }

    public int getId_editorialAF() {
        return id_editorialAF;
    }

    public void setId_editorialAF(int id_editorialAF) {
        this.id_editorialAF = id_editorialAF;
    }

    public int getId_categoriaAF() {
        return id_categoriaAF;
    }

    public void setId_categoriaAF(int id_categoriaAF) {
        this.id_categoriaAF = id_categoriaAF;
    }

    @Override
    public String toString() {
        return "Audiolibro{" + "id_audiolibro=" + id_audiolibro + ", titulo=" + titulo + ", fecha_creacion=" + fecha_creacion + ", num_paginas=" + num_paginas + ", duracion_total=" + duracion_total + ", portada=" + portada + ", contraportada=" + contraportada + ", calificacion=" + calificacion + ", sipnosis=" + sipnosis + ", numCapitulos=" + numCapitulos + ", idioma=" + idioma + ", reproducciones=" + reproducciones + ", id_narradorAF=" + id_narradorAF + ", id_editorialAF=" + id_editorialAF + ", id_categoriaAF=" + id_categoriaAF + '}';
    }
    
    
    
    
        public boolean insertarAudiolibro(Audiolibro objAL,String sql){
        
     boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                
                ps.setString(1, objAL.getTitulo());
                ps.setDate(2, objAL.getFecha_creacion());
                ps.setInt(3, objAL.getNum_paginas());
                ps.setInt(4, objAL.getDuracion_total());
                ps.setString(5, objAL.getPortada());
                ps.setString(6, objAL.getContraportada());
                ps.setString(7, objAL.getCalificacion());
                ps.setString(8, objAL.getSipnosis());
                ps.setString(9, objAL.getNumCapitulos());
                ps.setString(10, objAL.getIdioma());
                ps.setInt(11, objAL.getReproducciones());
                
                ps.setInt(12, objAL.getId_narradorAF());
                ps.setInt(13, objAL.getId_editorialAF());
                ps.setInt(14, objAL.getId_categoriaAF());
                

                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;

    }
        
       public LinkedList<Audiolibro> consultarAudioLibro(String sql) {

        ResultSet rs = null;
        LinkedList<Audiolibro> lu = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();
        
     String id_audiolibro;
     String titulo="";
     Date fecha_creacion;
     String num_paginas="";
     String duracion_total="";
     String portada;
     String contraportada;
     String calificacion="";
     String sipnosis="";
     String numCapitulos="";
     String idioma="";
     String reproducciones;
    
    String id_narradorAF="";
    String id_editorialAF="";
    String id_categoriaAF="";

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    
                         id_audiolibro=rs.getString("id_audiolibro");
                         titulo=rs.getString("titulo");
                         fecha_creacion=rs.getDate("fecha_creacion");
                         num_paginas=rs.getString("num_paginas");
                         duracion_total=rs.getString("duracion_total");
                         portada=rs.getString("portada");
                         contraportada=rs.getString("contraportada");
                         calificacion=rs.getString("calificacion");
                         sipnosis=rs.getString("sipnosis");
                         numCapitulos=rs.getString("numCapitulos");
                         idioma=rs.getString("idioma");
                         reproducciones=rs.getString("reproducciones");
    
                         id_narradorAF=rs.getString("id_narradorAF");
                         
                         id_editorialAF=rs.getString("id_editorialAF");
                         id_categoriaAF=rs.getString("id_categoriaAF");
                    
 

                    lu.add(new Audiolibro(Integer.parseInt(id_audiolibro), titulo, fecha_creacion,Integer.parseInt( num_paginas),Integer.parseInt( duracion_total), portada, contraportada, calificacion, sipnosis, numCapitulos, idioma,Integer.parseInt(reproducciones), Integer.parseInt(id_narradorAF), Integer.parseInt(id_editorialAF),Integer.parseInt(id_categoriaAF)));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lu;

    }

    public boolean modificarAudioLibro(String sql) {

        boolean t1 = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {

            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t1 = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t1 = false;
            }
        }
        return t1;

    }

    public boolean eliminarAudioLibro(String sql) {

        boolean t2 = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {

            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t2 = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t2 = false;
            }
        }
        return t2;

    }
        
}
