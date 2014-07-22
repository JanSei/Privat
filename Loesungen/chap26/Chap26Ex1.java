public class Chap26Ex1
{
  public static void main(String[] args)
  {
    String str1 = "Bo, die Katze";
    String str2 = "Bo, die Katze";
    String str3 = new String("Fred, der Hund");
    String str4 = new String("Fred, der Hund");

    int anzahl;
    if ( str1 == str2 )
      anzahl = 1;
    else
      anzahl = 2;

    if ( str3 == str4 )
      anzahl = anzahl + 1;
    else
      anzahl = anzahl + 2;

    System.out.println(
      "Es wurden " + anzahl + " Objekte erzeugt.");
  }
}