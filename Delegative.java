import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Delegative extends JFrame implements ActionListener
{
   JButton contButton ;
   


   // constructor for TwoButtons
   public Delegative (String title)                           
   {
      super( title );
      JLabel text = new JLabel("In this leadership style, the leader allows the team members to make the decisions. However, the leader is still responsible");
      JLabel text1 = new JLabel("for the decisions that are made. This is typically used when team members are able to analyze the situation and determine what");
      JLabel text2 = new JLabel("needs to be done and how to do it. You cannot do everything! You must set priorities and delegate certain tasks. This is not a style");
      JLabel text3 = new JLabel("used to blame others when things go wrong, rather this is a style to be used when you fully trust and have confidence");
      JLabel text4 = new JLabel("in the people you are working with.");
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
