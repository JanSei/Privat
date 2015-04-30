package woerter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.Console;

public final class Antonyms extends ArrayList<String> implements IWord {

	private static Scanner in = new Scanner(System.in);

	public Antonyms() {

	}

	public List<String> add() {
		int count = 0;
		System.out.println();
		List<String> antonyms = new ArrayList<String>();
		while (count < 3) {
			String myAntonym = Console.readLine("\tAntonym Nr." + (count + 1) + ": ", true);
			if (Console.containsWhiteSpace(myAntonym))
				System.out.println("One word only, please!");
			else if (antonyms.contains(myAntonym)) {
				System.out.println("No duplicate antonyms allowed!");
			} else {
				antonyms.add(myAntonym);
				count++;
			}
		}
		return antonyms;
	}
	
	public void out(ArrayList<String> list) {
		int count = 0;
		System.out.println();
		for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
			String antonym = i.next();
			System.out.println("\tAntonym Nr. " + (count+1) + ": " + antonym);
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
