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
public class Circulo {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
   
 public void calcularArea(){
 
     double area = 2*3.1614*radio*radio;
     System.out.println("El Area del Circulo es: "+area);
 }
 
 public void calcularPerimetro (){
 
     double perimetro = 2*3.1614*radio;
     System.out.println("El perimetro del Circulo es: "+perimetro);
     
 }
 }
    
