package programmieraufgaben;

public class Katze extends Haustiere {
	
	// Instanzvariablen
	String haltung;
	
	/*
	 * 
    1 - Wohnung
    2 - Artgerecht

	 */

	// Konstruktoren
	public Katze(String name, double futtervorrat, int katzenHaltung) {
		super(name, futtervorrat);
		if(katzenHaltung == 1)
			this.haltung = "Wohnung";
		
		if(katzenHaltung == 2)
			this.haltung = "Artgerecht";
		
		if(katzenHaltung != 1 & katzenHaltung != 2)
			this.haltung = "Ein Alien!";
	}

	// Methoden
	@Override
	public void sprich() {
		System.out.println("\nMiau!");
	}

	@Override
	public void friss() {
		futtervorrat -= 0.5;
		System.out.println(name + ": " + futtervorrat);
	}

	@Override
	public void anzeigen() {
		System.out.println("(Haltung: " + this.haltung + " Der Vorrat fuer " + this.name + " reicht "
				+ this.anzahlTage + " Tage.");
	}
}
