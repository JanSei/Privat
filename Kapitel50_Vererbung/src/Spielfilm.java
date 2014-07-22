class Spielfilm extends Videoband {

	String regisseur; // Name des Regisseurs
	String bewertung; // G, PG, R, oder X

	// Konstruktoren
	public Spielfilm(String ttl, int len, String reg, String bew) {
		super(ttl, len); // den Konstruktor der Superklasse verwenden
		regisseur = reg; // initialisieren, was in Spielfilm neu ist
		bewertung = bew;
	}

	public Spielfilm(String ttl, String reg, String bew) {
		super(ttl); // den passenden Konstruktor der Superklasse aufrufen
		regisseur = reg; // die eigenen Elemente von Spielfilm initialisieren
		bewertung = bew;
	}

	// Methoden
	// der Klasse Spielfilm hinzugefügt
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Regisseur: " + regisseur + "  " + bewertung);
	}

}