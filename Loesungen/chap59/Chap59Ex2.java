import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap59Ex2 extends JFrame implements ActionListener
{
  JButton button;

  // Konstruktor für  den Frame
  public Chap59Ex2(String title)
  {
    super( title );
    button   = new JButton("Klick");

    getContentPane().setBackground(Color.red);

    // den Frame als Listener für den Button registrieren
    button.addActionListener( this );

    setLayout( new FlowLayout() );
    add( button );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
    Color farbe = getContentPane().getBackground();
    // Farbe des Frame überprüfen
    if ( farbe.equals(Color.red) )
      getContentPane().setBackground(Color.green);
    if ( farbe.equals(Color.green) )
    	getContentPane().setBackground(Color.blue);
    if ( farbe.equals(Color.blue) )
    	getContentPane().setBackground(Color.gray);
    if ( farbe.equals(Color.gray) )
    	getContentPane().setBackground(Color.red);

    repaint();
  }

  public static void main ( String[] args )
  {
    Chap59Ex2 farbkreis  = new Chap59Ex2( "Klicken Sie auf den Button" ) ;

    farbkreis.setSize( 200, 150 );
    farbkreis.setVisible( true );
  }
}
