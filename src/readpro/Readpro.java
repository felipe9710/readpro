/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readpro;

import control.BaseDatos;

/**
 *
 * @author felipe
 */
public class Readpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseDatos objb= new BaseDatos();
        boolean t = objb.crearConexion();
        
        if(t==true){
            
            System.out.println("conexion exitosa");
        }else{
        
        System.out.println("conexion no exitosa");
    }
        
    }
    
}
