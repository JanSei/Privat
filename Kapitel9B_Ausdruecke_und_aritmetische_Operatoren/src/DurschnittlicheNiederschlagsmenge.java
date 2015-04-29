public class DurschnittlicheNiederschlagsmenge {

	public static void main(String[] args) {

		/*
		 * Niederschlagsmenge im April: 12 
		 * Niederschlagsmenge im Mai : 14
		 * Niederschlagsmenge im Juni : 8
		 * 
		 * Durchschnittlicher Niederschlag: 11.333333333333334
		 */
		
		int april = 12, mai = 14, juni = 8;
		double durschnitt = (april + mai + juni) / 3.0;

		System.out.println("Niederschlag im April:\t " + april);
		System.out.println("Niederschlag im Mai:\t " + mai);
		System.out.println("Niederschlag im Juni:\t " + juni);
		System.out.println("Durschnit: \t\t" + durschnitt);

	}

}
