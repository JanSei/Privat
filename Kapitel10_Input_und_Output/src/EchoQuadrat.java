import java.util.Scanner;

public class EchoQuadrat {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
	    int zahl, quadrat; // zwei int-Variablen deklarieren

	    System.out.println("Geben Sie eine Ganzzahl ein:");
	    zahl = in.nextInt();
	    quadrat = zahl * zahl ;  // das Quadrat berechnen

	    System.out.println("Das Quadrat von " + zahl + " ist " + quadrat);
	}

}
