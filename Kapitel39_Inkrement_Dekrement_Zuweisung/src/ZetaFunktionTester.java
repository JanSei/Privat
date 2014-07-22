import java.util.Scanner;

public class ZetaFunktionTester {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner( System.in );
		ZetaFunktion riemann = new ZetaFunktion();
		double hypothesis;
		
		// anzahl der Terme
		System.out.println("Geben Sie bitte die Anzahl der Terme an: ");
		long anzahl = scan.nextInt();
		
		// die Potenz des Nenners
		System.out.println("Geben Sie bitte die Potenz des Nenners an: ");
		int potenz = scan.nextInt();
		
		hypothesis = riemann.berechneFunktion(anzahl, potenz);
		
		System.out.println("Hypothese: " + hypothesis);
	}

}
