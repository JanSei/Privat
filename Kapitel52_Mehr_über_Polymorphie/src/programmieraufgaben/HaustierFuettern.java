package programmieraufgaben;

public class HaustierFuettern {
	
	public static void main(String[] args) {

		Hund meinHund = new Hund("Strolchie", 5.0, 1);
		Katze meineKatze = new Katze("Minka", 5.0, 1);
		
		meineKatze.fuettern();
		meineKatze.anzeigen();
		
		meinHund.fuettern();
		meinHund.anzeigen();

	}

}
