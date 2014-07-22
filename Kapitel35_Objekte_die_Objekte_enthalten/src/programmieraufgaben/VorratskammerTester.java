package programmieraufgaben;

/*Aufgabe 1 — Interaktion mit dem Anwender.
 *  Modifizieren Sie die VorratskammerTester-Klasse, so dass sie einen Dialog mit dem 
 *  Anwender durchführt:

 Willkommen zu Mutter Hubbards Vorratskammer!

 Die Vorratskammer enthaelt:
 1: Stachelbeermarmelade   04.07.09 12 Unzen.
 2: Erdbeermarmelade   31.09.10   8 Unzen.
 3: Aprikosenmarmelade   31.10.10   16 Unzen.
 Treffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:
 1
 Geben Sie die Menge ein, die aufgetragen werden soll:
 2
 Auftragen von 2 Unzen Stachelbeermarmelade.

 Die Vorratskammer enthaelt:
 1: Stachelbeermarmelade   04.07.09   10 Unzen.
 2: Erdbeermarmelade   31.09.10   8 Unzen.
 3: Aprikosenmarmelade   31.10.10   16 Unzen.
 Treffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:
 2
 Geben Sie die Menge ein, die aufgetragen werden soll:
 25
 Auftragen von 8 Unzen Erdbeermarmelade.

 Die Vorratskammer enthaelt:
 1: Stachelbeermarmelade   04.07.09   10 Unzen.
 2: Erdbeermarmelade   31.09.10   0 Unzen.
 3: Aprikosenmarmelade   31.10.10   16 Unzen.
 Treffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:
 2
 Geben Sie die Menge ein, die aufgetragen werden soll:
 9
 Keine Marmelade im Glas!

 Die Vorratskammer enthaelt:
 1: Stachelbeermarmelade   04.07.09   10 Unzen.
 2: Erdbeermarmelade   31.09.10   0 Unzen.
 3: Aprikosenmarmelade   31.10.10   16 Unzen.
 Treffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:
 -1
 Good-bye

 Das Programm sollte zuerst die Marmelade-Objekte und die Vorratskammer initialisieren 
 und dann:

 Alle verfügbaren Marmelade-Objekte auflisten.
 Den Anwender zur Eingabe auffordern.
 Die Auswahl einlesen.
 Eine Fehlermeldung für eine ungültige Auswahl ausgeben (und wieder von vorne anfangen).
 Den Anwender auffordern eine Aufstrichmenge für die Marmelade einzugeben.
 Die Menge der ausgewählten Marmelade, um die Aufstrichmenge verringern.
 Das Programm beenden, wenn der Anwender bei der Auswahl -1 eingibt, ansonsten wieder 
 von vorne anfangen.

 Verwenden Sie die Marmelade-, Vorratskammer-und VorratskammerTester-Klasse aus dem Test. 
 Kopieren Sie das vollständiges Programm mit der Testklasse: nach Notepad, speichern und 
 kompilieren es.
 */

import java.util.Scanner;

class VorratskammerTester {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		Marmelade stachelbeer = new Marmelade("Stachelbeermarmelade",
				"04.07.09", 12);
		Marmelade erdbeer = new Marmelade("Erdbeermarmelade", "30.09.10", 8);
		Marmelade aprikosen = new Marmelade("Aprikosenmarmelade", "31.10.10",
				16);
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

		System.out.println("Good-bye");
	}
}