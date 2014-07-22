import java.util.*;
class Chap12Ex3
{
  public static void main (String[] args)
  {

    String meldung;
    Scanner scan = new Scanner(System.in);

    int tankkapazitaet, benzinanzeige, meilenProGallone;
    System.out.println("Tankkapazitaet:");
    tankkapazitaet   = scan.nextInt();
    
    System.out.println("Benzinanzeige:");
    benzinanzeige    = scan.nextInt();

    System.out.println("Meilen pro Gallone:");
    meilenProGallone = scan.nextInt();

    double ergebnis =
      ( tankkapazitaet * benzinanzeige * meilenProGallone ) / 100.0 ;

    System.out.println("Ergebnis: " + ergebnis);

    if ( ergebnis < 200  )
      meldung = "Tanken!";
    else
      meldung = "Drive on...";

    System.out.println(meldung);
  }
}