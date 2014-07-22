
public class StringTester2 {

	public static void main(String[] args) {
		
		String str1; // str1 ist eine Variable, die ein String-Objekt
						// bezeichnet.
		String str2; // str2 ist eine Variable, die ein zweites String-Objekt
						// bezeichnet.
		int laenge1, laenge2; // die Länge von str1 und von str2

		str1 = new String("Eier"); // den ersten String erzeugen

		str2 = new String(" und Schinken."); // den zweiten String erzeugen

		laenge1 = str1.length(); // die Länge des ersten Strings ermitteln

		laenge2 = str2.length(); // die Länge des zweiten Strings ermitteln

		System.out.println("Die Gesamtlaenge beider Strings ist "
				+ (laenge1 + laenge2) + " Zeichen");
	}
}