package Programmieraufgaben;

//Schreiben Sie ein Programm, das Quadrat- und Kubikzahlen (Integer) von 1 bis n addiert. 
//Wobei n vom Anwender eingegeben wird. 
//
//Verwenden Sie nur eine Schleife

import java.util.Scanner;

public class Addition_von_Quadrat_und_Kubikzahlen {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int n, quadratSumme = 0, kubikSumme = 0, quadratInt, kubikInt;
		
		// Das Grenzwert der Integers
		System.out.println("Geben Sie n ein:");
		n = scan.nextInt();
		
		int i = 1;
		//Schleife berechnet beide Arten von Summen
		while ( i <= n) {
			quadratInt = i*i; //Quadrat der zu summierenden Integers 
			kubikInt = i*i*i; //Kubik der zu summierenden Integers
			quadratSumme += quadratInt;
			kubikSumme += kubikInt;
			i++;
		}
		System.out.print("Die Quadratsumme ist: " + quadratSumme);
		System.out.print("\nDie Kubiksumme ist: " + kubikSumme);
		
	}

}
