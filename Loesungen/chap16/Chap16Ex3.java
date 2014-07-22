import java.util.Scanner;
public class Chap16Ex3
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int n, zahl = 0;
    int zaehler = 0;
    double summe = 0, summeQ = 0, quadrat = 0;
    double durchschnitt, durchschnittQ;
    double sd;

    System.out.println("Geben Sie N ein:");
    n = scan.nextInt();

    while ( zaehler < n )
    {
       System.out.println("Geben Sie eine Zahl ein:");
       zahl    = scan.nextInt();

       summe   = summe  + zahl;
       quadrat = zahl   * zahl;
       summeQ  = summeQ + quadrat;
       zaehler = zaehler + 1;
    }

    System.out.println("Summe: "  + summe );
    System.out.println("SummeQ: " + summeQ);

    durchschnitt  = summe  / n;
    durchschnittQ = summeQ / n;

    System.out.println("Durchschnitt:  "  + durchschnitt );
    System.out.println("DurchschnittQ: "  + durchschnittQ);

    sd = Math.sqrt( durchschnittQ - durchschnitt * durchschnitt);

    System.out.println("Die Standardabweichung ist: " + sd);
  }
}