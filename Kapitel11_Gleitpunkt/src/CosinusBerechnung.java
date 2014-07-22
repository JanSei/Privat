import java.util.*;

public class CosinusBerechnung {

	private static Scanner scan;

	public static void main(String[] args) {

		double zahl;
	    scan = new Scanner( System.in );

	    System.out.print("Bogenmass eingeben: ");
	    zahl = scan.nextDouble();

	    // Cosinus berechnen
	    double ergebnis = Math.cos( zahl );

	    // Ergebnis ausgeben
	    System.out.println("Cosinus: " + ergebnis );
	    System.out.println("In Grad: " + (Math.toDegrees(ergebnis)));
	}

}
