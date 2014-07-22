package programmieraufgaben;

/*
 * Aufgabe 2 — Haustiere

 Erstellen Sie eine abstrakte Klasse Haustiere. Die Klasse besteht aus

 den Instanzvariablen

 String name;
 double futtervorrat;
 int    anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorat reicht

 einem Konstruktor, der die beiden Instanzvariablen name und futtervorrat initialisiert 
 ( Dieser Kontruktor kann zwar nicht direkt genutzt werden, da die abstrakte Klasse 
 Haustiere nicht instanziiert werden kann, aber er kann von den Subklassen Katze und Hund 
 verwendet werden.)
 der Methode

 public void fuettern()
 {
 // Hier erfolgt zuerst der Aufruf der Methode sprich().
 // Solange der Futtervorat reicht, wird dann die Methode friss() aufgerufen
 // und die Anzahl der Tage hochgezählt, die der Vorrat reicht.
 // Implementiert werden die abstrakten Methoden sprich() und friss() erst in den Subklassen.
 }

 der Methode

 public void anzeigen()
 {
 // zeigt den Namen des Haustiers an und wie viele Tage der Futtervorrat reicht
 }

 und den abstrakten Methoden

 public abstract void friss();
 public abstract void sprich();

 Leiten Sie von der abstrakten Klasse Haustiere die Klassen Hund und Katze ab. Schreiben Sie für 
 beide Subklassen einen Konstruktor, der den Konstruktor der Superklasse aufruft. Implementieren 
 Sie anschließend in den Subklassen die abstrakten Methoden:

 Die Methode sprich() gibt "Wuff!" bzw "Miau!" aus.
 Die Methode friss() verringert den Wert der Instanzvariablen futtervorrat um 1.0 (Hund) 
 bzw. um 0.5 (Katze) und gibt den Namen des Haustiers mit dem jeweiligen Stand des 
 Futtervorrats aus.

 Testen Sie das Programm in einer Klasse HaustierFuettern. Die Ausgabe sieht dann ungefähr wie 
 folgt aus:

 C:\data\java\bsp>java HaustierFuettern
 Miau!
 Minka: 5.0
 Minka: 4.5
 Minka: 4.0
 Minka: 3.5
 Minka: 3.0
 Minka: 2.5
 Minka: 2.0
 Minka: 1.5
 Minka: 1.0
 Minka: 0.5
 Der Vorrat fuer Minka reicht 10 Tage.

 Wuff!
 Strolchie: 5.0
 Strolchie: 4.0
 Strolchie: 3.0
 Strolchie: 2.0
 Strolchie: 1.0
 Der Vorrat fuer Strolchie reicht 5 Tage.

 */

public abstract class Haustiere {

	// Instanzvariablen
	String name;
	double futtervorrat;
	int anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorat reicht

	// Konstruktoren
	public Haustiere(String name, double futtervorrat) {
		this.name = name;
		this.futtervorrat = futtervorrat;
	}

	// abstrakte Methoden
	public abstract void sprich();

	public abstract void friss();

	public void fuettern() {
		this.sprich();
		while (this.futtervorrat > 0) {
			this.friss();
			this.anzahlTage++;
		}
	}

	public void anzeigen() {
		System.out.println("Der Vorrat fuer " + this.name + " reicht "
				+ this.anzahlTage + " Tage.");
	}

}
