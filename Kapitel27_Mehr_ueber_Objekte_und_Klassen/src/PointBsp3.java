import java.awt.*;

public class PointBsp3 {

	public static void main(String arg[]) {
		
		Point a = new Point(); // kombinierte Deklaration und Konstruktion
		Point b = new Point(12, 45);
		Point c = new Point(b);

		System.out.println(a); // einen temporären String basierend auf "a"
								// erzeugen und ausgeben
		System.out.println(b); // einen temporären String basierend auf "b"
								// erzeugen und ausgeben
		System.out.println(c); // einen temporären String basierend auf "c"
								// erzeugen und ausgeben
	}
}
