import java.util.Scanner;
public class Chap29Ex3
{
  public static void main(String[] args)
  {
    String inData = "";
    String vorname, nachname;
    int pos = 0; // Position des Leerzeichens zwischen Vor- und Nachnamen
    char ch;
    Scanner scan = new Scanner(System.in);

    System.out.println("Vor- und Nachnamen eingeben:");
    inData = scan.nextLine();

    while( !inData.equals("j") ) // für Programmende
    {
      //Leerzeichen ermitteln
      for(int i = 0; i < inData.length(); i++)
      {
        ch = inData.charAt(i);
        if (ch == ' ')
        {
          pos  = i;    //  Position des Leerzeichens
          break; // for-Schleife beenden
        }
      } // Ende for-Schleife
      
      //Vornamen und Nachnamen ermitteln
      vorname  = inData.substring(0, pos);
      nachname = inData.substring(pos + 1).toUpperCase();
      System.out.println(vorname + " " + nachname);


      System.out.println("Programm beenden mit <j>");
      System.out.println("Namen eingeben:");
      inData = scan.nextLine();
    } // Ende while-Schleife
  }
}





