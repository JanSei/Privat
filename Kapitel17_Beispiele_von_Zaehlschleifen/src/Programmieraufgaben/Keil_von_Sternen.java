package Programmieraufgaben;

//Schreiben Sie ein Programm, das Sterne in Keilform ausgibt. 
//Der Anwender gibt die Anfangszahl für die Sterne ein und das 
//Programm gibt Zeilen von Sternen aus, wobei jede Zeile einen 
//Stern weniger hat als die vorhergehende.

import java.util.Scanner;

public class Keil_von_Sternen {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int anzahlSterne, anzahlZeilen;
		
		//Anzahl der Sterne eingeben
		System.out.print("Anfangszahl der Sterne: ");
		anzahlSterne = scan.nextInt();
		
		anzahlZeilen = anzahlSterne;
		//Zeilen von Sternen
		for(int i = 0; i < anzahlZeilen; i++) {
			
			System.out.println("");
			
			//Anzahl von Sternchen
			for(int j = anzahlSterne; j > i; j--) {
				
				System.out.print("*");
			}
		}
	}

}
