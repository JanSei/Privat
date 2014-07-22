import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.* ;

public class Chap64Ex1 extends JFrame implements ActionListener, ChangeListener
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;
  
  JSlider      heightSlider;
  JPanel       heightPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;
  
  String sex = "F";
  int height = 58;

  public Chap64Ex1()
  {
    setTitle( "Your Ideal Weight" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );

    // Gender-Gruppe
    genderM = new JRadioButton("Male", false );
    genderF = new JRadioButton("Female", true );
    genderGroup = new ButtonGroup();
    genderGroup.add( genderM );
    genderGroup.add( genderF );
    genderPanel = new JPanel();
    genderPanel.setLayout( new BoxLayout(	genderPanel, BoxLayout.Y_AXIS ) );
    
    genderPanel.add( new JLabel("Your Gender") );
    genderPanel.add( genderM );
    genderPanel.add( genderF );
    
    // Gender-Buttons: Befehlstring setzen und ActionListener registrieren
    genderM.setActionCommand("M");
    genderF.setActionCommand("F");
    genderM.addActionListener(this);    
    genderF.addActionListener(this);    

    // Height-Panel
    heightSlider = new JSlider(JSlider.VERTICAL, 40, 80, 58);
    heightSlider.setMajorTickSpacing(10);
    heightSlider.setMinorTickSpacing(1);
    heightSlider.setPaintTicks ( true );
    heightSlider.setPaintLabels( true );
    heightSlider.setSnapToTicks( true );

    
    heightPanel =new JPanel();
    heightPanel.setLayout( new BoxLayout(	heightPanel, BoxLayout.Y_AXIS ) );
    heightPanel.add( new JLabel("Your Height") );
    heightPanel.add( heightSlider );
    heightSlider.setPreferredSize( new Dimension( 50, 300) );        
    heightSlider.setName("HeightSlider");
    heightSlider.addChangeListener(this);
        
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
    
    setSize( 200, 400 );
    //setResizable( false );
    setVisible( true );

  }
  
  public  int calculateIdealWeight()
  {
  	int divisor;
  	if( sex.equals("F") )
  		divisor = 30;
  	else
  		divisor = 28;
  		
  	//System.out.println("divisor: " + divisor); 
  	return height * height / divisor;
  }
  
  public void actionPerformed(ActionEvent evt)
  {
  	if( evt.getActionCommand().equals("M") )
  		sex = "M";
  	if( evt.getActionCommand().equals("F") )
  		sex = "F";

  	int result = calculateIdealWeight();
  	resultText.setText( result+"" );
  }
  
  public void stateChanged( ChangeEvent evt )
  {
  	JSlider source;
    source = (JSlider)evt.getSource();
    
    if ( !source.getValueIsAdjusting() )
    {
    	 //System.out.println( source.getValue() );
    	 height = source.getValue();
    	 int result = calculateIdealWeight();
  	   resultText.setText( result + "" );
    }
  	
  }

  public static void main ( String[] args )
  {
    Chap64Ex1 weightApp  = new Chap64Ex1() ;
  }
}
