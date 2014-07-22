package programmieraufgaben;

/*
 * Aufgabe 2 — Sonderposten

Leiten Sie eine Klasse Sonderposten von der Klasse Artikel ab. Die Subklasse erweitert 
die Superklasse, um die Instanzvariable rabatt.

Erstellen Sie unter Verwendung des Konstruktors der Superklasse einen Konstruktor, der 
die Objekte der Subklasse initialisiert. Die Initialisierung der Instanzvariablen rabatt 
wird vom Konstruktor je nach Lagerzeit übernommen. Bei einer Lagerzeit größer 12 Monate 
wird ein Rabatt auf dem Verkaufspreis von 30 Prozent gewährt. Andernfalls beträgt der 
Rabatt 10 Prozent.

Schreiben Sie eine Methode anzeigen() für die Subklasse, die die anzeigen() Methode der 
Superklasse überschreibt.

Schreiben Sie eine Methode berechneVerkaufspreis(), die ebenfalls die Methode der 
Superklasse überschreibt.

Die Ausgabe des Programms sieht dann z.B. ungefähr wie folgt aus:

SC123-F "DUFFY MALT Whisky" EK: 10.0 VK: 19 Euro Lagerzeit: 3 Monate

Sonderposten:
SC123-F "DUFFY MALT Whisky" EK: 10.0 VK: 17 Euro Lagerzeit: 3 Monate
(VK <alt>: 19 Euro; Rabatt: 10%)

Sonderposten:
SC347-A "GLEN MORANGIE MALT Whiskey" EK: 55.0 VK: 72 Euro Lagerzeit: 15 Monate
(VK <alt>: 104 Euro; Rabatt: 30%)

 */

public class Sonderposten extends Artikel {
	
	// Instanzvariable
	final double RABATT;

	// Konstruktoren
	public Sonderposten(String artklNr, String bezeichner, double preisEinkauf,
			int lagerdauer) {
		super(artklNr, bezeichner, preisEinkauf, lagerdauer);
		if(lagerdauer > 12)
			RABATT = 0.7;
		else
			RABATT = 0.9;
	}
	
	// Methoden
	public void anzeigen() {
		System.out.println("\nSonderposten:");
		super.anzeigen();
		System.out.println("(Alter Verkaufspreis: " + this.berechneVerkaufspreis()/RABATT
				+ " Euro; Rabatt: " + ((1-RABATT)*100) + "%%");
	}

	public int berechneVerkaufspreis() {
		return (int) ( Math.floor(einkaufspreis + (einkaufspreis*HANDELSSPANNE) - (einkaufspreis*MWST) ));
	}
}
