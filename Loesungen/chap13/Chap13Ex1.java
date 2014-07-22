import java.util.*;
class Chap13Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);        

    String inData, artikel;
    double preis, zuschlag, versand;
    int express;

    System.out.println("Geben Sie den Artikel ein:");
    artikel  = scan.nextLine();

    System.out.println("Geben Sie den Preis ein: ");
    preis    = scan.nextDouble();

    System.out.println("Expressversand (0==nein, 1==ja): ");
    express  = scan.nextInt();

    if( express == 1 )
      zuschlag = 5.0;
    else
      zuschlag = 0.0;
      
    if( preis < 10 )
      versand = 2.0;
    else
      versand = 3.0;
      
    System.out.println("Rechnung");
    System.out.print("\t" + artikel + ": " + preis);
    System.out.print("\n\tVersand: " + ( versand + zuschlag ) );
    System.out.print("\n\tGesamt: "  + ( preis + versand + zuschlag ) );
    System.out.println();
  }
}






