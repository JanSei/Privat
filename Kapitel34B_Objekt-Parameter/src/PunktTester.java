
public class PunktTester {
	
	public static void main(String[] args) {
		
		MeinPunkt pt = new MeinPunkt();

		pt.ausgeben();

		pt.x = 45;
		pt.y = 83;

		pt.ausgeben();
		
		System.out.println("---------");
		System.out.println("---------");
		
	    MeinPunkt pt2 = new MeinPunkt();

	    PunktDoppler pd = new PunktDoppler();

	    pt2.ausgeben();

	    pd.zweimal( pt2 );

	    pt2.ausgeben();
	}
}
