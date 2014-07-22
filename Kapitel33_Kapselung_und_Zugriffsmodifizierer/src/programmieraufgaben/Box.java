package programmieraufgaben;


import java.text.DecimalFormat;

/** Klasse als Bauplan von Boxen */
public class Box {
	
	DecimalFormat df = new DecimalFormat("0.00");
	// Instanzvariablen
	private double breite;
	private double hoehe;
	private double laenge;
	
	// Konstruktoren
	/** Box mit Breite, Hoehe und Laenge wird erzeugt */
	public Box(double breite, double hoehe, double laenge) {
		this.breite = breite;
		this.hoehe = hoehe;
		this.laenge = laenge;
	}
	
	/** Alle Seiten mit dem gleichen Wert initialisieren - z.B. bei einem Wuerfel */
	public Box(double seite) {
		breite = seite;
		hoehe = seite;
		laenge = seite;
	}
	
	/** Neue Box mit den Werten der alten Box wird erzeugt */
	public Box(Box alteBox) {
		breite = alteBox.getBreite();
		hoehe = alteBox.getHoehe();
		laenge = alteBox.getLaenge();
	}

	// Methoden
	/** Berechnet das Volumen einer Box */
	public double berechneVolumen() {
		return (breite * hoehe * laenge);
	}
	
	/** Berechnet die Oberflaeche einer Box */
	public double berechneOberflaeche() {
		return ( 2*( (berechneFlaecheOben()) + (berechneFlaecheVorn()) 
				+ (berechneFlaecheSeitlich()) ));
	}
	
	// Private Methoden zur berechnung innerhalb dieser Klasse
	// ...koennen nur von dieser Klasse gesehen werden
	private double berechneFlaecheVorn() {
		return breite*hoehe;
	}
	
	private double berechneFlaecheOben() {
		return breite*laenge;
	}
	
	private double berechneFlaecheSeitlich() {
		return hoehe*laenge;
	}
	
	/** Methode die Breite zurueckgibt */
	public double getBreite() {
		return breite;
	}
	
	/** Methode die Hoehe zurueckgibt */
	public double getHoehe() {
		return hoehe;
	}
	
	/** Methode die Laenge zurueckgibt */
	public double getLaenge() {
		return laenge;
	}
	
	/** Methode gibt Laenge, Hoehe und Breite aus */
	public void anzeigen() {
		System.out.print("\n\nLaenge: " + df.format(laenge));
		System.out.print("\nHoehe: " + df.format(hoehe));
		System.out.print("\nBreite: " + df.format(breite));
	}
	
	/** Um 25% groessere Box erzeugen */
	public Box groessereBox() {
		return new Box(1.25*this.breite, 1.25*this.hoehe, 1.25*this.laenge);
	}
	
	/** Um 25% kleiner Box erzeugen */
	public Box kleinereBox() {
		return new Box(0.75*this.breite, 0.75*this.hoehe, 0.75*this.laenge);
	}
	
	/** Passt es oder passt es nicht? */
	public boolean passtIn( Box auessereBox ) {
		if (this.breite <= auessereBox.getBreite() & 
				this.hoehe <= auessereBox.getHoehe() &
				this.laenge <= auessereBox.getLaenge())
			return true;
		else
			return false;
	}
	
}
