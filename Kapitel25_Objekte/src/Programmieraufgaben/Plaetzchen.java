package Programmieraufgaben;

public class Plaetzchen {

	// Instanzvariablen
	String sorte;
	String groesse;
	String form;
	boolean verzierungJaNein = false;
	
	public Plaetzchen(String sorte) {
		if(sorte.equals("Kokos")) {
			this.sorte = "Kokos";
			groesse = "mittel";
			form = "rund";
		}
		if(sorte.equals("Affennuss")) {
			this.sorte = "Affennuss";
			groesse = "klein";
			form = "rund";
		}
		if(sorte.equals("Honigkuchen")) {
			this.sorte = "Honigkuchen";
			groesse = "gross";
			form = "rechteckig";
			verzierungJaNein = true;
		}
	}

	// Instanzmethode
	public void ausgeben() {
		// gibt Informationen über die Plätzchen aus z.B.
		// Sorte Kokos, Groesse mittel, Form rund
		String verzierung;
		
		if(verzierungJaNein == true)
			verzierung = "ja";
		else
			verzierung = "nein";
			
		System.out.println("Sorte " + sorte + ", Groesse " + groesse + 
				", Form " + form + ", Verzierung " + verzierung);
	
	}

	// Test der Klasse Plaetzchen
	public static void main(String[] args) {

		/*
		 * (1) Erzeugen Sie mit dem new-Operator ein Objekt der Klasse
		 * Plaetzchen. Plaetzchen plaetzchen1 = new Plaetzchen(); // Der
		 * Standardkonstruktor wird von Java zur Verfügung gestellt. (2) Weisen
		 * Sie über die Punktnotation referenzvariable.instanzvariable den
		 * Instanzvariablen des Objekts Werte zu. (3) Lassen Sie dann das
		 * Plaetzchen-Objekt seine Methode ausgeben() aufrufen. (4) Testen Sie
		 * Ihr Programm. (5) Erzeugen Sie zwei weitere Plaetzchen-Objekte und
		 * verfahren Sie wie oben.
		 */
	

		Plaetzchen plaetzchen1 = new Plaetzchen("Kokos");
		Plaetzchen plaetzchen2 = new Plaetzchen("Affennuss");
		Plaetzchen plaetzchen3 = new Plaetzchen("Honigkuchen");
		
		System.out.println("+++ Plaetzchenliste +++\n");
		plaetzchen1.ausgeben();
		plaetzchen2.ausgeben();
		plaetzchen3.ausgeben();
	}
}