import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
import java.util.*;

public class Chap59Ex4 extends JFrame implements ActionListener
{
  JButton button1, button2, button3;

  // Konstruktor für den Frame
  public Chap59Ex4(String title)                           
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
    Color farbe = getContentPane().getBackground();
     
    if ( z == 0 || z == 1 )
    {
       if( farbe.equals( Color.white ) )
    	   getContentPane().setBackground(Color.green);
    	 if( farbe.equals( Color.green ) )
    	 	 getContentPane().setBackground(Color.yellow);
    	 if( farbe.equals( Color.yellow ) )
    	 	 getContentPane().setBackground(Color.green);
    }
    else
       System.exit(0);
    repaint();
  }

  public static void main ( String[] args )
  {
    Chap59Ex4 win  = new Chap59Ex4( "Drei-Button-Monte" ) ;
    
    win.setSize( 300, 150 );     
    win.setVisible( true );      
  }
}
