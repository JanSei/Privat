package programmieraufgaben;

/*
 * Aufgabe 2 — equals()

Schreiben Sie ein Programm, das den Anwender auffordert 5 Integer einzugeben. 
Das Programm wird den Anwender fünfmal auffordern eine Zahl einzugeben. 
Danach wird es die Summe berechnen und ausgeben.

Die Ausgabe des Programms sieht dann ungefähr folgendermaßen aus.

Geben Sie 1. Zahl ein:
11
Geben Sie 2. Zahl ein:
4
Geben Sie 3. Zahl ein:
5
Geben Sie 4. Zahl ein:
1
Geben Sie 5. Zahl ein:
9
Gesamtsumme: 30

Verändern Sie dann das Programm, so dass es am Anfang den Anwender fragt, 
ob er eine Eingabeaufforderung wünscht. Der Anwender gibt "ja" oder "nein" 
ein (nur einmal, am Anfang). Die Schleife wird jetzt entweder eine 
Eingabeauforderung ausgeben oder nicht.

Deklarieren Sie eine weitere Stringvariable antwort und weisen Sie ihr das 
Stringliteral "ja" zu. Vergleichen Sie dann mit der equals() Methode ob der 
vom Anwender eingegebene String äquivalent zur Stringvariablen antwort ist. 
Setzen Sie eine boolesche Variable auf true oder false, je nach dem was der 
Anwender eingegeben hat. Innerhalb der Schleife bestimmt dann eine if-Anweisung 
ob die Eingabeaufforderung ausgegeben wird oder nicht.

Die Ausgabe des Programms sieht dann ungefähr folgendermaßen aus.

Eingabeaufforderung <ja> oder <nein>?
nein
3
5
2
12
8
Gesamtsumme: 30

 */

import java.util.Scanner;

public class IntegerTester {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner( System.in );
		int zahl, summe = 0;
		String anwender, antwort = "ja";
		boolean aufforderung;
		
		System.out.print("Eingabeaufforderung <ja> oder <nein>? ");
		anwender = in.nextLine();
		
		if (anwender.equals(antwort))
			aufforderung = true;
		else
			aufforderung = false;
		
		for (int i = 0; i < 5; i++) {
			
			if (aufforderung == true) 
				System.out.printf("Geben Sie die %d. Zahl ein: ", i+1);
				
			zahl = in.nextInt();
			summe += zahl;
			
		}
		
		System.out.println("Gesamtsumme: " + summe);

		
	}

}
