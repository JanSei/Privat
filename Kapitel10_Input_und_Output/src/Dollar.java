import java.util.Scanner;

public class Dollar {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int dollar, cent, zahl;
		
		System.out.println("Geben Sie die Cent ein:");
		zahl = in.nextInt();
		
		cent = zahl % 100;
		dollar = zahl / 100;
		System.out.println("Das ergibt " + dollar 
				+ " Dollar und " + cent + " Cent.");
		
		
		
	}

}
