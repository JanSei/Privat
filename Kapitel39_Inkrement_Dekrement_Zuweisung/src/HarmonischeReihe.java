
public class HarmonischeReihe {
	
	double berechneSumme(int anzahl) {
		int term = 1;
		double summe = 0.0;

		while (term <= anzahl) {
			summe += 1.0 / term; // addiere den nächsten Term zur Summe
			term++; // inkrementiere term
		}

		return summe;
	}
}