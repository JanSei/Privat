package woerter;

import java.util.List;

public interface IWord /* extends ArrayList<String> */ {
	
	/*
	 * Diese Methode dient zum Einfuegen von Elementen in unserer Liste
	 */
	public List<String> add();
	
	/*
	 * Diese Methode dient der Suche von Elementen in unserer Liste
	 */
	public String search();
	
	/*
	 * Diese Methode dient zum Löschen von Elementen in unserer Liste
	 */
	public String delete();

}
