package Programmieraufgaben;

//Schreiben Sie ein Programm, das die folgende Summe berechnet:
//
//summe = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/n
//
//Die Variable n ist ein Integer, bis zu dem die Reihe berechnet werden soll. 
//Sie wird vom Anwender eingegeben.

import java.util.Scanner;

public class Summe_n {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int n;
		double summe = 0;
		
		// n eingeben
		System.out.println("Geben Sie n ein:");
		n = scan.nextInt();
		
		int i = 1;
		//Summenreihe
		while(i <= n) {
			summe += (1.0/i);
			i++;
		}
		//Summe ausgeben
		System.out.print("Die Summe ist: " + summe);
	}

}
