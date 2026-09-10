package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    

public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero para la posicion " + i + ":");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice [" + i + "] = " + numeros[i]);
        }
        scanner.close();
    }
}