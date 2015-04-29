import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class Synonyms extends ArrayList<String> {

	private static Scanner in = new Scanner(System.in);

	public Synonyms() {

	}

	public void synAdd() {
		int count = 0;
		while (count < 3) {
			System.out.print("Synonym Nr." + (count+1) + ": ");
			String mySynonym = in.next();
			if (this.contains(mySynonym)) {
				System.out.println("No duplicate synonyms allowed!");
			} else {
				super.add(mySynonym);
				count++;
			}
		}
	}
	
	public void synOut() {
		int count = 0;
		for (Iterator<String> i = this.iterator(); i.hasNext(); ) {
			String synonym = i.next();
			System.out.println("Synonym Nr. " + (count+1) + ": " + synonym);
			count++;
		}
	}

}
