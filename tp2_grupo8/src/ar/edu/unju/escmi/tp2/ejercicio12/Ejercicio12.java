package ar.edu.unju.escmi.tp2.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;

for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la edad " + i + ":");
            edad = scanner.nextInt();

if (edad >= 1 && edad <= 12) 
    
    {
                System.out.println("Es un niño");
            } else if (edad >= 13 && edad <= 20) {
                System.out.println("Es un joven");
            } else if (edad >= 21 && edad <= 100) {
                System.out.println("Es un adulto");
            } else {
                System.out.println("Edad no permitida");
            }
        }
        scanner.close();
    }
}