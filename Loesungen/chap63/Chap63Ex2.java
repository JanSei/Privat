import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Chap63Ex2 extends JFrame implements ActionListener
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  Box          genderBox;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  Box          heightBox;

  Box          buttonBox;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  String sex = "M";
  int height = 62;

  public Chap63Ex2()
  {
    setTitle( "Your Ideal Weight 2" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );

    // Gender-Gruppe
    genderM = new JRadioButton("Male", true );
    genderF = new JRadioButton("Female", false );
    genderGroup = new ButtonGroup();
    genderGroup.add( genderM );
    genderGroup.add( genderF );

    genderBox = new Box( BoxLayout.Y_AXIS );
    genderBox.add(Box.createHorizontalGlue());
    genderBox.add( new JLabel("Your Gender") );
    genderBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
    genderBox.add( genderM );
    genderBox.add( genderF );
    genderBox.add(Box.createHorizontalGlue());
    //genderBox.add( Box.createRigidArea( new Dimension(1, 73) ) );

    // Gender-Buttons: Befehlstring setzen und ActionListener registrieren
    genderM.setActionCommand("M");
    genderF.setActionCommand("F");
    genderM.addActionListener(this);
    genderF.addActionListener(this);

    // Height-Gruppe
    heightA = new JRadioButton("60 to 64 inches", true  );
    heightB = new JRadioButton("64 to 68 inches", false );
    heightC = new JRadioButton("68 to 72 inches", false );
    heightD = new JRadioButton("72 to 76 inches", false );
    heightE = new JRadioButton("76 to 80 inches", false );

    heightGroup = new ButtonGroup();
    heightGroup.add( heightA ); heightGroup.add( heightB );
    heightGroup.add( heightC ); heightGroup.add( heightD );
    heightGroup.add( heightE );

    heightBox = new Box(BoxLayout.Y_AXIS);
    heightBox.add( new JLabel("Your Height") );
    heightBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
    heightBox.add( heightA ); heightBox.add( heightB );
    heightBox.add( heightC ); heightBox.add( heightD );
    heightBox.add( heightE );

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

    // Button-Box
    buttonBox = new Box( BoxLayout.X_AXIS );
    buttonBox.add( Box.createHorizontalGlue() );
    buttonBox.add( genderBox );
    buttonBox.add( Box.createHorizontalGlue() );
    buttonBox.add( heightBox );
    buttonBox.add( Box.createHorizontalGlue() );

    // Result-Panel
    resultText  = new JTextField(7);
    resultText.setEditable( false );
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    resultText.setText( calculateIdealWeight() + "" );

    // Frame
    setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
    add( Box.createHorizontalGlue() );
    add( Box.createVerticalGlue() );
    add( buttonBox );
    add( Box.createVerticalGlue() );
    add( resultPanel );
    add( Box.createHorizontalGlue() );
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

  	resultText.setText( result + "" );

  }

  public static void main ( String[] args )
  {
    Chap63Ex2 weightApp  = new Chap63Ex2() ;
    weightApp.setSize( 250, 225 );
    weightApp.setResizable( true );
    weightApp.setVisible( true );
  }
}