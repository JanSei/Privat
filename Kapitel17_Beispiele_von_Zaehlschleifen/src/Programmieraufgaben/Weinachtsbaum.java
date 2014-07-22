package Programmieraufgaben;

//Schreiben Sie ein Programm, das einen Baum aus Sternen auf den Bildschirm ausgibt:

import java.util.Scanner;

public class Weinachtsbaum {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int baumhoehe, kopfhoehe, stammhoehe, kopfbreite, stammbreite;

		// Baumhoehe eingeben
		System.out.print("Geben Sie die Baumhoehe ein: ");
		baumhoehe = scan.nextInt();

		kopfhoehe = (baumhoehe * 70)/100; 	// Goldener Schnitt
		stammhoehe = baumhoehe - kopfhoehe;
		kopfbreite = 2 * kopfhoehe - 1;
		stammbreite = 0;
		
		if (stammhoehe % 2 == 0)
			stammbreite = stammhoehe - 1;
		else
			stammbreite = stammhoehe;
		
		// Baumhoehe
		for (int i = 1; i <= kopfhoehe; i++) {
			// Linke Leerzeichen
			for (int j = 0; j < ((kopfbreite - (2 * i - 1)) / 2); j++) {
				System.out.print(" ");
			}
			// Sternchen
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Rechte Leerzeichen
			for (int l = 0; l < ((kopfbreite - (2 * i - 1)) / 2); l++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		// Stammm
		for (int i = 1; i <= stammhoehe; i++) {
			// Linke Leerzeichen
			for (int j = 0; j < (kopfbreite-stammbreite)/2; j++) {
				System.out.print(" ");
			}
			// Sternchen
			for (int k = 1; k <= stammbreite; k++) {
				System.out.print("*");
			}
			// Rechte Leerzeichen
			for (int l = 0; l < (kopfbreite-stammbreite)/2; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

		// // Schleifen fuer die Baumstruktur
		// int b = n * 2 - 1; //Ungerade Zahlen
		//
		// char[][] tree = new char[n][b];
		//
		// for (int i = 0; i < n; i++) {
		// for (int j = (b - 1) / 2 - i; j < (i + n); j++)
		// tree[i][j] = '*';
		//
		// for (int k = 0; k < (b - 2 * i - 1); k++) {
		// if (tree[i][k] != '*')
		// tree[i][k] = ' ';
		// }
		// for (char each : tree[i])
		// System.out.print(each);
		// System.out.println();
		// }
	}
}
