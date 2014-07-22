package programmieraufgaben;

public class WarenB {

	// Instanzvariablen
	private String beschreibung;
	private double preis;
	private int anzahl;

	// Konstruktoren
	WarenB(String beschreibung, double preis, int anzahl) {
		this.beschreibung = beschreibung;
		this.preis = preis;
		this.anzahl = anzahl;
	}

	// Methoden
	void anzeigen() {
		System.out.println("\n\nArtikel: " + beschreibung + " \nPreis: " + preis
				+ " \nAnzahl: " + anzahl);
	}
	
	// Getters und Setters da Instanzvariablen private
	
	// fuer die Preise
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	// fuer die Anzahl der Waren (Produkte)
	public double getAnzahl() {
		return anzahl;
	}
	
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
}
