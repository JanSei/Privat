package Programmieraufgaben;
import java.util.Scanner;

public class HarmonischeMittel {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
		double x, y, amittel, hmittel;
		
		System.out.print("Geben Sie x ein: ");
		x = in.nextDouble();
		
		System.out.print("Geben Sie y ein: ");
		y = in.nextDouble();
		
		amittel = (x + y)/2;
		System.out.print("Arithmetisches Mittel: " + amittel);
		
		hmittel = 2/( (1/x) + (1/y) );
		System.out.println("\nHarmonisches Mittel: " + hmittel);
		
	}

}
