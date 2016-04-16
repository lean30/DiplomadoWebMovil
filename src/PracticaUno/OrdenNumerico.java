/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaUno;

import java.util.Arrays;

/**
 *
 * @author owner
 */
public class OrdenNumerico {

    public static void main(String args[]) {

        int primerNumero = Integer.parseInt(args[0]);
        int segundoNumero = Integer.parseInt(args[1]);
        int tercerNumero = Integer.parseInt(args[2]);
        int numeroMayor = primerNumero;

        int[] numeros = new int[3];
        numeros[0] = primerNumero;
        numeros[1] = segundoNumero;
        numeros[2] = tercerNumero;

        int[] numerosOrganizados = new int[3];

        boolean estaOrdenado = false;

        for (int i = 0; i < 2; i++) {

            if (numeros[i] < numeros[i + 1]) {

                estaOrdenado = true;
            }

        }

        if (estaOrdenado) {

            System.out.println("Las cantidades introducida están en orden numérico");
        } else {
            Arrays.sort(numeros);
            System.out.println("Las cantidades introducida no están en orden numérico");
            System.out.println("El orden correcto es: " + numeros[0] + " " + numeros[1] + " " + numeros[2]);

        }

    }
}
