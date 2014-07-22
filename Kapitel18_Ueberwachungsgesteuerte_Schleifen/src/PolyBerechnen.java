import java.util.Scanner;

public class PolyBerechnen {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		double x; // ein Wert für das Polynom
		double ergebnis; // Ergebnis der Berechnung des Polynoms für x
		String antwort = "j"; // "j" oder "n"

		while (antwort.equals("j") || antwort.equals("ja")) {

			// Einen Wert für x holen.
			System.out.println("Geben Sie einen Wert fuer x ein:");
			x = scan.nextDouble();

			// Polynom berechnen
			ergebnis = 7 * x * x * x - 3 * x * x + 4 * x - 12;

			// Ergebnis ausgeben
			System.out.println("Der Wert des Polynoms von x = " + x + " ist: "
					+ ergebnis + "\n");

			// Anwender fragen, ob das Programm fortfahren soll
			System.out.println("Fortfahren (j oder n)?");

			antwort = scan.next();
		}

	}
}
