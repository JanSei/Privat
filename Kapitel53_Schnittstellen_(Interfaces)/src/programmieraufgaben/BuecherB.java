package programmieraufgaben;

class BuecherB extends WarenB implements BesteuerbarB {
	
	private String autor;

	BuecherB(String beschreibung, double preis, int anzahl, String autor) {
		super(beschreibung, preis, anzahl);
		this.autor = autor;
	}

	void anzeigen() {
		super.anzeigen();
		System.out.println("Autor: " + autor);
	}

	public double berechneSteuer() {
		return getPreis() * STEUERSATZ;
	}
	
	// Getter und Setter fuer autor
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
}