package programmieraufgaben;
import java.util.Scanner;

/*
 * Aufgabe 1 — Bessere Anrede

Das Grusskarten-Beispiel hat in der deutschen Übersetzung einen kleinen Schönheitsfehler. 
Erweitern Sie die abstrakte Klasse Karte um die Instanzvariable String anrede und um einen 
Konstruktor, der die Variablen empfaenger und anrede initialisiert.

Karte( String empfaenger, String sex)

Der Variablen anrede wird dann entweder der String "Liebe" oder "Lieber" zugewiesen. Passen 
Sie die Subklassen und das Testprogramm entsprechend an.

Liebe Ann,

frohe Feiertage!


Lieber Bob,

Alles Gute zum 55. Geburtstag.


Liebe Joan,

Herzliche Gruesse und Kuesse.

XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


 */

public class KarteTester {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
	    String name;
	    scan = new Scanner( System.in );

	    System.out.println("Ihr Name");
	    name = scan.nextLine();
	    
	    System.out.println("Ihr Geschlecht?");
	    String geschlecht = scan.next();

	    Feiertag   feiern = new Feiertag( name, geschlecht );
	    feiern.gruss();

	    Geburtstag  geb  = new Geburtstag( name, 21, geschlecht );
	    geb.gruss();
	    
	    Valentin val = new Valentin(name, 10, geschlecht);
	    val.gruss();
	}
}