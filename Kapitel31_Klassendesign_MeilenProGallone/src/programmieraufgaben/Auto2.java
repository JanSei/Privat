package programmieraufgaben;


public class Auto2 {
	
	// Instanzvariablen
	private double startMeilen;		// Anfangsstand Tachometer lesen
	private double endMeilen;		// Endstand Tachometer lesen
	private double gallonen;		// Benzinverbrauch
	
	// Konstruktoren
	public Auto2(double startTacho, double endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;
	}
	
	// Methoden
	double berechneMPG() {
		return (endMeilen - startMeilen)/gallonen;
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
