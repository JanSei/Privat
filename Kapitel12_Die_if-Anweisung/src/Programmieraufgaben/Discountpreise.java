package Programmieraufgaben;

//Während einer Sonderaktion wird ein Rabatt von 10% auf alle Einkäufe 
//mit einem Gesamtbetrag von mehr als $10.00 gewährt. Schreiben Sie ein 
//Programm, das nach dem Gesamtbetrag fragt und den Discountpreis berechnet. 
//Der Gesamtbetrag wird in Cent (als Ganzzahl) eingegeben. 

import java.util.Scanner;

public class Discountpreise {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner( System.in );
		final double RABATT = 0.90;
		double gesamtbetrag; // in Cents
		
		System.out.println("Geben Sie den Gesamtbetrag ein: ");
		gesamtbetrag = in.nextDouble();
		
		if (gesamtbetrag > 1000) // Preis in Cents
			System.out.println("Discountpreis: " + (gesamtbetrag * RABATT));
		else
			System.out.println("Keine Discountpreise unter 10 Euro Einkauf!");
	}

}
