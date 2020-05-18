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
 * @author Home
 */
public class Editorial {
    
    String nombre_editorial;
    String telefono_E;
    String direccion_E;
    String correo_E;
    Date Fecha_Creacion_Editorial;

    public Editorial() {
    }

    public Editorial(String nombre_editorial, String telefono_E, String direccion_E, String correo_E, Date Fecha_Creacion_Editorial) {
        this.nombre_editorial = nombre_editorial;
        this.telefono_E = telefono_E;
        this.direccion_E = direccion_E;
        this.correo_E = correo_E;
        this.Fecha_Creacion_Editorial = Fecha_Creacion_Editorial;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }

    public String getTelefono_E() {
        return telefono_E;
    }

    public void setTelefono_E(String telefono_E) {
        this.telefono_E = telefono_E;
    }

    public String getDireccion_E() {
        return direccion_E;
    }

    public void setDireccion_E(String direccion_E) {
        this.direccion_E = direccion_E;
    }

    public String getCorreo_E() {
        return correo_E;
    }

    public void setCorreo_E(String correo_E) {
        this.correo_E = correo_E;
    }

    public Date getFecha_Creacion_Editorial() {
        return Fecha_Creacion_Editorial;
    }

    public void setFecha_Creacion_Editorial(Date Fecha_Creacion_Editorial) {
        this.Fecha_Creacion_Editorial = Fecha_Creacion_Editorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre_editorial=" + nombre_editorial + ", telefono_E=" + telefono_E + ", direccion_E=" + direccion_E + ", correo_E=" + correo_E + ", Fecha_Creacion_Editorial=" + Fecha_Creacion_Editorial + '}';
    }
   
    public boolean insertarEditorial(String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
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
