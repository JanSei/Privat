/*
 * Angenommen Sie brauchen ein Programm, 
 * das den Gesamtbetrag eines Restaurantessens berechnet. 
 * Der Input des Programms wird der Grundbetrag des Essens sein.
 *  Darauf werden x% Trinkgeld und 6% Verkaufssteuer aufgeschlagen. 
 *  Verwenden Sie double für die Arithmetik. Hier ist das Programm: 
 */

import java.util.Scanner;

public class RestaurantRechnung {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner( System.in );
	    double grundbetrag;
	    double trinkgeldProzent;
	
	    System.out.print("Geben Sie den Grundbetrag ein: ");
	    grundbetrag = scan.nextDouble();
	    
	    System.out.print("Geben Sie den Prozentsatz fuer das Trinkgeld ein: ");
	    trinkgeldProzent = scan.nextDouble();
	    trinkgeldProzent /= 100;
	
	    System.out.println("Grundbetrag " +  grundbetrag + " Gesamtkosten: " +
	         (grundbetrag + grundbetrag*0.06 + grundbetrag*trinkgeldProzent) );
	}

}
