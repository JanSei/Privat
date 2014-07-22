package programmieraufgaben;

import java.awt.Point;
import java.util.Scanner;

/*
 * Aufgabe 2 — äquivalente Point-Objekte

 Überprüfen Sie mit der equals() Methode ob die beiden Point-Objekte äquivalente Daten 
 enthalten.

 Sind die Daten äquivalent, sieht die Ausgabe des Programms folgendermaßen aus.
 Wert x1:
 3
 Wert x2:
 3
 Wert y1:
 8
 Wert y2:
 8
 Die Koordinaten der beiden Punkte sind gleich:
 java.awt.Point[x=3,y=8] und java.awt.Point[x=3,y=8]

 */

public class AequivalentePointObjekte {
	
	private static Scanner in;

	public static void main(String[] args) {

		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		in = new Scanner(System.in);
		Point obj1;
		Point obj2;

		// Eingabe der Punkte
		System.out.print("Wert x1: ");
		x1 = in.nextInt();
		System.out.print("Wert x2: ");
		x2 = in.nextInt();
		System.out.print("Wert y1: ");
		y1 = in.nextInt();
		System.out.print("Wert y2: ");
		y2 = in.nextInt();

		// Objekte werden mit eingegebenen Werte erzeugt
		obj1 = new Point(x1, y1);
		obj2 = new Point(x2, y2);

		// Ausgabe der beiden Point-Objekte
		if (obj1.equals(obj2))
			System.out
					.println("Die Koordinaten der beiden Punkte sind gleich: \n"
							+ obj1 + " und " + obj2);
		else {
			System.out.println(obj1);
			System.out.println(obj2);
		}

	}

}
