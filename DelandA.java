import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class DelandA extends JFrame implements ActionListener
{
   JButton contButton ;
   


   // constructor for TwoButtons
   public DelandA (String title)                           
   {
      super( title );
      JLabel text0 = new JLabel("Delegative-                 ");
      JLabel text = new JLabel("In this leadership style, the leader allows the team members to make the decisions. However, the leader is still responsible");
      JLabel text1 = new JLabel("for the decisions that are made. This is used when team members are able to analyze the situation and determine what needs to");
      JLabel text2 = new JLabel("be done and how to do it. This is very important since you cannot do everything! You must set priorities and delegate certain tasks.");
      JLabel text3 = new JLabel("This is not a style you use to blame others when things go wrong, rather this is a style to be used when you fully trust and");
      JLabel text4 = new JLabel("have confidence in the people you are working with. ");
      JLabel text5 = new JLabel("                                                                                                                                                             ");
      JLabel text6 = new JLabel("Authoritarian-               ");
      JLabel text7 = new JLabel("This leadership style is used when leaders tell their team members what they want done and how they want to accomplish it.");
      JLabel text8 = new JLabel("they do not receive nor use advice from groupmates. Some of the appropiate conditions to use it are when you are short");
      JLabel text9 = new JLabel("on time, and your team are not really interested in completing the task. Some people think of this style as a vehicle for");
      JLabel text10 = new JLabel("yelling, using demeaning language, and leading by threats and abusive power. This is NOT the authoritarian style as it");
      JLabel text11 = new JLabel("is an abusive, unprofessional style called 'bossing around'. ");
      JLabel text12 = new JLabel("                                                                                                                                                             ");
      JLabel text21 = new JLabel("                                                                                                                                                             ");
   
   
   
   
   
      contButton = new JButton("Finished");
      contButton.setActionCommand("continue");
   
   
       
   
   
      // register the buttonDemo frame
      // as the listener for both Buttons.
      contButton.addActionListener( this );
      setLayout( new FlowLayout() ); 
      add( text0 );
      add( text );                      
      add( text1 );
      add( text2 );
      add( text3 );
      add( text4 );
      add( text5 );
      add( text6 );                      
      add( text7 );
      add( text8 );
      add( text9 );
      add( text10 );
      add( text12);
      add( text21);
   
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
