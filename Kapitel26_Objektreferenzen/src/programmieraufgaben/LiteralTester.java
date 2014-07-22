package programmieraufgaben;

/*
 * Aufgabe 1 — Der == - Operator

Erstellen Sie eine Klasse LiteralTester und deklarieren Sie vier 
Stringvariablen str1, str2, str3 und str4. Erzeugen Sie dann ein 
Stringliteral "Bo, die Katze" und weisen Sie dieses Stringliteral 
den beiden Referenzvariablen str1 und str2 zu. Erzeugen Sie danach 
für die beiden Referenzvariablen str3 und str4 mit dem new-Operator 
jeweils ein Stringobjekt mit dem Inhalt "Fred, der Hund".

Überprüfen Sie anschließend mit dem == -Operator, ob die Referenzvariablen 
str1 und str2 auf dasselbe Objekt verweisen. Überprüfen Sie ebenfalls mit 
dem == -Operator, ob die Referenzvariablen str3 und str4 auf dasselbe Objekt verweisen.

Ermitteln Sie die Anzahl der Stringobjekte und geben Sie das Ergebnis auf 
den Bildschirm aus. Die Ausgabe des Programms sieht dann folgendermaßen aus.
 */

public class LiteralTester {

	public static void main(String[] args) {

		String str1, str2, str3, str4;
		str1 = "Bo, die Katze";
		str2 = "Bo, die Katze";
		str3 = new String("Fred, der Hund");
		str4 = new String("Fred, der Hund");

		if (str1 == str2)
			System.out
					.println("Die Referenzvariablen str1 und str2 verweisen auf dasselbe Objekt.");
		else
			System.out
					.println("Die Referenzvariablen str1 und str2 verweisen NICHT auf dasselbe Objekt.");

		if (str3 == str4)
			System.out
					.println("Die Referenzvariablen str3 und str4 verweisen auf dasselbe Objekt.");
		else
			System.out
					.println("Die Referenzvariablen str3 und str4 verweisen NICHT auf dasselbe Objekt.");

		System.out.println("Es wurden " + count(str1, str2, str3, str4) + " Objekte erzeugt.");
	}

	// Objektreferenzen werden gezählt
	private static int count(String... s) {
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] != s[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}

}
