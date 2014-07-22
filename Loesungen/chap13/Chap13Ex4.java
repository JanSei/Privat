import java.util.*;
class Chap13Ex4
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);        

    String namen;
    int staerke, gesundheit, glueck;

    System.out.println("Willkommen zu Yertle's Schatzsuche");
    System.out.println("Geben Sie den Namen der Spielfigur ein:");
    namen      = scan.nextLine();

    System.out.println("Staerke eingeben (1 - 10):");
    staerke    = scan.nextInt();

    System.out.println("Gesundheit eingeben (1 - 10):");
    gesundheit = scan.nextInt();

    System.out.println("Glueck eingeben (1 - 10):");
    glueck     = scan.nextInt();

    if( (staerke + gesundheit + glueck) > 15 )
    {
      staerke = 5; gesundheit = 5; glueck = 5;
      System.out.print(
        "Sie haben Ihrer Spielfigur zu viele Punkte gegeben! ") ;
      System.out.println(
        "Es wurden die Standardwerte zugewiesen: ") ;
    }
	
	System.out.println( namen      + ", "  +
	  "Staerke: "     + staerke    + " "   +
	  "Gesundheit: "  + gesundheit + " "   +
	  "Glueck: "      + glueck               );

	}
}