
public class Quadratgleichung {

	public static void main(String[] args) {

		double x = 0.0;
		double ergebnis = 0;
				
		ergebnis = 3*x*x - 8*x + 4;
		
		System.out.println("Bei " + x + 
				" ergibt die Quadratgleichung den Wert " 
				+ ergebnis );
		x = 2.0;
		ergebnis = 3*x*x - 8*x + 4;
		System.out.println("Bei " + x + 
				" ergibt die Quadratgleichung den Wert " 
				+ ergebnis );
		x = 4.0;
		ergebnis = 3*x*x - 8*x + 4;
		System.out.println("Bei " + x + 
				" ergibt die Quadratgleichung den Wert " 
				+ ergebnis );
	}

}
