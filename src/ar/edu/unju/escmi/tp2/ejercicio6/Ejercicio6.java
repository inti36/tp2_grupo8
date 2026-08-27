package ar.edu.unju.escmi.tp2.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        byte radio = scanner.nextByte();
        
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
        
        scanner.close();
	}

}
