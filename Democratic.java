import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Democratic extends JFrame implements ActionListener
{
   JButton contButton ;
   


   // constructor for TwoButtons
   public Democratic (String title)                           
   {
      super( title );
      JLabel text = new JLabel("This leadership style involves the leader including one or more team members in the decision making process.");
      JLabel text1 = new JLabel("However, the leader still maintains the final decision making authority. Using this style is not a sign of");
      JLabel text2 = new JLabel("weakness rather it is a sign of strength that your team will respect. This leadership type is normally used when");
     // JLabel text3 = new JLabel("");
      JLabel text4 = new JLabel("you have part of the information and your team members have other parts. A leader is not expected to know everything –this ");
      JLabel text5 = new JLabel("is why you have groupmates that have knowledge and are also skilled. Using this style is of mutual benefit");
      JLabel text6 = new JLabel("as it allows them to become part of the team and allows you to make better decisions.");
      JLabel text7 = new JLabel("                                                                                                                                                             ");
   
   
      contButton = new JButton("Finished");
      contButton.setActionCommand("continue");
   
   
       
   
   
      // register the buttonDemo frame
      // as the listener for both Buttons.
      contButton.addActionListener( this );
      setLayout( new FlowLayout() ); 
      add( text );                      
      add( text1 );
      add( text2 );
    //  add( text3 );
      add( text4 );
      add( text5 );
      add( text6 );
      add( text7 );
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
