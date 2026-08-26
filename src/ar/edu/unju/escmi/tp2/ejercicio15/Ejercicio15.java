package ar.edu.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanio;

        do {
            System.out.print("Ingrese un numero entre 3 y 10: ");
            tamanio = scanner.nextInt();
        } while (tamanio < 3 || tamanio > 10);

        int[] numeros = new int[tamanio];

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero para la posicion " + i + ": ");
            numeros[i] = scanner.nextInt();

            suma = suma + numeros[i];
        }

        System.out.println("\nValores del array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }

        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();
    }
}