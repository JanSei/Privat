package Programmieraufgaben;

/*
 * Schreiben Sie ein Programm, das zwei Worte einliest. 
 * Das Programm gibt dann beide Worte auf einer Zeile aus. 
 * Dabei werden die Worte durch Punkte getrennt. 
 * Die Gesamtlänge der ausgegebenen Zeichen soll 30 betragen:
 * 
 * Das könnte für ein Inhaltsverzeichnis verwendet werden.

Hinweis: Verwenden Sie System.out.print(".") innerhalb einer Schleife, um die Punkte auszugeben. 
 */

import java.util.Scanner;

public class ZweiWorte {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		String inputString1, inputString2;
		int laenge1, laenge2, gesamtlaenge = 30, punkte;
		
		//Eingabe des ersten Wortes
		System.out.println("Geben Sie das erste Wort ein:");
		inputString1 = scan.nextLine();
		
		//Eingabe des zweiten Wortes
		System.out.println("Geben Sie das zweite Wort ein:");
		inputString2 = scan.nextLine();
		
		//Ermitteln der Zeichenkettenlaenge beider Strings
		laenge1 = inputString1.length();
		laenge2 = inputString2.length();
		
		//Anzahl der Punkte berechnen
		punkte = gesamtlaenge - (laenge1 + laenge2);
		
		//Ausgabe des ersten Strings
		System.out.print("\n" + inputString1);
		
		//Ausgabe der Punkte
		int i = 0;
		while(i < punkte) {
			System.out.print(".");
			i++;
		}
		
		//Ausgabe des zweiten Strings
		System.out.print(inputString2);
		
	}

}
