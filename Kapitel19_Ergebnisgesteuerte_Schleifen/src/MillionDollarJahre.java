//Was, wenn Sie daran interessiert wären ein Millionär zu werden? 
//Wie lange wird es dauern, um eine Million Dollar zu erreichen?
//Es gibt Formeln dafür. (In Tabellenkalkulationsprogrammen sind 
//diese Formeln integriert, ebenso wie bei Taschenrechnern mit 
//finanzmathematischen Funktionen.) Aber nehmen wir an, dass Sie 
//das nicht wissen. Hier ist ein Grundgerüst eines Programms, um 
//zu berechnen wie viele Jahre es dauern wird: 

public class MillionDollarJahre {

	public static void main(String[] args) {
		
		double dollars = 1000.0;
		final double ZINSSATZ = 0.05;
		int jahre = 0;

		while (dollars < 1000000.0) {
			// Zinsen für ein weiteres Jahr addieren

			dollars = dollars + dollars * ZINSSATZ;
			dollars += 1000.0;
			jahre = jahre + 1;
		}

		System.out.println("Es braucht " + jahre
				+ " Jahre, um das Ziel zu erreichen.");
	}
}