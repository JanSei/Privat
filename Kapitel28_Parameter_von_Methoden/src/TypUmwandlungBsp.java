import java.awt.*; 	// Die Klassenbibliothek importieren,
					// in der Point definiert ist

public class TypUmwandlungBsp {

	public static void main(String arg[]) {
		
		Point pointB = new Point(); // ein Point-Objekt an der
									// Position x=0, y=0 erzeugen
		pointB.move((int) 14.305, (int) (34.9 - 12.6));
		System.out.println("Neue Position:" + pointB);
	}
}