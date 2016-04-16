/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaUno;

/**
 *
 * @author owner
 */
public class Bombilla {
    
    private  boolean estado=false;
    public static boolean hayLuz=false;
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean estaEncendida () {
    
        if (estado & hayLuz ){
        return true;
        
        }
        return false;
    }
    
    
}
