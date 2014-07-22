class Artikel
{
  String  artikelNr;
  String  bezeichnung;  // Artikelbezeichnung
  double  einkaufspreis;
  int     lagerzeit;    // in Monaten

  final double  HANDELSSPANNE = 0.6; // 60 Prozent des EK
  final double  MWST          = 0.19;

  // Konstruktor
  public Artikel( String artNr, String bez, double ekpreis, int zeit )
  {
    artikelNr     = artNr;   bezeichnung = bez;
    einkaufspreis = ekpreis; lagerzeit   = zeit;
  }

  public void anzeigen()
  {
    System.out.println( artikelNr         + " \""         +
                        bezeichnung       + "\" EK: "     +
                        einkaufspreis     + " VK: "       +
                        berechneVerkaufspreis() + " Euro" + // ruft je nachdem,
                        // von welchem Typ die Referenzvariable ist, entweder
                        // die Methode der Superklasse Artikel oder die Methode
                        // der Subklasse Sonderposten auf.
                        " Lagerzeit: "    + lagerzeit      + " Monate" );
  }

  public int berechneVerkaufspreis()
  {
    double netto, mwst;
    netto = einkaufspreis + einkaufspreis * HANDELSSPANNE;
    mwst  = netto * MWST;
    return  (int)(netto + mwst);
  }
}


class Sonderposten extends Artikel
{
  double rabatt;

  // Konstruktor
  public Sonderposten(String artNr, String bez, double ekpreis, int zeit )
  {
    super(artNr, bez, ekpreis, zeit);
    if ( zeit > 12 )
      rabatt = 0.3;
    else
      rabatt = 0.1;
  }

  // Methoden

  public void anzeigen()
  {
    System.out.println("\n\nSonderposten:");
    super.anzeigen();
    System.out.println( "(VK <alt>: "  + super.berechneVerkaufspreis() + " Euro" +
                        " Rabatt: "    + (int)( rabatt * 100 )   + "%" + ")"  );
  }

  public int berechneVerkaufspreis()
  {
    double vk;
    vk = super.berechneVerkaufspreis() * (1.0 - rabatt) ;
    return (int)vk;
  }
}

public class Chap50Ex2
{
  public static void main(String args[])
  {
    Artikel artikelA = new Artikel(
            "SC123-F", "DUFFY MALT WHISKEY", 10.0, 3);
    Sonderposten spostenA = new Sonderposten(
            "SC123-F", "DUFFY MALT WHISKEY", 10.0, 3);
    Sonderposten spostenB = new Sonderposten(
            "SC347-A", "GLEN MORANGIE MALT WHISKEY", 55.0, 15 );
    artikelA.anzeigen();
    spostenA.anzeigen();
    spostenB.anzeigen();
  }
}







