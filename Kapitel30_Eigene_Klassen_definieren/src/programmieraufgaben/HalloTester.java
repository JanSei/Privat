package programmieraufgaben;

/*
 * Aufgabe 1 
 *  Verändern Sie das Programm aus Kapitel 30, so dass ein HalloObjekt-Objekt 
 *  eine Mitteilung so oft ausgibt wie die Mitteilung Zeichen hat. Die 
 *  HalloObjekt-Klasse wird einen Konstruktor haben, der es der Methode main() 
 *  erlaubt das Objekt mit unterschiedlichen Mitteilungen zu initialisieren.

D:\JavaNotes\Aufgaben>java HalloTester
Hallo
Hallo
Hallo
Hallo
Hallo

 */

/*
 * Aufgabe 2

Ändern Sie das Programm, so dass die Klasse HalloObjekt zwei Grußmitteilungen ausgibt: 
einen Morgengruß und einen Abendgruß. Für die Ausgabe wird es zwei Methoden geben, 
eine für jede Grußmitteilung.

D:\JavaNotes\Aufgaben>java HalloTester
Guten Morgen Welt!
Guten Abend Welt!

 */

/*
 * Aufgabe 3
 * 
 *  Schreiben Sie von HalloObjekt eine Programmversion in der die Grußmitteilung, 
 *  die von dem Objekt ausgegeben wird, vom Anwender eingegeben wird.

D:\JavaNotes>java HalloTester
Geben Sie die Mitteilung ein:
Hallo Mars!

Hallo Mars!

D:\javaNotes\aufgaben>

Das ist wirklich ein interessanteres Programm als es scheinen mag, da es eine 
schwierige Designentscheidung verlangt. Wer soll den Anwender nach der Grußmitteilung 
fragen, die statische Methode main() von der HalloTester Klasse oder das HalloObjekt? 
Beides wird funktionieren, aber eines (denke ich) ist "logischer" als das andere. 
Wenn Sie sich nicht entscheiden können, schreiben Sie beide Versionen und entscheiden sich dann. 
 */

/*
 * Aufgabe 4

Fügen Sie der Klasse HalloObjekt einen weiteren Konstruktor hinzu, der ein HalloObjekt-Objekt 
als Parameter nimmt:

HalloObjekt( HalloObjekt einHalloObjekt )
{
  // initialisieren Sie die Variable mitteilung des neuen Objekts
  // mit der Variablen mitteilung des einHalloObjekt-Parameters
}

Der zusätzliche Konstruktor wird den Parameter (selbstverständlich) nicht ändern, er wird 
lediglich dessen Daten verwenden. Verwenden Sie die "Punkt-Notation", um auf den String 
innerhalb des Parameters zu verweisen.

Dieses Programm ist (ebenfalls) interessanter als es aussieht. Wenn Sie es in der nahe 
liegenden Weise schreiben, wird der zusätzliche Konstruktor die Variable mitteilung mit 
der Referenz desselben Stringobjekts initialisieren, auf die das Parameter-Objekt verweist. 
Das ist OK für dieses Programm, aber manchmal ist es nicht das, was Sie möchten.

Verändern Sie den vorhin hinzugefügten Konstruktor, so dass er für das neue HalloObjekt, das 
er konstruiert, ein neues Stringobjekt erstellt. Verwenden Sie dafür den Konstruktor der Klasse 
String der wie folgt aussieht:

public String( String  str ) ;

(Weitere Informationen dazu finden Sie in der Java Dokumentation der Klasse String.) 
 */

class HalloTester {
	
	public static void main(String[] args) {
		
	    HalloObjekt hallo = new HalloObjekt("Hallo");		// Aufgabe 1
	    HalloObjekt benutzer = new HalloObjekt();
	    HalloObjekt test;
	    
	    hallo.sprich();		// Aufgabe 1
	    hallo.morgengruß();	// Aufgabe 2
	    hallo.abendgruß();	// Aufgabe 2
	    
	    benutzer.einlesen();	// Aufgabe 3
	    benutzer.ausgeben();	// Aufgabe 3

	    test = new HalloObjekt(hallo);	// Aufgabe 4
	    test.ausgeben();	// Aufgabe 4
	   
	}
}