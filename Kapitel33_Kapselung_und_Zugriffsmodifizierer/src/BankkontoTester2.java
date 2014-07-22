class BankkontoTester2 {

	public static void main(String[] args) {

		Bankkonto bobsKonto = new Bankkonto("999", "Bob", 100);
		Bankkonto jillsKonto = new Bankkonto("111", "Jill", 500);

		bobsKonto.geldAuszahlen(50);
		bobsKonto.geldEinzahlen(150);
		bobsKonto.geldAuszahlen(50);

		jillsKonto.geldEinzahlen(500);
		jillsKonto.geldAuszahlen(100);
		jillsKonto.geldAuszahlen(100);
		jillsKonto.geldEinzahlen(100);

		bobsKonto.anzeigen();
		jillsKonto.anzeigen();

	}
}