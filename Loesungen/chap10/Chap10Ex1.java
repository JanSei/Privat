import java.util.*;
public class Chap10Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner( System.in );
    String inData;

    System.out.println("Geben Sie den Radius ein:");
    int radius     = scan.nextInt();
    double flaeche = radius * radius * Math.PI;

    System.out.println("Der Radius ist: "        +  radius +
                       " Die Flaeche betraegt: " + flaeche );
  }
}

