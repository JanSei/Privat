import java.util.Scanner;
public class Chap14Ex3
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);

    int reifenVorneLinks,  reifenVorneRechts;
    int reifenHintenLinks, reifenHintenRechts;
    String meldung;

    System.out.println("Reifendruck: rechter Vorderreifen");
    reifenVorneRechts = scan.nextInt();

    System.out.println("Reifendruck: linker Vorderreifen");
    reifenVorneLinks = scan.nextInt();

    System.out.println("Reifendruck: rechter Hinterreifen");
    reifenHintenRechts = scan.nextInt();

    System.out.println("Reifendruck: linker Hinterreifen");
    reifenHintenLinks = scan.nextInt();

    if( reifenVorneRechts  == reifenVorneLinks  &&
        reifenHintenRechts == reifenHintenLinks )
      meldung = "ok";
    else
      meldung = "nicht ok";

    System.out.println("Der Reifendruck ist: " + meldung);
  }
}







