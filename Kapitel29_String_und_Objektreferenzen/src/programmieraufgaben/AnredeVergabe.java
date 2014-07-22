package programmieraufgaben;

/*
 * Aufgabe 2 — Anrede vergeben

 Schreiben Sie ein Programm, das den Anwender nach seinem Namen fragt und 
 dann den Namen zusammen entweder mit "Ms." oder "Mr." ausgibt, je nachdem 
 ob der Name weiblich oder männlich ist. Angenommen, dass die einzigen weiblichen Namen

 Amy
 Buffy
 Cathy

 und, dass die einzigen männlichen Namen

 Elroy
 Fred
 Graham

 sind. Alle anderen Namen werden ohne Anrede ausgegeben. Das Programm setzt seine 
 Schleifendurchläufe solange fort, bis der Anwender die Eingabe-Taste drückt, 
 ohne zuerst etwas einzugeben.

 D:\JavaNotes>java Anrede
 Geben Sie einen Namen ein:
 Amy Johnson
 Ms. Amy Johnson

 Geben Sie einen Namen ein:
 Fred Smith
 Mr. Fred Smith

 Geben Sie einen Namen ein:
 Zoltan Jones
 Zoltan Jones

 Geben Sie einen Namen ein:

 D:\JavaNotes>

 */


import java.util.Scanner;

public class AnredeVergabe {
	
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
		String meineAnrede;

		do {
			
			// Eingabe des Strings
			System.out.println("Geben Sie einen Namen ein: ");
			meineAnrede = in.nextLine();
			
			// Ausgabe des Strings
			if (meineAnrede.trim().startsWith("Amy")
					| meineAnrede.trim().startsWith("Buffy")
					| meineAnrede.trim().startsWith("Cathy"))
				System.out.println("Ms. " + meineAnrede + "\n");

			else if (meineAnrede.trim().startsWith("Elroy")
					| meineAnrede.trim().startsWith("Fred")
					| meineAnrede.trim().startsWith("Graham"))
				System.out.println("Mr. " + meineAnrede + "\n");
			else
				System.out.println(meineAnrede + "\n");

		} while ((meineAnrede != null) & (meineAnrede.length() > 0)); 
		// Bedingung für Eingabe-Taste wird dadurch erfüllt
	}
}
