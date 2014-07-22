import java.util.Scanner;

public class Chap19Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double saldo = 1000.0, zinsen, rate, gesamt = 0.0;
    final double ZINSSATZ = 0.015; // 1.5 Prozent

    System.out.println("Geben Sie den monatlichen Betrag ein:");
    rate   = scan.nextDouble();
    
    int i = 0;
    while( saldo >= 0 )
    {
      zinsen = saldo  * ZINSSATZ;
      saldo  = saldo  + zinsen - rate;
      gesamt = gesamt + rate;
      i = i + 1;
      System.out.println("Monat: "   + i     +
                        "\tSaldo: "  + saldo +
                        "\tGesamtbetrag: "   + gesamt ) ;
    }
  }
}