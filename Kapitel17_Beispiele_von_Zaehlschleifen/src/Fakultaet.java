import java.util.Scanner;

// Der Anwender gibt Integer N ein.
// Das Programm berechnet N Fakultät.

public class Fakultaet {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		long n, fakultaet = 1;

		// Wiederholt Anweisung solange ein Wert fuer n unter 0 oder ueber 20 angegeben wird
		do {
			// Eingabe der zu berechnende Zahl in Fakultaet
			System.out.println("Geben Sie N ein:");
			n = scan.nextLong();

			// Schleife fuer zahlen zwischen 0 und 20
			if (n >= 0 && n <= 20) {

				while (n > 1) {

					fakultaet = fakultaet * n;
					n = n - 1;

				}
				System.out.println("Fakultaet ist " + fakultaet);
			} else {
				System.out.println("N muss zwischen 0 und 20 sein");
				System.out.println("Fakultaet fur N kleiner 0 ist nicht definiert.");
				System.out.println("Fakultaet fur N groesser 20 verursacht Overflow.");
				System.out.println(" ");
			}
		} while (n < 0 || n > 20);
	}

}