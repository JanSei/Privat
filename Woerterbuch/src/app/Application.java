package app;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import util.Console;
import util.Menu;
import util.Command;
import woerter.Antonyms;
import woerter.Definitions;
import woerter.Sentences;
import woerter.Synonyms;

public class Application {

//	private static Scanner in;

	public static void main(String[] args) {
		// Sprache des Woerterbuches
		Map<String, Map<String, List<ArrayList<String>>>> languageSelection = new HashMap<String, Map<String, List<ArrayList<String>>>>();
		
		// Woerterbuch Inhalt
		final Map<String, List<ArrayList<String>>> myDictionary = new HashMap<String, List<ArrayList<String>>>();
		
		// Liste gedacht fuer Synonyme, Antonyme, Saetze
		final List<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();
		
		// Liste meiner gesamten Anzahl an Woertern
		final HashSet<String> myWords = new HashSet<String>();
		
		// For 1 word = 3 synonyms = 3 antonym = 3 sentences
		final ArrayList<String> synonyms = new Synonyms();
		final ArrayList<String> antonyms = new Antonyms();
		final ArrayList<String> definitions = new Definitions();
		final ArrayList<String> sentences = new Sentences();
		
		String sprache = Console.readLine("Geben Sie ihre Sprache an: ");
		
		Menu menu = new Menu("Auswahl der Aktion");
		
		// Speicher
		menu.add("Wort einfuegen", 'a', new Command() {
			public void run() {
				/* Inputting a word into a list of 
				 * words - duplicates not added to myWords */
				String myWord = Console.readLine("Wort:");
				myWords.add(myWord);
				
				// Adding three synonyms
				((Synonyms) synonyms).synAdd();
				
				// Adding three antonyms
				((Antonyms) antonyms).antAdd();
				
				// Adding indefinite amount of definitions
				((Definitions) definitions).defAdd();

				// Adding three sentences
				((Sentences) sentences).sentAdd();
				
				myList.add(synonyms);
				myList.add(antonyms);
				myList.add(definitions);
				myList.add(sentences);
				myDictionary.put(myWord, myList);
			}
		});
//		menu.add("Wort suchen", 's', action);
//		menu.add("Wort loeschen", 'd', action);
        menu.add("Ende", 'e', null);
		menu.runloop();

		languageSelection.put(sprache, myDictionary);
		System.out.println("Schönes Leben noch!");
		
		((Synonyms) synonyms).synOut();
		((Antonyms) antonyms).antOut();
		((Definitions) definitions).defOut();
		((Sentences) sentences).sentOut();

	}
}