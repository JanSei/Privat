import java.util.Scanner;
class Chap14Ex2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String meldung;
    int gewicht;

    System.out.println("Geben Sie Ihr Gewicht ein: ");
    gewicht = scan.nextInt();

    if( gewicht >= 235 && gewicht <= 265 )
      meldung = "zugelassen";
    else
      meldung = "nicht zugelassen";

    System.out.println("Sie sind zum Wettbewerb " + meldung);
  }
}