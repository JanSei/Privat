abstract class Haustiere
{
  // Instanzvariablen
  String  name;
  double  futtervorrat;
  int     anzahlTage;

  // Konstruktor, er kann nicht direkt verwendet werden, da die Klasse abstrakt ist.
  // Aber er wird von den Subklassen Katze bzw. Hund verwendet.
  public Haustiere(String name, double futtervorrat)
  {
    this.name          = name;
    this.futtervorrat  = futtervorrat;
  }


  public void fuettern()
  {
    sprich();
    while ( futtervorrat > 0 )
    {
      friss();
      anzahlTage++;
    }
  }

  public void anzeigen()
  {
    System.out.println("Der Vorrat fuer " + name       +
                       " reicht "         + anzahlTage + " Tage.");
  }

  public abstract void friss();
  public abstract void sprich();

}

class Katze extends Haustiere
{
  // Instanzvariable
  String haltung;

  // Konstruktor
  public Katze(String name, double futtervorrat, int typ)
  {
    super(name, futtervorrat);

    if ( typ == 1 )
      haltung = "Wohnungskatze";
    else
      haltung = "Artgerecht";
  }

  public void friss()
  {
    System.out.println(name + ": " +  futtervorrat);
    futtervorrat = futtervorrat - 0.5;
  }

  public void sprich()
  {
    System.out.println("Miau!");
  }

  public void anzeigen()
  {
    System.out.print("(Haltung: " + haltung + ") " );
    super.anzeigen();
  }
}

class Hund extends Haustiere
{
  // Instanzvariable
  String kategorie;

  // Konstruktor
  public Hund(String name, double futtervorrat, int kategorie)
  {
    super(name, futtervorrat);

    switch (kategorie)
    {
      case 1:  this.kategorie =  "Kleinhunde";         break;
      case 2:  this.kategorie =  "Mittelgrosse Hunde"; break;
      case 3:  this.kategorie =  "Grosse Hunde";       break;
    }
  }

  public void friss()
  {
    System.out.println(name + ": " +  futtervorrat);
    futtervorrat = futtervorrat - 1.0;
  }

  public void sprich()
  {
    System.out.println("Wuff!");
  }

  public void anzeigen()
  {
    System.out.print("(Kategorie: " + kategorie + ") " );
    super.anzeigen();
  }
}

public class Chap52Ex1
{
  public static void main(String[] args)
  {
    Katze katze = new Katze("Minka", 3.0, 1);
    katze.fuettern(); katze.anzeigen() ;
    System.out.println();
    Hund hund = new Hund("Strolchie", 5.0, 1);
    hund.fuettern(); hund.anzeigen();
  }
}













