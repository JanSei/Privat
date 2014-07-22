package Programmieraufgaben;
//Schreiben Sie ein Programm, das die gefahrenen Meilen pro Gallone 
//für eine Reihe von Autos berechnet. Die Daten für jedes Auto bestehen 
//aus dem Anfangs- und Endstand in Meilen und der Anzahl der Gallonen. 
//Das Programm wird beendet, sobald der Anwender eine negative Zahl als 
//Anfangsstand eingibt. 

import java.util.Scanner;

public class MeilenProGallone {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int anfangsstand = 0, endstand = 0; // Stand der Meilen
		int gallonen = 0; // Anzahl der Gallonen
		double ergebnis;

		// Name des Programms
		System.out.println("Programm Meilen pro Gallone");

		// Solange ausgefuehrt bis eine negative Zahl
		// entweder bei anfangs- oder endstand eingegeben wird
		while (anfangsstand >= 0 && endstand >= 0 && gallonen >= 0) {

			// Eingabe des Anfangsstand (in Meilen)
			System.out.println("Anfangsstand Meilen:");
			anfangsstand = scan.nextInt();
			if (anfangsstand < 0) {
				System.out
						.println("\nNegative Zahlen?! Wirklich?? Hasta la vista!");
				System.exit(1);
			}

			// Eingabe des Endstands (in Meilen)
			System.out.println("Endstand Meilen:");
			endstand = scan.nextInt();
			if (endstand < 0) {
				System.out
						.println("\nNegative Zahlen?! Wirklich?? Hasta la vista!");
				System.exit(1);
			}

			// Abfrage der Anzahl der Gallonen
			System.out.println("Gallonen:");
			gallonen = scan.nextInt();
			if (gallonen < 0) {
				System.out
						.println("\nNegative Zahlen?! Wirklich?? Hasta la vista!");
				System.exit(1);
			}

			if (anfangsstand >= 0 && endstand >= 0 && gallonen >= 0) {
				// Meilen pro Gallone
				ergebnis = meilenProGallone(anfangsstand, endstand, gallonen);
				System.out.print("Meilen pro Gallone: " + ergebnis + "\n\n");
			} else
				System.out
						.println("\nNegative Zahlen?! Wirklich?? Hasta la vista!");
		}
	}

	// Methode für die Berechnung der Meilen pro Gallone
	public static double meilenProGallone(int x, int y, double z) {
		return ((y - x) / z);
	}
}
