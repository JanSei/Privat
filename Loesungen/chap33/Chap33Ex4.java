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

  public Box(Box alteBox)
  {
    breite  = alteBox.breite;
    hoehe   = alteBox.hoehe;
    laenge  = alteBox.laenge;
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

  public double getLaenge() { return laenge; }
  public double getBreite() { return breite; }
  public double getHoehe()  { return hoehe;  }

  public Box groessereBox()
  {
    final double FAKTOR = 1.25 ;
    return new Box( FAKTOR * this.breite,
                    FAKTOR * this.hoehe,
                    FAKTOR * this.laenge );
  }
}

public class Chap33Ex4
{
 public static void main(String[] args)
 {
   Box box1 = new Box(10.0, 10.0, 10.0);
   Box box2 = box1.groessereBox();

   System.out.println("+++ Box1 +++");
   System.out.println(
     "Flaeche: "  + box1.berechneFlaeche() + 
     " Volumen: " + box1.berechneVolumen() );
   
   System.out.println(
    "Laenge: "  + box1.getLaenge() +
    " Hoehe: "  + box1.getHoehe()  +
    " Breite: " + box1.getBreite() );
   
   System.out.println("\n+++ Box2 +++");
   System.out.println(
     "Flaeche: "  + box2.berechneFlaeche() + 
     " Volumen: " + box2.berechneVolumen() );
   
   System.out.println(
    "Laenge: "  + box2.getLaenge() +
    " Hoehe: "  + box2.getHoehe()  +
    " Breite: " + box2.getBreite() );
 }
}