class VideoVerleih {
	
	public static void main(String args[]) {
		
	    Videoband   artikelA = new Videoband("Microcosmos", 90 );
	    Spielfilm   artikelB = new Spielfilm("Jaws", 120, "Spielberg", "PG" );
	    
	    artikelA.anzeigen();
	    artikelB.anzeigen();
	}
}