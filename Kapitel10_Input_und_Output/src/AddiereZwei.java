import java.util.Scanner;

public class AddiereZwei {
	

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
	    int erster, zweiter, summe ;   // Deklaration der int Variablen

	    System.out.println("Geben Sie die erste Ganzzahl ein:");
	    erster = in.nextInt();       // Zeichen einlesen und in int konvertieren

	    System.out.println("Geben Sie die zweite Ganzzahl ein:");
	    zweiter = in.nextInt();      // Zeichen einlesen und in int konvertieren

	    summe = erster + zweiter;      // addiere die zwei ints, stelle das Ergebnis summe

	    System.out.println("Die Summe von " + erster + " plus " + zweiter + " ist " + summe );
	}

}
