import java.util.Scanner;

public class Chap18Ex3
{
  public static void main(String[] args )
  {
    Scanner scan = new Scanner(System.in);

    int          gewicht;
    double       gebuehr = 0;
    final double VERSANDKOSTEN = 3.0;  // Grundgebühr bis 10 Pfund inklusive
    final double AUFSCHLAG = 0.25;     // je weitere Pfund Gewicht
    final double GEWICHTLIMIT = 10.0;

    // Gewicht holen
    System.out.println( "Gewicht der Sendung:");
    gewicht = scan.nextInt();

    while( gewicht > 0 )
    {
      if ( gewicht <= GEWICHTLIMIT )
        gebuehr = VERSANDKOSTEN;
      else
        gebuehr = VERSANDKOSTEN + (gewicht - GEWICHTLIMIT) * AUFSCHLAG;

      // VERSANDKOSTENkosten ausgeben
      System.out.println( "Versandkosten: " + gebuehr);

      // den nächsten Wert vom Anwender holen
      System.out.println( "Gewicht der Sendung:");
      gewicht = scan.nextInt(); // neuer Wert zum testen
    }
  }
}