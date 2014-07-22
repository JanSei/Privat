import java.util.Scanner;
public class Chap18Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int anfangsstand, endstand, gallonen;
    double ergebnis = 0;

    System.out.println("Programm Meilen pro Gallone");
    System.out.println("Anfangsstand Meilen:");
    anfangsstand = scan.nextInt();

    while (anfangsstand >= 0)
    {
      System.out.println("Endstand Meilen:");
      endstand = scan.nextInt();

      System.out.println("Gallonen:");
      gallonen = scan.nextInt();

      ergebnis = (endstand - anfangsstand) / ( gallonen * 1.0 );

      System.out.println("Meilen pro Gallone: " + ergebnis + "\n\n");
      System.out.println("Anfangsstand Meilen:");
      anfangsstand = scan.nextInt();
    }

    System.out.println("bye");
  }
}