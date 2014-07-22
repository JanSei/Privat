import java.awt.*;

public class EqualsDemo4 {
	
	public static void main(String arg[]) {
		
		Point pointA = new Point(7, 99); // pointA verweist auf ein Point-Objekt
		Point pointB = pointA; // pointB verweist auf dasselbe Objekt

		if (pointA.equals(pointB)) {
			System.out
					.println("Die zwei Variablen verweisen auf dasselbe Objekt,");
			System.out
					.println("oder auf verschiedene Objekte mit gleichen Daten.");
		} else
			System.out
					.println("Die zwei Variablen verweisen auf verschiedene Objekte");

	}
}