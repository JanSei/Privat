
class Buecher extends Waren implements Besteuerbar {
	
	String autor;

	Buecher(String beschreibung, double preis, String autor) {
		super(beschreibung, preis);
		this.autor = autor;
	}

	void anzeigen() {
		super.anzeigen();
		System.out.println("Autor: " + autor);
	}

	public double berechneSteuer() {
		return preis * STEUERSATZ;
	}
}