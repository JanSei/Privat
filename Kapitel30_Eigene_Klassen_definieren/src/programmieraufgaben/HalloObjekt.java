package programmieraufgaben;

import java.util.Scanner;

public class HalloObjekt {
	
	// Instanzvariablen
	private String mitteilung;
	private int anzahl;
	private static Scanner in;		// Aufgabe 3
	
	// Konstruktor
	public HalloObjekt() {		// Aufgabe 3
		
	}
	
	public HalloObjekt(String mitteilung) {
		this.setMitteilung(mitteilung);
		anzahl = mitteilung.length();
	}
	
	public HalloObjekt(HalloObjekt einHalloObjekt) {	// Aufgabe 4
		this.mitteilung = einHalloObjekt.getMitteilung();
	}
	
	// Methodendefinition
	void sprich() {
		int i = 0;
		while( i < anzahl) {
		System.out.println(mitteilung);
		i++;
		}
	}
	
	void morgengruß() {		// Aufgabe 2
		System.out.println("Guten Morgen Welt!");
	}
	
	void abendgruß() {		// Aufgabe 2
		System.out.println("Guten Abend Welt!");
	}
	
	void einlesen() {		// Aufgabe 3
		in = new Scanner( System.in );
		System.out.printf("%nGeben Sie die Mitteilung ein: ");
		this.mitteilung = in.nextLine();
	}
	
	void ausgeben() {		// Aufgabe 3
		System.out.printf("%n" + this.mitteilung);
	}

	private String getMitteilung() {		// Aufgabe 4
		return mitteilung;
	}

	private void setMitteilung(String mitteilung) {
		this.mitteilung = mitteilung;
	}
	
	
}