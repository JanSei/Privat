import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class Chap61Ex1 extends JFrame implements ActionListener
{
  JLabel heading  = new JLabel("Celsius in Fahrenheit umrechnen");
  JLabel outLabel = new JLabel("Fahrenheit    ");
  JLabel inLabel  = new JLabel("Celsius ");

  JTextField outFahr = new JTextField( 7 );
  JTextField inCel   = new JTextField( 7 );

  int fahrTemp ;
  int celsTemp ;

  Chap61Ex1( String title )
  {
     super( title );
     setLayout( new FlowLayout() );

     inCel.addActionListener( this );
     outFahr.setEditable( false );

     add( heading );
     add( inLabel );
     add( outLabel );
     add( inCel );
     add( outFahr );
     
     setSize( 200, 150 );
     setVisible( true );

     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convert( int c )
  {
    return (c * 9/5) + 32;  // Celsius in Fahrenheit
  }


  public void actionPerformed( ActionEvent evt)
  {
    String userIn = inCel.getText() ;

    try
    {
      celsTemp = Integer.parseInt( userIn ) ;
      fahrTemp = convert( celsTemp ) ;
      outFahr.setText( fahrTemp + "" );
    }

    catch ( Exception ex )
    {
      outFahr.setText( "Falsche Eingabe" );
    }

    repaint();
  }


  public static void main ( String[] args )
  {
    Chap61Ex1 frame  = new Chap61Ex1( "F to C" ) ;

    
  }

}
