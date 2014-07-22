import java.util.Scanner;

public class Chap18Ex2
{
  public static void main(String[] args )
  {
    Scanner scan = new Scanner(System.in);
    String inputData;
    int untergrenze, obergrenze, zahl;
    int summeIn = 0, summeOut = 0;

    // Untergrenze eingeben lassen
    System.out.println("Untergrenze eingeben:");
    untergrenze = scan.nextInt();

    // Obergrenze eingeben lassen
    System.out.println("Obergrenze eingeben:");
    obergrenze = scan.nextInt();

    System.out.println("Zahl eingeben ( 0 -> Ende):");
    zahl = scan.nextInt(); // Zahl zum testen

    while( zahl != 0 )
    {
      if ( zahl >= untergrenze && zahl <= obergrenze )
        summeIn = summeIn + zahl;
      else
        summeOut = summeOut + zahl;

      // die nächste Zahl vom Anwender holen
      System.out.println(
      	"Einen weiteren Integer eingeben ( 0 -> Ende):");
      zahl = scan.nextInt(); // neue Zahl zum testen
    }

    System.out.println(
    	"Summe der Zahlen innerhalb des Bereichs: "  + summeIn);
    System.out.println(
    	"Summe der Zahlen ausserhalb des Bereichs: " + summeOut);
  }
}