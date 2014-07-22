// Ein Boxer in der Gewichtsklasse Weltergewicht muss zwischen 136 und 147 Pfund wiegen. 
// Das Gewicht eines Boxers wird vor jedem Kampf überprüft, um sicher zu gehen, 
// dass er sich innerhalb seiner Gewichtskategorie befindet. Hier ist ein Programm, 
// das überprüft, ob das Gewicht eines Boxers innerhalb des Bereichs liegt: 

// Gewichtsklasse überprüfen
//
// Boxer muss zwischen 136 und 147 Pfund wiegen
//
import java.util.Scanner;

class Weltergewicht {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int gewicht;

		// Gewicht einholen
		System.out.println("Wie schwer ist der Boxer?");

		gewicht = scan.nextInt();

		// überprüfen, ob das Gewicht innerhalb des Bereichs liegt
		if (gewicht >= 136 && gewicht <= 147)
			System.out.println("Im Bereich!");
		else
			System.out.println("Ausserhalb des Bereichs.");
	}
}