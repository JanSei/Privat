import java.util.Scanner;
class Chap17Ex2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int i, n;
    double x , ergebnis = 1;

    System.out.println("Geben Sie x ein:");
    x = scan.nextDouble();

    System.out.println("Geben Sie n ein:");
    n = scan.nextInt();
    i = 1;
    if( n > 0 )
    {
    	while( i <= n)
    	{
        ergebnis = ergebnis * x;
        i = i + 1;
    	}
    	System.out.println(x + " hoch " + n + " ergibt: " + ergebnis );
    }
    else
    {
      System.out.println("n muss ein positiver Integer sein:");
    }
  }
}