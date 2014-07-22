// Autovermietung

//  Eine Autovermietung braucht ein Programm, um zu bestimmen wer ein Auto mieten darf. 
//  Die Regeln sind:
//
//    Ein Mieter muss 21 Jahre oder älter sein.
//    Ein Mieter muss eine Kreditkarte mit einem Kreditrahmen von $10.000 oder mehr haben.
//
//  Das Programm ähnelt in etwa dem Plätzchen-Programm: 
	
import java.util.Scanner;

public class Autovermietung {
	
  private static Scanner scan;

public static void main (String[] args) {
	
    scan = new Scanner( System.in );
    int alter, kredit;

    // das Alter des Mieters abfragen
    System.out.println("Wie alt sind Sie?");
    alter = scan.nextInt() ;

    // den Kreditrahmen abfragen
    System.out.println("Wie viel Kredit haben Sie?");
    kredit = scan.nextInt() ;

    // überprüfen, ob beide Anforderungen erfüllt sind
    if (  alter >= 21 && kredit >= 10_000)
      System.out.println("Genug, um dieses Auto zu mieten!" );
    else
      System.out.println("Wie waere es mit einem Fahrrad?" );
  }
}

