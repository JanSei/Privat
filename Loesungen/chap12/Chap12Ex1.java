import java.util.*;
class Chap12Ex1
{
  public static void main(String[] args)
  {
    int betrag, rabatt, rabattsatz = 10;
    Scanner scan = new Scanner(System.in);

    System.out.println("Geben Sie den Gesamtbetrag ein: ");

    betrag  = scan.nextInt();

    if( betrag > 1000 )
      rabatt = betrag / 100 * rabattsatz;
    else
      rabatt = 0;

    System.out.println("Discountpreis: " + (betrag - rabatt) );
  }
}