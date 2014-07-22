package programmieraufgaben;

import java.awt.Point;

/*
 * Aufgabe 2 — Zwei Referenzen auf dasselbe Point-Objekt

Kopieren Sie die Referenz von pt1 in eine Referenzvariable ptAlias. 
Überprüfen Sie anschließend mit dem == -Operator ob die 
Referenzvariablen pt1 und ptAlias auf dasselbe Objekt verweisen.

    Geben Sie die x- und y-Werte des Point-Objekts aus, auf das die 
    Referenzvariablen pt1 und ptAlias verweisen.
    Verdoppeln Sie dann die x- und y-Werte des Point-Objekts auf das 
    ptAlias verweist. Verwenden Sie dazu NICHT die move() Methode.
    Geben Sie erneut die x- und y-Werte des Point-Objekts aus, auf das 
    die Referenzvariablen pt1 und ptAlias verweisen.

Die Ausgabe des Programms sieht dann folgendermaßen aus.


pt1 und ptAlias verweisen auf dasselbe Objekt!

Point pt1 vorher:      java.awt.Point[x=10,y=10]
Point ptAlias vorher:  java.awt.Point[x=10,y=10]

Nur von ptAlias wurden die x- und y-Werte verdoppelt!

Point pt1 nachher:      java.awt.Point[x=20,y=20]
Point ptAlias nachher:  java.awt.Point[x=20,y=20]


 */

public class Zwei_Referenzen_auf_dasselbe_Objekt {
	
	public static void main(String[] args) {

		int x, y;
		Point pt1 = new Point(10, 10);
		Point ptAlias = pt1;
		x = (int)ptAlias.getX();
		y = (int)ptAlias.getY();
		
		if(pt1 == ptAlias)
			System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt!\n");
		
		// Vorher
		System.out.println("Point pt1 vorher: \t" + pt1);
		System.out.println("Point ptAlias vorher: \t" + ptAlias);
		
		// x und y von ptAlias werden verdoppelt
		x *= 2;
		y *= 2;
		pt1 = new Point(x, y);
		ptAlias = pt1;
		System.out.println("\nNur von ptAlias wurden die x- und y-Werte verdoppelt!\n");
		
		// Nachher
		System.out.println("Point pt1 nachher: \t" + pt1);
		System.out.println("Point ptAlias nachher: \t" + ptAlias);

	}

}
