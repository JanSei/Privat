import java.util.Scanner;

public class ZahlenTester {

	private static Scanner scan;

	public static void main(String[] args) {

	    scan = new Scanner( System.in );
	    int zahl;

	    System.out.println("Geben Sie ein Ganzzahl ein:");
	    zahl = scan.nextInt();
	    
	    if ( zahl < 0 ) {
	    	System.out.println("Die Zahl " + zahl + " ist negativ");
	    	System.out.println("Negative Zahlen sind kleiner als 0");  // True-Zweig
	    }
	    else {
	    	 System.out.println("Die Zahl " + zahl + " ist positiv");  // False-Zweig
	         System.out.print  ("Positive Zahlen sind groesser ");     // False-Zweig
	         System.out.println("oder gleich Null");                   // False-Zweig
	    }
	    System.out.println("Good-bye fuer jetzt");
	}

}
