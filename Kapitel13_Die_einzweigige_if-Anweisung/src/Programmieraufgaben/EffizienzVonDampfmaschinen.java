package Programmieraufgaben;
import java.util.Scanner;

public class EffizienzVonDampfmaschinen {
	
	private static final int SIEDEPUNKT = 373;
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int tLuft, tDampf;
		double effizienz;
		
		// Eingabe der Lufttemperatur
		System.out.print("Geben Sie die Lufttemperatur ein: ");
		tLuft = scan.nextInt();
		
		// Eingabe der Dampftemperatur
		System.out.print("Geben Sie die Dampftemperatur ein: ");
		tDampf = scan.nextInt();
		
		// Kontrolle ob die Dampftemperatur unter Siedepunkt liegt
		if(tDampf < SIEDEPUNKT){
			tDampf = 0;
			effizienz = 0;
		}
		else if(tDampf > 6273) {
			System.out.println("Sie wollen doch nicht das Planet unter Flammen setzen, oder?!!");
			System.exit(1);
		}

		// Berechnung der maximalen möglichen Effizienz der Dampfmaschine
		effizienz = 1 - (double)tLuft / tDampf;
		System.out.println("Die Effizienz betraegt: " + effizienz);
		
	}

}
