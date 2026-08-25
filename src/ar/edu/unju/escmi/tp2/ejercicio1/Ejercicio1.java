package ar.edu.unju.escmi.tp2.ejercicio1;
import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dni = 48277388;
		char ejemplarDni = 'B' ;
		short edad = 56;
		String nombreCompleto = "Manuel Belgrano";
		short numeroDeBingo = 12;
		int precioCelular = 850000;
		double altura = 1.77;
		float pesoNala = 7.350f;
		LocalDate fechaInicioCuatrimestre = LocalDate.of(2026, 07, 29);
		LocalDate fechaFinCuatrimestre = LocalDate.of(2026, 11, 29);
		
		
		System.out.println("el valor de la variable dni es: " + dni);
		System.out.println("su ejemplar es: " + ejemplarDni);
		System.out.println("la edad de mi madre es: " + edad);
		System.out.println("uno de nuestros proceres mas grandes es: " + nombreCompleto);
		System.out.println("el nro de bingo es: " + numeroDeBingo);
		System.out.println("mi altura es: " + altura);
		System.out.println("el peso de mi mascota es: " + pesoNala);
		System.out.println("el cuatrimestre arranca el " + fechaInicioCuatrimestre);
		System.out.println("el cuatrimestra termina el " + fechaFinCuatrimestre);
	
	}

}
