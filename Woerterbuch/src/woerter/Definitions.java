package woerter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;


public final class Definitions extends ArrayList<String>{
	
	private static Scanner in = new Scanner(System.in);

	public Definitions() {

	}

	public void defAdd() {
		boolean eingabe = true;
		int count = 0;
		while (eingabe) {
			System.out.print("Definition Nr." + (count+1) + ": ");
			String myDefinition = in.nextLine();
			if (this.contains(myDefinition)) {
				System.out.println("No duplicate definitions allowed!");
			} 
			else if (myDefinition.equals("exit")) {
				return;
			}
			else {
				super.add(myDefinition);
				count++;
			}
		}
	}
	
	public void defOut() {
		int count = 0;
		for (Iterator<String> i = this.iterator(); i.hasNext(); ) {
			String definition = i.next();
			System.out.println("Definition Nr. " + (count+1) + ": " + definition);
			count++;
		}
	}

}
