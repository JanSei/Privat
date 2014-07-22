interface Besteuerbar
{
  final double STEUERSATZ = 0.06 ;
  double berechneSteuer() ;
}

class Waren
{
  private String beschreibung;
  private double preis;
  private int anzahl;

  public Waren( String beschreibung, double preis, int anzahl )
  {
    this.beschreibung = beschreibung;
    this.preis        = preis;
    this.anzahl       = anzahl;
  }

  public void anzeigen()
  {
    System.out.println( "Artikel: " + beschreibung +
        " Preis: " + preis + " Anzahl: " + anzahl);
  }

  public double getPreis()
  {
    return preis;
  }

  public void setPreis( double neuerPreis)
  {
    preis =  neuerPreis;
  }

  public int getAnzahl()
  {
    return anzahl;
  }

  public void setAnzahl ( int neueAnzahl )
  {
    anzahl =  neueAnzahl;
  }
}

class Lebensmittel extends Waren
{
  private double kalorien;

  public Lebensmittel( String beschreibung, double preis, int anzahl, double kalorien)
  {
    super( beschreibung, preis, anzahl);
    this.kalorien = kalorien ;
  }

  public void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Kalorien: " + kalorien );
  }
}

class Spielwaren extends Waren implements Besteuerbar
{
  private int mindestalter;

  public Spielwaren( String beschreibung, double preis, int anzahl, int mindestalter)
  {
    super( beschreibung, preis, anzahl );
    this.mindestalter = mindestalter;
  }

  public void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Mindestalter: " + mindestalter );
  }

  public double berechneSteuer()
  {
    return getPreis() * STEUERSATZ ;
  }
}

class Buecher extends Waren implements Besteuerbar
{
  private String autor;

  public Buecher( String beschreibung, double preis, int anzahl, String autor)
  {
    super( beschreibung, preis, anzahl );
    this.autor  = autor ;
  }

  public void anzeigen()
  {
    super.anzeigen() ;
    System.out.println( "Autor: " + autor );
  }

  public double berechneSteuer()
  {
    return getPreis() * STEUERSATZ ;
  }
}

public class Chap53Ex1
{

  public static void main ( String[] args )
  {
    Waren[] inventar =  new Waren[4];
    inventar[0] = new Waren( "Tube", 1.40, 123 );
    inventar[1] = new Lebensmittel ( "Milch", 0.95, 555, 690 );
    inventar[2] = new Buecher ( "Emma", 14.95, 666, "Austin" );
    inventar[3] = new Spielwaren  ( "Lego", 24.45, 777, 8 );

    System.out.println("Array length: " + inventar.length);

    for ( int i = 0; i < inventar.length; i++ )
    {
    	inventar[i].anzeigen();
    }


  }
}
