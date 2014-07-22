package programmieraufgaben;

//Die beiden vorderen Reifen eines Autos sollten beide den gleichen Reifendruck haben. 
//Ebenso sollten die beiden hinteren Reifen den gleichen Reifendruck haben, aber nicht 
//unbedingt den gleichen wie die Vorderreifen. Schreiben Sie ein Programm, das den 
//Reifendruck der vier Reifen einliest und dann eine Meldung ausgibt, ob der Reifendruck 
//in Ordnung ist. 

import java.util.Scanner;

public class Reifendruck {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int rVReifen, lVReifen, rHReifen, lHReifen;
		
		// Eingabe des Reifendrucks einzelner Reifen
		
		// rechter Vorderreifen
		System.out.println("Reifendruck: rechter Vorderreifen");
		rVReifen = scan.nextInt();
		
		// linker Vorderreifen
		System.out.println("Reifendruck: linker Vorderreifen");
		lVReifen = scan.nextInt();
		
		// rechter Hinterreifen
		System.out.println("Reifendruck: rechter Hintererreifen");
		rHReifen = scan.nextInt();

		// linker Hinterreifen
		System.out.println("Reifendruck: linker Hintererreifen");
		lHReifen = scan.nextInt();
		
		// Ueberprueft ob Reifendruck OK ist
		if(rVReifen == lVReifen && rHReifen == lHReifen)
			System.out.println("\nDer Reifendruck ist OK");
		else
			System.out.println("\nDer Reifendruck ist NICHT OK! Fahren Sie sofort zur Werkstatt!");

	}

}
