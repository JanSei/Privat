package woerter;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import util.Console;


public final class Definitions extends ArrayList<String> implements IWord {
	
	public Definitions() {

	}

	public List<String> add() {
		boolean eingabe = true;
		int count = 0;
		System.out.println();
		List<String> definitions = new ArrayList<String>();
		while (eingabe) {
			String myDefinition = Console.readLine("\t\tDefinition Nr." + (count+1) + ": ", false);
			if (definitions.contains(myDefinition)) {
				System.out.println("No duplicate definitions allowed!");
			} 
			else if (myDefinition.equals("exit")) {
				break;
			}
			else {
				definitions.add(myDefinition);
				count++;
			}
		}
		return definitions;
	}
	
	public void out(ArrayList<String> list) {
		int count = 0;
		System.out.println();
		for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
			String definition = i.next();
			System.out.println("\t\tDefinition Nr. " + (count+1) + ": " + definition);
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
