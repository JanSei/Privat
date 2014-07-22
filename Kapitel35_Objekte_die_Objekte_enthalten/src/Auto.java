
public class Auto {
	
	// Daten
	private int startMeilen; // Tacho Anfangsstand Meilen
	private int endMeilen; // Tacho Endstand Meilen
	private double gallonen; // verbrauchte Gallonen Benzin

	// Konstruktor
	public Auto(int startTacho, int endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;
	}

	// Methoden
	public double berechneMPG() {		
		return (endMeilen - startMeilen) / gallonen;
	}
	
	// Den Zustand eines Auto ändern, unter der Verwendung der Tachostände und der 
	// Anzahl der verbrauchten Gallonen seit der letzten Tankfüllung.
	void auftanken(int aktuellerTacho, double getankteGalls) {
	    startMeilen = endMeilen;
	    endMeilen   = aktuellerTacho;
	    gallonen    = getankteGalls;
	}
}
