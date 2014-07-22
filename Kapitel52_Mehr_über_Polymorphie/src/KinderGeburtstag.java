public class KinderGeburtstag extends Geburtstag {

	// Konstruktoren
	public KinderGeburtstag(String e, int jahre) {
		super(e, jahre);
	}

	// Methoden
	public void gruss() {
		super.gruss();
		System.out.println("Was bist du gross geworden!!\n");
	}

	// zusätzliche Methode — überschreibt nicht die Methode der Superklasse
	public void gruss(String absender) {
		super.gruss();
		System.out.println("Was bist du gross geworden!!\n");
		System.out.println("In Liebe, " + absender + "\n");
	}
}