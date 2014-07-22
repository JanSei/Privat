import java.util.Scanner;
public class Chap17Ex4
{
  public static void main (String[] args )
  {
    int anzahlZeilen;   // die Anzahl der Zeilen
    int i, j, k;        // Laufvariablen
    Scanner scan = new Scanner(System.in);

    // Input vom Anwender sammeln
    System.out.println("Wie viele Zeilen?");
    anzahlZeilen  = scan.nextInt();

    i  =  1;
    while ( i <= anzahlZeilen * 2) // i wird um 2 inkrementiert 
    {
      /* es muss immer ein Leerzeichen weniger pro Zeile ausgegeben werden,
         also wird die innere Laufvariable mit dem Wert der äußeren Laufvariablen
         initialisiert
      */ 
      j = i;
      while ( j <= anzahlZeilen * 2 )
      {
        System.out.print(" "); // Leerzeichen ausgeben
        j = j + 2;
      }

      k = 1;
      // i wird um 2 inkrementiert,
      // also werden immer 2 Sterne mehr pro Zeile ausgegeben
      while ( k <= i )
      {
        System.out.print("*"); // Sternchen ausgeben
        k = k + 1;
      }

      System.out.println(); // notwendig um jede Zeile zu beenden
      i = i + 2; // Anzahl der Sternchen pro Zeile um 2 erhöhen
    }

    // Baumstamm
    // dreimal 3 Sterne ausgeben
    j = 1;
    while ( j <= 3 )
    {
      /* Anzahl der Leerzeichen ergibt sich aus der Anzahl der Sterne
         der letzten Zeile / 2 
         Die Anzahl der Sterne der letzten Reihe ergibt sich aus i - 2.
      */
      k = 1;
      while ( k <= (i - 2 ) / 2 )
      {
         System.out.print(" "); // Leerzeichen ausgeben
         k = k + 1;
      }

      k = 1;
      while ( k <= 3 )
      {
         System.out.print("*"); // Sterne ausgeben
         k = k + 1;
      }

      System.out.println(); // notwendig um jede Zeile zu beenden
      j = j + 1;
    }
  }
}
