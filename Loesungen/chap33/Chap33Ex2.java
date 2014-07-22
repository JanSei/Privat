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

  double berechneFlaeche( )
  {
    return 2 * berechneFlaecheVorn() +
           2 * berechneFlaecheOben() +
           2 * berechneFlaecheSeitlich() ;
  }

  private double berechneFlaecheVorn()     { return   breite * hoehe;  }
  private double berechneFlaecheOben()     { return   breite * laenge; }
  private double berechneFlaecheSeitlich() { return   hoehe  * laenge; }

  public void anzeigen()
  {
    System.out.println("Laenge: "   +  laenge +
                       " Hoehe: "   +  hoehe  +
                       " Breite: "  +  breite  );
  }
}

public class Chap33Ex2
{
  public static void main(String[] args)
  {
    Box box = new Box(2.5, 5.0, 6.0);

    System.out.println(
      "Flaeche: "  + box.berechneFlaeche() +
      " Volumen: " + box.berechneVolumen() );
  }
}