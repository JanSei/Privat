import java.util.*;
class Chap13Ex2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);        

    final double SIEDEPUNKT = 373.0;
    double effizienz, tLuft, tDampf;

    System.out.println("Geben Sie die Lufttemperatur ein:");
    tLuft   = scan.nextDouble();

    System.out.println("Geben Sie die Dampftemperatur ein:");
    tDampf  = scan.nextDouble();

    if( tDampf >= SIEDEPUNKT )
      effizienz = 1 - tLuft / tDampf;
    else
      effizienz = 0.0;
    
    System.out.println("Die Effizienz betraegt: " + effizienz);
  }
}