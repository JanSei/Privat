import java.awt.Point;

public class Chap28Ex2
{
  public static void main(String[] args)
  {
    // Zwei Referenzen auf dasselbe Point-Objekt

    // Point-Objekt erzeugen
    Point pt1 = new Point(10, 10);

    // Referenz vov pt1 nach ptAlias kopieren
    Point ptAlias = pt1;

    if ( pt1 == ptAlias )
      System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt!\n");

    System.out.println("Point pt1 vorher:\t"     + pt1);
    System.out.println("Point ptAlias vorher:\t" + ptAlias  + "\n");

    // Über die Referenzvariable ptAlias
    // die Instanzvariablen x und y des Point-Objekts ändern
    ptAlias.x = ptAlias.x * 2;
    ptAlias.y = ptAlias.y * 2;

    System.out.println("Nur ueber ptAlias wurden die x- und y-Werte verdoppelt!\n");

    System.out.println("Point pt1 nachher:\t"     + pt1);
    System.out.println("Point ptAlias nachher:\t" + ptAlias);
  }
}