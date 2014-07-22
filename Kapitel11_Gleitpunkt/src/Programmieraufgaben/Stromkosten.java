package Programmieraufgaben;
import java.util.Scanner;

public class Stromkosten {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
		double preis, strompreis;
		int anzahl;
		
		// Preis pro Kilowattstunde eingeben
		System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein: ");
		preis = in.nextDouble();
		
		// Anzahl der Kilowattstunden pro Jahr eingeben
		System.out.println("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein: ");
		anzahl = in.nextInt();
		
		strompreis = (preis * anzahl) / 100; 
		System.out.printf("Jahreskosten: %.2f Euros", strompreis);
	}

}
