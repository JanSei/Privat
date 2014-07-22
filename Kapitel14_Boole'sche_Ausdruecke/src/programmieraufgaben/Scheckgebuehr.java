package programmieraufgaben;

//Eine Bank verfährt nach der folgenden Regel: 
//Wenn ein Kunde auf seinem Girokonto ein Guthaben von mehr als 1000$ 
//oder auf seinem Sparkonto ein Guthaben von mehr als 1500$ hat, 
//wird keine Scheckgebühr erhoben. Andernfalls wird eine Gebühr von 0.15$ erhoben. 
//Schreiben Sie ein Programm, das nach dem Kontostand der beiden Konten fragt und dann ausgibt, 
//ob eine Gebühr erhoben wird oder nicht.

import java.util.Scanner;

public class Scheckgebuehr {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int girokonto, sparkonto;
		double gebuehr = 0.15;
		
		// Abfrage der Kontostände
		System.out.print("Geben Sie den Kontostand ihres Girokontos an: ");
		girokonto = scan.nextInt();
		
		System.out.print("Geben Sie den Kontostand ihres Sparkontos an: ");
		sparkonto = scan.nextInt();
		
		if(girokonto >= 1000 || sparkonto >= 1500)
			System.out.println("\nKeine Scheckgebühr wird erhoben.");
		else {
			System.out.println("\nEine Scheckgebühr von " + (girokonto = (int) (girokonto * gebuehr)) 
					+ " Euros wird aufgrund ihres Guthabens in ihrem Konto erhoben.");
		}
		
		
	}

}
