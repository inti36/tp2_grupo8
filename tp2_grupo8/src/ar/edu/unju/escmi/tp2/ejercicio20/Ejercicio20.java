package ar.edu.unju.escmi.tp2.ejercicio20;

public class Ejercicio20 {

	public static void main(String[] args){
		String textoOriginal="Hoja";
		String textoModificado=textoOriginal.replace("ja", "la");

		System.out.println("Texto original: "+textoOriginal);
		System.out.println("Texto modificado: "+textoModificado);

		// El valor de textoOriginal no cambia porque los String en Java son inmutables:
		// una vez creado un String, su contenido no se puede modificar. El metodo replace()
		// no altera el objeto original, sino que crea y devuelve un objeto String nuevo con
		// el reemplazo aplicado. Por eso hay que guardar ese resultado en otra variable
		// (textoModificado), mientras que textoOriginal sigue apuntando al mismo texto de siempre.
	}

}