import java.awt.*; // Die Klassenbibliothek importieren, in der Point definiert ist

public class AutoConvertBsp {

	public static void main(String arg[]) {
		
		Point pointB = new Point(); // einen Point an der Position x=0, y=0
									// erzeugen

		short a = 12, b = 42;
		pointB.move(a, b); // Die Werte der Parameterliste werden automatisch
							// in den geforderten int-Typ konvertiert

		System.out.println("Neue Position:" + pointB);
	}
}
