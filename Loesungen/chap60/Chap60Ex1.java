import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap60Ex1 extends JFrame implements ActionListener
{
   int versuch = 1;
   final String PW = "geheim";

   JLabel inLabel, outLabel;
   JTextField inText, outText;

   public Chap60Ex1( String titel )      // Konstruktor
   {
      super( titel );

      inLabel= new JLabel( "Eingabe: " );
      inText = new JTextField( 15 );

      outLabel = new JLabel( "Ergebnis:" );
      outText  = new JTextField( 15 );

      setLayout( new FlowLayout() );
      add( inLabel ) ;
      add( inText  ) ;
      add( outLabel) ;
      add( outText ) ;

      inText.addActionListener( this );

      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      setSize( 300, 200 );
      setVisible( true );
   }

  public void actionPerformed(ActionEvent evt)
  {
  	String userIn = "";
    userIn = inText.getText();
  	if( userIn.equals( PW ) )
  	  outText.setText("Korrekt");
  	else
  	  outText.setText(versuch + ". Versuch: Falsch!");

  	versuch++;

  	if( versuch > 3 && !userIn.equals(PW) )
  	  System.exit(0);

  	repaint();

  }

  public static void main ( String[] args )
  {
    Chap60Ex1 echo  = new Chap60Ex1( "Ratespiel" ) ;
  }
}

