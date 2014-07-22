import java.util.*;
public class Chap10Ex3_1
{
  public static void main(String[] args)
  {
    /* Ein Dollar passt in 163, Rest 63 Cent.
       Zwei Quarter passen in 63 Cent, Rest 13 Cent.
       Eine Dime passt in 13 Cent, Rest 3 Cent.
       Es wird kein Nickel gebraucht.
       Drei Cent bleiben übrig.
    */

    Scanner scan = new Scanner( System.in );

    int betrag, rest, dollar, quarter, dime, nickel, cent;

    System.out.println("Geben Sie das Wechselgeld ein:");
    betrag = scan.nextInt();

    dollar  = betrag / 100;
    rest    = betrag % 100; 
    quarter = rest   / 25 ;
    rest    = rest   % 25 ;
    dime    = rest   / 10 ;
    rest    = rest   % 10 ;
    nickel  = rest   /  5 ;
    cent    = rest   %  5 ;
    
  	System.out.println("Das Wechselgeld ist "      +
  	                    dollar  + " Dollar, "     +
                        quarter + " Quarter, "    +
                        dime    + " Dime, "       +
                        nickel  + " Nickel und "  +
                        cent    + " Cent.");

  }
}