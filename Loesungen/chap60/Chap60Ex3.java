import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap60Ex3 extends JFrame implements ActionListener
{

   JLabel inLabel, outLabel;
   JTextField inText, outText;
   
   public Chap60Ex3( String titel )      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
      inLabel= new JLabel( "Geben Sie Ihren Namen ein:  " );
      inText = new JTextField( 20 );	
      	
      outLabel = new JLabel( "Hier kommt dann Ihr Name:" );
      outText  = new JTextField( 20 );
     
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;

      inText.addActionListener( this );
      outText.addActionListener( this );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      setSize( 300, 150 );
      setVisible(true);
   }
   
   public void actionPerformed( ActionEvent evt)
   {
     if( evt.getActionCommand().equals( inText.getText() ) )
       outText.setText( inText.getText() );
     else
       inText.setText( outText.getText() );
    
     repaint();
   }

   public static void main ( String[] args )
   {
     Chap60Ex3 echo  = new Chap60Ex3( "Chap60Ex3" ) ;
   }
}

