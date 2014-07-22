package programmieraufgaben;

//Es genügt nicht, dass der Reifendruck der beiden Vorder- und Hinterräder der gleiche ist. 
//Beide Reifendrücke müssen sich innerhalb eines bestimmten Bereichs befinden. 
//Erweitern Sie das Pogramm aus Aufgabe 3. Es soll überprüfen, 
//ob sich der Druck aller Reifen zwischen 35 und 45 befindet. 
//Befindet sich ein Reifen außerhalb dieses Bereichs, wird sofort eine Warnmeldung ausgegeben. 
//Danach fährt das Programm mit dem Einlesen und Verarbeiten der Werte fort. 

//Kommt es zu einer Warnmeldung, dann gibt das Programm am Ende eine letzte Warnmeldung aus. 
//Deklarieren Sie dafür eine boolesche Variable druckOK.
//
//boolean druckOK
//
//Initialisieren Sie sie mit true und setzen Sie den Wert auf false, wenn sich ein Reifen 
//außerhalb des gültigen Bereichs befindet. 

import java.util.Scanner;

public class ReifendruckzumZweiten {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int rVReifen, lVReifen, rHReifen, lHReifen;
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
		
		// Ueberprueft ob Reifendruck OK ist
		if(rVReifen == lVReifen && rHReifen == lHReifen && druckOk)
			System.out.println("\nDer Reifendruck ist OK");
		else
			System.out.println("\nDer Reifendruck ist NICHT OK! Fahren Sie sofort zur Werkstatt!");
	}

}
