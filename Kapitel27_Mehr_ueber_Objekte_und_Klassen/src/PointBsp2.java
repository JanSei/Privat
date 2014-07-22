import java.awt.*;

public class PointBsp2 {

	public static void main(String arg[]) {
		
		Point a, b, c; // Referenzvariablen

		a = new Point(); 	// ein Point-Objekt erzeugen bei ( 0, 0 );
							// Referenz in "a" speichern
		b = new Point(12, 45); 	// ein Point-Objekt erzeugen bei ( 12, 45 );
								// Referenz in "b" speichern
		c = new Point(b); 	// ein Point-Objekt erzeugen

		String strA = a.toString(); // ein String-Objekt erzeugen;
									// auf der Basis der Daten,
									// die in dem Objekt gefunden werden,
									// das von "a" referenziert wird
		String strB = b.toString();
		String strC = c.toString();
		
		System.out.println(strA);
		System.out.println(strB);
		System.out.println(strC);
		System.out.println( a.toString() ); // einen temporären String
         									// basierend auf "a" erzeugen
	}
}