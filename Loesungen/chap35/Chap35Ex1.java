import java.util.Scanner;

class Marmelade
{
  // Instanzvariablen
  private String inhalt;  // Art der Frucht im Glas
  private String datum;   // Datum des Abfüllens
  private int menge;      // Menge der Marmelade im Glas
  
  // Konstruktoren
  public Marmelade(String inhalt, String datum, int menge)
  {
    this.inhalt = inhalt;
    this.datum  = datum;
    this.menge  = menge;
  }
  
  // Methoden
  public boolean istLeer()
  {
    return ( menge == 0 );
  }
  
  public void ausgeben()
  {
    System.out.println ( inhalt + "marmelade "  +
                         datum  + " "           +
                         menge  + " Unzen.");
  }
  
  public void auftragen (int unzen)
  {
    if ( !istLeer() )
    {
      if ( unzen <= menge )
      {
        System.out.println("Auftragen von " + unzen  +
                           " Unzen "        + inhalt + "marmelade");
        menge = menge - unzen;
      }
      else
      {
        System.out.println("Auftragen von  " + menge  +
                           " Unzen "         + inhalt + "marmelade");
        menge =  0;
      }
    }
    else
      System.out.println("Keine Marmelade im Glas!");
  }
}

class Vorratskammer
{
  // Instanzvariablen
  private Marmelade  glas1;
  private Marmelade  glas2;
  private Marmelade  glas3;
  private Marmelade  glasAusgewaehlt;

  // Konstruktoren
  public Vorratskammer(Marmelade glas1, Marmelade glas2, Marmelade glas3)
  {
    this.glas1      = glas1;
    this.glas2      = glas2;
    this.glas3      = glas3;
    glasAusgewaehlt = null;
  }


  // Methoden
  public void ausgeben()
  {
  	System.out.println("\nDie Vorratskammer enthaelt:");
    System.out.print("1: "); glas1.ausgeben();
    System.out.print("2: "); glas2.ausgeben();
    System.out.print("3: "); glas3.ausgeben();
  }

  // wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder 3
  public void auswaehlen(int glasNummer)
  {
    if      ( glasNummer == 1 )
      glasAusgewaehlt = glas1;
    else if ( glasNummer == 2 )
      glasAusgewaehlt = glas2;
    else
      glasAusgewaehlt = glas3;
  }

  // Auftragen der ausgewählten Marmelade
  public void auftragen(int unzen)
  {
    glasAusgewaehlt.auftragen(unzen);
  }
}

public class Chap35Ex1
{
  public static void main(String[] args)
  {
    Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
    Marmelade erdbeer     = new Marmelade("Erdbeer", "30.09.10", 8);
    Marmelade aprikosen   = new Marmelade("Aprikosen", "31.10.10", 16);
    Vorratskammer vorrat  = new Vorratskammer(stachelbeer, erdbeer, aprikosen);
    int glasNr, unzen;

    Scanner scan = new Scanner(System.in);

    System.out.println("Willkommen zu Mutter Hubbards Vorratskammer!");
    vorrat.ausgeben();
    System.out.println(
      "\nTreffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:");
    glasNr = scan.nextInt();

    while( glasNr != -1 )
    {
      if( glasNr == 1 || glasNr == 2 || glasNr == 3 )
      {
        vorrat.auswaehlen( glasNr );
        System.out.println(
          "Geben Sie die Menge ein, die aufgetragen werden soll:");
        unzen = scan.nextInt();
        vorrat.auftragen(unzen);
        vorrat.ausgeben();
      }
      else
      {
        System.out.println("Ungueltige Auswahl");
      }

      System.out.println
        ("Treffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:");
      glasNr = scan.nextInt();
    }
  }
}