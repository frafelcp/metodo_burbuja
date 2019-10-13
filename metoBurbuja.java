/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodBurbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * Metodo de ordenamiento por burbuja
 * Si el numero actual > numero siguiente
 */

/**
 *
 * @Felix Castro
 */
public class metoBurbuja {
    public static void main(String[] args) {
    //ingresa datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        //definicion de variables
        int vector[];
        int x;
        int nElem;
        
        //ingresamos tamaño de vector por pop up
        System.out.println("Ingrese el numero elementos para el vector");        
        nElem=entrada.nextInt();
        
        //vector
        vector=new int[nElem];
        
        //llenado de vector
        for (int i = 0; i < nElem; i++) {
            System.out.println("Ingrese el numero "+ (i+1));
            vector[i]=entrada.nextInt();
        }
        
        //vector en el orden ingresado
        System.out.println("Vector en el orden ingresado");
        for (int i = 0; i < nElem; i++) {
            System.out.println(vector[i]);
        }
        
        //contador
        x=nElem-2;
        
        //metodo burbuja
        for (int i = 0; i < nElem; i++) {
            for (int j = 0; j < x; j++) {
                if (vector[j]>vector[j+1]) {
                    int aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
            
            //contador
            x=nElem-1;
        }
        
        //mostrar vector ordenado en forma ascendente
        System.out.println("Vector ordenado en forma ascendente");
        for (int i = 0; i < nElem; i++) {
            System.out.println(vector[i]);
        }
        
        //mostrar vector ordenado en forma descendente
        System.out.println("Vector ordenado en forma descendente");
        for (int i = (nElem-1); i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
