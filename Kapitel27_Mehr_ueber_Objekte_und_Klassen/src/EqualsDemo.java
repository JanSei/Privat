import java.awt.*;

public class EqualsDemo {
	
	public static void main(String arg[]) {
		
		Point pointA = new Point(7, 99); // erstes Point-Objekt
		Point pointB = new Point(7, 99); // zweites Point-Objekt
											// mit äquivalenten Daten

		if (pointA.equals(pointB))
			System.out
					.println("Die zwei Objekte enthalten die gleichen Daten: "
							+ pointA);
		else
			System.out.println("Die zwei Objekte sind nicht äquivalent: "
					+ pointA + " unterscheidet sich von" + pointB);
	}
}