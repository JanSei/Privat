package programmieraufgaben;

/*
 * Aufgabe 3 — Echo Namen

Schreiben Sie ein Programm, das den Anwender nach dem Vornamen und Nachnamen fragt. 
Dann den Vornamen, so wie er eingegeben wurde, ausgibt und den Nachnamen in 
Großbuchstaben ausgibt.

D:\JavaNotes>java NameEcho
Geben Sie Ihren Namen ein:
Sherlock Holmes

Sherlock HOLMES

D:\JavaNotes>

Dazu müssen Sie die Dokumentation der Stringklasse betrachten und Methoden verwenden, 
die in diesen Aufzeichnungen nicht behandelt wurden:

    public char charAt(int index)
    public String substring( int startIndex ) bzw.
    public String substring( int startIndex, int endIndex )

 */

import java.util.Scanner;

public class EchoNamen {
	
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
		String vorname, nachname, meinEcho;
		
		// Eingaben des Strings
		System.out.print("Bitte geben Sie Ihren Namen ein: ");
		vorname = in.next();
		nachname = in.next();
		
		meinEcho = vorname + " " + nachname.toUpperCase(); // Nachname großgeschrieben
		System.out.println(meinEcho);	// Ausgabe des Strings

		
	}

}
