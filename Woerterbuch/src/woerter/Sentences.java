package woerter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import util.Console;


public final class Sentences extends ArrayList<String> implements IWord {
	
	public Sentences() {

	}

	public List<String> add() {
		int count = 0;
		List<String> sentences = new ArrayList<String>();
		while (count < 3) {
			String mySentence = Console.readLine("\nSentence Nr." + (count+1) + ": ", false);
			if (sentences.contains(mySentence)) {
				System.out.println("No duplicate sentences allowed!");
			} else {
				sentences.add(mySentence);
				count++;
			}
		}
		return sentences;
	}
	
	public void out(ArrayList<String> list) {
		int count = 0;
		for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
			String sentence = i.next();
			System.out.println("\nSentence Nr. " + (count+1) + ": " + sentence);
			count++;
		}
	}

	public String search() {
		return "";
	}
	
	public String delete() {
		return "";
	}

}
