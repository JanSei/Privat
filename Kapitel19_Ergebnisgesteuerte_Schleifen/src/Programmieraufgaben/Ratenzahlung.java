package Programmieraufgaben;

//Angenommen Sie anfangssaldo Ihrer Kreditkartengesellschaft 1000.00$. 
//Die Gesellschaft berechnet Ihnen monatlich 1.5% Zinsen für den gewährten Kredit. 
//Sie entscheiden sich die Kreditkarte nicht mehr zu verwenden und Ihren Kredit 
//monatlich mit einem bestimmten Betrag n zurückzuzahlen. Schreiben Sie ein Programm, 
//das nach dem monatlichen Rückzahlungsbetrag fragt, dann den Saldo und den Gesamtbetrag 
//der Zahlungen für jeden Monat ausgibt, bis der Saldo Null oder weniger beträgt. 
//
//Berechnen Sie die monatlichen Zinsen auf Grund des Saldos. Berechnen Sie dann den 
//neuen Saldo, indem Sie die Zinsen addieren und den zurückgezahlten Betrag subtrahieren.

import java.util.Scanner;

public class Ratenzahlung {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		
		double anfangssaldo = 1000.00; // zuzahlende anfangssaldo
		final double ZINSSATZ = 0.015; // darauf berechnete Zinsen
		double monatlicherBetrag, saldo = 1.0;
		int monat = 0;
		double gesamtbetrag = 0;
		
		// monatlicher Betrag
		System.out.print("Geben Sie den monatlichen Betrag ein: ");
		monatlicherBetrag = scan.nextDouble();

		while (saldo > 0) {
			
			// Anzahl des Monats
			monat++;
			System.out.print("Monat: " + monat);
			
			// Gesamtbetrag
			gesamtbetrag += monatlicherBetrag;
			
			// Saldo wird berechnet
			saldo = anfangssaldo + (anfangssaldo * ZINSSATZ);
			saldo = saldo - monatlicherBetrag;
			anfangssaldo = saldo; 			// anfangssaldo entsprechen den Betrag vom Saldo
			System.out.printf("\t\tSaldo: %.2f", saldo);
			
			// Gesamtbetrag wird ausgegeben
			System.out.print("\t\tGesamtbetrag: " + gesamtbetrag);
			System.out.println();
			
		}

	}

}
