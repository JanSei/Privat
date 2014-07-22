package Programmieraufgaben;

//Ein bestimmtes Arzneimittel verliert jeden Monat 4% seines Wirkstoffgehalts. 
//Wenn sein Wirkstoffgehalt unter 50% fällt, muss es ausgemustert werden. 
//Schreiben Sie ein Programm, das berechnet wie viele Monate eine Arznei gelagert werden kann. 

public class Wirkstoffgehalt_eines_Arzneimittels {
	
	public static void main(String[] args) {

		int monat = 0;
		double wirkstoffgehalt = 100.00;
		
		// Schleife fuer das Zerfall des Wirkstoffsgehalt
		while(wirkstoffgehalt >= 50) {
			
			System.out.print("Monat: " + monat);
			System.out.print("\tWirkstoffgehalt: " + wirkstoffgehalt);
			monat++;
			wirkstoffgehalt *= 0.96;  // Zerfall
		
			System.out.println();
		}
		System.out.print("Monat: " + monat);
		System.out.print("\tWirkstoffgehalt: " + wirkstoffgehalt);
		System.out.print("\tABGELAUFEN !!");
	}

}
