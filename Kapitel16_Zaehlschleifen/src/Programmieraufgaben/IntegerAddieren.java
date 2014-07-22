package Programmieraufgaben;

//Schreiben Sie ein Programm, das Integer addiert, die vom Benutzer eingegeben werden. 
//Das Programm fragt zuerst wie viele Zahlen addiert werden sollen. Danach fordert 
//das Programm den Benutzer auf die Zahlen nacheinander einzugeben. Schließlich gibt 
//es das Ergebnis auf den Bildschirm aus. 

import java.util.Scanner;

public class IntegerAddieren {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int arraygroesse, summe = 0;
		int[] zahlenArray;
		 
		//Arraygroesse festlegen
		System.out.println("Wie viele Integer sollen addiert werden?");
		arraygroesse = scan.nextInt();
		
		//Array
		zahlenArray = new int[arraygroesse];
		
		//Zahlen einlesen
		int i = 0;
		for(i=0; i < arraygroesse; i++) {
			System.out.println("Geben Sie einen Integer ein");
			zahlenArray[i] = scan.nextInt();
			summe += zahlenArray[i]; // Summe berechnen
		}
		System.out.println("Die Summe ist " + summe); // Summe auslesen
	}

}
