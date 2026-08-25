package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int anio;

        System.out.print("Ingrese un año: ");
        anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto."); //
        }

        scanner.close();
    }
}