import java.util.*;
public class Chap11Ex4
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner( System.in );

    double x, ergebnis;

    System.out.println("Geben Sie ein double ein:");
    x      = scan.nextDouble();

    ergebnis = Math.log(x) / Math.log(2);

    System.out.println
      ("Die Basis log2 von " + x + " ist " + ergebnis);
  }
}