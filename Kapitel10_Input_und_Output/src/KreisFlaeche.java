import java.util.Scanner;

public class KreisFlaeche {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int radius;
		double flaeche;
		
		System.out.println("Geben Sie den Radius ein:");
		radius = scan.nextInt();
		
		flaeche = radius*radius*Math.PI;
		
		System.out.println("Der Radius ist: " + radius);
		System.out.println("Die Flaeche betraegt: " + flaeche);
		
	}



}
