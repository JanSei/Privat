//So.... jetzt haben Sie zwei Teile: 
//	(1) den Teil, der gewährleistet, dass die erforderliche Anzahl Zeilen "passiert" 
//	und, (2) den Teil, der die erforderliche Anzahl von Sternen pro Zeile ausgibt. 
//	
//Hier ist ein vollständiges Programm mit den zwei zusammengesetzten Teilen: 

import java.util.Scanner;

class Sternchen {

	private static Scanner scan;

	public static void main(String[] args) {

		int anzahlZeilen; // die Anzahl der Zeilen
		int anzahlSterne; // die Anzahl der Sterne pro Zeile
		int zeile; // aktuelle Zeilennummer
		int stern; // die Anzahl der Sterne in dieser Zeile soweit

		scan = new Scanner(System.in);

		// Input vom Anwender sammeln
		System.out.println("Wie viele Zeilen?");
		anzahlZeilen = scan.nextInt();

		System.out.println("Wie viele Sterne pro Zeile?");
		anzahlSterne = scan.nextInt();

		zeile = 1;
		while (zeile <= anzahlZeilen) {

			stern = 1;

			while (stern <= anzahlSterne) {
				System.out.print("*");
				stern = stern + 1;
			}

			System.out.println(); // notwendig, um jede Zeile zu beenden
			zeile = zeile + 1;
		}
	}
}