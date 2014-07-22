package Programmieraufgaben;

//Ein CAD Programm erwartet, das der Anwender die Koordinaten von zwei Eckpunkten 
//für jedes von mehreren Rechtecken eingibt (siehe Diagramm). Dabei wird vorausgesetzt, 
//dass die Seiten der Rechtecke parallel zur X und Y Achse verlaufen. Die Koordinaten 
//eines jeden Eckpunkts werden als Paar von Ganzzahlen eingegeben, zuerst die X-Koordinate 
//und dann die Y-Koordinate. Der Urprung des Koordinatensystems (0,0) ist die linke obere Ecke, 
//so dass Y abwärts zunimmt und X nach rechts zunimmt.
//
//Das Programm berechnet für jedes Rechteck die Höhe, die Breite und die Fläche. Die zwei 
//eingegebenen Eckpunkte müssen sich diagonal gegenüber liegen (links oben und rechts unten, 
//oder rechts oben und links unten), aber welche Wahl für jedes Rechteck getroffen wird, 
//ist Sache des Anwenders. Der Anwender kann die Eckpunkte in beliebiger Reihenfolge 
//eingeben. Höhe und Breite sind immer positive (das Programm wird seine Berechnungen 
//anpassen müssen, damit das wahr ist.)
//
//Das Programm wird beendet, wenn der Anwender Eckpunkte eingibt, die nicht die eines 
//Rechtecks sein können (entweder die Höhe ist 0, die Breite ist 0 oder beide.) 

import java.util.Scanner;
import static java.lang.Math.*;

public class Flaeche_von_Rechtecken {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int ersterX, ersterY, zweiterX, zweiterY;
		int breite = 0, hoehe = 0, flaeche = 0; 	// aus den Eckpunkten bestimmt
		
		
		do {
		
		//Eingabe der Eckpunkte
		System.out.print("Eckpunkt der ersten X-Koordinate:  ");
		ersterX = scan.nextInt();
		
		System.out.print("Eckpunkt der ersten Y-Koordinate:  ");
		ersterY = scan.nextInt();
		
		System.out.print("Eckpunkt der zweiten X-Koordinate: ");
		zweiterX = scan.nextInt();
		
		System.out.print("Eckpunkt der zweiten Y-Koordinate: ");
		zweiterY = scan.nextInt();
		
		//Berechnung der Breite
		breite = ersterX - zweiterX;
		hoehe = ersterY - zweiterY;
		flaeche = breite * hoehe;
		
		System.out.print("Breite: " + abs(breite));
		System.out.print("\tHoehe: " + abs(hoehe));
		System.out.print("\tFlaeche: " + abs(flaeche));
		System.out.println("\n");
		
		} while (breite != 0 & hoehe != 0 & flaeche != 0);
		
		System.out.println("Fertig!");
	}

}