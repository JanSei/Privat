/* Freier Fall
   Geben Sie die Anzahl der Sekunden ein: 5,4
   Die Entfernung e betraegt: 143.02980000000002 Meter/Sekunde
*/

import java.util.Scanner;

class Chap11Ex2
{
  public static void main(String[] args)
  {
	  
	  final double G = 9.81;
	  double e, z;
	  Scanner scan = new Scanner( System.in );
	  
	  System.out.print("Geben Sie die Anzahl der Sekunden ein: ");
	  z = scan.nextDouble();
	
	  e = 1.0/2.0 * G * z*z;
	
	  System.out.println("Die Entfernung e betraegt: " + e + " Meter/Sekunde");
  }
}