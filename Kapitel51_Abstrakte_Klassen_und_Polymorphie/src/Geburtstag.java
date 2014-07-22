public class Geburtstag extends Karte {
	
	// Instanzvariablen
	int alter;

	// Konstruktoren
	public Geburtstag(String e, int jahre) {
		empfaenger = e;
		alter = jahre;
	}

	// Methoden
	public void gruss() {
		System.out.println("Dear " + empfaenger + ",\n");
		System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
	}
}