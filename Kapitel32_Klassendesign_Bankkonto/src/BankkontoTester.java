public class BankkontoTester {

	public static void main(String[] args) {

		Bankkonto konto1 = new Bankkonto("123", "Bob", 100);
		Bankkonto konto2 = new Bankkonto("007", "James Bond", 50000);

		konto1.anzeigen();
		konto1.geldEinzahlen(2000);
		konto1.geldAuszahlen(1500);
		konto1.anzeigen();
		
		System.out.println();
		konto2.anzeigen();
		konto2.geldEinzahlen(70000);
		konto2.geldAuszahlen(10000);
		konto2.anzeigen();
		
		// Sagen wir, dass James einen 300 Dollar Scheck an Bob ausgestellt hat und 
		// Bob dieses Geld auf sein Konto einzahlen will.
		System.out.println();
	    int scheck = 30000;
	    konto2.geldAuszahlen( scheck );
	    konto1.geldEinzahlen( scheck );
	    konto1.anzeigen();
	    konto2.anzeigen();
	    
	    // Es ist zwar nicht Teil des Testens dieser Klasse, aber das ist ein günstiger 
	    // Zeitpunkt, um erneut auf Aliase zu sprechen zu kommen. Erinnern Sie sich daran, 
	    // dass mehr als eine Referenz auf ein vorhandenes Objekt zeigen kann. Jede dieser 
	    // Referenzen nennt man ein Alias. Um Ihnen das zu zeigen, gibt es hier ein weiteres 
	    // Testprogramm: 
	    konto1 = new Bankkonto("123", "Bob", 100);
	    konto2 = new Bankkonto( "456", "Jill", 900 );
	    System.out.println();
	    Bankkonto konto3;

	    konto1.anzeigen() ;
	    konto2.anzeigen() ;

	    konto3 = konto1;
	    konto3.anzeigen() ;
	}
}