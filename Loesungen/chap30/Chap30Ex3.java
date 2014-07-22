import java.util.Scanner;
class HalloObjekt
{
  String mitteilung;

  //Konstruktor
  HalloObjekt(String mit)
  {
    mitteilung = mit ;
  }

  // Methodendefinition
  void sprich()
  {
    System.out.println(mitteilung);
  }
}

public class Chap30Ex3
{
  public static void main(String[] args)
  {
    String inData;
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie einen Gruss ein:");
    inData = scan.nextLine();

    HalloObjekt einObjekt = new HalloObjekt(inData);
    einObjekt.sprich();

  }
}