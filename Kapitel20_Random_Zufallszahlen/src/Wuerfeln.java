import java.util.Random;
import java.util.Scanner;

public class Wuerfeln {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		Random rand = new Random();
		String zeile = "";

		while (!zeile.equals("q") && !zeile.equals("Q")) {
			
			System.out.print("Ihr Wurf ist eine " + (rand.nextInt(11) - 5));
			System.out.println("\nq oder Q fuer 'Quit':");
			zeile = scan.next();
		}
	}
}