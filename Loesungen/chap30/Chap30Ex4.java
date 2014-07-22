import java.util.Scanner;
class HalloObjekt
{
  String mitteilung;

  // Konstruktoren
  HalloObjekt()
  {
  	 mitteilung = "Hallo";
  }

  HalloObjekt(String mit)
  {
  	mitteilung = mit;
  }

  HalloObjekt(HalloObjekt einHalloObjekt)
  {
    // zwei Referenzen auf dasselbe Stringobjekt
    mitteilung = einHalloObjekt.mitteilung;

    // ein neues Stringobjekt auf der Basis des Stringobjekts
    // erzeugen, auf das die Instanzvariable mitteilung des Objekts
    // einHalloObjekt verweist.
    // mitteilung = new String( einHalloObjekt.mitteilung ) ;
  }

  // Methodendefinition
  void sprich()
  {
  	 System.out.println(mitteilung);
  }

}

public class Chap30Ex4
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie eine Mitteilung ein:");
    String userIn = scan.nextLine();
    HalloObjekt hallo1 = new HalloObjekt(userIn);

    HalloObjekt hallo2 = new HalloObjekt(hallo1);
    hallo1.sprich();
    hallo2.sprich();
  }
}