import java.util.Scanner;

class Marmelade
{
  // Instanzvariablen
  private String inhalt;  // Art der Frucht im Glas
  private String datum;   // Datum des Abfüllens
  private int    menge;   // Menge der Marmelade im Glas

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
    System.out.println ( inhalt + "marmelade   " +
                         datum  + "   "          +  menge + " Unzen.");
  }

  public void auftragen(int unzen)
  {
    if ( !istLeer() )
    {
      if ( unzen <= menge )
      {
        System.out.println("Auftragen von " + unzen +
                           " Unzen von "    + inhalt);
        menge = menge - unzen;
      }
      else
      {
        System.out.println("Auftragen von  " + menge +
                           " Unzen von "     + inhalt );
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
  private String auswahl;

  // Konstruktoren
  public Vorratskammer(Marmelade glas1, Marmelade glas2, Marmelade glas3)
  {
    this.glas1      = glas1;
    this.glas2      = glas2;
    this.glas3      = glas3;
    glasAusgewaehlt = null;
    auswahl  = "\nTreffen Sie Ihre Auswahl (1, 2 oder 3). Exit -1:";
  }

  public Vorratskammer(Marmelade glas1, Marmelade glas2)
  {
    this.glas1      = glas1;
    this.glas2      = glas2;
    this.glas3      = null;
    glasAusgewaehlt = null;
    auswahl  = "\nTreffen Sie Ihre Auswahl (1 oder 2). Exit -1:";
  }

  public Vorratskammer(Marmelade glas1)
  {
    this.glas1      = glas1;
    this.glas2      = null;
    this.glas3      = null;
    glasAusgewaehlt = null;
    auswahl  = "\nLeider gibt es nur ein Glas (1 oder 1). Exit -1:";
  }

  // Methoden
  public void ausgeben()
  {
  	System.out.println("\nDie Vorratskammer enthaelt:");
    if( glas1 != null )
    {
      System.out.print("1: ");
      glas1.ausgeben();
    }

    if( glas2 != null )
    {
      System.out.print("2: ");
      glas2.ausgeben();
    }

    if( glas3 != null )
    {
      System.out.print("3: ");
      glas3.ausgeben();
    }
  }

  public boolean auswaehlen(int glasNummer)
  {
    if( glasNummer == 1 && glas1 != null )
    {
      glasAusgewaehlt = glas1;
      return true;
    }
    else if ( glasNummer == 2 && glas2 != null )
    {
      glasAusgewaehlt = glas2;
      return true;
    }
    else if ( glasNummer == 3 && glas3 != null )
    {
      glasAusgewaehlt = glas3;
      return true;
    }
    else
      return false;
  }

  // Auftragen der ausgewählten Marmelade
  public void auftragen(int unzen)
  {
     glasAusgewaehlt.auftragen(unzen);
  }

  public String getAuswahl()
  {
  	return auswahl;
  }

  public void ersetzen(Marmelade m, int slot)
  {
    if( slot == 1 )
      glas1 = m;
    else if( slot == 2 )
      glas2 = m;
    else
      glas3 = m;
  }


}

public class Chap35Ex3
{
  public static void main(String[] args)
  {
    Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
    Marmelade erdbeer     = new Marmelade("Erdbeer", "30.09.10", 8);
    Marmelade aprikosen   = new Marmelade("Aprikosen", "31.10.10", 16);

    Vorratskammer vorrat  = new Vorratskammer(stachelbeer, erdbeer, aprikosen);
    int glasNr, unzen;

    Marmelade kirsch      = new Marmelade("Kirsch", "01.07.09", 11);

    vorrat.ersetzen(kirsch, 2);
    vorrat.ausgeben();
  }
}







