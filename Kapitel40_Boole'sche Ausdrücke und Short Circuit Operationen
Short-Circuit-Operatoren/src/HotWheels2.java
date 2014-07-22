// Sportwagenkauf
// Neuer $25.000 teurer roter Miata Sportwagen.
// Sie brauchen Bargeld oder Kredit ohne Schulden

import java.io.*;

class HotWheels2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));

		String inData;
		int cash, kredit, schulden;

		// Eingabe Bargeld
		System.out.println("Geld in bar?");
		inData = stdin.readLine();
		cash = Integer.parseInt(inData);

		// Eingabe Kreditrahmen
		System.out.println("Kreditrahmen?");
		inData = stdin.readLine();
		kredit = Integer.parseInt(inData);

		// Eingabe Schulden
		System.out.println("Wieviel Schulden haben Sie?");
		inData = stdin.readLine();
		schulden = Integer.parseInt(inData);

		// Prüfen, ob zumindest eine der Voraussetzungen gegeben ist
		if (cash >= 25000 || (kredit >= 25000 && schulden < 1000))
			System.out.println("Fahrzeug kann gekauft werden!");
		else
			System.out
					.println("Haben Sie einmal über die Anschaffung eines Kleinwagen nachgedacht?");

	}
}