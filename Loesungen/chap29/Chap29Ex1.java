import java.util.Scanner;
public class Chap29Ex1
{
  public static void main(String[] args)
  {
    String inData = "";
    int index  = 0;
    char ch;
    Scanner scan = new Scanner(System.in);

    System.out.println("Geben Sie einen String ein:");
    System.out.println("Programm beenden mit <j>");
    inData = scan.nextLine();

    while( !inData.equals("j"))
    {
      for(int i = 0; i < inData.length(); i++)
      {
        ch = inData.charAt(i);
        System.out.println(ch);
      }

      System.out.println("Programm beenden mit <j>");
      System.out.println("String eingeben:");
      inData = scan.nextLine();
    }

  }
}









