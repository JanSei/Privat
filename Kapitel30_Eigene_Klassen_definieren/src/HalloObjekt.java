public class HalloObjekt {
	
	// Instanzvariablen
	String mitteilung;
	
	// Konstruktor
	public HalloObjekt(String mitteilung) {
		this.mitteilung = mitteilung;
	}
	
	// Methodendefinition
	void sprich() {
		System.out.println(mitteilung);
	}
}