package util;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Die Klasse erledigt die Tastatureingabe.
 * 
 * @author J. Seidler
 */
public final class Console {
    private Console() { /* no Objects */ }
    
    private final static Scanner in = new Scanner(System.in);

    /**
     * Liest einen String von der Tastatur ein.
     * Zunaechst wird der uebergebene Prompt ausgegeben. Dann
     * wird eine komplette, durch Zeilenende abgeschlossene
     * Zeile eingelesen und zurueckgegeben.
     * 
     * @param prompt Eingabeaufforderung
     * @param isWord prueft ob die Eingabe ein Wort ist oder nicht.
     * @return eingelesene Zeile
     */
    public static String readLine(String prompt, boolean isWord) {
    	System.out.print(prompt + " ");
    	String readInput = in.nextLine();
    	if (isWord) {
    		while (Console.containsWhiteSpace(readInput)) {
    			System.out.println("\nOne word only, please!");
    			System.out.print(prompt + " ");    			
    			readInput = in.nextLine();
    		}	
    	}
        return readInput;
    }

    /**
     * Liest eine Gleitkommazahl von der Tastatur ein.
     * Zunaechst wird der uebergebene Prompt ausgegeben. Dann
     * wird eine komplette, durch Zeilenende abgeschlossene Zeile
     * eingelesen. Dieser String wird muss eine gueltige Gleitkommazahl
     * sein. Ihr Wert wird zurueckgegeben.
     * <p>
     * Bei fehlerhafter Eingabe wird eine erneute Eingabe angefordert.
     * 
     * @param prompt Eingabeaufforderung
     * @return Wert der eingegebenen Zahl
     */
    public static double readDouble(String prompt, boolean isWord) {
//        for (;;) {
//            String input = readLine(prompt);
//            try {
//                return Double.parseDouble(input);
//            } catch (NumberFormatException e) {
//                System.err.println("keine gueltige Gleitkommazahl");
//            }
//        }
    	return 0.0;
    }
    
    public static boolean containsWhiteSpace(String word) {
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(word);
		boolean found = matcher.find();
		// is equivalent to 
		/*
		 * public static boolean containsWhiteSpace(final String mySynonym) {
		 * 		if (mySynonym != null) {
		 * 				for (int i = 0; i < mySynonym.length(); i++) {
		 * 						if (Character.isWhitespace(mySynonym.charAt(i))) {
		 * 								return true;
		 * 						}
		 * 				}
		 * 		}
		 * }
		 */
		return found;
    }

}