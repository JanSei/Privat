/*
 * Hier ist ein vollständiges Programm, das den Anwender den 
 * Anfangs- und den Endwert wählen lässt: 
 */

import java.util.Scanner;

// Anwender wählt den Anfangs- und Endwert
class BeispielSchleife {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int zaehler, limit;

		System.out.println("Geben Sie den Anfangswert ein:");
		zaehler = scan.nextInt();

		System.out.println("Geben Sie den Endwert ein:");
		limit = scan.nextInt();

		while (zaehler <= limit) // kleiner-oder-gleich-Operator
		{
			System.out.println("Zaehler ist:" + zaehler);
			zaehler = zaehler + 1;
		}
		System.out.println("Schleife beendet");
	}
}

/*
 * Der Typ Schleife, den wir betrachtet haben, ist eine Zählschleife, da sie
 * hochzählt, indem sie eine Schleifenkontrollvariable als einen Zähler
 * verwendet. Sie können Zählschleifen mit anderen Anweisungen als der
 * while-Anweisung realisieren, und nicht alle while-Schleifen sind
 * Zählschleifen.
 */