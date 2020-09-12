import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Authoritarian extends JFrame implements ActionListener
{
   JButton contButton ;
   


   // constructor for TwoButtons
   public Authoritarian (String title)                           
   {
      super( title );
      JLabel text = new JLabel("This leadership style is used when leaders tell their groupmates what they want done and how they want to accomplish it.");
      JLabel text1 = new JLabel("They do not recieve nor use advice from groupmates. One of the appropiate conditions to use it are when you are short");
      JLabel text2 = new JLabel("on time, and your team is not really interested in completing the task. Some people think of this style as a vehicle");
      JLabel text3 = new JLabel("for yelling, using demeaning language, and leading by threats and abusive power. This is NOT the authoritarian style");
      JLabel text4 = new JLabel("as it is an abusive, unprofessional style called 'bossing around'. ");
      JLabel text5 = new JLabel("                                                                                                                                                             ");
   
   
      contButton = new JButton("Finished");
      contButton.setActionCommand("continue");
   
   
       
   
   
      // register the buttonDemo frame
      // as the listener for both Buttons.
      contButton.addActionListener( this );
      setLayout( new FlowLayout() ); 
      add( text );                      
      add( text1 );
      add( text2 );
      add( text3 );
      add( text4 );
      add( text5 );
      add( contButton );
   
      
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

   public void actionPerformed( ActionEvent evt)
   {
      // check which command has been sent
      if ( evt.getActionCommand().equals( "continue" ) )
      {   
         System.exit(0);
      }
   }

}
