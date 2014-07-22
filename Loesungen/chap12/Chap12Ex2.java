import java.util.*;
class Chap12Ex2
{
  public static void main (String[] args)
  {
    final int SCHRAUBEN_PREIS = 5;
    final int MUTTERN_PREIS   = 3;
    final int SCHEIBEN_PREIS  = 1;
    
    int anzahlSchrauben, anzahlMuttern, anzahlScheiben;
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Anzahl der Schrauben: ");
    anzahlSchrauben  = scan.nextInt();

    System.out.println("Anzahl der Muttern: ");
    anzahlMuttern    =  scan.nextInt();

    System.out.println("Anzahl der Unterlegscheiben: ");
    anzahlScheiben   =  scan.nextInt();

    if(anzahlSchrauben > anzahlMuttern)
      System.out.println("Kontrollieren Sie Ihre Bestellung ");

    int gesamt = anzahlSchrauben * SCHRAUBEN_PREIS +
                 anzahlMuttern   * MUTTERN_PREIS   +
                 anzahlScheiben  * SCHEIBEN_PREIS;

    System.out.println("Gesamtbetrag: " + gesamt);
  }











}