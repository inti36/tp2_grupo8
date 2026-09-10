package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 3;
		int c = -5;

		int resultA = a + b + c;
		int resultB = 2 * b + 3 * (a - c);
		double resultC = (double) a / b;
		int resultD = a % b;
		double resultE = (double) a / c;
		int resultF = a % c;
		double resultG = (double) (a * b) / c;
		double resultH = a * ((double) b / c);
		int resultI = (a * c) % b;
		int resultJ = a * (c % b);
		int resultK = (3 * a - 2 * b) % (2 * a - c);
		double resultL = (2 * ((double) a / 5 + (4 - b * 3))) % (a + c - 2);
		double resultM = (double) ((a - 3 * b) % (c + 2 * a)) / (a - c);
		int resultN = a - b - c * 2;

		System.out.println("a) " + resultA);
		System.out.println("b) " + resultB);
		System.out.println("c) " + resultC);
		System.out.println("d) " + resultD);
		System.out.println("e) " + resultE);
		System.out.println("f) " + resultF);
		System.out.println("g) " + resultG);
		System.out.println("h) " + resultH);
		System.out.println("i) " + resultI);
		System.out.println("j) " + resultJ);
		System.out.println("k) " + resultK);
		System.out.println("l) " + resultL);
		System.out.println("m) " + resultM);
		System.out.println("n) " + resultN);
	}

}
