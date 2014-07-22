package programmieraufgaben;

//Beim State Fair Pie Eating Contest müssen alle Teilnehmer 
//in der Schwergewichtsklasse zwischen 235 und 265 Pfund wiegen. 
//Schreiben Sie ein Programm, das nach dem Gewicht des Teilnehmers 
//fragt und dann ausgibt, ob er zum Wettbewerb zugelassen ist oder nicht. 

import java.util.Scanner;

public class WettbewerbTortenEssen {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
		int gewicht;
		
		// Gewichteingabe
		System.out.print("Geben Sie ihr Gewicht ein: ");
		gewicht = scan.nextInt();
		
		// Ueberprueft ob Teilnehmer zugelassen wird oder nicht
		if(gewicht >= 235 && gewicht <= 265)
			System.out.println("\nGlückwunsch, und willkommen beim State Fair Pie Eating Contest!");
		else
			System.out.println("\nEs tut uns leid, aber aufgrund ihres Gewichts können Sie nicht teilnehmen...");
		
	}

}
