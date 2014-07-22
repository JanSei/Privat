import java.util.Scanner;

public class Chap26Ex2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int zahl, summe = 0;
    String userIn;
    boolean prompt = false;

    System.out.println("Eingabeaufforderung <ja> oder <nein>?");
    userIn = scan.nextLine();
    if ( userIn.equals("ja") )
      prompt = true;

    int zaehler = 1; // zaehler initialisieren    
    while( zaehler <= 5 )
    {
      if( prompt == true )
        System.out.println("Geben Sie die " + zaehler + ". Zahl ein:");
      
      zahl = scan.nextInt();
      summe    = summe + zahl;
      zaehler  = zaehler + 1; 
    }
    System.out.println( "Gesamtsumme: " + summe );
  }
}