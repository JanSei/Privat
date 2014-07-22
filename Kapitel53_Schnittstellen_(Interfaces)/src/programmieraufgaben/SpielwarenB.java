package programmieraufgaben;

class SpielwarenB extends WarenB implements BesteuerbarB {
	
	// Instanzvariablen
	
	private int mindestalter;

	// Konstruktor
	
	SpielwarenB(String beschreibung, double preis, int anzahl, int mindestalter) {
		super(beschreibung, preis, anzahl);
		this.mindestalter = mindestalter;
	}

	// Methoden
	
	void anzeigen() {
		super.anzeigen();
		System.out.println("Mindestalter: " + mindestalter);
	}

	public double berechneSteuer() {
		return getPreis() * STEUERSATZ;
	}
	
	// Getter und Setter fuer mindestalter
	public int getMindestalter() {
		return mindestalter;
	}

	public void setMindestalter(int mindestalter) {
		this.mindestalter = mindestalter;
	}
}