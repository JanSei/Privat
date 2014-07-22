import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class Chap61Ex2 extends JFrame implements ActionListener
{
  JLabel lblHeading    = new JLabel("Celsius/Fahrenheit Converter");
  JLabel lblFahrenheit = new JLabel("Fahrenheit");
  JLabel lblCelsius    = new JLabel("Celsius      ");

  JTextField txtFahrenheit = new JTextField(15);
  JTextField txtCelsius    = new JTextField(15);
  
  JButton btnCelsInFahr = new JButton("Celsius in Fahrenheit");
  JButton btnFahrInCels = new JButton("Fahrenheit in Celsius");
  JButton btnReset      = new JButton("Reset");

  int fahrTemp ;
  int celsTemp ;

  Chap61Ex2( String title )
  {
     super( title );
     setLayout( new FlowLayout() );

     btnCelsInFahr.setActionCommand("CelsInFahr");
     btnFahrInCels.setActionCommand("FahrInCels");
     btnReset.setActionCommand("Reset");

     btnCelsInFahr.addActionListener( this );
     btnFahrInCels.addActionListener( this );
     btnReset.addActionListener( this );

     add( lblHeading );
     add( lblCelsius );
     add( txtCelsius );
     add( lblFahrenheit );     
     add( txtFahrenheit );
     add( btnCelsInFahr );
     add( btnFahrInCels );
     add( btnReset );

     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
     setSize( 230, 250 );
     setVisible( true );
  }

  // die Applikation
  public int convertInFahrenheit( int c )
  {
    return (c * 9/5) + 32;
  }
  
  public int convertInCelsius( int f )
  {
    return ( (f-32) * 5 ) / 9;
  }

  public void actionPerformed( ActionEvent evt)
  {
    String userIn = "";
    
    if( evt.getActionCommand().equals("FahrInCels") )
    {
    	userIn = txtFahrenheit.getText();
      fahrTemp = Integer.parseInt( userIn ) ;
      celsTemp = convertInCelsius( fahrTemp ) ;
     	txtCelsius.setText( celsTemp + "" );
    }
    
    if( evt.getActionCommand().equals("CelsInFahr") )
	  {
	  	userIn = txtCelsius.getText();
	   	celsTemp = Integer.parseInt( userIn );
	   	fahrTemp = convertInFahrenheit( celsTemp ) ;
	   	txtFahrenheit.setText( fahrTemp + "" );
	  }
	  
	  if( evt.getActionCommand().equals("Reset") )
	  {
	   	txtCelsius.setText("");
	   	txtFahrenheit.setText("");
	  }
 
    repaint();
  }


  public static void main ( String[] args )
  {
    Chap61Ex2 frame  = new Chap61Ex2( "F to C and C to F" ) ;
  }

}
