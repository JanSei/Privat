
public class StringBsp4 {
	
	public static void main(String[] args) {
		
		String strA; // Referenz auf das erste Objekt
		String strB; // Referenz auf das zweite Objekt

		strA = new String("Der Gingham Hund"); // Das erste Objekt erzeugen und
												// seine Referenz speichern.

		System.out.println(strA); // Der Referenz auf das erste
									// Objekt folgen und Daten ausgeben.

		strB = new String("Die Calico Katze"); // Das zweite Objekt erzeugen und
												// seine Referenz speichern.

		System.out.println(strB); // Der Referenz auf das zweite
									// Objekt folgen und Daten ausgeben.

		System.out.println(strA); // Der Referenz auf das erste
									// Objekt folgen und Daten ausgeben.

	}
}