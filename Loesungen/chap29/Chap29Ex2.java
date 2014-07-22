import java.util.Scanner;
public class Chap29Ex2
{
  public static void main(String[] args)
  {

    //Das Programm vergibt den Titel Ms. oder Mr.
    Scanner scan = new Scanner(System.in);
    String inData;
    System.out.println("Geben Sie einen Namen ein:");
    inData = scan.nextLine();
    while( !inData.equals("") )
    {
      if( inData.startsWith("Amy")   ||
          inData.startsWith("Buffy") ||
          inData.startsWith("Cathy") )
        inData = "Ms. " + inData;
      
      if( inData.startsWith("Elroy") ||
          inData.startsWith("Fred")  ||
          inData.startsWith("Graham") )
        inData = "Mr. " + inData;
      
      System.out.println(inData);
      
      System.out.println("Geben Sie einen Namen ein:");
      inData = scan.nextLine();
    }
  }
}







