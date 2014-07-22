package Programmieraufgaben;

//Schreiben Sie ein Programm, dass ein Ratespiel implementiert. 
//Dies ist ein "klassisches" Programm, das häufig in den 
//Anfangsklassen der Informatik gestellt wird.
//
//Das Programm ermittelt eine Zufallszahl zwischen 1 und 10. 
//Der Anwender bekommt jetzt 3 Versuche die Zahl zu erraten. 
//Sobald der Anwender die richtige Zahl eingibt, gibt das Programm 
//eine Gewinnmeldung aus und endet. Wenn der Anwender nach 3 Versuchen 
//die richtige Zahl nicht erraten hat, gibt das Programm eine entsprechende 
//Meldung aus und endet. 
//
//Verwenden Sie die Methoden der Klasse Random.

import java.util.Scanner;
import java.util.Random;

public class Ratespiel {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		Random rand = new Random();
		int zufallszahl, versuchszahl;
		int versuch = 1;
		String antwort = "";
		boolean gewonnen = false;

		System.out.println("Ich denke an eine Zahl von 1 bis 10.");
		zufallszahl = rand.nextInt(10) + 1;		// Zufallszahl wird erzeugt
		antwort = antwort + zufallszahl;		// Zufallszahl an String 'antwort' verknüpft
		System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
		System.out.println("Raten Sie!");

		// Das eigentliche Raten beginnt
		while (!gewonnen & versuch <= 3) {

			System.out.println("Versuch: " + versuch);
			versuchszahl = scan.nextInt();		 // Erraten
			String errateneZahl = "" + versuchszahl; // erratene Zahl an String angeklebt

			if (versuchszahl < 1 || versuchszahl > 10) {
				System.out
						.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein! \n");
			} else {
				// errateneZahl wird mit Zufallszahl verglichen
				if (!(errateneZahl.equals(antwort))) {
					System.out.println("Falsch");
					versuch++;
				} else {
					gewonnen = true;
				}
			}
		}
		if (gewonnen == false) {

			System.out.println("Die richtige Zahl war " + antwort);
			System.out.println("Sie haben das Spiel verloren.");
		} else {

			System.out.println("RICHTIG!");
			System.out.println("Sie haben das Spiel gewonnen.");
		}

	}

}
