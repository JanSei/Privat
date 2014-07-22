
public class StringBsp5 {
	
	public static void main(String[] args) {
		
		String strA; // Referenz auf das Objekt
		String strB; // eine weitere Referenz auf das Objekt

		strA = new String("Der Gingham Hund"); // Das einzige Objekt erzeugen.
												// Seine Referenz in strA
												// speichern.
		System.out.println(strA);

		strB = strA; // Die Referenz nach strB kopieren.

		System.out.println(strB);

		if (strA == strB)
			System.out
					.println("Die gleiche Information in jeder der Referenzvariablen.");
		
	}
}