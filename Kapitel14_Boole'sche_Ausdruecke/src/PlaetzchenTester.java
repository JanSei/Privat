// Plätzchenzutaten überprüfen
//
import java.util.Scanner;

public class PlaetzchenTester {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int zucker, mehl;

		// Anzahl der Tassen Mehl einholen
		System.out.println("Wie viel Mehl haben Sie?");
		mehl = scan.nextInt();

		// Anzahl der Tassen Zucker einholen
		System.out.println("Wie viel Zucker haben Sie?");
		zucker = scan.nextInt();

		// überprüfen, ob es genug von beiden Zutaten gibt
		if (mehl >= 4 && zucker >= 2)
			System.out.println("Genug fuer Plaetzchen!");
		else
			System.out.println("Sorry....");
	}
}
