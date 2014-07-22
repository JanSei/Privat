import java.util.Scanner;
public class Chap14Ex1
{
  public static void main(String[] args)
  {
    int girokonto, sparkonto;
    Scanner scan = new Scanner(System.in);

    System.out.println("Guthaben Girokonto:");
    girokonto = scan.nextInt();

    System.out.println("Guthaben Sparkonto:");
    sparkonto = scan.nextInt();

    if( girokonto > 1000 || sparkonto > 1500 )
      System.out.println("Es wird keine Gebuehr erhoben!");
    else
      System.out.println("Die Gebuehr betraegt 0.15$");
  }
}