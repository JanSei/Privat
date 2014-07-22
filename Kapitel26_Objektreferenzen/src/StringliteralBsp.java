class StringliteralBsp {

	public static void main(String[] args) {

		String str1 = "Stringliteral"; // ein Literal erzeugen
		String str2 = "Stringliteral"; // str2 verweist auf dasselbe Literal

		String msgA = new String("Aufgepasst!"); // ein Objekt erzeugen
		String msgB = new String("Aufgepasst!"); // ein weiteres Objekt erzeugen

		if (str1 == str2)
			System.out.println("Dies WIRD ausgegeben.");

		if (str1.equals(str2))
			System.out.println("Dies WIRD ausgegeben.");

		if (msgA == msgB)
			System.out.println("Dies wird NICHT ausgegeben.");

		if (msgA.equals(msgB))
			System.out.println("Dies WIRD ausgegeben.");

	}

}