import java.util.Scanner;
public class Chap15Ex2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    String inData;
    int laenge;
    int zaehler = 1;

    System.out.println("Geben Sie ein Wort ein");

    inData = scan.nextLine();
    laenge = inData.length();
    System.out.println();

    while ( zaehler <= laenge )
    {
      System.out.println(inData);
      zaehler = zaehler + 1;
    }
  }
}