package ar.edu.unju.escmi.tp2.ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {

        Integer num1 = 1000;
        Integer num2 = 1000;

        System.out.println("Referencia de num1: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2: " + System.identityHashCode(num2));

        if (num1 == num2) {
            System.out.println("Las referencias son iguales");
        } else {
            System.out.println("Las referencias no son iguales");
        }

        if (num1.equals(num2)) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println("Los valores no son iguales");
        }
    }
}