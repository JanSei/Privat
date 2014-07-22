// Die Schwerkraft wirkt auf den Ziegelstein ein, lässt ihn schneller und schneller werden. 
// Die Entfernung zwischen dem Ziegelstein und der Stelle an der er fallen gelassen wurde 
// ist nach t Sekunden:
//
//    entfernung = (1/2)*G*t2
//
//        t ist die Anzahl Sekunden, die der Ziegelstein fällt.
//        G ist eine Konstante: 9.80665
//        entfernung ist in Metern. 
//
//Nach 0.0 Sekunden hat der Ziegelstein 0.0 Meter zurückgelegt.
//
//Nach 1.0 Sekunde hat der Ziegelstein 
//(1/2) * 9.80665 * (1.0)2  =  0.5 * 9.80665 * 1.0 = 4.903325 Meter zurückgelegt.
//
//Nach 2.0 Sekunden hat der Ziegelstein 
//(1/2 )* 9.80665 * (2.0)2  =  0.5 * 9.80665 * 4.0  =  19.6133 Meter zurückgelegt.
//
//Das wird lästig. Lassen Sie uns ein Programm schreiben, das die Berechnung für 
//beliebige Werte von t durchführt und das Ergebnis ausgibt. 

import java.util.Scanner;

// Anwender wählt den Endwert für die Zeit, t
// Das Programm berechnet und gibt die Entfernung aus,
// die der Ziegelstein in der Zeit t zurückgelegt hat
//
class FallenderZiegelstein {
	
  private static Scanner scan;

public static void main (String[] args ) {
	  
    final double G = 9.80665;  // Konstante für Gravitationsbeschleunigung
    int    t, zeit;            // Zeit in Sekunden und Endwert der Zeit
    double entfernung;         // die Entfernung, die der Ziegelstein
                               scan = new Scanner( System.in );

    System.out.println( "Zeit in Sekunden:" );
    zeit = scan.nextInt();

    // Übschrift ausgeben
    System.out.println( "Sekunden\tEntfernung"  );
    System.out.println( "-------\t--------"  );

    // Entfernung ausrechnen und ausgeben
    t = 0 ;
    while (  t <= zeit ) {
      entfernung = (G * t * t)/2 ;
      System.out.println( t + "\t" + entfernung );

      t = t + 1 ;
    }
  }
}
