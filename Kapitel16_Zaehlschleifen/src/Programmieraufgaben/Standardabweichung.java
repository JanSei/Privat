package Programmieraufgaben;

//Schreiben Sie ein Programm, das die Standardabweichung für eine Reihe von Gleitpunktzahlen 
//berechnet, die vom Anwender eingegeben werden. Zuerst teilt der Anwender mit wie viele 
//Zahlen N folgen werden. Dann wird das Programm die Gleitpunktzahlen anfordern und nacheinander 
//einlesen. Schließlich wird es die Standardabweichung ausgeben. Die Standardabweichung für 
//einen Satz Zahlen Xi ist:
//
//SD = Math.sqrt( durchschnittQ - durchschnitt2 )
//
//Dabei ist durchschnitt der Durchschnitt der Zahlen N und durchschnitt2 ist das 
//Quadrat des Durchschnitts.
//
//durchschnittQ ist der Durchschnitt von Xi * Xi. Mit anderen Worten, es ist der 
//Durchschnitt der quadrierten Werte aller Gleitpunktzahlen.
//
//Zum Beispiel, wenn N = 4 und, angenommen die Zahlen wären:
//	
//	
//	dann ist
//
//	durchschnitt = 8.0/4 = 2.0
//	durchschnitt2 = 4.0
//
//	durchschnittQ = 18.0/4 = 4.5
//
//	SD = Math.sqrt( 4.5 - 4.0 ) = Math.sqrt( .5 ) = 0.7071067811865476
//
//	Um das zu tun, werden Sie mehrere Dinge innerhalb des Schleifenkörpers 
//	für jeden Gleitpunktwert tun müssen. Die Gleitpunktwerte müssen addiert 
//	werden und die Quadrate der Gleitpunktwerte müssen addiert werden. Dann, 
//	nachdem die Schleife fertig ist, wenden Sie die Formel an.

import java.util.Scanner;

public class Standardabweichung {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		double SD, durchschnitt1, durchschnitt2, durchschnittQ,
				summe1 = 0, summe2 = 0, x1, x2;
		int N;
		
		//N Zahlen folgen
		System.out.print("Geben Sie N ein: ");
		N = scan.nextInt();
		
		//Gleitpunktzahlen eingeben
		for(int i = 0; i < N; i++) {
			System.out.print("Bitte geben Sie die " + (i+1) + "-te Zahl ein: ");
			x1 = scan.nextDouble();
			x2 = x1 * x1;
			summe1 += x1;
			summe2 += x2;
		}
		durchschnitt1 = summe1/N; //Durchschnitt der Zahlen N
		durchschnitt2 = durchschnitt1 * durchschnitt1; //Quadrat des Durchschnitts
		durchschnittQ = summe2/N; //Durchschnitt der quadrierten Werte aller Gleitpunktzahlen
		
		//Standardabweichung bestimmen
		SD = Math.sqrt( durchschnittQ - durchschnitt2 );
		
		//Standardabweichung ausgeben
		System.out.println("\nStandardabweichung für "+ N +" Gleitpunktzahlen: " + SD);
	}

}
