import java.util.*;
public class Chap10Ex2
{
  public static void main (String[] args) 
  {
    /*
       Geben Sie die Cents ein: 324
       Das ergibt 3 Dollar und 24 Cent.
    */

    Scanner scan =new Scanner( System.in );

    int cent, dollar, rest;

    System.out.println("Geben Sie die Cent ein:");
    cent   = scan.nextInt();
    dollar  = cent / 100;
		rest    = cent % 100;
    System.out.println("Das ergibt: " + dollar +
                       " Dollar und " + rest    + " Cent");

  }
}