package Programmieraufgaben;
import java.util.Scanner;

public class ZurueckgelegteEntfernung {

	private static final double ERDBESCHLEUNIGUNG = 9.81;
	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner( System.in );
		double sekunden, e, G, z;
		G = ERDBESCHLEUNIGUNG;
		
		System.out.print("Geben Sie die Anzahl der Sekunden ein: ");
		sekunden = in.nextDouble();
		
		z = sekunden;
		e = ((double)1/2) * G * z*z;
		System.out.println("Die Entfernung e betraegt: " + e + " Meter");
		
		System.out.println("\nWie lange braucht der Stein, um ungefaehr eine Entfernung von 1000 Meter pro Sekunde zurueckzulegen?");
		e = 1000;
		z = Math.sqrt((2*e)/G);
		System.out.println("Zurueckgelegte Entfernung von 1000 Meter in Sekunden: " + z);
		
		
		
	}

}
