
public class GeburtstagTester {
	
	public static void main(String[] args) {

		KinderGeburtstag kinder = new KinderGeburtstag ( "Valerie", 7 );
		kinder.gruss();
		
		ErwachsenenGeburtstag erwachsenen = new ErwachsenenGeburtstag ( "Walter", 47 );
		erwachsenen.gruss();
		
		Karte postkarte = new KinderGeburtstag ( "Valerie", 7 );
		postkarte.gruss();

		postkarte       = new ErwachsenenGeburtstag ( "Walter", 47 );
		postkarte.gruss();

		postkarte       = new Geburtstag ( "Zoe", 30 );
		postkarte.gruss();
		
		KinderGeburtstag kinder2 = new KinderGeburtstag ( "Henry", 12 );
		kinder2.gruss();
		kinder2.gruss( "Alice" );

	}

}
