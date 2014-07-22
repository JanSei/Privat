//Der Anwender handelt wie eine ergebnisgesteuerte Schleife. Also könnten wir das 
//Programm tun lassen, was der Anwender tut. Hier ist ein Grundgerüst eines Programms, 
//das bei einem Zinssatz von 0 Prozent beginnt und dann in Zehntel Prozentschritten 
//den Zinssatz erhöht, bis das Eine-Million Dollar Ziel erreicht ist: 

class MillionDollarZinssaetze {

	public static void main( String[] args ) {
		
    double anfangsbetrag = 1000.0 ;
    double dollars       = 0.0 ;
    double zinssatz ;
    int    jahre;

    zinssatz = -0.001 ;    // das wird gleich auf 0 erhöht

    while ( dollars < 1000000 ) {
       // zum nächsten Zinssatz wechseln
       zinssatz = zinssatz + 0.001 ;

       // Dollars nach 40 Jahren beim gegenwärtigen Zinssatz berechnen
       jahre    =  1 ;
       dollars  = anfangsbetrag ;               // Schleife richtig initialisieren
       while (  jahre <= 40 )
       {
         dollars = dollars + dollars*zinssatz ; // Zinsen für ein weiteres
                                                // Jahr addieren
         dollars = dollars + 1000 ;             // jährliche Einzahlung
                                                // hinzufügen
         jahre    =  jahre + 1 ;
       }

    }

    System.out.println("Nach 40 Jahren bei " + zinssatz*100
      + " Prozent Zinsen werden Sie " + dollars + " Dollar haben." ) ;
  }
}