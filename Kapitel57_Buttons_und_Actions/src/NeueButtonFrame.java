import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class NeueButtonFrame extends JFrame implements ActionListener {

	JButton aChange;
	
	public NeueButtonFrame(String title) {
		super(title);
		setLayout( new FlowLayout() );
		
		aChange = new JButton( "Klicke hier fuer Exit!");
		aChange.addActionListener(this);
		this.add(aChange);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		System.exit(0);
	}
	
	public static void main(String[] args) {
		NeueButtonFrame frm = new NeueButtonFrame("Button Quitter");

		frm.setSize(200, 100);
		frm.setVisible(true);
	}

	
}
