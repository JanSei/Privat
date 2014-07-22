
class Spielwaren extends Waren implements Besteuerbar {
	
	int mindestalter;

	Spielwaren(String beschreibung, double preis, int mindestalter) {
		super(beschreibung, preis);
		this.mindestalter = mindestalter;
	}

	void anzeigen() {
		super.anzeigen();
		System.out.println("Mindestalter: " + mindestalter);
	}

	public double berechneSteuer() {
		return preis * STEUERSATZ;
	}
}