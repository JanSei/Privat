import java.util.Scanner;

public class DoubleDouble {

	private static Scanner scan;

	public static void main(String[] args) {

		double zahl;
	    scan = new Scanner( System.in );

	    System.out.print("Geben Sie ein double ein: ");
	    zahl = scan.nextDouble(); // einlesen einer 'Gleitpunktzahl' mit doppelter Genauigkeit

	    System.out.println("zahl: " + zahl + " zahl * 2: " + 2.0*zahl );
	}

}
