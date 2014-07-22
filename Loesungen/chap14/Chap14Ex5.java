import java.util.Scanner;
public class Chap14Ex5
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String meldung;
    int reifenVorneLinks, reifenVorneRechts;
    int reifenHintenLinks, reifenHintenRechts;
    int psiBereich;
    boolean druckOK = true;

    System.out.println("Reifendruck: rechter Vorderreifen");
    reifenVorneRechts = scan.nextInt();

    System.out.println("Reifendruck: linker Vorderreifen");
    reifenVorneLinks = scan.nextInt();

    psiBereich = reifenVorneRechts - reifenVorneLinks;
    if( !(psiBereich >= -3 && psiBereich <= 3) )
      druckOK = false;

    System.out.println("Reifendruck: rechter Hinterreifen");
    reifenHintenRechts = scan.nextInt();

    System.out.println("Reifendruck: linker Hinterreifen");
    reifenHintenLinks = scan.nextInt();
    
    psiBereich = reifenHintenRechts - reifenHintenLinks;
    if( !(psiBereich >= -3 && psiBereich <= 3) )
      druckOK = false;
    
    if( druckOK )
      meldung = "ok";
    else
      meldung = "nicht ok";

    System.out.println("Der Reifendruck ist: " + meldung);
  }
}








