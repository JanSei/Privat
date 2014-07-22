
public class PunktDoppler {
	
	public void zweimal(MeinPunkt punkt) {
		
		System.out.println("Beginn PunktDoppler");
		punkt.ausgeben();
		punkt.x = punkt.x * 2;
		punkt.y = punkt.y * 2;
		punkt.ausgeben();
		System.out.println("Ende PunktDoppler");
	}
}