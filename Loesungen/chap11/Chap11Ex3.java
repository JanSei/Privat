import java.util.Scanner;
class Chap11Ex3
{
  public static void main (String[] args)
  {

    double arithMittel; 	 // aritharmonMitteletisches Mittel
    double harmonMittel; 	 // harmonisches Mittel;
    double x,y;

    Scanner scan = new Scanner( System.in );
    
    System.out.print("Geben Sie x ein: ");
    x      = scan.nextDouble();

    System.out.print("eben Sie y ein: ");
    y      = scan.nextDouble();

    arithMittel = (x + y) / 2.0 ;
    System.out.println("AritharmonMitteletisches Mittel: " + arithMittel);

    harmonMittel = 2.0 / (1.0 / x  +  1.0 / y);
    System.out.println("Harmonisches Mittel: " + harmonMittel);

  }













}