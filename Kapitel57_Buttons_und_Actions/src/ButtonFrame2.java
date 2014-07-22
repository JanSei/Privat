import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonFrame2 extends JFrame implements ActionListener {
	
	JButton bChange; // Referenz auf ein Button Objekt

	// Konstruktor von ButtonFrame2
	ButtonFrame2(String title) {
		super(title); // den JFrame Konstruktor aufrufen
		setLayout(new FlowLayout()); // den Layoutmanager setzen

		// construct a Button
		bChange = new JButton("Klick mich!");

		// das ButtonFrame2-Objekt als Listener für den JButton registrieren
		bChange.addActionListener(this);

		add(bChange); // JFrame den Button hinzufügen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt) {
		getContentPane().setBackground(Color.blue); // den Hintergrund des
													// Frames ändern
		//repaint(); // das System aufforden den Bildschirm zu zeichnen.
	}
}