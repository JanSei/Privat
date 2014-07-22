package programmieraufgaben;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MeilenProGallone3 {

	private static Scanner in;
	private static double anfangsTacho, aktTacho, galls;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		Auto3 auto1;
		String ablauf;
		
		System.out.print("Neues Auto - Tachometer-Anfangsstand: ");
		anfangsTacho = in.nextDouble();
		
		do {
			
		System.out.println("\n+++ Besuch der Tankstelle +++");
		einlesen();
		auto1 = new Auto3(anfangsTacho);
		auto1.auftanken(aktTacho, galls);
		ausgeben(auto1);
		anfangsTacho = aktTacho;
		
		System.out.println("\nProgramm beenden <j>a <n>ein?");
		ablauf = in.next();
		
		if (ablauf.equals("j"))
			System.exit(0);
		
		} while(ablauf.equals("n"));

	}

	static void einlesen() {
		System.out.println("Aktuellen Tachometerstand eingeben: ");
		aktTacho = in.nextDouble();
		System.out.println("Anzahl der Gallonen fuer die Tankfuellung: ");
		galls = in.nextDouble();
	}

	static void ausgeben(Auto3 einAuto) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print("\nMeilen pro Gallone: "
				+ df.format(einAuto.berechneMPG()));

		if (einAuto.benzinschwein())
			System.out.print("\tAutotyp: Benzinschwein!");

		if (einAuto.sparauto())
			System.out.print("\tAutotyp: Sparauto!");
	}
}