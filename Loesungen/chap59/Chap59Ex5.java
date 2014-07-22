import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap59Ex5 extends JFrame implements ActionListener
{
  JButton[] button;
  String buttonIn = ""; // wenn der User die Buttons 1, 2, 3 anklickt, enthält buttonIn "123"
  final String CODE = "735";
  int versuch = 0;

  // Konstruktor für den Frame
  public Chap59Ex5(String title)
  {
    super( title );
    button = new JButton[10];
  	setLayout( new FlowLayout() );

    for(int i = 0; i < button.length; i++ )
    {
    	button[i]   = new JButton( "" + i ); // Buttons beschriften
    	button[i].addActionListener( this ); // Frame als Listener für die Buttons registrieren
    	add( button[i] );
    }

    getContentPane().setBackground(Color.white);
    pack();
    setVisible( true );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
  	versuch = versuch + 1;
  	if ( versuch <= 3 )
  	{
  		buttonIn = buttonIn + evt.getActionCommand();
  		System.out.println( buttonIn ); // Teststatement
  	}

    if( versuch == 3 && buttonIn.equals( CODE ) )
    	System.exit(0);

    if( versuch == 3 && !buttonIn.equals( CODE ) )
    	getContentPane().setBackground(Color.red
    		);

    repaint();
  }

  public static void main ( String[] args )
  {
    Chap59Ex5 frame  = new Chap59Ex5( "Zahlenschloss" ) ;
  }
}
