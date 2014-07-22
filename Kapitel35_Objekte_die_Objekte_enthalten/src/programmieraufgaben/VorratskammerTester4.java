package programmieraufgaben;

/*
 * Aufgabe 4 — gemischte Früchte

Fügen Sie der Vorratskammer-Klasse eine weitere Methode hinzu:

public void gemischteFruechte()

Diese Methode überprüft, ob jedes Marmeladenglas in der Vorratskammer 2 Unzen oder weniger 
hat und ersetzt, wenn dem so ist das erste Marmeladenglas durch ein Glas gemischter Früchte. 
Die Menge ergibt sich aus der kombinierten Menge aller ursprünglicher Gläser. Die letzten 
zwei Gläser werden auf null gesetzt. (Mit anderen Worten, diese Methode mischt die Marmelade 
aller drei Gläser, um ein neues Glas zu erzeugen, das die alten ersetzt.) Modifizieren Sie 
das Testprogramm, um diese neue Methode zu verwenden. Hier ist die beispielhafte Ausgabe eines 
Testprogramms:

Willkommen zu Mutter Hubbards Vorratskammer!

Die Vorratskammer enthaelt:
1: Stachelbeer   04.07.09   4 Unzen.
2: Erdbeer   30.09.10   1 Unzen.
3: Aprikosen   31.10.10   2 Unzen.

Treffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:
1
Geben Sie die Menge ein, die aufgetragen werden soll:
2
Auftragen von 2 Unzen Stachelbeermarmelade

Die Vorratskammer enthaelt:
1: Stachelbeer   04.07.09   2 Unzen.
2: Erdbeer   30.09.10   1 Unzen.
3: Aprikosen   31.10.10   2 Unzen.

Die Vorratskammer enthaelt:
1: Gemischte Fruechte   19.01.11   5 Unzen.

 */

import java.util.Scanner;

public class VorratskammerTester4 {

		private static Scanner in;

		public static void main(String[] args) {

			in = new Scanner( System.in );
			Marmelade stachelbeer = new Marmelade("Stachelbeermarmelade",
					"04.07.09", 4);
			Marmelade erdbeer = new Marmelade("Erdbeermarmelade", "30.09.10", 1);
			Marmelade aprikosen = new Marmelade("Aprikosenmarmelade", "31.10.10", 2);
			int menge, eingabe;

			// Willkommensgruß
			System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");

			Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer,
					aprikosen);

			// Interaktion mit Anwender
			do {
				System.out.println("\nDie Vorratskammer enthaelt:");
				vorrat.ausgeben();

				// Auswahl
				System.out
						.println("\nTreffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:");
				eingabe = in.nextInt();
				vorrat.auswaehlen(eingabe);

				if (eingabe == -1)
					break;
				
				// aufgetragene Menge - wenn's geht
				if (vorrat.auswaehlen(eingabe)) {
					System.out
							.println("Geben Sie die Menge ein, die aufgetragen werden soll:");
					menge = in.nextInt();
					vorrat.auftragen(menge);
				} else
					System.out.println("### Fehler! Auswahl existiert nicht!! ###");

				vorrat.gemischteFruechte();
				
			} while (true);
		}
	}
