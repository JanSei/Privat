import java.util.Scanner;

public class DasOmscheGesetz {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int u, r;
		double i;
		
		System.out.print("Bitte geben sie die Spannung des Geräts ein: ");
		u = in.nextInt();
		
		System.out.print("Bitte geben sie den Widerstand des Geräts ein: ");
		r = in.nextInt();
		
		i = (u + 0.0)/r;

		System.out.println("Durch das Gerät fließt eine Stromstärke von: " + i + " Ampere");
		System.out.println("Spannung: " + u + " Volt");
		System.out.println("Widerstand: " + r + " Ohm");
		
		
		
	}

}
