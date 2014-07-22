import java.util.*;
class Chap12Ex4
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);        
   
    double preisA, preisB, preisMagerA, preisMagerB;
    int prozentA, prozentB;

    System.out.println("Preis pro Pfund Packung A:");
    preisA = scan.nextDouble();

    System.out.println("Prozent mageres Fleisch Packung A:");
    prozentA = scan.nextInt();

    System.out.println("Preis pro Pfund Packung B:");
    preisB = scan.nextDouble();

    System.out.println("Prozent mageres Fleisch Packung A:");
    prozentB  = scan.nextInt();

    preisMagerA = preisA / prozentA * 100;
    preisMagerB = preisB / prozentB * 100;

    System.out.println(
      "Packung A kostet pro Pfund mageres Fleisch: " +
        preisMagerA );
    System.out.println(
      "Packung B kostet pro Pfund mageres Fleisch: " + 
        preisMagerB );

    if ( preisMagerA < preisMagerB )
      System.out.println("Packung A ist preiswerter");
    else
      System.out.println("Packung B ist preiswerter");
  }
}