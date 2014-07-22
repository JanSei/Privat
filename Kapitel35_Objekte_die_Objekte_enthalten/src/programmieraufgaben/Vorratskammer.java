package programmieraufgaben;

class Vorratskammer {

	// Instanzvariablen
	private Marmelade glas1;
	private Marmelade glas2;
	private Marmelade glas3;
	private Marmelade glasAusgewaehlt;


	// Konstruktoren
	public Vorratskammer(Marmelade glas1, Marmelade glas2, Marmelade glas3) {
		this.glas1 = glas1;
		this.glas2 = glas2;
		this.glas3 = glas3;
		glasAusgewaehlt = null;
	}

	// Aufgabe 2 - weitere Konstruktoren
	public Vorratskammer(Marmelade glas1, Marmelade glas2) {
		this.glas1 = glas1;
		this.glas2 = glas2;
		this.glas3 = null;
	}

	public Vorratskammer(Marmelade glas1) {
		this.glas1 = glas1;
		this.glas2 = null;
		this.glas3 = null;
	}

	// Methoden
	public void ausgeben() {
		if (this.glas1 != null) {
			System.out.print("1: ");
			glas1.ausgeben();
		}
		
		if (this.glas2 != null) {
			System.out.print("2: ");
			glas2.ausgeben();
		}
		
		if (this.glas3 != null) {
			System.out.print("3: ");
			glas3.ausgeben();
		}

	}

	// wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2,
	// oder 3
	public boolean auswaehlen(int glasNummer) {
		if ((glasNummer == 1) & (this.glas1 != null)) {
			glasAusgewaehlt = glas1;
			return true;
		}

		if ((glasNummer == 2) & (this.glas2 != null)) {
			glasAusgewaehlt = glas2;
			return true;
		}

		if ((glasNummer == 3) & (this.glas3 != null)) {
			glasAusgewaehlt = glas3;
			return true;
		}

		return false;
	}

	// Auftragen der ausgewählten Marmelade
	public void auftragen(int unzen) {
		glasAusgewaehlt.auftragen(unzen);
	}
	
	// Ersetzen einer bestimmten Marmelade durch eine selbst eingegebene
	public void ersetzen(Marmelade m, int slot) {
		if(slot == 1)
			this.glas1 = m;
		
		if(slot == 2)
			this.glas2 = m;
		
		if(slot == 3)
			this.glas3 = m;
		
		if((slot != 1) & (slot != 2) & (slot != 3))
			System.out.println("\n### Fehler! Slot existiert nicht!! ###\n\n");
	}
	
	// Mischt die Marmeladed wenn jedes Marmeladenglas 2 oder weniger Unzen hat
	public void gemischteFruechte() {
		int gemischteMenge;
		
		this.ausgeben();
		System.out.println();
		
		if((this.glas1.getMenge() <= 2) & (this.glas2.getMenge() <= 2) & 
				(this.glas3.getMenge() <= 2)) {
			gemischteMenge = this.glas1.getMenge() + this.glas2.getMenge() +
					this.glas3.getMenge();
			
		// Inhalt, Datum und Menge in neues Objekt gesetzt	
		this.glas1.setMenge(gemischteMenge);
		this.glas1.setInhalt("1: Gemischte Fruechte");
		this.glas1.setDatum("19.01.11");
		this.glas2 = null;
		this.glas3 = null;
		System.out.println("\nDie Vorratskammer enthaelt:");
		this.glas1.ausgeben();
		
		System.exit(1);
	}
	}
}