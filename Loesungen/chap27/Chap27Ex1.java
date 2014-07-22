import java.util.Scanner;
import java.awt.Point;

public class Chap27Ex1
{
  public static void main( String[] args )
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
    System.out.println( pt1.toString() );
    System.out.println( pt2.toString() );
  }
}