package Programmieraufgaben;

//Schreiben Sie ein Programm, das x n berechnet, wobei x eine Gleitpunktzahl 
//und n ein positiver Integer ist. Bei der Eingabe einer negativen Zahl, wird 
//das Programm den Anwender informieren, dass n positiv sein muss. 

import java.util.Scanner;

public class PotenzEinerZahl {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int x, n;
		double potenzwert = 1;

		// Basis des Exponents
		System.out.println("Geben Sie x ein:");
		x = scan.nextInt();

		// Exponent
		System.out.println("Geben Sie n ein:");
		n = scan.nextInt();

		
		if (n < 0) //Ueberprueft ob n eine negative Zahl ist
			System.out.println("n muss ein positiver Integer sein.");
		else {
			// Der Potenzverlauf - Wert der Potenz
			int potenz = 1;
			while (potenz <= n) {
				
				potenzwert *= x;
				potenz++;
				
			}
			System.out.println(x + " hoch " + n + " ergibt: " + potenzwert);
		}
	}

}
