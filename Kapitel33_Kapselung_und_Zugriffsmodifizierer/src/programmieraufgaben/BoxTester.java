package programmieraufgaben;

/*
 * Aufgabe 1: Unveraenderbare Box

Implementieren Sie eine Klasse Box, aehnlich wie in der vorherigen Testaufgabe. 
Aber die neue Implementierung von Box wird eine bessere Kapselung haben. Hier 
ist die Dokumentation fuer Box:

    class Box

    Eine Klasse, die eine Box implementiert.

    Konstruktoren

    Box ( double breite, double hoehe, double laenge )

    Box ( double seite )

    Methoden

    double berechneVolumen( )

    double berechneFlaeche( )

Verwenden Sie als Ausgangsbasis das Beispiel des vorherigen Tests, das fuer diese und 
die naechsten Uebungen leicht modifiziert werden kann.

Deklarieren Sie in der jetzigen Implementierung von Box alle Instanzvariablen als 
private. Das bedeutet, dass nur die Methoden eines BoxObjekts dessen Objektdaten 
sehen koennen. Das Objekt wird unveraenderbar sein, wenn es keine Zugriffsmethoden gibt, 
die die Daten aendern. Ein unveraenderbares Objekt ist ein Objekt, dessen Daten sich nicht 
aendern. Sie erinnern sich vielleicht, dass Stringobjekte unveraenderbar sind sobald die 
Zeichen des Strings mit dem Konstruktor gesetzt worden sind, werden sie sich niemals aendern 
(obwohl sie fuer die Erzeugung anderer Stringobjekte verwendet werden koennen.) Es gibt viele 
Vorteile in der Verwendung unveraenderbarer Objekte, besonders in der Programmierung mit Threads 
(mit Threads werden fast alle umfangreichen Programme geschrieben).

Geben Sie auf die Methoden von Box oeffentlichen (public) Zugriff.

Testen Sie Ihre BoxKlasse mit verschiedenen Versionen dieses Programms:

    class BoxTester
    {

      public static void main ( String[] args )
      {
         Box box = new  Box( 2.5, 5.0, 6.0 ) ;

         System.out.println( "Flaeche: "  + box.berechneFlaeche( ) +
                             " Volumen: " + box. berechneVolumen( ) );

         System.out.println( "Laenge: " + box.laenge +
                             " Hoehe: " + box. hoehe +
                             "Breite: " + box.breite )  ;
      }
    }

(Das obenstehende Programm wird, so wie wir es wollten, nicht kompilieren. ueberlegen Sie warum 
es nicht kompiliert und bessern Sie es aus, so dass es sich kompilieren laesst.)
 */

/*
 * Aufgabe 2: Private Methoden fuer Box

Die Implementierung von berechneFlaeche( ) , wie sie in der vorherigen Testaufgabe 
gegeben wurde, ist wahrscheinlich vernuenftig fuer die BoxKlasse. Aber, um private 
Methoden zu ueben schreiben Sie wie folgt:

      double berechneFlaeche( )
      {
        return 2 * berechneFlaecheVorn() +
               2 * berechneFlaecheOben() +
               2 * berechneFlaecheSeitlich() ;
      }

Dabei sind berechneFlaecheVorn(), berechneFlaecheOben() und berechneFlaecheSeitlich() 
private Methoden, um die Flaeche der vorderen, der oberen und der seitlichen Seite der 
Box zu berechnen. Sie muessen sie Ihrer Klasse hinzufuegen. Private Methoden sind oft 
"Hilfsmethoden", die von den oeffentlichen Methoden verwendet werden, aber nicht von 
ausserhalb der Klasse verwendet werden koennen. Testen Sie Ihr Programm mit verschiedenen 
Versionen des folgenden:

    class BoxTester
    {

      public static void main ( String[] args )
      {
         Box box = new  Box( 2.5, 5.0, 6.0 ) ;

         System.out.println(
           "Flaeche: "  + box.berechneFlaeche( ) + " volumen: " + box. berechneVolumen( ) );
         System.out.println( "Flaeche oben: "  + box.berechneFlaecheOben() );

      }
    }

(Das obenstehende Programm wird, wie erwartet, nicht kompilieren.)
 */

/*
 * Aufgabe 3: BoxKonstruktor und Zugriffsmethoden

Fuegen Sie der BoxKlasse einen neuen Konstruktor hinzu:

    Box( Box alteBox )

Der Konstruktor erzeugt ein neues BoxObjekt mit genau den gleichen Dimensionen des 
uebergebenen BoxObjekts alteBox. Natuerlich wird das alte Objekt nicht veraendert.

Fuegen Sie jetzt einige Zugriffsmethoden hinzu. Eine Zugriffsmethode ist eine Methode, die 
verwendet werden kann, um auf private Variablen (und andere Variablen) eines Objekts 
zuzugreifen:

    public double getLaenge()
    public double getHoehe()
    public double getBreite()

Jede dieser Methoden gibt bloss den Wert einer Instanzvariablen zurueck. Da das Objekt 
unveraenderbar ist, gibt es keine Zugriffsmethode, um die Instanzvariablen zu aendern. 
Testen Sie Ihr Programm mit der geaenderten Testklasse der vorherigen Aufgabe. 
 */

