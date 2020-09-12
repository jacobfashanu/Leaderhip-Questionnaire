import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Question1 extends JFrame implements ActionListener
{
   JCheckBox one = new JCheckBox("Never");
   JCheckBox two = new JCheckBox("Rarely");
   JCheckBox three = new JCheckBox("Occasionally");
   JCheckBox four = new JCheckBox("Frequently");
   JCheckBox five = new JCheckBox("Pretty much Always");
   
   // constructor for TwoButtons
   public Question1 (String title)                           
   {
      super( title );
      JLabel text = new JLabel("1) I always retain the final decision making");
      JLabel text1 = new JLabel("authority within my group.");
      JLabel text2 = new JLabel("                                                                                                              ");
   
      one.setActionCommand( "one" );   // set the  command 
      two.setActionCommand( "two" );
      three.setActionCommand( "three" );   // set the  command 
      four.setActionCommand( "four" );
      five.setActionCommand( "five" );   // set the  command 
   
    
   
   
      // register the buttonDemo frame
      // as the listener for both Buttons.
      one.addActionListener( this );
      two.addActionListener( this );
      three.addActionListener( this );
      four.addActionListener( this );
      five.addActionListener( this );
   
           
   
      setLayout( new FlowLayout() ); 
      add( text ); 
      add( text1 );   
      add( text2 );                  
      add( one );
      add( two );
      add( three );
      add( four );
      add( five );
      setVisible(true);
      setBounds(0, 0,400, 200 );     
     
   
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

   public void actionPerformed( ActionEvent evt)
   {
      // check which command has been sent
      if ( evt.getActionCommand().equals( "one" ) )
      {
         setVisible(false);
         Question2 confirm = new Question2 ("Question #2");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.authoritarianTally = Results2.authoritarianTally + 1;
         ;
      
      }
      else if ( evt.getActionCommand().equals( "two" ) )
      {
         setVisible(false);
         Question2 confirm = new Question2 ("Question #2");
      
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.authoritarianTally = Results2.authoritarianTally + 2;
      
      }
      else if ( evt.getActionCommand().equals( "three" ) )
      {
         setVisible(false);
         Question2 confirm = new Question2 ("Question #2");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.authoritarianTally = Results2.authoritarianTally + 3;
      
      
      }
      else if ( evt.getActionCommand().equals( "four" ) )
      { 
         setVisible(false);
         Question2 confirm = new Question2 ("Question #2");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.authoritarianTally = Results2.authoritarianTally + 4;
      
      }
      else
      {
         setVisible(false);
         Question2 confirm = new Question2 ("Question #2");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.authoritarianTally = Results2.authoritarianTally + 5;
      
      }
             
   }
  
}