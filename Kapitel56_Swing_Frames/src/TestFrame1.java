import java.awt.*; // 1. importiere das Application Windowing Toolkit
import javax.swing.*; // 2. importiere die Swingklassen. Beachten Sie das "x" bei javax.

@SuppressWarnings("unused")
public class TestFrame1 {
	
	// die übliche main() Methode
	public static void main(String[] args) {
		
		JFrame frame // 4. Eine Referenz auf das Objekt
		= new JFrame("Test Frame 1"); // 3. konstruiert ein JFrame-Objekt
		frame.setSize(200, 100); // 5. setzt es auf eine Breite von 200
									// und eine Höhe von 100 Pixeln

		frame.setVisible(true); // 6. macht es auf dem Bildschirm sichtbar
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 7. sagt, was
																// der
																// Schließen-Button
																// tun soll
	}
}