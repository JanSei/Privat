import java.util.*;

/* Kilowattstunden: 8.51
   Preis: 653
   Ergebnis: 55.570299999999996
*/

class Chap11Ex1
{
 public static void main(String[] args)
 {

  Scanner scan = new Scanner(System.in);

  double preis, anzahl;// Deklaration von zwei double Variablen

  System.out.println(
    "Geben Sie den Preis pro Kilowattstunde in Cent ein:");
  preis  = scan.nextDouble();

  System.out.println(
    "Geben Sie die Anzahl der Kilowattstunden pro Jahr ein:");
  anzahl = scan.nextDouble();

  double ergebnis = preis * anzahl / 100.0 ;
  System.out.println("Jahreskosten: " + ergebnis);
  }
}











