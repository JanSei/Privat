package programmieraufgaben;

public abstract class Karte {
	
	// Instanzvariablen
	String empfaenger; // Name des Empfängers
	String anrede;
	
	// Konstruktoren
	public Karte(String empfaenger, String sex) {
		this.empfaenger = empfaenger;
		if(sex.equals("m"))
			anrede = "Lieber";
		if(sex.equals("f"))
			anrede = "Liebe";
		if(!(sex.equals("m")) & !(sex.equals("f")))
			anrede = "Liebe(r)";
	}

	public abstract void gruss();	// abstrakte gruss() Methode
}