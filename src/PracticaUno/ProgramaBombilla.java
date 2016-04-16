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
public class ProgramaBombilla {
    
    public static void main (String arg[]){
    
    Bombilla bombilla1 = new Bombilla();
    Bombilla bombilla2 = new Bombilla();
    Bombilla bombilla3 = new Bombilla();
    
    Bombilla.hayLuz=true;
    
    bombilla1.setEstado(true);
    
        System.out.println("Bombilla 1 esta "+bombilla1.estaEncendida());
        System.out.println("Bombilla 2 esta "+bombilla2.estaEncendida());
    
    }
    
}
