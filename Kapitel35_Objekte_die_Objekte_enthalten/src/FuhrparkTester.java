
public class FuhrparkTester {

	public static void main(String[] args) {

		Fuhrpark meineAutos = new Fuhrpark(1000, 1234, 10, 777, 999, 20);
		System.out.println("durchschnittlicher MPG Fuhrpark = "
				+ meineAutos.berechneMPG());

		meineAutos.auftanken(1434, 10, 1099, 10);
		System.out.println("neuer durchschnittlicher MPG Fuhrpark = "
				+ meineAutos.berechneMPG());
	}
}
