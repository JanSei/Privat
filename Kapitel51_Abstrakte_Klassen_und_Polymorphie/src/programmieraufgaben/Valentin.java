package programmieraufgaben;
public class Valentin extends Karte {
	
	// Instanzvariablen
	int kuesse;

	// Konstruktoren
	public Valentin(String e, int k, String sex) {
		super(e, sex);
		kuesse = k;
	}

	// Methoden
	public void gruss() {
		System.out.println(anrede + " " + empfaenger + ",\n");
		System.out.println("herzliche Gruesse und Kuesse,\n");
		for (int j = 0; j < kuesse; j++)
			System.out.print("X");
		System.out.println("\n\n");
	}
}