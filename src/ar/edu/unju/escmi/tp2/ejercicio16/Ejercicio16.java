package ar.edu.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanio;

        do {
            System.out.print("Ingrese un numero entre 5 y 10: ");
            tamanio = scanner.nextInt();
        } while (tamanio < 5 || tamanio > 10);

        scanner.nextLine();

        String[] nombres = new String[tamanio];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre para la posicion " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("\nNombres desde el primer indice:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posicion " + i + ": " + nombres[i]);
        }

        System.out.println("\nNombres desde la ultima posicion:");

        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posicion " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}