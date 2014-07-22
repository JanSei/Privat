class BoxTester {

	public static void main(String[] args) {
		// eine Box mit den Seiten 2.5, 3.0 und 5.0 erzeugen

		Box box1 = new Box(2.5, 3.0, 5.0);

		System.out.println("Box1 Flaeche: " + box1.berechneOberflaeche()
				+ "  Volumen: " + box1.berechneVolumen());

		// eine Box mit gleichen Seiten von 3.0 erzeugen

		Box box2 = new Box(3.0);

		System.out.println("Box2 Flaeche: " + box2.berechneOberflaeche()
				+ "  Volumen: " + box2.berechneVolumen());

	}
}
