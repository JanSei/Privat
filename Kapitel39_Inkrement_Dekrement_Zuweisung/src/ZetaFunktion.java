public class ZetaFunktion {

	public double berechneFunktion(long anzahl, int potenz) {
		int term = 0;
		double zFunktion = 0;
		for (int i = 0; i < anzahl; i++) {
			term++;
			for (int j = 1; j < potenz; j++) {
				term *= term;
			}
			zFunktion += 1.0/term;
		}
		return zFunktion;
	}

}
