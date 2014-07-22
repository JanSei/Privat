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
//
//Verbessertes Programm:     Lassen Sie das Programm nach dem Anfangssaldo, dem monatlichen 
//Zinssatz und dem Rückzahlungsbetrag fragen. Wenn der Saldo unter dem Rückzahlungsbetrag liegt, 
//gibt das Programm die letzte Rate aus, die den Saldo exakt auf 0 bringt. 

import java.util.Scanner;

public class Ratenzahlung_mit_Eingabe {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		double anfangssaldo; // zuzahlende anfangssaldo
		double zinssatz; // darauf berechnete Zinsen
		double monatlicherBetrag, saldo = 1.0;
		int monat = 0;
		double gesamtbetrag = 0;

		// Anfangssaldo eingeben
		System.out.print("Geben Sie den Anfangssaldo ein: ");
		anfangssaldo = scan.nextDouble();

		// monatlicher Zinssatz
		System.out
				.print("Geben Sie Ihr gewünschter monatlicher Zinssatz ein: ");
		zinssatz = scan.nextDouble();
		zinssatz /= 100;

		// monatlicher Rückzahlungsbetrag
		System.out.print("Geben Sie den monatlichen Betrag ein: ");
		monatlicherBetrag = scan.nextDouble();

		while (saldo > 0) {

			// Anzahl des Monats
			monat++;
			System.out.print("Monat: " + monat);

			// Gesamtbetrag
			gesamtbetrag += monatlicherBetrag;

			// Saldo wird berechnet
			saldo = anfangssaldo + (anfangssaldo * zinssatz);
			saldo = saldo - monatlicherBetrag;
			anfangssaldo = saldo; // anfangssaldo entsprechen den Betrag vom
			
			// Rückzahlungsbetrag unter 0 wird exakt auf 0 gesetzt
			if(saldo < 0)
				System.out.printf("\t\tSaldo: %.2f", (saldo = 0));
			else
				System.out.printf("\t\tSaldo: %.2f", saldo);

			// Gesamtbetrag wird ausgegeben
			System.out.print("\t\tGesamtbetrag: " + gesamtbetrag);
			System.out.println();

		}
	}
}