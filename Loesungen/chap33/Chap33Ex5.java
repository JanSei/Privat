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
                 hoehe  * laenge    ) ;
  }

  public double getLaenge() { return laenge; }
  public double getBreite() { return breite; }
  public double getHoehe()  { return hoehe;  }

  public Box groessereBox()
  {
  final double FAKTOR = 1.25 ;
  return new Box( FAKTOR * this.getBreite(),
                  FAKTOR * this.getHoehe() ,
                  FAKTOR * this.getLaenge() ) ;
  }

  public boolean passtIn(Box aeussereBox)
  {
    if ( this.breite < aeussereBox.breite &&
         this.hoehe  < aeussereBox.hoehe  &&
         this.laenge < aeussereBox.laenge )
      return true;
    else
      return false;
  }
}

public class Chap33Ex5
{

 public static void main(String[] args)
 {
   Box box1 = new Box(10.0, 10.0, 10.0);
   Box box2 = new Box(20.0, 11.0, 10.001);

   if ( box1.passtIn(box2) )
     System.out.println("Die Box passt hinein");
   else
     System.out.println("Die Box passt nicht hinein!");
 }
}