package programmieraufgaben;
public class Geburtstag extends Karte {
	
	// Instanzvariablen
	int alter;

	// Konstruktoren
	public Geburtstag(String e, int jahre, String sex) {
		super(e, sex);
		alter = jahre;
	}

	// Methoden
	public void gruss() {
		System.out.println(anrede + " " + empfaenger + ",\n");
		System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
	}
}