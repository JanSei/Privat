package programmieraufgaben;


public class Marmelade {
	
	// Instanzvariablen
	private String inhalt; // Art der Frucht im Glas
	private String datum; // Datum des Abfüllens
	private int menge; // Menge der Marmelade im Glas

	// Konstruktor
	public Marmelade(String inhalt, String datum, int menge) {
		this.inhalt = inhalt;
		this.datum = datum;
		this.menge = menge;
	}

	// Methoden
	public boolean istLeer() {
		return (menge == 0);
	}

	public void ausgeben() {
		System.out.println(inhalt + "   " + datum + "   " + menge + " Unzen.");
	}

	public void auftragen(int unzen) {
		if (!istLeer()) {
			if (unzen <= menge) {
				System.out.println("Auftragen von " + unzen + " Unzen "
						+ inhalt);
				menge = menge - unzen;
			} else {
				System.out.println("Auftragen von  " + menge + " Unzen "
						+ inhalt);
				menge = 0;
			}
		} else
			System.out.println("Keine Marmelade im Glas!");
	}
	
	public void setMenge(int addierteMenge) {
		this.menge = addierteMenge;
	}
	
	public int getMenge() {
		return menge;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	
}