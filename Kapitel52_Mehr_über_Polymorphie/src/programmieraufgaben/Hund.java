package programmieraufgaben;

public class Hund extends Haustiere{
	
	// Instanzvariablen
	String kategorie;
	
	/*
	 * 
    1 - Kleinhunde
    2 - Mittelgrosse Hunde
    3 - Große Hunde

	 */

	// Konstruktoren
	public Hund(String name, double futtervorrat, int hundKategorie) {
		super(name, futtervorrat);
		if(hundKategorie == 1)
			this.kategorie = "Kleinhunde";
		
		if(hundKategorie == 2)
			this.kategorie = "Mittelgrosse Hunde";
		
		if(hundKategorie == 3)
			this.kategorie = "Große Hunde";
		
		if(hundKategorie != 1 & hundKategorie != 2 & hundKategorie != 3)
			this.kategorie = "Ein verkackter Alien";
	}

	// Methoden
	@Override
	public void sprich() {
		System.out.println("\nWuff!");
	}

	@Override
	public void friss() {
		futtervorrat -= 1.0;
		System.out.println(name + ": " + futtervorrat);
	}
	
	@Override
	public void anzeigen() {
		System.out.println("(Kategorie: " + this.kategorie + ") Der Vorrat fuer " + this.name + " reicht "
				+ this.anzahlTage + " Tage.");
	}

}
