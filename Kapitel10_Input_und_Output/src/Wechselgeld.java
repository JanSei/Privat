import java.util.Scanner;

public class Wechselgeld {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int wechselgeld, dollar, quarter, dime, nickel, cent;
		
		// Wechselgeld wird eingelesen
		System.out.println("Geben Sie das Wechselgeld ein:");
		wechselgeld = scan.nextInt();
		
		// Wechselgeld wird berechnet
		dollar = wechselgeld / 100;
		cent = wechselgeld % 100;
		
		quarter = cent / 25;
		cent = cent % 25;
		
		dime = cent / 10;
		cent = cent % 10;
		
		nickel = cent / 5;
		cent = cent % 5;
		
		System.out.println("Das Wechselgeld ist " + dollar + " Dollar, "
				+ quarter + " Quarter, " + dime + " Dime, "
				+ nickel + " Nickel und " + cent + " Cent.");
		
	}

}
