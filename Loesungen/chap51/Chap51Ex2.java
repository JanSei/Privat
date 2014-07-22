abstract class Haustiere
{
  // Instanzvariablen
  String name;
  double futtervorrat;
  int anzahlTage; // wie lange der Futtervorrat hält 

  // Konstruktor, er kann nicht direkt verwendet werden, da die Klasse abstrakt ist.
  // Aber er wird von den Subklassen Katze bzw. Hund verwendet
  public Haustiere(String name, double futtervorrat)
  {
    this.name = name; this.futtervorrat = futtervorrat;
  }
  
  // Methoden
  public void fuettern()
  {
    sprich();
    while( futtervorrat > 0 )
    {
      friss(); anzahlTage++;
    }
  }

  public void anzeigen()
  {
    System.out.println(
      "Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage.\n");
  }

  public abstract void friss();
  public abstract void sprich();
}

class Katze extends Haustiere
{
  // Konstruktor
  public Katze(String name, double futtervorrat)
  {
    super(name, futtervorrat);
  }

  public void friss()
  {
    System.out.println( name + ": " +  futtervorrat );
    futtervorrat = futtervorrat - 0.5;
  }

  public void sprich()
  {
    System.out.println("Miau!");
  }
}

class Hund extends Haustiere
{
  public Hund(String name, double futtervorrat)
  {
    super(name, futtervorrat);
  }

  public void friss()
  {
    System.out.println(name + ": " + futtervorrat);
    futtervorrat = futtervorrat - 1.0;
  }

  public void sprich()
  {
     System.out.println("Wuff!");
  }
}

public class Chap51Ex2
{
  public static void main(String[] args)
  {
    Katze katze = new Katze("Minka", 5.0);
    katze.fuettern();
    katze.anzeigen();
    Hund hund = new Hund("Strolchie", 5.0);
    hund.fuettern();
    hund.anzeigen();
  }
}










