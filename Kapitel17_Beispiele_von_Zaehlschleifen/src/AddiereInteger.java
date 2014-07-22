import java.util.Scanner;

// Anwender gibt einen Wert N ein
// Addieren der geraden, ungeraden und aller Integer von 0 bis N
//
class AddiereInteger {

	private static Scanner scan;

	public static void main (String[] args ) {

		scan = new Scanner( System.in );
		int n, summeAlle = 0, summeGerade = 0, summeUngerade = 0;
		
		//Grenzwert bestimmen
		System.out.println("Geben Sie den Grenzwert ein:");
		n = scan.nextInt();
		
		//Schleife fuer Summen
		int zaehler = 0;
		while(zaehler <= n) {
			
			summeAlle += zaehler;
			//Anweisung um Summen der (un)geraden Zahlen zu bilden
			if(zaehler % 2 == 0)
				summeGerade += zaehler;
			else
				summeUngerade += zaehler;
			
			zaehler++;
		}
		//Ausgabe der gesamten, geraden und ungeraden Summen
		System.out.print("Summe aller: " + summeAlle);
		System.out.print("\tSumme der geraden: " + summeGerade);
		System.out.print("\tSumme der ungeraden: " + summeUngerade);
  }
}