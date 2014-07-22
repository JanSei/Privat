import java.util.Scanner;

class Auto
{
  // Instanzvariablen
  double startMeilen;  // Anfangsmeilenstand
  double endMeilen;    // Endmeilenstand
  double gallonen;     // verbrauchte Gallonen

  // Konstruktor
  Auto(double startTacho, double endTacho, double galls)
  {
    startMeilen = startTacho;
    endMeilen   = endTacho;
    gallonen    = galls;
  }

  // Methoden
  double berechneMPG()
  {
    return ( endMeilen - startMeilen ) / gallonen;
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


public class Chap31Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    String inData, autotyp = "Standard";
    double startMeilen, endMeilen, gallonen;

    do
    {
      System.out.println("Anfangsmeilenstand eingeben: ");
      startMeilen = scan.nextDouble();

      System.out.println("Endmeilenstand eingeben: ");
      endMeilen = scan.nextDouble();

      System.out.println("Gallonen eingeben: ");
      gallonen = scan.nextDouble();

      Auto auto = new Auto(startMeilen, endMeilen, gallonen);

      if( auto.benzinschwein() )
      	autotyp = "Benzinschwein";
      
      if( auto.sparauto() )
      	autotyp = "Sparauto";

      System.out.println( "Meilen pro Gallone: "
        + auto.berechneMPG() + " Autotyp: " + " " + autotyp);

      System.out.println("Programm beenden <j>a <n>ein?");
      inData = scan.next();
    } while( !inData.equals("j") );
  }

}