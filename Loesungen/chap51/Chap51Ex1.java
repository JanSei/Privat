abstract class Karte
{
  String empfaenger;  // Name des Empfängers
  String anrede;      // <w>eiblich oder <m>ännlich

  Karte(String empfaenger, String sex)
  {
    this.empfaenger = empfaenger;
    if ( sex.equals("w") )
      anrede = "Liebe";
    else
      anrede = "Lieber";
  }

  public abstract void gruss();  // abstrakte gruss() Methode
}

class Feiertag extends Karte
{
  public Feiertag(String empfaenger, String sex)
  {
    super(empfaenger, sex);
  }
  
  public void gruss()
  {
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}

class Geburtstag extends Karte
{
  int jahre;
  
  public Geburtstag(String empfaenger, String sex, int jahre)
  {
    super(empfaenger, sex);
    this.jahre = jahre;
  }
  
  public void gruss()
  {
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("Alles Gute zum " + jahre + ". Geburtstag.\n\n");
  }
}

class Valentin extends Karte
{
  int kuesse;
  
  public Valentin(String empfaenger, String sex, int kuesse)
  {
    super(empfaenger, sex);
    this.kuesse = kuesse;
  }
  
  public void gruss()
  {
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("Herzliche Gruesse und Kuesse.\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}

public class Chap51Ex1
{
  public static void main(String[] args)
  {
    Feiertag feiertag = new Feiertag("Ann", "w");
    feiertag.gruss();
    Geburtstag geb = new Geburtstag("Bob", "m", 55);
    geb.gruss();
    Valentin val = new Valentin("Joan", "w", 33);
    val.gruss();
  }
}









