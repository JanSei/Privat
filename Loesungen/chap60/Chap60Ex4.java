import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap60Ex4 extends JFrame implements ActionListener
{

   JLabel inLabel, outLabel;
   JTextField inText, outText;
   JButton button;
   
   public Chap60Ex4( String titel )      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
      
      inLabel  = new JLabel( "Textbox 1" );
      inText   = new JTextField( 20 );	
      	
      outLabel = new JLabel( "Textbox 2" );
      outText  = new JTextField( 20 );
      
      button   = new JButton("Swap Text");
     
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;
      add( button );

      button.addActionListener( this );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      setSize( 300, 175 );
      setVisible(true);
   }
 
  

  public void actionPerformed( ActionEvent evt)
  {
    String temp = inText.getText();
    inText.setText( outText.getText() );
    outText.setText( temp );
    
    repaint();
  }

  public static void main ( String[] args )
  {
    Chap60Ex4 tauschen  = new Chap60Ex4( "Text tauschen" ) ;
  }
}

