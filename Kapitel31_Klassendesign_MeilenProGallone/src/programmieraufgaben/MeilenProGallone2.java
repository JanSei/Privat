package programmieraufgaben;

import java.util.Scanner;
import java.text.DecimalFormat;

class MeilenProGallone2 {

	private static Scanner in;
	private static double startTacho, endTacho, galls;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		Auto2 auto1;

		einlesen();
		auto1 = new Auto2(startTacho, endTacho, galls);
		ausgeben(auto1);

	}

	static void einlesen() {
		System.out.println("Geben Sie den Anfangsmeilenstand ein: ");
		startTacho = in.nextDouble();
		System.out.println("Geben Sie den Endmeilenstand ein: ");
		endTacho = in.nextDouble();
		System.out.println("Geben Sie die Gallonen ein: ");
		galls = in.nextDouble();
	}

	static void ausgeben(Auto2 einAuto) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nMeilen pro Gallone: "
				+ df.format(einAuto.berechneMPG()));

		if (einAuto.benzinschwein())
			System.out.println("Benzinschwein!");

		if (einAuto.sparauto())
			System.out.println("Sparauto!");
	}
}

// Lange Version des DecimalFormats - wenn nur einmal angewendet
/*
 * System.out.println("Meilen pro Gallone: " + new
 * java.text.DecimalFormat("0.00").format(auto1 .berechneMPG()));
 */