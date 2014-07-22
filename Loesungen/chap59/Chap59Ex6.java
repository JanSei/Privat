import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
import java.util.*;

public class Chap59Ex6 extends JFrame implements ActionListener
{
  JButton button1, button2;
  int breite, hoehe;

  // Konstruktor für den Frame
  public Chap59Ex6(String title)                           
  {
    super( title );
    breite = 300;
    hoehe  = 150;
    button1   = new JButton("Vergrößern");
    button2   = new JButton("Verkleinern");
    
    button1.setActionCommand("ZoomIn");
    button2.setActionCommand("ZoomOut");
    
    getContentPane().setBackground(Color.magenta);
    
    // den Frame als Listener registrieren
    button1.addActionListener( this );
    button2.addActionListener( this );

    setLayout( new FlowLayout() ); 
    add( button1 );
    add( button2 );
    
    setSize( breite, hoehe);     
    setVisible( true );      
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }

  public void actionPerformed( ActionEvent evt)
  {
  	if( evt.getActionCommand().equals("ZoomIn") )
  	{
  		breite = (int)(breite * 1.1);
  		hoehe  = (int)(hoehe  * 1.1);
  	}
  	
  	if( evt.getActionCommand().equals("ZoomOut") )
  	{
  		breite = (int)(breite * 0.9);
  		hoehe  = (int)(hoehe  * 0.9);
  	}
  	
    setSize( breite, hoehe);     
    repaint();
  }

  public static void main ( String[] args )
  {
    Chap59Ex6 frame  = new Chap59Ex6( "Größer-Kleiner" ) ;
  }
}
