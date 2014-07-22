package Programmieraufgaben;

/*
 * Schreiben Sie ein Programm, das ein Wort einliest. 
 * Das Wort wird dann so oft ausgegeben, wie es Buchstaben hat:
 * 
 * Verwenden Sie die Methode length(), um die Anzahl der Zeichen eines Strings zu ermitteln:

String inputString;
int laenge;

 . . . .

laenge = inputString.length() ;

 */

import java.util.Scanner;

public class WortEinlesen {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		String inputString;
		int laenge;
		
		//Wort eingeben
		System.out.println("Geben Sie ein Wort ein: ");
		inputString = scan.nextLine();
		
		//Anzahl der Zeichen ermitteln
		laenge = inputString.length();

		System.out.println("");
		//Auslesen der Zeichen
		int i = 0;
		while( i < laenge) {
			System.out.println(inputString);
			i++;
		}
		
		
	}

}
