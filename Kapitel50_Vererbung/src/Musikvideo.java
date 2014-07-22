
public class Musikvideo extends Videoband {
	
	// Instanzvariablen
	String kuenstler;		// Der Kuenstler
	String kategorie;		// Die Musikkategorie
	
	// Konstruktoren
	public Musikvideo(String ttl, int len, String kuenstler, String kategorie) {
		super(ttl, len);
		this.kuenstler = kuenstler;
		this.kategorie = kategorie;
	}
	
	// Methoden
	public void anzeigen() {
		super.anzeigen();
		System.out.println("Kuenstlername: " + kuenstler + "\nMusikkategorie: " + kategorie);
	}

}
