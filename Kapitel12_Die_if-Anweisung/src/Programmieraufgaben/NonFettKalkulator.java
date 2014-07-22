package Programmieraufgaben;

//Verschiedene Packungen von Rinderhack haben einen unterschiedlichen 
//Anteil von Fett und einen unterschiedlichen Preis pro Pfund. 
//Schreiben Sie ein Programm, das den Anwender fragt nach:
//
//    Dem Preis pro Pfund der Packung "A".
//    Dem Prozentanteil an mageren (nicht-fetten) Fleisch in Packung "A".
//    Dem Preis pro Pfund der Packung "B".
//    Dem Prozentanteil an mageren (nicht-fetten) Fleisch in Packung "B". 
//
//Das Programm berechnet dann den Preis des mageren (nicht-fetten) Rindfleischs 
//für jede Packung und gibt den günstigsten Preis aus.
//
//Nehmen Sie an, dass die zwei Packungen unterschiedliche Werte ergeben.

import java.util.Scanner;

public class NonFettKalkulator {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		double preisA, preisB, proMageresFleischA, proMageresFleischB;
		double prozentA, prozentB;
		
		System.out.println("Preis pro Pfund Packung A:");
		preisA = scan.nextDouble();
		
		System.out.println("Prozent mageres Fleisch Packung A");
		prozentA = scan.nextInt();
		prozentA = (100 - prozentA)/100;
		
		System.out.println("Preis pro Pfund Packung B:");
		preisB = scan.nextDouble();
		
		System.out.println("Prozent mageres Fleisch Packung B:");
		prozentB = scan.nextInt();
		prozentB = (100 - prozentB)/100;
		
		proMageresFleischA = preisA + (preisA * prozentA);
		proMageresFleischB = preisB + (preisB * prozentB);
		
		System.out.print("\nPackung A kostet pro Pfund mageres Fleisch: " + proMageresFleischA);
		System.out.print("\nPackung B kostet pro Pfund mageres Fleisch: " + proMageresFleischB);

		if(proMageresFleischA < proMageresFleischB)
			System.out.println("\nPackung A ist preiswerter");
		else if(proMageresFleischA > proMageresFleischB)
			System.out.println("\nPackung B ist preiswerter");
		else if(proMageresFleischA == proMageresFleischB)
			System.out.println("\nPackungen A und B enthalten denselben Preis.");
			
		
	}

}
