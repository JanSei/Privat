public class ErwachsenenGeburtstag extends Geburtstag {
	
	public ErwachsenenGeburtstag(String e, int jahre) {
		super(e, jahre);
	}

	public void gruss() {
		super.gruss();
		System.out.println("Was bist du gross geworden!!\n");
	}
}