
public class Objekte_erzeugtNurLaufzeit {

	public static void main(String[] args) {

		String str1 = new String("Hello World!");
		
		System.out.println(str1);
		
		String zweiteVariable = "Hi you";
		String s = zweiteVariable.substring(3);
		
		System.out.println( zweiteVariable );
		System.out.println( s );
	}

}
