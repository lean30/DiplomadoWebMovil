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
public class ProgramaMiClase {
    
      public static void main (String arg[]){
          
          Mi_Clase mc = new Mi_Clase ();
          
          System.out.println("MiClse"+Mi_Clase.miClase);
          mc.setValorClase(5);
          System.out.println("valoclase"+mc.getValorClase());
          
          
          Mi_Clase mc2 = new Mi_Clase ();
          
          System.out.println("MiClse"+Mi_Clase.miClase);
          mc2.setValorClase(10); 
          System.out.println("valoclase"+mc2.getValorClase());
      }
}
