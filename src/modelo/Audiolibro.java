/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.mysql.cj.MysqlType.LONGBLOB;
import control.BaseDatos;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class Audiolibro {
    
    private int id_audiolibro;
    private String titulo;
    private Date titulo2;
    private int titulo3;
    private int titulo4;
    private LONGBLOB titulo5;
    private String titulo6;
    private String titulo7;
    private String titulo8;
    private String titulo9;
    
    
    
    
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
