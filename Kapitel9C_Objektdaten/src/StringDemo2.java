
public class StringDemo2 {

	public static void main(String[] args) {

	    String str = new String( "Golf is a good walk spoiled." ); // erzeuge das originale Stringobjekt
	    int laenge = str.length();
	    System.out.println( "Laenge: " + laenge );  // -> 28
	    
	    String sub = str.substring(8, 19); // a good walk
	    System.out.println( sub );
	    
	    sub = str.substring(0, 0); // Leerstring
	    System.out.println( sub );

	    sub = str.substring(0, 27); // Index des letzten Zeichens
	    System.out.println( sub );  // a good walk spoiled -> ohne das letzte Zeichen, den Punkt
	    
	    sub = str.substring(8, laenge); // a good walk spoiled.
	    System.out.println( sub );
	    
	    sub = str.substring(8, 2); // Laufzeitfehler StringIndexOutOfBoundsException
	    System.out.println( sub );
	}

}
