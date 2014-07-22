public class Chap09AEx2


{
  public static void main(String[] args)
  {
    //double x = 4.0;
    double x = 2.0/3.0; // 2/3 würde 0 ergeben, da dann eine Integerdivision stattfindet.
    double ergebnis = 0.0;

    ergebnis = 3*x*x - 8*x + 4;
    System.out.println("Bei x = " + x +
	    " ergibt die Quadratgleichung den Wert " + ergebnis);
  }
}

