import java.util.Scanner;

public class AddiereDouble {

	private static Scanner scan;

	public static void main(String[] args) {

		double erster, zweiter, summe;
	    scan = new Scanner( System.in );

	    // erstes double einlesen
	    System.out.print("Geben Sie das erste double ein: ");
	    erster = scan.nextDouble();

	    // zweites double einlesen
	    System.out.print("Geben Sie das zweite double ein: ");
	    zweiter = scan.nextDouble();

	    // Summe berechnen und ausgeben
	    summe = erster + zweiter;
	    System.out.print("Summe: " + summe );
	}

}
