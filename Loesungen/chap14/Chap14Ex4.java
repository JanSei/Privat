import java.util.Scanner;
public class Chap14Ex4
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner(System.in);

    int reifenVorneLinks,  reifenVorneRechts;
    int reifenHintenLinks, reifenHintenRechts;
    String schlussbericht;
    String warnung = 
      "Warnung: Der Reifendruck ist ausserhalb des erlaubten Bereichs!";
    boolean druckOK = true;

    System.out.println("Reifendruck: rechter Vorderreifen");
    reifenVorneRechts = scan.nextInt();

    if( !(reifenVorneRechts >= 35 && reifenVorneRechts <= 45) )
    {
      System.out.println(warnung); druckOK = false;
    }

    System.out.println("Reifendruck: linker Vorderreifen");
    reifenVorneLinks = scan.nextInt();
    
    if( !(reifenVorneLinks >= 35 && reifenVorneLinks <= 45) )
    {
      System.out.println(warnung); druckOK = false;
    }

    System.out.println("Reifendruck: rechter Hinterreifen");
    reifenHintenRechts = scan.nextInt();
    
    if( !(reifenHintenRechts >= 35 && reifenHintenRechts <= 45) )
    {
      System.out.println(warnung); druckOK = false;
    }

    System.out.println("Reifendruck: linker Hinterreifen");
    reifenHintenLinks = scan.nextInt();
    
    if( !(reifenHintenLinks >= 35 && reifenHintenLinks <= 45) )
    {
      System.out.println(warnung); druckOK = false;
    }

    if( reifenVorneRechts  == reifenVorneLinks   &&  
        reifenHintenRechts == reifenHintenLinks  &&
        druckOK == true )
      schlussbericht = "ok";
    else
      schlussbericht = "nicht ok";

    System.out.println("Der Reifendruck ist: " + schlussbericht);
  }
}




