package programmieraufgaben;
public class Feiertag extends Karte {
	
	// Konstruktoren
	public Feiertag(String e, String sex) {
		super(e, sex);
	}

	// Methoden
	public void gruss() {
		System.out.println(anrede + " " + empfaenger + ",\n");
		System.out.println("frohe Feiertage!\n\n");
	}
}