package programmieraufgaben;


public class Auto3 {
	
	// Instanzvariablen
	private double tachoAnfangsstand;		// Anfangsstand Tachometer lesen
	private double aktuellerTachometerstand;		// Endstand Tachometer lesen
	private double gallonen;		// Benzinverbrauch
	
	// Konstruktoren
	public Auto3(double meilenAnfangsstand) {
		tachoAnfangsstand = meilenAnfangsstand;
	}
	
	// Methoden
	double berechneMPG() {
		return (aktuellerTachometerstand - tachoAnfangsstand)/gallonen;
	}

	void auftanken( double aktTacho, double galls) {
		aktuellerTachometerstand = aktTacho;
		gallonen = galls;
	}
	
	boolean benzinschwein() {
		if(berechneMPG() <= 15.0)
			return true;
		else
			return false;
	}
	
	boolean sparauto() {
		if(berechneMPG() >= 30.0)
			return true;
		else
			return false;
	}
}
