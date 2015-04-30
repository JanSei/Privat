package app;

import java.util.Collections;
import java.util.LinkedHashSet;
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
import woerter.IWord;
import woerter.Sentences;
import woerter.Synonyms;

public class Application {

	// private static Scanner in;

	public static void main(String[] args) {
		// Sprache des Woerterbuches
		Map<String, Map<String, ArrayList<ArrayList<String>>>> languageSelection = new HashMap<String, Map<String, ArrayList<ArrayList<String>>>>();

		// Woerterbuch Inhalt
		final Map<String, ArrayList<ArrayList<String>>> myDictionary = new HashMap<String, ArrayList<ArrayList<String>>>();

		// Liste gedacht fuer Synonyme, Antonyme, Definitionen, Saetze
		final List<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();

		// Liste meiner gesamten Anzahl an Woertern
		final List<String> myWords = new ArrayList<String>();

		// For 1 word = 3 synonyms = 3 antonym = 3 sentences
		final ArrayList<String> synonyms = new Synonyms();
		final ArrayList<String> antonyms = new Antonyms();
		final ArrayList<String> definitions = new Definitions();
		final ArrayList<String> sentences = new Sentences();

		String sprache = Console.readLine("Geben Sie ihre Sprache an: ", true);

		Menu menu = new Menu("Auswahl der Aktion");

		// Speicher
		menu.add("Wort einfuegen", 'a', new Command() {
			public void run() {
				/*
				 * Inputting a word into a list of words - duplicates not added
				 * to myWords
				 */
				String myWord = Console.readLine("\nWort:", true);
				if (myWords.contains(myWord))
					System.out.println("Wort existiert schon!");
				else {
					myWords.add(myWord);

					// Adding three synonyms
					List<String> myThreeSynonyms = ((Synonyms) synonyms).add();

					// Adding three antonyms
					List<String> myThreeAntonyms = ((Antonyms) antonyms).add();

					// Adding indefinite amount of definitions
					List<String> myDefinitions = ((Definitions) definitions).add();

					// Adding three sentences
					List<String> myThreeSentences = ((Sentences) sentences).add();

					myList.add((ArrayList<String>) myThreeSynonyms);
					myList.add((ArrayList<String>) myThreeAntonyms);
					myList.add((ArrayList<String>) myDefinitions);
					myList.add((ArrayList<String>) myThreeSentences);
					myDictionary.put(myWord, (ArrayList<ArrayList<String>>) myList);
				}
			}
		});
		menu.add("Wort suchen", 's', new Command() {
			public void run() {
				boolean found = false;
				while (!found) {
					String mySearchedWord = Console.readLine(
							"\nGesuchtes Wort:", true);
					if (myDictionary.containsKey(mySearchedWord)) {
						System.out.println("\nWort: " + mySearchedWord);
						List<ArrayList<String>> wordProperties = myDictionary.get(mySearchedWord); // TODO unnoetig?
						for (ArrayList<String> temp : wordProperties) {
//							if (temp instanceof Synonyms)
								((Synonyms) synonyms).out(temp);
//							if (temp instanceof Antonyms)
								((Antonyms) antonyms).out(temp);
//							if (temp instanceof Definitions)
								((Definitions) definitions).out(temp);
//							if (temp instanceof Sentences)
								((Sentences) sentences).out(temp);
						}
						System.out.println(myDictionary.get(mySearchedWord)); // zum
																				// Testen
						found = true;
					} else
						System.out.println("Word NOT FOUND!");
				}
			}
		});
		// menu.add("Wort loeschen", 'd', action);
		
		menu.add("Liste der Woerter ausgeben", 'y', new Command() {
			public void run() {
				System.out.println();
				for (String tmp : myWords)
					System.out.println(tmp);
			}
		});
		menu.add("Liste der Woerter sortieren", 'z', new Command() {
			public void run() {
				Collections.sort(myWords);				
			}
		});
		menu.add("Ende", 'e', null);
		menu.runloop();

		languageSelection.put(sprache, myDictionary);
		System.out.println("Schönes Leben noch!");

	}
}