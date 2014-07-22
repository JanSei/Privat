import java.util.Scanner;

class Auto
{
  // Instanzvariablen
  double startMeilen;   // Anfangsmeilenstand
  double endMeilen;     // Endmeilenstand
  double gallonen;      // verbrauchte Gallonen Benzin

  // Konstruktor
  Auto(double startTacho)
  {
    startMeilen = startTacho;
    endMeilen   = startTacho;
    gallonen    = 0;
  }

  void auftanken(double aktTacho, double gallonen)
  {
  	startMeilen      = endMeilen;
  	endMeilen        = aktTacho;
  	this.gallonen    = gallonen;
  }

  // Methoden
  double berechneMPG()
  {
    return (endMeilen - startMeilen) / gallonen ;
  }
  
  boolean benzinschwein()
  {
  	return ( berechneMPG() < 15.0 );
  }
  
  boolean sparauto()
  {
  	return ( berechneMPG() > 30.0 );
  }

}


class MeilenProGallone
{
  public static void main( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    String inData, autotyp = "Standard";
    double aktTacho, gallonen;
    
    double start = 200;
    Auto auto = new Auto( start );
    
    System.out.println(
    	"Neues Auto - Tachometer-Anfangsstand: " + start);

    do
    {
    	System.out.println(
    		"+++ Besuch der Tankstelle +++");
    		
	    System.out.println(
	    	"Aktuellen Tachometerstand eingeben:" );
	    aktTacho = scan.nextDouble();
	
	    System.out.println("Gallonen eingeben: " );
	    gallonen = scan.nextDouble();
	
	    auto.auftanken(aktTacho, gallonen);
	 
	    if( auto.benzinschwein() ) autotyp = "Benzinschwein";
	    if( auto.sparauto() )    	 autotyp = "Sparauto";	 
	    
	    System.out.println( "Meilen pro Gallone: "
	        + auto.berechneMPG() + " Autotyp: " + autotyp );
	    
	    System.out.println("Programm beenden <j> oder <n>ein");
	    inData = scan.next();
      }while( !inData.equals("j") );
  }
}



     















