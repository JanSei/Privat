import java.util.*;
class Chap12Ex5
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);        

    int geburtsjahr, aktuellesJahr, alter;

    System.out.println("Geburtsjahr:");
    geburtsjahr = scan.nextInt();

    System.out.println("Aktuelles Jahr:");
    aktuellesJahr  = scan.nextInt();

    if ( geburtsjahr < aktuellesJahr )
      alter = aktuellesJahr - geburtsjahr;
    else
      alter = 100 - geburtsjahr + aktuellesJahr;

    System.out.println("Ihr Alter ist: " + alter);

  }
}