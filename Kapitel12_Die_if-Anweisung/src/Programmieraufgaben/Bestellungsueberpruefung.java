package Programmieraufgaben;

//Bobs Schrauben Discount verlangt folgende Preise:
//
//    5 Cent pro Schraube
//    3 Cent pro Mutter
//    1 Cent pro Unterlegscheibe 
//
//Schreiben Sie ein Programm, das den Anwender nach der Anzahl der Schrauben, 
//Muttern und Beilegscheiben fragt und dann den Gesamtbetrag berechnet und ausgibt. 
//Zusätzlich überprüft das Programm die Bestellung. Es ist normalerweise ein Fehler, 
//wenn mehr Schrauben als Muttern bestellt werden. In diesem Fall gibt das Programm 
//die Meldung aus "Kontrollieren Sie Ihre Bestellung!". Andernfalls gibt das Programm 
//aus "Die Bestellung ist okay." In jedem Fall wird der Gesamtbetrag ausgegeben. 

import java.util.Scanner;

public class Bestellungsueberpruefung {

	private static Scanner scan;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int SCHRAUBENPREIS = 5, MUTTERPREIS = 3, UNTERLEGSCHEIBE = 1;
		int schrauben, muttern, unterlegscheiben;
		scan = new Scanner( System.in );
		
		// Anzahl der Schrauben eingeben
		System.out.println("Anzahl der Schrauben:");
		schrauben = scan.nextInt();
		int schraubenpreis = schrauben * SCHRAUBENPREIS;
		
		// Anzahl der Muttern eingeben
		System.out.println("Anzahl der Muttern:");
		muttern = scan.nextInt();
		int mutterpreis = muttern * MUTTERPREIS;
		
		// Anzahl der Unterlegscheiben eingeben
		System.out.println("Anzahl der Unterlegscheiben:");
		unterlegscheiben = scan.nextInt();
		int unterlegscheibenpreis = unterlegscheiben * UNTERLEGSCHEIBE;
		
		// Es ist normalerweise ein Fehler, wenn mehr Schrauben als Muttern bestellt wird
		if( schrauben > muttern)
			System.out.println("\nKontrollieren Sie Ihre Bestellung!");
		else
			System.out.println("\nDie Bestellung ist okay.");
		
		int gesamtbetrag = schraubenpreis + mutterpreis + unterlegscheibenpreis;
		System.out.println("\nGesamtbetrag: " + (gesamtbetrag));
	}

}
