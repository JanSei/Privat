
public class Box {
	
	// Instanzvariablen
	double breite;
	double hoehe;
	double laenge;
	
	// Konstruktoren
	public Box(double breite, double hoehe, double laenge) {
		this.breite = breite;
		this.hoehe = hoehe;
		this.laenge = laenge;
	}
	
	// Alle Seiten mit dem gleichen Wert initialisieren - z.B. bei einem Würfel
	public Box(double seite) {
		breite = seite;
		hoehe = seite;
		laenge = seite;
	}

	// Methoden
	double berechneVolumen() {
		return (breite * hoehe * laenge);
	}
	
	double berechneOberflaeche() {
		return ( 2*( (breite*laenge) + (breite*hoehe) + (laenge*hoehe) ));
	}
}
