package Programmieraufgaben;
import java.util.Scanner;

public class InternetDelikatessen {

	private static Scanner scan;

	public static void main(String[] args) {
		final double EXPRESSZUSCHLAG = 5.00;
		
		scan = new Scanner( System.in );
		String artikel = new String();
		double preis, versand;
		int express;
		
		// Eingabe des Artikels
		System.out.print("Geben Sie den Artikel ein: ");
		artikel = scan.nextLine();
		
		// Eingabe des Preises
		System.out.print("Geben Sie den Preis ein: ");
		preis = scan.nextDouble();
		
		// Abfrage ob Expressversand oder nicht
		System.out.print("Expressversand (0==nein, 1==ja): ");
		express = scan.nextInt();
		
		if(preis < 10.0)
			versand = 2.00;
		else
			versand = 3.00;
		
		if(express==1)
			versand = versand + EXPRESSZUSCHLAG;
		
		System.out.println("Rechnung");
		System.out.println(artikel + ": " + preis);
		System.out.println("Versand: " + versand);
		System.out.println("Gesamt: " + (preis + versand));
		
		
	}

}
