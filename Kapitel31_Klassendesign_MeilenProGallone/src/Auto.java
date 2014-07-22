
public class Auto {
	
	// Instanzvariablen
	private double startMeilen;		// Anfangsstand Tachometer lesen
	private double endMeilen;		// Endstand Tachometer lesen
	private double gallonen;		// Benzinverbrauch
	
	// Konstruktoren
	public Auto(double startTacho, double endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;
	}
	
	// Methoden
	double berechneMPG() {
		return (endMeilen - startMeilen)/gallonen;
	}

}
