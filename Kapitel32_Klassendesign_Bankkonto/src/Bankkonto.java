public class Bankkonto {

	// Instanzvariablen
	private String kontonummer;
	private String kontoinhaber;
	private int kontostand;
	private int zaehler = 0;	//zaehlt wie oft das Bankkonto verwendet wird

	// Konstruktoren
	public Bankkonto(String ktoNummer, String ktoInhaber, int start) {
		kontonummer = ktoNummer;
		kontoinhaber = ktoInhaber;
		kontostand = start;
	}

	// Methoden
	private void inkrementZaehler() {
		zaehler++;
	}
	
	public int aktuellerKontostand() {
		return kontostand;
	}

	public void geldEinzahlen(int betrag) {
		inkrementZaehler();
		kontostand = kontostand + betrag;
	}

	public void geldAuszahlen(int betrag) {
		int gebuehr;
		inkrementZaehler();
		if (kontostand < 100000)

			gebuehr = 15;
		else

			gebuehr = 0;

		kontostand = kontostand - betrag - gebuehr;

	}

	public void anzeigen() {
		System.out.println(kontonummer + "\t" + kontoinhaber + "\t"
				+ kontostand + "\t" + zaehler);
	}
}