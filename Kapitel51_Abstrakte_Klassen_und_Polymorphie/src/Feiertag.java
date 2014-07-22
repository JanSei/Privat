public class Feiertag extends Karte {
	
	// Konstruktoren
	public Feiertag(String e) {
		empfaenger = e;
	}

	// Methoden
	public void gruss() {
		System.out.println("Dear " + empfaenger + ",\n");
		System.out.println("frohe Feiertage!\n\n");
	}
}