import java.util.*;
public class Chap10Ex3_2
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
    int betrag, dollar, quarter, dime, nickel, cent;
    
    
    
    System.out.println("Geben Sie das Wechselgeld ein:");
    betrag = scan.nextInt();

    dollar  =  betrag / 100;
    quarter =  betrag % 100 / 25;
    dime    =  betrag % 100 % 25 / 10;
    nickel  =  betrag % 100 % 25 % 10 / 5;
    cent    =  betrag % 100 % 25 % 10 % 5;

  	System.out.println("Das Wechselgeld ist "      +
  	                    dollar  + " Dollar, "     +
                        quarter + " Quarter, "    +
                        dime    + " Dime, "       +
                        nickel  + " Nickel und "  +
                        cent    + " Cent." );

  }
}