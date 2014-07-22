package programmieraufgaben;

import java.util.Scanner;

/*
 * Aufgabe 2 — Neue Konstruktoren für die Vorratskammer-Klasse

 Fügen Sie der Vorratskammer-Klasse neue Konstruktoren hinzu: einen Konstruktor, 
 der einen Marmelade-Parameter übernimmt und einen weiteren, der zwei Marmelade-Parameter 
 übernimmt. Nicht verwendete Instanzvariablen des Vorratskammer-Objekts werden auf null 
 gesetzt.

 Modifizieren Sie jetzt die Methoden der Klasse, so dass sie mit null in den 
 Instanzvariablen umgehen können: ausgeben() überprüft auf null bevor die Marmeladen 
 ausgegeben werden. auswaehlen() wird einen Rückgabetyp boolean haben. Geben Sie true 
 zurück, wenn die Auswahl verfügbar ist, ansonsten false. 

 Wenn das Programm läuft, gibt es ungefähr folgendes aus:

 Willkommen zu Mutter Hubbards Vorratskammer!

 Die Vorratskammer enthaelt:
 1: Stachelbeermarmelade 04.07.09 12 Unzen.
 2: Erdbeermarmelade 30.09.10 8 Unzen.

 Treffen Sie Ihre Auswahl (1 oder 2). Exit -1:
 1
 Geben Sie die Menge ein, die aufgetragen werden soll:
 5
 Auftragen von 5 Unzen Stachelbeermarmelade

 Die Vorratskammer enthaelt:
 1: Stachelbeermarmelade 04.07.09 7 Unzen.
 2: Erdbeermarmelade 30.09.10 8 Unzen.

 Treffen Sie Ihre Auswahl (1 oder 2). Exit -1:
 3
 Ungueltige Auswahl

 Treffen Sie Ihre Auswahl (1 oder 2). Exit -1:

 Natürlich, ein vollständiges Testen würde eine sehr viel größere 
 VorratskammerTester2-Klasse voraussetzen.
 */


public class VorratskammerTester2 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
		Marmelade erdbeer = new Marmelade("Erdbeer", "31.09.10", 8);
		int menge, auswahl;

		Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer);

		// Willkommensgruß
		System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");

		// Interaktion mit Anwender
		do {
			System.out.println("\nDie Vorratskammer enthaelt:");
			vorrat.ausgeben();

			// Auswahl
			System.out
					.println("\nTreffen Sie Ihre Auswahl (1 oder 2). Exit -1:");
			auswahl = scan.nextInt();

			if (auswahl == -1)
				break;
			
			// aufgetragene Menge - wenn's geht
			if (vorrat.auswaehlen(auswahl)) {
				System.out
						.println("Geben Sie die Menge ein, die aufgetragen werden soll:");
				menge = scan.nextInt();
				vorrat.auftragen(menge);
			} else
				System.out.println("### Fehler! Auswahl existiert nicht!! ###");
			
		} while (true);

		System.out.println("Good-bye");
	}
}
