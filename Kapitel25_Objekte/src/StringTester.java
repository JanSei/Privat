

public class StringTester {

	public static void main(String[] args) {
		String str; // str ist eine Variable, die ein Objekt bezeichnet,
					// aber das Objekt existiert noch nicht.
		int laenge; // laenge ist eine primitive Variable vom Typ int

		str = new String("Zufaellige Notizen"); // erzeugt ein Objekt vom Typ
												// String

		laenge = str.length(); // Ruft die length() Methode des Objekts str auf

		System.out.println("Der String str ist " + laenge + " Zeichen lang");
	}
}