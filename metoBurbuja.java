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
        Scanner entrada = new Scanner(System.in);
    
        int vector [];
        int nElem;
        int aux;
        
        nElem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "
                + "numero de elementos para el vector"));
        
        vector = new int[nElem];
        
        for (int i = 0; i < nElem; i++) {
            System.out.println((i+1)+". Digite un numero");
            vector [i] = entrada.nextInt();
        }
        
        //mostramos el vector como se ingreso
        System.out.println("Vector en el orden ingresado");
        for (int i = 0; i < nElem; i++) {
            System.out.println(vector[i]);
        }
        
        //metodo burbuja
        for (int i = 0; i < (nElem-1); i++) {
            for (int j = 0; j < (nElem-1); j++) {
                if (vector [j] > vector[j+1]) { //si numeroActual > numero siguiente
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        
        //mostramos el arreglo ardenado ascendente
        System.out.println("Vector ordenado ascendente");
        for (int i = 0; i < nElem; i++) {
            System.out.println(vector[i]);
        }
        
        //mostramos arreglo en forma desendente
        System.out.println("Vector ordenado desendente");
        for (int i = (nElem-1); i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
