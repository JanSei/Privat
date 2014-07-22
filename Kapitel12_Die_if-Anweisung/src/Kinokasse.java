import java.util.Scanner;

public class Kinokasse {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner( System.in );
	    int alter;

	    System.out.println("Geben Sie das Alter an:");
	    alter = scan.nextInt();

	    if ( alter < 13 )
	    {
	      System.out.println("Jugendtarif");
	    }
	    else
	    {
	      System.out.println("Erwachsentarif");
	    }
	    System.out.println("Geniessen Sie die Show");    // wird immer ausgeführt
	}

}
