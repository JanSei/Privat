import java.util.*;
class Chap13Ex3
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);        

    int    posten;
    double erhitzungszeit;
    
    System.out.println(
      "Geben Sie die Erhitzungszeit in Minuten fuer einen Posten ein:");
    erhitzungszeit = scan.nextDouble();


    System.out.println("Wie viele Posten?");
    posten = scan.nextInt();

    if( posten == 1 )
      System.out.println(
        "Erhitzungszeit: " + erhitzungszeit + " Minuten" );      
        
    if( posten == 2 )
      System.out.println("Erhitzungszeit: " +
        (erhitzungszeit + erhitzungszeit / 2.0) + " Minuten" );
      
    if( posten == 3 )
      System.out.println("Erhitzungszeit: " +
        ( erhitzungszeit * 2 ) + " Minuten" );
        
    if ( posten > 3 )
      System.out.println(
        "Das Erhitzen von mehr als 3 Posten wird nicht empfohlen!");
  }
}







