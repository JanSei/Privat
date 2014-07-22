package programmieraufgaben;


import java.lang.Math;

public class Artikel {
	
	// Instanzvariablen
	final double HANDELSSPANNE = 0.6;	// 60 Prozent des Einkaufspreises
	final double MWST = 0.19;		// 19 Prozent
	String artikelNr;
	String bezeichnung;
	double einkaufspreis;
	int lagerzeit;
	
	// Konstruktoren
	public Artikel(String artklNr, String bezeichner, double preisEinkauf, int lagerdauer) {
		artikelNr = artklNr;
		bezeichnung = bezeichner;
		einkaufspreis = preisEinkauf;
		lagerzeit = lagerdauer;
	}
	
	// Methoden
	public void anzeigen() {
		System.out.println("\nArtikelnummer: " + artikelNr + "\nBezeichnung: " + bezeichnung 
				+ " \nEinkaufspreis: " + einkaufspreis + " Verkaufspreis: " + this.berechneVerkaufspreis() 
				+ " Euro \nLagerdauer: " + lagerzeit + " Monate");
	}
	
	public int berechneVerkaufspreis() {
		return (int) ( Math.floor(einkaufspreis + (einkaufspreis*HANDELSSPANNE) - (einkaufspreis*MWST) ));
	}

}
