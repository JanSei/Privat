import java.util.Scanner;
import java.awt.Point;

public class Chap27Ex2
{
  public static void main(String[] args)
  {
    int x1, x2, y1, y2;
    Scanner scan = new Scanner(System.in);

    // 1. Point-Objekt x- und y-Werte vom Anwender holen
    System.out.println("1. Point-Objekt x-Wert eingeben");
    x1 = scan.nextInt();
    System.out.println("1. Point-Objekt y-Wert eingeben");
    y1 = scan.nextInt();

    // 2. Point-Objekt x- und y-Werte vom Anwender holen
    System.out.println("2. Point-Objekt x-Wert eingeben");
    x2 = scan.nextInt();
    System.out.println("2. Point-Objekt y-Wert eingeben");
    y2 = scan.nextInt();

    // Point-Objekte erzeugen und ausgeben
    Point pt1 = new Point(x1, y1);
    Point pt2 = new Point(x2, y2);

    if( pt1.equals(pt2) )
      System.out.println(
        "Die Koordinaten der beiden Punkte sind gleich:\n" + pt1 + " und " + pt2);
    else
      System.out.println(
        "Die Koordinaten der beiden Punkte sind NICHT gleich:\n" + pt1 + " und " + pt2);
  }
}