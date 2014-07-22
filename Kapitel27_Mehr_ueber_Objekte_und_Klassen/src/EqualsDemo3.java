import java.awt.*;

public class EqualsDemo3 {
	
	public static void main(String arg[]) {
		
		Point pointA = new Point(7, 99); // pointA verweist auf ein Point-Objekt
		Point pointB = pointA; // pointB verweist auf dasselbe Objekt

		if (pointA == pointB)
			System.out
					.println("Die beiden Variablen verweisen auf dasselbe Objekt");
		else
			System.out
					.println("Die beiden Variablen verweisen auf verschiedene Objekte");
	}
}