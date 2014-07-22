package programmieraufgaben;

//Reifen müssen nicht genau den gleichen Druck haben. 
//Verändern Sie Ihr Programm aus Aufgabe 3, so dass sich 
//die beiden Vorder- und Hinterräder in einem Toleranzbereich von 3 psi bewegen dürfen.

import java.util.Scanner;

public class ReifendruckzumDritten {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int rVReifen, lVReifen, rHReifen, lHReifen,
		differenzVorder, differenzHinter;
		boolean druckOk = true;
		
		// Eingabe des Reifendrucks einzelner Reifen
		
		// rechter Vorderreifen
		System.out.println("Reifendruck: rechter Vorderreifen");
		rVReifen = scan.nextInt();
		if(!(rVReifen >= 35 && rVReifen <= 45)) {
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!\n");
			druckOk = false;
		}
		
		// linker Vorderreifen
		System.out.println("Reifendruck: linker Vorderreifen");
		lVReifen = scan.nextInt();
		if(!(lVReifen >= 35 && lVReifen <= 45)) {
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!\n");
			druckOk = false;
		}
		
		// rechter Hinterreifen
		System.out.println("Reifendruck: rechter Hinterreifen");
		rHReifen = scan.nextInt();
		if(!(rHReifen >= 35 && rHReifen <= 45)) {
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!\n");
			druckOk = false;
		}

		// linker Hinterreifen
		System.out.println("Reifendruck: linker Hinterreifen");
		lHReifen = scan.nextInt();
		if(!(lHReifen >= 35 && lHReifen <= 45)) {
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs!\n");
			druckOk = false;
		}
		
		// Der Toleranzbereich für Vorderreifen wird berechnet
		if(rVReifen > lVReifen)
			differenzVorder = rVReifen - lVReifen;
		else
			differenzVorder = lVReifen - rVReifen;
		
		// Der Toleranzbereich für Hinterreifen wird berechnet
		if(rHReifen > lHReifen)
			differenzHinter = rHReifen - lHReifen;
		else
			differenzHinter = lHReifen - rHReifen;
				
		// Ueberprueft ob Reifendruck OK ist, diesmal mit Toleranzbereich 3 psi
		if(differenzVorder <= 3 && differenzHinter <= 3 && druckOk)
			System.out.println("\nDer Reifendruck ist OK");
		else
			System.out.println("\nDer Reifendruck ist NICHT OK! Fahren Sie sofort zur Werkstatt!");
	}

}
