import java.util.Scanner;
public class Chap17Ex3
{
  public static void main(String[] args )
  {
    int anzahl;
    int i, j;
    Scanner scan = new Scanner(System.in);

    // Input vom Anwender sammeln
    System.out.println("Wie viele Sterne?");
    anzahl  = scan.nextInt();

    i = 1;
    while( i <= anzahl )
    {
      j = i;  // Anzahl der Sterne pro Zeile um eins verringern
              // durch die Übernahme der äußeren Laufvariablen
              // als Anfangswert für die innere Laufvariable
      while ( j <= anzahl )
      {
        System.out.print("*"); // Sternchen ausgeben
        j = j + 1;
      }

      System.out.println(); // notwendig um jede Zeile zu beenden
      i = i + 1;
    }
  }
}