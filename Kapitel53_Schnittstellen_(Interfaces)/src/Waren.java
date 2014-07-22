
public class Waren {
	
	// Instanzvariablen
	String beschreibung;
	double preis;

	// Konstruktoren
	Waren(String beschreibung, double preis) {
		this.beschreibung = beschreibung;
		this.preis = preis;
	}

	// Methoden
	void anzeigen() {
		System.out.println("Artikel: " + beschreibung + " Preis: " + preis);
	}
}
