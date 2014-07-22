import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Chap63Ex1 extends JFrame implements ActionListener
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  JPanel       heightPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;
  
  String sex = "M";
  int height = 62;

  public Chap63Ex1()
  {
    setTitle( "Your Ideal Weight" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );

    // Gender-Gruppe
    genderM = new JRadioButton("Male", true );
    genderF = new JRadioButton("Female", false );
    genderGroup = new ButtonGroup();
    genderGroup.add( genderM );
    genderGroup.add( genderF );
    genderPanel = new JPanel();
    genderPanel.setLayout( new BoxLayout( genderPanel, BoxLayout.Y_AXIS ) );
    genderPanel.add( new JLabel("Your Gender") );
    genderPanel.add( genderM );  genderPanel.add( genderF );
    
    // Gender-Buttons: Befehlstring setzen und ActionListener registrieren
    genderM.setActionCommand("M");
    genderF.setActionCommand("F");
    genderM.addActionListener(this);    
    genderF.addActionListener(this);    

    // Height-Gruppe
    heightA = new JRadioButton("60 to 64 inches", true );
    heightB = new JRadioButton("64 to 68 inches", false );
    heightC = new JRadioButton("68 to 72 inches", false );
    heightD = new JRadioButton("72 to 76 inches", false );
    heightE = new JRadioButton("76 to 80 inches", false );

    heightGroup = new ButtonGroup();
    heightGroup.add( heightA ); heightGroup.add( heightB );
    heightGroup.add( heightC ); heightGroup.add( heightD );
    heightGroup.add( heightE );

    heightPanel = new JPanel();
    heightPanel.setLayout( new BoxLayout( heightPanel, BoxLayout.Y_AXIS ) );
    heightPanel.add( new JLabel("Your Height") );
    heightPanel.add( heightA ); heightPanel.add( heightB );
    heightPanel.add( heightC ); heightPanel.add( heightD );
    heightPanel.add( heightE );
    
    // Height-Gruppe: Befehlstring setzen und ActionListener registrieren
    heightA.setActionCommand("A");
    heightB.setActionCommand("B");
    heightC.setActionCommand("C");
    heightD.setActionCommand("D");
    heightE.setActionCommand("E");
    heightA.addActionListener(this);
    heightB.addActionListener(this);
    heightC.addActionListener(this);
    heightD.addActionListener(this);
    heightE.addActionListener(this);    
    

    // Result-Panel
    resultText  = new JTextField(7);
    resultText.setEditable( false );
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame: verwendet den Standard Layoutmanager
    add( genderPanel, BorderLayout.WEST );
    add( heightPanel, BorderLayout.EAST );
    add( resultPanel, BorderLayout.SOUTH  );
    
    resultText.setText( calculateIdealWeight() + "" );
    
    setSize( 250, 225 );
    setResizable( false );
    setVisible( true );

  }
  
  public  int calculateIdealWeight()
  {
  	int divisor;
  	if( sex.equals("F") )
  		divisor = 30;
  	else
  		divisor = 28;
  		
  	//System.out.println("divisor: " + divisor); // Teststatement
  	return height * height / divisor;
  }
  
  public void actionPerformed(ActionEvent evt)
  {
  	if( evt.getActionCommand().equals("M") )
  		sex = "M";
  	
  	if( evt.getActionCommand().equals("F") )
  		sex = "F";
  	  		
  	if( evt.getActionCommand().equals("A") )
  		height = 62;
  	
  	if( evt.getActionCommand().equals("B") )
  		height = 66;
  	
  	if( evt.getActionCommand().equals("C") )
  		height = 70;
  		
  	if( evt.getActionCommand().equals("D") )
  		height = 74;
  		
  	if( evt.getActionCommand().equals("E") )
  		height = 78;
  	
  	int result = calculateIdealWeight();
  	
  	resultText.setText( result+"" );
  		
  }

  public static void main ( String[] args )
  {
    Chap63Ex1 weightApp  = new Chap63Ex1() ;
  }
}
