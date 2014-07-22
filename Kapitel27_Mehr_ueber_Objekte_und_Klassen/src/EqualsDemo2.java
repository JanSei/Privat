import java.awt.*;

public class EqualsDemo2 {
	
	public static void main(String arg[]) {
		
		Point pointA = new Point(7, 99); // erstes Point-Objekt
		Point pointB = new Point(7, 99); // zweites Point-Objekt
											// mit äquivalenten Daten

		if (pointA == pointB)
			System.out
					.println("Die zwei Variablen verweisen auf dasselbe Objekt");
		else
			System.out
					.println("Die zwei Variablen verweisen auf verschiedene Objekte");

	}
}
