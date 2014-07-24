public class Trigonometrie {

	public static void main(String[] args) {

		double zahl, sinx, cosx, ergebnis;
		zahl = 0.5235;
		
		sinx = Math.sin(zahl);
		cosx = Math.cos(zahl);
		
		ergebnis = (Math.pow(sinx, 2)) + (Math.pow(cosx, 2));

		System.out.println("Sinus: " + sinx + "\nCosinus: " + cosx
				+ "\nErgebnis: " + ergebnis);

	}

}
