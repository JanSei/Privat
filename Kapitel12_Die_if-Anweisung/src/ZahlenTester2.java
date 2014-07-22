import java.util.Scanner;

// Mit verschachtelte if-Anweisungen
public class ZahlenTester2 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int zahl;

		System.out.println("Geben Sie eine Ganzzahl ein:");
		zahl = scan.nextInt();

		if (zahl < 0)
			// True-Zweig
			System.out.println("Die Zahl " + zahl + " ist negativ");
		else {
			if (zahl > 0)
				// verschachtelter True-Zweig
				System.out.println("Die Zahl " + zahl + " ist positiv");
			else
				// verschachtelter False-Zweig
				System.out.println("Die Zahl " + zahl + " ist Null");
		}
		System.out.println("Good-bye fuer jetzt"); // wird immer ausgeführt
	}
}