/*
 * Aufgabe 4: Groessere Boxen

Es waere schoen eine Box zu erzeugen, die groesser ist als eine gegebene Box. Schreiben Sie 
diese Methode:

    public Box groessereBox()

Das ist eine oeffentliche Methode, die eine Referenz auf ein neues BoxObjekt zurueckgibt. 
Die neue Box wird in jeder Dimension 25% groesser sein als die alte Box. Die Methode wird 
einen Konstruktor verwenden muessen, um die neue Box zu erzeugen:

    public Box groessereBox()
    {

      return new Box( 1.25 * this.breite, ...... )
    }

Das Schluesselwort this bezieht sich auf das Objekt, das diese Methode aufruft. Es muss nicht 
mit angegeben werden und dient nur der besseren Verstaendlichkeit. Schreiben Sie jetzt eine 
Methode, die eine Box zurueckgibt, die in jeder Dimension 25% kleiner ist als eine gegebene Box. 
Schreiben Sie wie ueblich ein Testprogramm, um Ihre Klasse zu testen. 
 */

/*
 * Aufgabe 5: Verschachtelte Boxen

Schreiben Sie eine Methode, die true oder false ergibt, je nach dem ob eine Box vollstaendig 
in eine andere Box passt:

    public boolean passtIn( Box aeussereBox )

Dies ist moeglicherweise eine schwierige Methode, da die innere Box hineinpassen oder nicht 
hineinpassen kann, je nach dem wie sie gedreht wird. Um die Methode zu vereinfachen, schreiben 
Sie sie so, dass sie true zurueckgibt, wenn zwei Boxen ohne Rotation ineinander geschachtelt 
werden koennen (Hoehe wird mit Hoehe verglichen, Laenge mit Laenge usw.). 
 */

/*
 * Was abzuliefern ist:

Wenn das ein Auftrag fuer eine regelgerechte Klasse waere, wuerden Sie aufgefordert werden das 
folgende abzuliefern:

    Eine sauber geschriebene Dokumentation der letzten Version Ihrer Klasse.
        Schreiben Sie die Dokumentation in dem Stil, wie er am Anfang der Seite gegeben ist, 
        aehnlich dem Stil der meisten Java Klassendokumentationen.
        Kurze Kommentare beschreiben jede Methode und jeden Konstruktor.
        Private Instanzvariablen und private Methoden werden in dieser Dokumentation nicht 
        erwaehnt. Die Dokumentation soll dem Anwender der Klasse das Interface erklaeren. 
    Den Quellcode der endgueltigen Implementierung der Klasse.
        Kommentare am Anfang des Quelltextes beschreiben fuer was die Klasse ist, wer 
        sie geschrieben hat, wann sie geschrieben wurde und was ihr DebuggingStatus ist.
        Kurze Kommentare werden verwendet, um jede Methode und einige Anweisungen zu erklaeren.
        Einrueckungen und leere Zeilen muessen verwendet werden, um die Struktur und die 
        Organisation der Klasse zu zeigen. 
    Quellcode und Output fuer mehrere kleine Programme, die die verschiedenen Eigenschaften 
    der Klasse testen. 

Die Zusammenstellung des abzuliefernden Materials ist haeufig ein substantieller Teil der Arbeit. 
Das ist gute Praxis fuer die "realen Aufgaben".
 */

class BoxTester {

	public static void main(String[] args) {
		
        Box box = new  Box( 2.5, 5.0, 6.0 ) ;
        Box boxNeu = new Box(box);
        
        System.out.println( "Flaeche: "  + box.berechneOberflaeche() +
                            " Volumen: " + box. berechneVolumen() );

        box.anzeigen();
        boxNeu.anzeigen();
        System.out.println("\nboxNeuLaenge: " + boxNeu.getLaenge() + 
        		"\nboxNeuHoehe: " + boxNeu.getHoehe() + "\nboxNeuBreite: " + boxNeu.getBreite());
        
        Box boxGroesser = box.groessereBox();
        Box boxKleiner = box.kleinereBox();
        
        boxGroesser.anzeigen();
        boxKleiner.anzeigen();
        
        if(boxKleiner.passtIn(boxGroesser))
        	System.out.println("\nEs passt! Es passt!");
        else
        	System.out.println("\nEs passt nicht, verdammt nochmal!");
	}
}
