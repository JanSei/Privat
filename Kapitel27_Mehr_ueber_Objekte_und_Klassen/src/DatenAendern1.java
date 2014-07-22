import java.awt.*;

public class DatenAendern1 {
	
	public static void main(String arg[]) {
		
		Point pt = new Point(12, 45); // ein Point-Objekt konstruieren
		System.out.println("Anfangswerte: " + pt);

		pt.move(-13, 49); // x und y des Point-Objekts
							// ändern
		System.out.println("Endwerte: " + pt);
	}
}