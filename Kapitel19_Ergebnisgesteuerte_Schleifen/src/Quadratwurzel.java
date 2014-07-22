// Um zu bestimmen, ob das Ergebnis fast korrekt ist, berechnen Sie dessen Quadrat. 
// Wenn alteSchaetzung*alteSchaetzung fast gleich N ist, dann
// 
//N/(alteSchaetzung*alteSchaetzung) == fast 1.0
//
//oder
//
//N/(alteSchaetzung*alteSchaetzung) - 1.0 == fast 0.0
//
//Leider wissen wir nicht, ob "fast 0.0" negativ oder positiv sein wird. 
//Aus diesem Grund müssen wir den absoluten Wert verwenden, um sicher zu 
//gehen, dass er positiv ist. Der absolute Wert einer Zahl ist eine Zahl
//ohne negatives Vorzeichen. In Mathematikbüchern wird der absolute Wert 
//von x mit |x| dargestellt. Also wird die Schleife beendet werden, wenn:
//
//| N/(alteSchaetzung*alteSchaetzung) - 1.0 |  == fast 0.0
//
//Jetzt müssen wir entscheiden, was "fast 0.0" bedeutet. Wenn alle Variablen 
//vom Typ doppelte Genauigkeit sind, dann werden sie eine Genauigkeit von 
//ungefähr 15 Dezimalstellen haben. Um sicher zu gehen, gehen wir davon aus, 
//dass 14 Stellen an Genauigkeit erreicht werden können. "Fast 0" bei 14 Stellen 
//an Genauigkeit bedeutet "weniger als 0.00000000000001" 

import java.util.Scanner;

public class Quadratwurzel {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		final double FASTNULL = 1.0E-14;
		double n;
		double schaetzung = 1.0;
		boolean keineQuadratwurzel;

		do {
			// die Zahl vom Anwender holen
			System.out.println("Geben Sie eine Zahl ein:");
			n = scan.nextDouble();

			keineQuadratwurzel = false;
			if (n >= 0.0) {
				while (Math.abs(n / (schaetzung * schaetzung) - 1.0) > FASTNULL) {
					// einen neuen Wert für schaetzung berechnen
					schaetzung = n / (2 * schaetzung) + schaetzung / 2;
				}
				System.out.println("Die Quadratwurzel von " + n + " ist "
						+ schaetzung);
			} else {
				System.out.println("Bitte geben Sie eine positive Zahl ein!\n");
				keineQuadratwurzel = true;
			}

		} while (keineQuadratwurzel);
	}
}
