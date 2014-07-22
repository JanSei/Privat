import java.util.Scanner;

public class RegenTester {

	private static Scanner scan;

	public static void main(String[] args) {

	    scan = new Scanner( System.in );
	    String antwort;

	    System.out.print("Regnet es? (J oder N): ");
	    antwort =  scan.next();

	    if ( antwort.equals("J") )  // ist antwort genau "J" ?
	      System.out.println("Scheibenwischer An");  // True-Zweig
	    else
	      System.out.println("Scheibenwischer Aus"); // False-Zweig
	}

}
