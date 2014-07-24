package Programmieraufgaben;

//Al's Last Chance Gas Station befindet sich an der Straße 190 am 
//Rande des Death Valley. Die nächsten 200 Meilen gibt es keine weitere 
//Tankstelle. Sie sollen ein Programm schreiben, das den Fahrern hilft zu 
//entscheiden, ob sie tanken sollen oder nicht. Das Programm fragt nach:
//
// - Der Tankkapazität in Gallonen (3,78l)
// - Der Benzinanzeige in Prozent (voll= 100, drei viertel voll = 75 usw.)
// - Dem Benzinverbrauch des Fahrzeuges in Meilen pro Gallone. 
//
//Die Ausgabe des Programms ist "Tanken!", oder "Weiterfahren...". Je nachdem, 
//ob das Fahrzeug genug Benzin für 200 Meilen hat oder nicht. 

// !Verwenden Sie für die Eingabe und die Arithmetik Ganzzahlen.

import java.util.Scanner;

public class LetzteTankmoeglichkeit {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int tankkapazitaet, benzinanzeige, meilenProGallone;
		int reichweite;
		
		System.out.println("Tankkapazität:");
		tankkapazitaet = scan.nextInt();
		
		System.out.println("Benzinanzeige:");
		benzinanzeige = scan.nextInt();
		
		System.out.println("Meilen pro Gallone:");
		meilenProGallone = scan.nextInt();
		
		if (benzinanzeige == 100)
			tankkapazitaet *= 1;
		else if (benzinanzeige == 75)
			tankkapazitaet *= (double)3/4;
		else if (benzinanzeige == 50)
			tankkapazitaet *= (double)1/2;
		else if (benzinanzeige == 25)
			tankkapazitaet *= (double)1/4;
		
		reichweite = tankkapazitaet * meilenProGallone;
		
		if (reichweite < 200)
			System.out.println("Tanken!");
		else
			System.out.println("Weiterfahren...");
	}
}
