package Programmieraufgaben;
//
//Der Hersteller eines Mikrowellenherds empfiehlt beim Erhitzen von zwei Posten 
//50% mehr Erhitzungszeit und beim Erhitzen von drei Posten, die Erhitzungszeit 
//zu verdoppeln. Das Erhitzen von mehr als drei Posten wird nicht empfohlen.
//
//Schreiben Sie ein Programm, das den Anwender nach der Anzahl der Posten und nach 
//der Erhitzungszeit für einen Posten fragt. Das Programm gibt dann die empfohlene 
//Erhitzungszeit aus.
//
//Hinweis: Verwenden Sie vier aufeinanderfolgende einzweigige if-Anweisungen, 
//wobei jede von ihnen einen von vier Fällen testet: 
//	1 Posten, 2 Posten, 3 Posten, mehr als drei Posten. 
//	
//	Wenn Sie nicht weiterkommen, werfen Sie einen Blick auf das Sportwagen-Programm 
//	in diesem Kapitel. 
	
import java.util.Scanner;

public class Mikrowellenherd {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int tErhitzung, posten;
		
		// Eingabe der Anzahl der Posten
		System.out.print("Geben Sie die Anzahl der Posten ein: ");
		posten = scan.nextInt();
		
		// Eingabe der Erhitzungszeit für einen Posten
		System.out.print("Geben Sie die Erhitzungszeit für einen Posten ein: ");
		tErhitzung = scan.nextInt();
		
		// Posten werden überprüft, und Erhitzungszeit wird berechnet
		if(posten == 1)
			tErhitzung *= 1;
		
		if(posten == 2)
			tErhitzung += ((double)tErhitzung/2);
		
		if(posten == 3)
			tErhitzung *= 2;
		
		if(posten > 3)
			System.out.println("Das Erhitzen von mehr als drei Posten wird nicht empfohlen.");
		
		// Ausgabe der Erhitzungszeit
		System.out.println("Empfohlene Erhitzungszeit: " + tErhitzung);
			
	}

}
