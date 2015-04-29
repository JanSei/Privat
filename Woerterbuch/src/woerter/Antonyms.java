package woerter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class Antonyms extends ArrayList<String> {

	private static Scanner in = new Scanner(System.in);

	public Antonyms() {

	}

	public void antAdd() {
		int count = 0;
		while (count < 3) {
			System.out.print("Antonym Nr." + (count + 1) + ": ");
			String myAntonym = in.next();
			if (this.contains(myAntonym)) {
				System.out.println("No duplicate antonyms allowed!");
			} else {
				super.add(myAntonym);
				count++;
			}
		}
	}
	
	public void antOut() {
		int count = 0;
		for (Iterator<String> i = this.iterator(); i.hasNext(); ) {
			String antonym = i.next();
			System.out.println("Antonym Nr. " + (count+1) + ": " + antonym);
			count++;
		}
	}

}
