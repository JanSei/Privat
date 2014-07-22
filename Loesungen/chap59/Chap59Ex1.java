import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chap59Ex1_T extends JFrame implements ActionListener
{
  JButton rotButton;
  JButton gruenButton;
  JButton blauButton;
  JButton grauButton;


  // Konstruktor für  den Frame
  public Chap59Ex1_T(String title)
  {
    super( title );

    rotButton   = new JButton("Rot");
    gruenButton = new JButton("Grün");
    blauButton  = new JButton("Blau");
    grauButton  = new JButton("Grau");

    rotButton.setActionCommand( "rot" );   // den Befehlsstring setzen
    gruenButton.setActionCommand( "gruen" );
    blauButton.setActionCommand( "blau" );
    grauButton.setActionCommand( "grau" );

    // den Frame als Listener für die Buttons registrieren
    rotButton.addActionListener( this );
    gruenButton.addActionListener( this );
    blauButton.addActionListener( this );
    grauButton.addActionListener( this );

    setLayout( new FlowLayout() );
    add( rotButton );
    add( gruenButton );
    add( blauButton );
    add( grauButton );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
    // überprüfen welcher Befehl geschickt wurde
    if ( evt.getActionCommand().equals( "rot" ) )
      getContentPane().setBackground(  Color.red  );
    else if ( evt.getActionCommand().equals( "gruen" ) )
      getContentPane().setBackground( Color.green );
    else if ( evt.getActionCommand().equals( "blau" ) )
      getContentPane().setBackground( Color.blue );
    else
      getContentPane().setBackground( Color.gray );
    repaint();
  }

  public static void main ( String[] args )
  {
    Chap59Ex1_T buttondemo  = new Chap59Ex1_T( "Klicken Sie auf einen Button" ) ;

    buttondemo.setSize( 200, 150 );
    buttondemo.setVisible( true );
  }
}
