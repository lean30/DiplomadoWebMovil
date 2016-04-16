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
public class Edificio {
    
    
    private String nombre;
    private int cantideDePisos;
    private int numeroDePuerta;

    public Edificio(String nombre, int cantideDePisos, int numeroDePuerta) {
        this.nombre = nombre;
        this.cantideDePisos = cantideDePisos;
        this.numeroDePuerta = numeroDePuerta;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantideDePisos() {
        return cantideDePisos;
    }

    public void setCantideDePisos(int cantideDePisos) {
        this.cantideDePisos = cantideDePisos;
    }

    public int getNumeroDePuerta() {
        return numeroDePuerta;
    }

    public void setNumeroDePuerta(int numeroDePuerta) {
        this.numeroDePuerta = numeroDePuerta;
    }
    
    public void imprimirNombre() {
    
    
        System.out.println("El nombre es: "+nombre+ "El numero es "+numeroDePuerta +"y la cantidad de pisos son " +cantideDePisos);  
    
    }
    
    
}
