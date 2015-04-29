import java.io.*;
import java.util.*;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		// Entscheidung ob Input oder nicht
		String entscheidung = null;
		Boolean immernoch = false;

		// Sprache des Woerterbuches
		Map<String, Map<String, List<ArrayList<String>>>> languageSelection = new HashMap<String, Map<String, List<ArrayList<String>>>>();
		
		// Woerterbuch Inhalt
		Map<String, List<ArrayList<String>>> myDictionary = new HashMap<String, List<ArrayList<String>>>();

		// Liste gedacht fuer Synonyme, Antonyme, Saetze
		List<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();

		// Liste meiner gesamten Anzahl an Woertern
		HashSet<String> myWords = new HashSet<String>();

		// For 1 word = 3 synonyms = 3 antonym = 3 sentences
		String myWord = null;
		ArrayList<String> synonyms = new Synonyms();
		ArrayList<String> antonyms = new Antonyms();
		ArrayList<String> definitions = new Definitions();
		ArrayList<String> sentences = new Sentences();

		System.out.println("Willst du ein Wort eingeben? (J oder N)");
		entscheidung = in.next();
		if (entscheidung.equals("J"))
			immernoch = true;
		else
			immernoch = false;
		
		System.out.println("Geben Sie ihre Sprache an: ");
		String sprache = in.next().toUpperCase();

		while (immernoch) {

			// Inputting a word into a list of words - duplicates not added to
			// myWords
			System.out.print("Wort: ");
			myWord = in.next().toLowerCase();
			myWords.add(myWord);

			// Adding three synonyms
			((Synonyms) synonyms).synAdd();

			// Adding three antonyms
			((Antonyms) antonyms).antAdd();
//			in.nextLine();
			
			// Adding indefinite amount of definitions
			((Definitions) definitions).defAdd();

			// Adding three sentences
			((Sentences) sentences).sentAdd();

			myList.add(synonyms);
			myList.add(antonyms);
			myList.add(definitions);
			myList.add(sentences);
			myDictionary.put(myWord, myList);
			
			System.out.println("Willst du ein Wort eingeben? (J oder N)");
			entscheidung = in.next();
			if (entscheidung.equals("J"))
				immernoch = true;
			else
				immernoch = false;
		}
		in.close();
		languageSelection.put(sprache, myDictionary);
		System.out.println("Schönes Leben noch!");
		((Synonyms) synonyms).synOut();
		((Antonyms) antonyms).antOut();
		((Definitions) definitions).defOut();
		((Sentences) sentences).sentOut();

	}
}