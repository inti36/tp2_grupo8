package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {

	public static void main(String[] args){
		String texto1="Hola";
		String texto2="Hola";
		String texto3=new String("Hola");

		System.out.println("Comparacion texto1 == texto2: "+(texto1==texto2));
		System.out.println("Comparacion texto1.equals(texto2): "+texto1.equals(texto2));

		System.out.println("Comparacion texto1 == texto3: "+(texto1==texto3));
		System.out.println("Comparacion texto1.equals(texto3): "+texto1.equals(texto3));

		// texto1 == texto2 da true porque al crear Strings con texto literal (sin new),
		// Java los guarda en el pool de Strings y reutiliza el mismo objeto en memoria
		// si el texto es identico. Como texto1 y texto2 apuntan al mismo objeto, == da true.

		// texto1 == texto3 da false porque texto3 se creo con new String("Hola"), y eso
		// obliga a Java a crear un objeto nuevo y separado en memoria, aunque el contenido
		// sea igual. Al estar en direcciones de memoria distintas, == da false.

		// equals() no compara direcciones de memoria como ==, compara el contenido real
		// caracter por caracter. Por eso tanto texto1.equals(texto2) como texto1.equals(texto3)
		// dan true, ya que en los tres casos el texto es "Hola".
	}

}