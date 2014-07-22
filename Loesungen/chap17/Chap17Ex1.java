import java.util.Scanner;
public class Chap17Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int i, n, quadratSumme = 0, kubikSumme   = 0;
    
    System.out.println("Geben Sie n ein:");
    n = scan.nextInt();

    i = 1;
    while( i <= n )
    {
     quadratSumme = quadratSumme + i * i;
     kubikSumme   = kubikSumme   + i * i * i;
     i = i + 1 ;
    }

    System.out.println("Die Quadratsumme ist: " + quadratSumme);
    System.out.println("Die Kubiksumme ist: "   + kubikSumme);
  }
}