public class Chap19Ex2
{
  public static void main(String[] args)
  {
    double wirkstoffgehalt = 100.0;
    double verlust         = 0.04;
    int    i               = 0;

    while( wirkstoffgehalt > 50.0 )
    {
      System.out.println
        ("Monat: " + i + "\tWirkstoffgehalt: " + wirkstoffgehalt);
	  
	  i = i + 1;
	  wirkstoffgehalt = wirkstoffgehalt * (1 - verlust);
    }

    System.out.println
      ("Monat: " + i + "\tWirkstoffgehalt: " + wirkstoffgehalt + " ABGELAUFEN");
  }
}