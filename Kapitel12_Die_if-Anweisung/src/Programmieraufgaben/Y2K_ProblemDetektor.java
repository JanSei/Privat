package Programmieraufgaben;

import java.util.Scanner;

//Schreiben Sie ein Programm, dass den Anwender nach seinem Geburtsjahr fragt, 
//kodiert als zwei Ziffern (wie "62"), und nach dem aktuellen Jahr fragt, 
//ebenfalls kodiert als zwei Ziffern (wie 99). Das Programm soll das richtige 
//Alter des Anwenders in Jahren ausgeben. 

public class Y2K_ProblemDetektor {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int geburtsjahr, aktuellesJahr, alter;
		
		// Eingabe des Geburtsjahr
		System.out.println("Geburtsjahr:");
		geburtsjahr = scan.nextInt();
		
		// Eingabe des aktuellen Jahres
		System.out.println("Aktuelles Jahr:");
		aktuellesJahr = scan.nextInt();
		
		// Berechnung des Alters
		if(aktuellesJahr < geburtsjahr) {
			alter = (aktuellesJahr + 100) - geburtsjahr; 
		}
		else {
			alter = aktuellesJahr - geburtsjahr;
		}
		
		System.out.print("Ihr Alter ist: " + alter);
		
		
		
	}

}
