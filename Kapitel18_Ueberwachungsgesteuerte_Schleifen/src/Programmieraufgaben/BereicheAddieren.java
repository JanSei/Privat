package Programmieraufgaben;

//Schreiben Sie ein Programm, das den Anwender nach einer Unter- und Obergrenze 
//für einen Bereich von Ganzzahlen fragt. Das Programm fragt dann den Anwender 
//nach Ganzzahlen, die addiert werden sollen. Das Programm berechnet zwei Summen:
//
//    Die Summe der Integer, die im Bereich sind (inklusive)
//    und die Summe der Integer, die außerhalb des Bereichs sind. 
//
//Der Anwender signalisiert das Ende der Eingabe mit einer 0.

import java.util.Scanner;

public class BereicheAddieren {

	private static Scanner scan;

	public static void main(String[] args) {
		
		// Name des Programms
		
		scan = new Scanner( System.in );
		int untergrenze, obergrenze;
		int daten = 1, summeInnerhalb = 0, summeAusserhalb = 0;
		
		// Untergrenze bestimmen
		System.out.println("Untergrenze des Bereichs:");
		untergrenze = scan.nextInt();
		
		// Obergrenze bestimmen
		System.out.println("Obergrenze des Bereichs:");
		obergrenze = scan.nextInt();
		
		while (daten != 0) {
			System.out.println("Daten eingeben:");
			daten = scan.nextInt();
			
			// Innerhalb des Bereichs
			if(daten >= untergrenze && daten <= obergrenze)
				summeInnerhalb += daten;
			else
				summeAusserhalb += daten; // Ausserhalb des Bereichs
		}
		System.out.print("Summe der Werte innerhalb des Bereichs: " + summeInnerhalb);
		System.out.print("\nSumme der Werte ausserhalb des Bereichs: " + summeAusserhalb);
	}

}
