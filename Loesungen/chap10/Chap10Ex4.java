import java.util.*;
public class Chap10Ex4
{
  public static void main(String[] args)
  {
    /*
       Ohms Gesetz: I = U/R
       U -> Spannung, I -> Stromstärke, R -> Widerstand
       Spannung und Widerstand werden vom Anwender eingegeben
    */

    Scanner scan = new Scanner( System.in );
    int u, r;
    double i;
    
    System.out.println("Geben Sie die Spannung ein: ");
    u = scan.nextInt();

    System.out.println("Geben Sie den Widerstand ein: ");
    r = scan.nextInt();

    i = ( u + 0.0 ) / r ;

    System.out.println("Die Stromstaerke betraegt: " + i );

  }
}