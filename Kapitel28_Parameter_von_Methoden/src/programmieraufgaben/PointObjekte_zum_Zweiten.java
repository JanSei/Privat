package programmieraufgaben;

import java.awt.Point;

/*
 * Aufgabe 1 — Point-Objekte zum Zweiten

Schreiben Sie ein Programm, das zwei Point-Objekte 
(pt1 mit den x- und y-Werten 10, 10 und pt2 mit den 
x- und y-Werten 30, 30) erzeugt.

Die Point-Objekte repräsentieren die Eckpunkte eines Rechtecks. 
Berechnen Sie die Fläche dieses Rechtecks. Verwenden Sie zum 
Ermitteln der Breite und Höhe die Klassenmethode abs() der Klasse Math.

Die Ausgabe des Programms sieht folgendermaßen aus.


Die Flaeche betraegt: 400


 */

public class PointObjekte_zum_Zweiten {
	
	public static void main(String[] args) {

		int x1, x2, y1, y2, flaeche = 0;
		Point pt1 = new Point(10, 10);	// Objekte mit x und y Koordinaten
		Point pt2 = new Point(30, 30);	// erzeugen
		int breite, hoehe;
		// x und y Koordinaten von Objekte herauslesen und in Variablen speichern
		x1 = (int)pt1.getX();
		y1 = (int)pt1.getY();
		x2 = (int)pt2.getX();
		y2 = (int)pt2.getY();
		
		// Geometrie
		breite = Math.abs(x1-x2);
		hoehe = Math.abs(y1-y2);
		flaeche = breite * hoehe;
		
		// Ausgabe
		System.out.println("Die Flaeche betragt: " + flaeche);

	}

}
