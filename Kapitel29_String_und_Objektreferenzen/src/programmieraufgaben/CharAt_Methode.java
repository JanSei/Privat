package programmieraufgaben;

/*
 * Aufgabe 1 — charAt()

Schreiben Sie ein Programm in dem der Anwender einen String eingibt und das Programm 
ihn ein Zeichen pro Zeile auf den Bildschirm ausgibt:


D:\JavaNotes>java EinZeichenProZeile
Geben Sie einen String ein:
Octopus

O
c
t
o
p
u
s

Sie werden dafür die folgende Methode der Klasse String brauchen:

    public char charAt( int index )

Diese Methode gibt das Zeichen zurück, das sich an der Stelle index des Strings befindet.
 */

import java.util.Scanner;

public class CharAt_Methode {
	
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
		String myString;
		
		// Eingabe des Strings
		System.out.print("Bitte geben Sie einen String ein: ");
		myString = in.next();
		System.out.println();	// Ein Leerzeichen zwischen Eingabe und Ausgabe
		
		// Ausgabe des Strings als einzelne Zeichen
		int i = 0;
		while( i < myString.length() )
			System.out.println(myString.charAt(i++));
	}

}
