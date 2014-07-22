// Wir müssen offensichtlich eine Bank mit einem höheren Zinssatz als 5 Prozent finden. 
// Angenommen Sie sind bereit 40 Jahre auf Ihre eine Million Dollar zu warten. Wie hoch 
// muss der Zinssatz sein?
//
//Eine Möglichkeit diese Frage zu beantworten wäre verschiedene Zinssätze auszuprobieren, 
//bis Sie einen gefunden hätten der funktioniert. Hier ist ein Programm, das das tut: 

import java.util.Scanner;

public class DollarsNachVierzig {

	private static Scanner scan;

	public static void main(String[] args) {
		
		double dollars = 1000.0;
		int jahre = 1;
		double zinssatz;

		scan = new Scanner(System.in);
		System.out.println("Geben Sie den Zinssatz in Prozent ein:");
		zinssatz = scan.nextDouble() / 100.0;

		while (jahre <= 40) {
			// Zinsen für ein weiteres Jahr addieren
			dollars = dollars + dollars * zinssatz;

			// fügen Sie die jährliche Einzahlung hinzu
			dollars = dollars + 1000;

			jahre = jahre + 1;
		}

		System.out.println("Nach 40 Jahren bei " + zinssatz * 100
				+ " Prozent Zinsen werden Sie " + dollars + " Dollar haben.");
	}
}