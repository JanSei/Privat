package woerter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public final class Sentences extends ArrayList<String>{
	
	private static Scanner in = new Scanner(System.in);

	public Sentences() {

	}

	public void sentAdd() {
		int count = 0;
		while (count < 3) {
			System.out.print("Sentence Nr." + (count+1) + ": ");
			String mySentence = in.nextLine();
			if (this.contains(mySentence)) {
				System.out.println("No duplicate sentences allowed!");
			} else {
				super.add(mySentence);
				count++;
			}
		}
	}
	
	public void sentOut() {
		int count = 0;
		for (Iterator<String> i = this.iterator(); i.hasNext(); ) {
			String sentence = i.next();
			System.out.println("Sentence Nr. " + (count+1) + ": " + sentence);
			count++;
		}
	}


}
