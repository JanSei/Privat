import java.util.Scanner;

public class HarmonischeReiheTester {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Anzahl Terme? ");
		int anzahl = scan.nextInt();
		HarmonischeReihe reihe = new HarmonischeReihe();

		System.out.println("Summe von " + anzahl + " Terme: "
				+ reihe.berechneSumme(anzahl));

	}
}
