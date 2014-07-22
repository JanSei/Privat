import java.util.Scanner;

//Das "Gebäck-Problem" besteht darin, ob Sie Ihrem Einkaufsbummel 
//einen Besuch in der Bäckerei hinzufügen. Dieses Programm hilft bei 
//dieser wichtigen Entscheidung. Bewerten Sie drei Faktoren auf einer 
//Skala von 1 bis 10. Wenn die Kombination von Hunger, Aroma und visuellem Anreiz 
//eine Reizschwelle von 15 übersteigt, kaufen Sie das Gebäck. 

//Anders als bei den Entscheidungen des vorherigen Kapitels, 
//gibt es jetzt nur einen Zweig (der dem Wahr-Zweig entspricht).
//
//	Die if-Anweisung stellt immer eine Frage, in dem sie Zahlen vergleicht.
//	Wenn die Antwort wahr ist, wird der Wahr-Zweig ausgeführt.
//	Wenn die Antwort falsch ist, wird der Wahr-Zweig übersprungen.
//	In beiden Fällen wird die Ausführung mit der Anweisung nach dem Wahr-Zweig fortgesetzt.


public class GebaeckEntscheidung {

	private static Scanner scan;

	public static void main(String[] args) {
		 	
			scan = new Scanner( System.in );
		    int hunger, aussehen, aroma ;

		    System.out.print("Wie hungrig sind Sie            (1-10): ");
		    hunger = scan.nextInt();

		    System.out.print("Wie lecker sieht das Gebaeck aus (1-10): ");
		    aussehen = scan.nextInt();

		    System.out.print("Wie gut riecht das Gebaeck (1-10): ");
		    aroma = scan.nextInt();

		    if ( (hunger + aussehen + aroma ) > 15 )
		      System.out.println("Gebaeck kaufen!" );

		    System.out.println("Setzen Sie Ihren Einkauf fort.");
	}

}
