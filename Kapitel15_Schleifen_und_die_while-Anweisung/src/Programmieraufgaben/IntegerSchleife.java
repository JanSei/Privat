package Programmieraufgaben;

/*
 * Schreiben Sie ein Programm, das den Anwender nach einem Start- und Endwert 
 * fragt und dann alle Zahlen (Integer) inklusive der eingegebenen ausgibt.
 */

import java.util.Scanner;

public class IntegerSchleife {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int anfang, ende;

		// Eingabe des Startwerts
		System.out.print("Startwert: ");
		anfang = scan.nextInt();

		// Eingabe des Endwerts
		System.out.print("Endwert: ");
		ende = scan.nextInt();

		System.out.println("");
		// Schleifendurchlauf
		while (anfang <= ende) {
			System.out.println(anfang);
			anfang++;
		}
	}

}
