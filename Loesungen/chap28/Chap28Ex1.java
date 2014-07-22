import java.awt.Point;

public class Chap28Ex1
{
  public static void main(String[] args)
  {
    // Point-Objekte erzeugen und ausgeben

    Point pt1 = new Point(10, 10);
    Point pt2 = new Point(30, 30);

    int breite = Math.abs(pt1.x - pt2.x);
    int hoehe  = Math.abs(pt1.y - pt2.y);

    int flaeche = breite * hoehe;

    System.out.println("Die Flaeche betraegt: " + flaeche);
  }
}