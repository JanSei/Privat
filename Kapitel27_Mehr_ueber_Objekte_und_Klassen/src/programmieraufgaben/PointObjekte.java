package programmieraufgaben;

/*
 * Aufgabe 1 ??? Point-Objekte

Schreiben Sie ein Programm, das zwei Point-Objekte erzeugt. 
Die x- und y-Werte werden vom Anwender eingegeben. Verwenden 
Sie f??r die Ausgabe die toString() Methode der Klasse Point.

Ein Ablauf des Programms sieht dann folgenderma??en aus.

Wert x1:
3
Wert x2:
5
Wert y1:
2
Wert y2:
7
java.awt.Point[x=3,y=2]
java.awt.Point[x=5,y=7]

 */

import java.awt.Point;
import java.util.Scanner;

public class PointObjekte {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		in = new Scanner ( System.in );
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
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
