import java.awt.*;
import javax.swing.*;

class MeinFrame extends JFrame {
	/**
	 * no jodas peee
	 */
	private static final long serialVersionUID = 1L;
	JLabel label, label2, label3;

	// Konstruktor
	MeinFrame(String title) {
		super(title); // den Konstruktor von JFrame aufrufen
		setSize(150, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout()); // den Layoutmanager setzen

		label = new JLabel("Hello Swing!"); // ein JLabel konstruieren
		add(label); // das Label dem JFrame hinzufügen
		label2 = new JLabel("Noch ein Test!");
		add(label2);
		label3 = new JLabel("Und ein weiteren Test!");
		add(label3);
	}

}

