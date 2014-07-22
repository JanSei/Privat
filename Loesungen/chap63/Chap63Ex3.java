import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.text.* ;


public class Chap63Ex3 extends JFrame implements ActionListener
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;

  JRadioButton frameS, frameM, frameL;
  ButtonGroup  frameGroup;
  JPanel       framePanel;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  JPanel       heightPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  String sex = "M";
  int height = 62;
  double frame = 1.0;


  public Chap63Ex3()
  {
    setTitle( "Your Ideal Weight 1" );
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

    // Frame-Gruppe
    frameS = new JRadioButton("Small", false );
    frameM = new JRadioButton("Medium", true );
    frameL = new JRadioButton("Large", false );
    frameGroup = new ButtonGroup();
    frameGroup.add( frameS );
    frameGroup.add( frameM );
    frameGroup.add( frameL );
    framePanel = new JPanel();
    framePanel.setLayout( new BoxLayout( framePanel, BoxLayout.Y_AXIS ) );
    framePanel.add(Box.createRigidArea(new Dimension(20,0)));
    framePanel.add( new JLabel("Your Frame") );
    framePanel.add(frameS); framePanel.add(frameM); framePanel.add(frameL);

    // Frame-Buttons: Befehlstring setzen und ActionListener registrieren
    frameS.setActionCommand("Small");
    frameM.setActionCommand("Medium");
    frameL.setActionCommand("Large");
    frameS.addActionListener(this);
    frameM.addActionListener(this);
    frameL.addActionListener(this);

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
    add( framePanel, BorderLayout.CENTER );
    add( heightPanel, BorderLayout.EAST );
    add( resultPanel, BorderLayout.SOUTH  );


    resultText.setText(new DecimalFormat("#0.0#").format(calculateIdealWeight()) );

    setSize( 300, 225 );
    setResizable( true );
    setVisible( true );

  }

  public double calculateIdealWeight()
  {
  	int divisor;
  	if( sex.equals("F") )
  		divisor = 30;
  	else
  		divisor = 28;

  	//System.out.println("divisor: " + divisor); // Teststatement
  	return height * height * frame / divisor;
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

    if( evt.getActionCommand().equals("Small") )
  		frame = 0.95;

  	if( evt.getActionCommand().equals("Medium") )
  		frame = 1.0;

  	if( evt.getActionCommand().equals("Large") )
  		frame = 1.05;

  	double result = calculateIdealWeight();
    // Test Statement
    System.out.println(result);
  	resultText.setText( new DecimalFormat("#0.0#").format(result) );

  }

  public static void main ( String[] args )
  {
    Chap63Ex3 weightApp  = new Chap63Ex3() ;
  }
}
