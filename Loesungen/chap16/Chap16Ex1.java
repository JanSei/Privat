import java.util.Scanner;
public class Chap16Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int    anzahl ;
    int    zaehler = 1, summe = 0, zahl = 0;

    System.out.println("Wie viele Integer sollen addiert werden:");
    anzahl = scan.nextInt();

    System.out.println();

    while ( zaehler <= anzahl )
    {
      System.out.println("Geben Sie einen Integer ein:");
      zahl    = scan.nextInt();
      summe   = summe + zahl;
      zaehler = zaehler + 1;
    }

    System.out.println("Die Summe ist: " + summe);
  }
}