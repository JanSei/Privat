import java.util.Scanner;

public class Chap18Ex4
{
  public static void main(String[] args )
  {
    Scanner scan = new Scanner(System.in);

    int x1, x2, y1, y2;
    int breite, hoehe, flaeche = 1;

    System.out.println("CAD Programm");

    while( flaeche > 0 )
    {
      // Daten holen
      System.out.println( "Erster Eckpunkt X-Koordinate:");
      x1 = scan.nextInt();

      System.out.println( "Erster Eckpunkt Y-Koordinate:");
      y1 = scan.nextInt();

      System.out.println( "Zweiter Eckpunkt X-Koordinate:");
      x2 = scan.nextInt();

      System.out.println( "Zweiter Eckpunkt Y-Koordinate:" );
      y2 = scan.nextInt();

      // Rechteck berechnen
      breite  = Math.abs(x1 - x2);
      hoehe   = Math.abs(y1 - y2);
      flaeche = breite * hoehe;

      System.out.println( "Breite: "  + breite  + "\t" +
                          "Hoehe: "   + hoehe   + "\t" + 
                          "Flaeche: " + flaeche + "\n" );
    }
    
    System.out.println ("Fertig!");
  }
}