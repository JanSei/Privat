class Videoband {
	
	String titel; // Titel des Videos
	int laenge; // Anzahl der Minuten
	boolean vorhanden; // ist das Video vorhanden?
	double verleihpreis;

	// Konstruktor
	public Videoband(String ttl) {
		titel = ttl;
		laenge = 90;
		vorhanden = true;
		verleihpreis = 10.99;
	}

	// Konstruktor
	public Videoband(String ttl, int len) {
		titel = ttl;
		laenge = len;
		vorhanden = true;
	}

	public void anzeigen() {
		System.out.println(titel + ", " + laenge + " Min. verfuegbar: "
				+ vorhanden);
	}

}