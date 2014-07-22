import java.util.Scanner;

public class Quadratwurzel {

	private static Scanner scan;

	public static void main(String[] args) {

		 	scan = new Scanner( System.in );
		    double zahl;

		    // ein double einlesen
		    System.out.print("Geben Sie ein double ein: ");
		    zahl = scan.nextDouble();

		    // Quadratwurzel berechnen
		    double ergebnis = Math.log( zahl );

		    // Ergebnis ausgeben
		    System.out.println("Quadratwurzel: " + ergebnis );
	}

}
