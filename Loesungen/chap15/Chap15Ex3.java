import java.util.Scanner;
public class Chap15Ex3
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    String wort1, wort2;
    int laenge1, laenge2, anzahlPunkte;
    int zaehler = 1;

    System.out.println("Geben Sie das erste Wort ein");
    wort1   = scan.nextLine();
    laenge1 = wort1.length();

    System.out.println("Geben Sie das zweite Wort ein");
    wort2   = scan.nextLine();
    laenge2 = wort2.length();

    anzahlPunkte = 30 - (laenge1 + laenge2);

    System.out.println();
    System.out.print(wort1);

    while ( zaehler <= anzahlPunkte )
    {
      System.out.print(".");
      zaehler = zaehler + 1;
    }
    System.out.println(wort2);
  }
}