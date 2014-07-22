import java.util.*;

public class ZweiWuerfel {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		Random rand = new Random();
		String input = "";

		while (!input.equals("q") && !input.equals("Q")) {
			
			System.out.print("Ihr Wurf ist eine "
					+ (rand.nextInt(6) + 1 + rand.nextInt(6) + 1));
			System.out.println("q oder Q fuer 'Quit':");
			input = scan.next();
		}
	}

}