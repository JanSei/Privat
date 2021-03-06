import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class Chap61Ex4 extends JFrame implements ActionListener
{
  JLabel heading   = new JLabel("Anteil der Fettkalorien in %");
  JLabel fatLabel  = new JLabel("Wieviel Gramm Fett:");
  JLabel calLabel  = new JLabel("Kalorien gesamt:");
  JLabel perLabel  = new JLabel("Fettkalorien in %:");
  JLabel msgLabel  = new JLabel("Hinweis");

  JTextField inFat  = new JTextField(14);
  JTextField inCal  = new JTextField(14);
  JTextField outPer = new JTextField(14);
  JTextField outMsg = new JTextField(14);

  JButton doit   = new JButton("Do It!");

  double calories; // Input: Kalorien gesamt pro Portion
  double fatGrams; // Input: Gramm Fett pro Portion
  double percent;  // Ergebnis: Fettkalorien in %

  public Chap61Ex4()
  {
    setTitle( "Fett-Kalkulator" );
    setLayout( new FlowLayout() );

    add( heading );
    add( fatLabel );
    add( inFat );
    add( calLabel );
    add( inCal );
    add( perLabel );
    add( outPer );
    add( msgLabel );
    add( outMsg );
    outPer.setEditable( false );

    add( doit );
    doit.addActionListener( this );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setSize( 220, 280 );
    setVisible( true );
  }

  // Die Applikation
  public void calcPercent( )
  {
    percent = ((fatGrams * 9) / calories) * 100 ;
  }

  public void actionPerformed( ActionEvent evt)
  {
    if( !inFat.getText().equals("") )
    {
    	try
    	{
    		fatGrams  = Double.parseDouble( inFat.getText() ) ;
    	}
    	catch( Exception e )
    	{
    		inFat.setText("Falsche Eingabe");
    	}
    }
    
    if( !inCal.getText().equals("") )
    {
    	try
    	{
    		calories  = Double.parseDouble( inCal.getText() ) ;
    	}
    	catch( Exception e )
    	{
    		inCal.setText("Falsche Eingabe");
    	}
    }
    
    if( fatGrams > 0 && calories > 0 )
    {
    	calcPercent();
	    
	    if( percent >= 30.0 )
	    	outMsg.setText("Zu viele Fettkalorien!");
	    else
	      outMsg.setText("Fettanteil OK.");
    }
      
    // Ausgabe formatieren und in das Ausgabefeld schreiben
    outPer.setText( new DecimalFormat("#0.0##").format( percent ) + "%" );
    repaint();
  }

  public static void main ( String[] args )
  {
    Chap61Ex4 fatApp  = new Chap61Ex4() ;
  }
}
