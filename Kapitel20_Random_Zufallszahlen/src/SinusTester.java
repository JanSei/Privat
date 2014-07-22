import java.util.Random;

//Angenommen Sie sind nicht davon überzeugt, dass Java und Ihr elektronischer 
//Taschenrechner die gleichen Werte für sin(x) berechnen. Sie könnten das testen, 
//indem Sie die Werte, die beide für einige Standardwinkel erzielen, wie 0.0, pi/2 
//und so weiter, überprüfen. Aber Sie sollten auch verschiedene, zufällig ausgewählte 
//Winkel testen. Hier ist ein Programm, das sin(x) für zufällige Winkel (in Bogenmaß) 
//zwischen -10*pi und +10*pi berechnet. 

class SinusTester
{
  public static void main ( String[] args )
  {
    int j = 0;
    Random rand = new Random();

    System.out.println(" x " + "\t\t\t sin(x)");
    while ( j < 10 )
    {
      double x = rand.nextDouble()*(20*Math.PI) - 10*Math.PI;
      System.out.println("" + x + "\t" + Math.sin(x));
      j = j + 1;
    }
  }
}