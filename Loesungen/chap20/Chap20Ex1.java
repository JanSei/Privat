import java.util.*;
public class Chap20Ex1
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int zzahl, userIn, versuch;  
	  Random rand = new Random();
	  zzahl = rand.nextInt(10)+1;
	  
	  System.out.println("Ich denke an eine Zahl von 1 bis 10.");
	  System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
	  System.out.println("Raten Sie!");
  
	  versuch = 1;
	  while ( versuch <= 3 )
	  {
	  	System.out.println("Versuch: " + versuch);
	  	userIn = scan.nextInt();
	  	if ( userIn == zzahl )
	  	{
	  		System.out.println("RICHTIG!");
	  	  System.out.println("Sie haben das Spiel gewonnen.");
	  	  System.exit(0);
	  	}
	  	else
	  		System.out.println("Falsch");
	  		
	  	if ( versuch == 3 )
	  	{
	  		System.out.println("Die richtige Zahl war: " + zzahl);
	  		System.out.println("Sie haben das Spiel verloren.");
	  	}
	  	
	    versuch++;
	  }
    
    
  }
  
}