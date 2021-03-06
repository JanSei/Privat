import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
import java.util.*;

public class Chap59Ex3 extends JFrame implements ActionListener
{
  JButton button1, button2, button3;

  // Konstruktor f�r den Frame
  public Chap59Ex3(String title)                           
  {
    super( title );
    button1   = new JButton("Klick");
    button2   = new JButton("Klick");
    button3   = new JButton("Klick");
    
    getContentPane().setBackground(Color.white);
    
    // den Frame als Listener registrieren
    button1.addActionListener( this );
    button2.addActionListener( this );
    button3.addActionListener( this );

    setLayout( new FlowLayout() ); 
    add( button1 );
    add( button2 );
    add( button3 );
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }

  public void actionPerformed( ActionEvent evt)
  {
    Random rnd = new Random();
    int z = rnd.nextInt(3);
     
    if ( z == 0 )
    	 getContentPane().setBackground(Color.green);
    else
       System.exit(0);
    repaint();
  }

  public static void main ( String[] args )
  {
    Chap59Ex3 monte  = new Chap59Ex3( "Drei-Button-Monte" ) ;
    
    monte.setSize( 300, 150 );     
    monte.setVisible( true );      
  }
}
