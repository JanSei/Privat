
public class Teleskop {
	
	// Instanzvariablen
	double durchmesserHauptlinse;
	double brennweiteHauptlinse;
	double brennweiteOkular;
	
	// Konstruktoren
	public Teleskop(double durchmesserHauptlinse,
					double brennweiteHauptlinse,
					double brennweiteOkular) {
		this.durchmesserHauptlinse = durchmesserHauptlinse;
		this.brennweiteHauptlinse = brennweiteHauptlinse;
		this.brennweiteOkular = brennweiteOkular;
	}

	// Methoden
	public double berechneVergroesserung() {	// Vergroesserung des Teleskops berechnen
		return (brennweiteHauptlinse / brennweiteOkular);
	}
	
	public double berechneFZahl() {		
		return (brennweiteHauptlinse / durchmesserHauptlinse);
	}
}
