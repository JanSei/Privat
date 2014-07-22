import java.util.Scanner;

public class Echo {

	private static Scanner scan;

	public static void main(String[] args) {

			String inData;
		    scan = new Scanner( System.in );

		    System.out.println("Geben Sie die Daten ein:");
		    inData = scan.nextLine();

		    System.out.println("Sie haben eingegeben: " + inData );
	}

}
