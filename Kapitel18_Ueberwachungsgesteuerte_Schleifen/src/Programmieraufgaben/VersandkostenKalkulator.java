package Programmieraufgaben;

//Ein Paketdienst berechnet $3.00 Versandkosten bis zu einem Gewicht von 10 Pfund (inklusive). 
//Darüber sind für jedes Pfund zusätzlich $0.25 zu bezahlen. Schreiben Sie ein Programm, 
//das den Anwender nach dem Gewicht der Sendung fragt und dann die Versandkosten ausgibt. 
//Das Programm endet, wenn ein Gewicht von 0 oder weniger eingegeben wird. 

import java.util.Scanner;

public class VersandkostenKalkulator {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int gewicht;
		double versandkosten = 0;
		
//		// Gewicht der Sendung eingeben
//		System.out.println("Gewicht der Sendung:");
//		gewicht = in.nextInt();

		do {
//			if()
			// Gewicht der Sendung eingeben
			System.out.print("Gewicht der Sendung: ");
			gewicht = scan.nextInt();

			if(gewicht > 0) {
				if (gewicht <= 10)
					versandkosten = 3.00;
				else if(gewicht > 10)
					versandkosten = 3.00 + (0.25 * (gewicht - 10));
					
				// Ausgabe der Versandkosten
				System.out.println("Versandkosten: " + versandkosten);
				System.out.println();
			}
		} while(gewicht > 0);
		System.out.println("Bye, du Teufel!");
	}

}
