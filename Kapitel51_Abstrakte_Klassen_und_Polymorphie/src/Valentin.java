public class Valentin extends Karte {
	
	// Instanzvariablen
	int kuesse;

	// Konstruktoren
	public Valentin(String e, int k) {
		empfaenger = e;
		kuesse = k;
	}

	// Methoden
	public void gruss() {
		System.out.println("Dear " + empfaenger + ",\n");
		System.out.println("herzliche Gruesse und Kuesse,\n");
		for (int j = 0; j < kuesse; j++)
			System.out.print("X");
		System.out.println("\n\n");
	}
}