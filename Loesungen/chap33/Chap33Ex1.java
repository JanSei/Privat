class Box
{
  // Instanzvariablen
  private double laenge;
  private double breite;
  private double hoehe;

  // Konstruktoren
  public Box(double breite, double hoehe, double laenge)
  {
    this.breite  = breite;
    this.hoehe   = hoehe;
    this.laenge  = laenge;
  }

  public Box(double seite)
  {
    breite  = seite;
    hoehe   = seite;
    laenge  = seite;
  }


  // Methoden
  public double berechneVolumen()
  {
    return breite * hoehe * laenge;
  }

  public double berechneFlaeche()
  {
    return 2 * ( breite * hoehe   +
                 breite * laenge  +
                 hoehe  * laenge    );
  }

  public void anzeigen()
  {
  System.out.println( "Laenge: "   +  laenge +
                      " Hoehe: "   +  hoehe  +
                      " Breite: "  +  breite  );
  }
}

public class Chap33Ex1
{
  public static void main(String[] args)
  {
    Box box = new Box(2.5, 5.0, 6.0);

    System.out.println( "Flaeche: "  + box.berechneFlaeche() +
                        " Volumen: " + box.berechneVolumen() );
    box.anzeigen();
  }
}