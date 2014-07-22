import java.util.Scanner;

public class Chap19Ex1_2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double saldo, zinssatz , zinsen, rate, gesamt = 0.0;

    System.out.println("Geben Sie den Kreditbetrag ein:");
    saldo  = scan.nextDouble();
    
    System.out.println("Geben Sie den Zinsatz in Prozent ein:"); // 1.5
    zinssatz = scan.nextDouble();
    zinssatz = zinssatz / 100;
    
    System.out.println("Geben Sie die monatliche Rate ein:");
    rate = scan.nextDouble();
    
    int i = 0;
    while( saldo > 0 )
    {
      zinsen = saldo * zinssatz;
      
      i = i + 1;
      if ( saldo > rate ) 
      {
        saldo  = saldo  + zinsen - rate;
        gesamt = gesamt + rate;
      } 
      else
      {
        rate   = saldo  + zinsen;  //die letzte Rate berechnen
        gesamt = gesamt + rate;
        saldo  = 0.0;
      }
      System.out.println("Monat: "   + i     +
                        "\tSaldo: "  + saldo +
                        "\tGesamtbetrag: "   + gesamt );
    }
    System.out.println("Die letzte Rate betraegt mit Zinsen: " + rate);
  }
}