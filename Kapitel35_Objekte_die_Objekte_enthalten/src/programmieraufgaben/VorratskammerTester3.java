package programmieraufgaben;

/*
 * Aufgabe 3 — ersetzen() Methode

Erweitern Sie das Programm aus Aufgabe 2. Schreiben Sie eine Methode 
ersetzen( Marmelade m, int slot ) für die Vorratskammer-Klasse, die ein bestimmtes 
Glas Marmelade aus der Vorratskammer durch das Objekt m ersetzt. Hier ist das Testprogramm: 
 */

import java.util.Scanner;

public class VorratskammerTester3 {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner( System.in );
		Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
		Marmelade erdbeer = new Marmelade("Erdbeer", "31.09.10", 8);
		Marmelade aprikosen = new Marmelade("Aprikosen", "31.10.10", 16);
		String inhalt, datum;
		int menge, auswahl;

		Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer,
				aprikosen);
		vorrat.ausgeben();

		// Ersetzen
		System.out.println("Welche Marmelade wollen Sie ersetzen? (1, 2 oder 3)");
		auswahl = in.nextInt();
		
		System.out.println("Durch welche? Weh die ist nicht leckerer!!");
		inhalt = in.next();
		
		System.out.println("Die Menge darin enthalten?");
		menge = in.nextInt();
		
		System.out.println("Wann wurde diese erstell? (Form: TT.MM.JJ)");
		datum = in.next();
		
		Marmelade neueMarmelade = new Marmelade(inhalt, datum, menge);
		// Marmelade kirsch      = new Marmelade( "Kirsch", "01.07.09", 11 );
		
		vorrat.ersetzen(neueMarmelade, auswahl);
		vorrat.ausgeben();

	}
}