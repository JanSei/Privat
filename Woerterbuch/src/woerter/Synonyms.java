package woerter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.Console;

public final class Synonyms extends ArrayList<String> implements IWord {
	
	

	public Synonyms() {

	}

	public List<String> add() {
		int count = 0;
		System.out.println();
		List<String> synonyms = new ArrayList<String>();
		while (count < 3) {
			String mySynonym = Console.readLine("\tSynonym Nr." + (count+1) + ": ", true);
			if (Console.containsWhiteSpace(mySynonym))
				System.out.println("One word only, please!");
			else if (synonyms.contains(mySynonym)) {
				System.out.println("No duplicate synonyms allowed!");
			} else {
				synonyms.add(mySynonym);
				count++;
			}
		}
		return synonyms;
	}
	
	public void out(ArrayList<String> list) {
		int count = 0;
		System.out.println();
		for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
			String synonym = i.next();
			System.out.println("\tSynonym Nr. " + (count+1) + ": " + synonym);
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
