
public class TrimDemo {

	public static void main(String[] args) {

		String ersterString = new String("    Hallo, wer   bist du?  ");
		String zweiterString = ersterString.trim();
		System.out.println(zweiterString);
	}

}
