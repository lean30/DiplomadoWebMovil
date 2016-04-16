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
public class ControladorEmisora {
    
  private float  frecuencia=80;

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }
  
  
    public void up() {

        frecuencia = (float) (frecuencia + 0.5);
        if (frecuencia > 108) {

            frecuencia = 80;

        }
    }

    public void down() {

        frecuencia = (float) (frecuencia - 0.5);
        if (frecuencia < 80) {

            frecuencia = 108;

        }
   
  }
    public void imprimirFrecuencia() {

        System.out.println("La frecuencia es " + frecuencia);

    }
  }
  
    


