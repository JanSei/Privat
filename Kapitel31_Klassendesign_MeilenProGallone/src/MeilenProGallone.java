import java.text.DecimalFormat;

class MeilenProGallone {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		Auto auto1 = new Auto(32456, 32810, 10.6);
		System.out.println("Meilen pro Gallone: "
						+ df.format(auto1
								.berechneMPG()));
		
		Auto auto2 = new Auto( 100000, 100300, 12.5 );
		System.out.println("Meilen pro Gallone: "
				+ df.format(auto2
						.berechneMPG()));
	}
}

// Lange Version des DecimalFormats - wenn nur einmal angewendet
/*
System.out.println("Meilen pro Gallone: "
+ new java.text.DecimalFormat("0.00").format(auto1
		.berechneMPG()));
*/