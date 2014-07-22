class VorratskammerTester {
	
	public static void main(String[] args) {
		
		Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
		Marmelade erdbeer = new Marmelade("Erdbeer", "30.09.10", 8);
		Marmelade aprikosen = new Marmelade("Aprikosen", "31.10.10", 3);

		Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer,
				aprikosen);
		vorrat.ausgeben();

		vorrat.auswaehlen(1);
		vorrat.auftragen(2);
		vorrat.ausgeben();

		vorrat.auswaehlen(3);
		vorrat.auftragen(4);
		vorrat.ausgeben();
	}
}