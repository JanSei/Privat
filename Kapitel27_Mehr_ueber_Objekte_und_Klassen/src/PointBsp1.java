import java.awt.*; // Klassenbibliothek importieren,
// in der die Point-Klasse definiert ist.

public class PointBsp1 {

	public static void main(String arg[]) {
		
		Point a, b, c; // Referenzvariablen

		a = new Point(); // ein Point-Objekt erzeugen bei ( 0, 0);
							// Referenz in "a" speichern
		b = new Point(12, 45); // ein Point-Objekt erzeugen bei ( 12, 45);
								// Referenz in "b" speichern
		c = new Point(b); // ein Point-Objekt erzeugen,
							// das die gleichen Daten enthält
							// wie die, die durch "b" referenziert werden
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}