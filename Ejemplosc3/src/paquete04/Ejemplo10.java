/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //int[][] arreglo1 = {{-10, 41, 40}, {1, -2, -3}, {6, 8, -9}};
        int[][] arreglo1 = new int[3][3];
        /*
        -10      41      40
        1       -2       -3
        6       8       -9
        */
        int valor;
        
        System.out.println("Ingreso de datos del arreglo");
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1.length; col++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        fila, col);
                valor = entrada.nextInt();
                arreglo1[fila][col] = valor;
            }
        }
        System.out.println("");
                    }
}
