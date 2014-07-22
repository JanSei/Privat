class HalloObjekt
{
  String mitteilung;

  //Konstruktor
  HalloObjekt(String mit)
  {
    mitteilung = mit;
  }

  // Methodendefinition
  void mitteilungMorgens()
  {
    System.out.println("Guten Morgen " + mitteilung );
  }

  void mitteilungAbends()
  {
    System.out.println("Guten Abend " + mitteilung );
  }

  //  void sprich() // ausgelassen...

}

public class Chap30Ex2
{
  public static void main(String[] args)
  {
    HalloObjekt einObjekt = new HalloObjekt("Welt");
    einObjekt.mitteilungMorgens();
    einObjekt.mitteilungAbends();
  }
}