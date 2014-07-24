
public class Watson {

	public static void main(String[] args) {

	    String str;
	    int    len;

	    str = new String( "Elementary, my dear Watson!" );
	    len = str.length();
	    System.out.println("Die Laenge ist: " + len );  // -> 27
	    
	    str = new String( " Elementary, my dear Watson! " ); // f�hrendes + nachfolgendes Leerzeichen
	    len = str.length();
	    System.out.println("Die Laenge ist: " + len );  // -> 29
	    
	    str = new String( "		Elementary, my dear Watson!		" ); // 2 f�hrende + nachfolgende Tabzeichen
	    len = str.length();		
	    System.out.println("Die Laenge ist: " + len );  // -> 31
	    
	    str = new String( "Elementary,	my	dear	Watson!" ); // Im String, statt Leerzeichen Tabzeichen
	    len = str.length();
	    System.out.println("Die Laenge ist: " + len );  // -> 27

	    str = new String( "Elementary, my dear Watson!!!" );
	    len = str.length();
	    System.out.println("Die Laenge ist: " + len );  // -> 29    
	        
	}

}
