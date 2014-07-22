import java.util.Scanner;

public class KarteTester {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
	    String name;
	    scan = new Scanner( System.in );

	    System.out.println("Ihr Name");
	    name = scan.nextLine();

	    Feiertag   feiern = new Feiertag( name );
	    feiern.gruss();

	    Geburtstag  geb  = new Geburtstag( name, 21 );
	    geb.gruss();

	    Valentin val = new Valentin( name, 7 );
	    val.gruss();
	    
	    
	    // Polymorphie
	    /*
	     * Wenn eine einzelne Variable für mehrere verschiedene, aber verwandte 
	     * Objekttypen an verschiedenen Stellen des Programms verwendet wird. 
	     */

	    Karte postkarte = new Feiertag( "Amy" );
	    postkarte.gruss();                      //Feiertag gruss() aufrufen

	    postkarte = new Valentin( "Bob", 3 );
	    postkarte.gruss();                      //Valentin gruss() aufrufen

	    postkarte = new Geburtstag( "Cindy", 17 );
	    postkarte.gruss();                      //Geburtstag gruss() aufrufen
	}
}