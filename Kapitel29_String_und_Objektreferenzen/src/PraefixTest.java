public class PraefixTest {
	
	public static void main(String[] args) {
		
		String entflammt = "Meine Liebe ist wie eine rote, rote Rose.";

		if (entflammt.startsWith("Meine Liebe"))
			System.out.println("Praefix 1 stimmt ueberein.");			// P1 stimmt ueberein
		else
			System.out.println("Praefix 1 stimmt nicht ueberein.");

		if (entflammt.startsWith("meine Liebe"))
			System.out.println("Praefix 2 stimmt ueberein.");
		else
			System.out.println("Praefix 2 stimmt nicht ueberein.");		// P2 stimmt NICHT ueberein

		if (entflammt.startsWith("  Meine Liebe"))
			System.out.println("Praefix 3 stimmt ueberein.");
		else
			System.out.println("Praefix 3 stimmt nicht ueberein.");		// P3 stimmt ueberein

		if (entflammt.startsWith("  Meine Liebe".trim()))
			System.out.println("Praefix 4 stimmt ueberein.");			// P4 stimmt NICHT ueberein
		else
			System.out.println("Praefix 4 stimmt nicht ueberein.");
	}
}
