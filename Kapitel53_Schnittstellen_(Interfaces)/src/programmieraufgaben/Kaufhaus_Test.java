package programmieraufgaben;

public class Kaufhaus_Test {

	public static void main(String[] args) {

		WarenB[] inventar = new WarenB[10];
		inventar[0] = new SpielwarenB("Cocos Locos", 15.69, 5, 13);
		inventar[1] = new LebensmittelB("Nachos Fritos", 3.39, 10, 50);
		inventar[2] = new BuecherB("Cien años de Soledad", 15.69, 3,
				"Gabriel García Márquez");

		for (WarenB each : inventar) {
			if (each != null) {
				try {
					each.anzeigen();
					System.out.println();
				} catch (NullPointerException npe) {
					// wegen der if-Bedingung muss hier nichts stehen
				}
			}
		}
		
		inventar[2].setPreis(12.99);
		inventar[2].setAnzahl(12);
		inventar[2].anzeigen();
		
		BesteuerbarB best = new SpielwarenB("Asimoo", 199.99, 2, 21);
		
		((SpielwarenB)best).anzeigen();
		System.out.println("Steuer: " + best.berechneSteuer());
		((SpielwarenB)best).setAnzahl(8);
		((SpielwarenB)best).anzeigen();
		
	}
}
