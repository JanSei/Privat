public class Chap09BEx3
{
  public static void main(String[] args)
  {
    double grad = 30.0;
    double sinx, cosx, ergebnis;

    double bogenmass = grad * Math.PI / 180;

    sinx = Math.sin(bogenmass);
    cosx = Math.cos(bogenmass);

    ergebnis = sinx*sinx + cosx*cosx;

    System.out.println("Sinus: "     + sinx + 
                       " Cosinus: "  + cosx + 
                       " ergebnis: " + ergebnis );
  }
}