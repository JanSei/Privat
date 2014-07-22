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
                        berechneVerkaufspreis() + " Euro" +
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

public class Chap50Ex1
{
  public static void main(String args[])
  {
    Artikel artikelA = new Artikel(
            "SC123-F", "DUFFY MALT WHISKEY", 10.0, 3);
    Artikel artikelB = new Artikel(
            "SC347-A", "GLEN MORANGIE MALT WHISKEY", 55.0, 15);
    artikelA.anzeigen();
    artikelB.anzeigen();
  }
}







