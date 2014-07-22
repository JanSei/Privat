package programmieraufgaben;

/*
 * Aufgabe 1 — Old Scotch

Erstellen Sie eine Klasse Artikel mit den Instanzvariablen artikelNr, bezeichnung, 
einkaufspreis und lagerzeit (Monate). Deklarieren Sie zwei Konstanten:

    final double  HANDELSSPANNE = 0.6  ; // 60 Prozent des Einkaufspreises
    final double  MWST          = 0.19 ; // 19 Prozent

Erstellen Sie einen Konstruktor, der die Artikelobjekte initialisiert (alle Instanzvariablen).

Schreiben Sie eine öffentliche anzeigen() Methode, die die Artikelinformationen ausgibt und 
eine öffentliche Methode zum Berechnen des Verkaufspreises:

    public int berechneVerkaufspreis()

Der Verkaufspreis ergibt sich aus der Summe von Einkaufspreis und Handelsspanne zuzüglich 
Mehrwertsteuer. Das Ergebnis wird auf eine ganze Zahl abgerundet.

Erzeugen Sie in der Klasse ArtikelTester zwei Artikelobjekte und testen Sie die Methoden.

Die Ausgabe des Programms sieht dann z.B. folgendermaßen aus:

SC123-F "DUFFY MALT Whisky" EK: 10.0 VK: 19 Euro Lagerzeit: 3 Monate
SC347-A "GLEN MORANGIE MALT Whisky" EK: 55.0 VK: 104 Euro Lagerzeit: 15 Monate

 */

public class ArtikelTester {

	public static void main(String[] args) {

		Artikel artikelA = new Artikel("SC123-F", "DUFFY MALT Whisky", 10.0, 3);
		Artikel artikelB = new Artikel("SC347-A", "GLEN MORANGIE MALT Whisky", 55.0, 15);
		
		artikelA.anzeigen();
		artikelB.anzeigen();
		
		Sonderposten artikelA2 = new Sonderposten("SC123-F", "DUFFY MALT Whisky", 10.0, 3);
		Sonderposten artikelB2 = new Sonderposten("SC347-A", "GLEN MORANGIE MALT Whisky", 55.0, 15);
		
		artikelA2.anzeigen();
		artikelB2.anzeigen();
	}

}
