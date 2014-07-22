import java.text.DecimalFormat;

public class TeleskopTester {

	public static void main(String[] args) {

		Teleskop tele = new Teleskop(3.0, 6.5, 0.8);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Vergroesserung: " + df.format(tele.berechneVergroesserung()) + "\n" 
							+ "F-Zahl: " + df.format(tele.berechneFZahl()));
	}

}
