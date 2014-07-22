package Programmieraufgaben;

//In einem Fantasy-Rollenspiel können die Spieler ihre Spielfiguren entwerfen, 
//indem Sie einen Punktwert für jedes von drei Merkmalen vergeben:
//
//    Stärke, von 1 bis 10
//    Gesundheit, von 1 bis 10
//    Glück, von 1 bis 10 
//
//Schreiben Sie ein Programm, das nach dem Namen der Spielfigur und nach den Punktwerten 
//der einzelnen drei Merkmale fragt. Aber, die Gesamtpunktzahl muss geringer als 15 sein. 
//Wenn die Gesamtpunktzahl 15 überschreitet, dann wird jedem Merkmal 5 Punkte zugewiesen. 

import java.util.Scanner;

public class FantasySpiel {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		String name = new String();
		int staerke, gesundheit, glueck, gesamtAttribute;
		
		// Willkommensgruss
		System.out.println("Willkommen zu der Arche des Lebens!");
		
		// Name der Spielfigur
		System.out.print("Geben Sie den Namber der Spielfigur ein: ");
		name = scan.nextLine();
		
		// Staerke der Spielfigur
		System.out.print("Staerke eingeben (1-10): ");
		staerke = scan.nextInt();
		
		// Gesundheit der Spielfigur
		System.out.print("Gesundheit eingeben (1-10): ");
		gesundheit = scan.nextInt();
		
		// Glueck der Spielfigur
		System.out.print("Glueck eingeben (1-10): ");
		glueck = scan.nextInt();
		
		gesamtAttribute = staerke + gesundheit + glueck;
		
		if(gesamtAttribute > 15) {
			System.out.println("\nSie haben Ihrer Spielfigur zu viele Punkte gegeben!");
			staerke = gesundheit = glueck = 5;
		}
		System.out.println(name + ", Staerke: " + staerke 
				+ ", Gesundheit: " + gesundheit + ", Glueck: " + glueck);
	}
}
