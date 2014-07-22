
class Lebensmittel extends Waren {
	
	double kalorien;

	Lebensmittel(String beschreibung, double preis, double kalorien) {
		super(beschreibung, preis);
		this.kalorien = kalorien;
	}

	void anzeigen() {
		super.anzeigen();
		System.out.println("Kalorien: " + kalorien);
	}
}
