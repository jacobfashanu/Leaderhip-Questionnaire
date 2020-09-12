import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class DelandDEM extends JFrame implements ActionListener
{
   JButton contButton ;
   


   // constructor for TwoButtons
   public DelandDEM (String title)                           
   {
      super( title );
      JLabel text0 = new JLabel("Delegative-                                ");
      JLabel text = new JLabel("In this leadership style, the leader allows the team members to make the decisions. However, the leader is still responsible");
      JLabel text1 = new JLabel("for the decisions that are made. This is used when team members are able to analyze the situation and determine what needs to");
      JLabel text2 = new JLabel("be done and how to do it. This is important as you cannot do everything! You must set priorities and delegate certain tasks.");
      JLabel text3 = new JLabel("This is not a style so that you can blame others when things go wrong, rather it is a style to be used when you fully trust");
      JLabel text4 = new JLabel("and have confidence in the people you are working with. ");
      JLabel text5 = new JLabel("                                                                                                                                              ");
      JLabel text13 = new JLabel("Participative-                              ");
      JLabel text14 = new JLabel("This leadership style involves the leader including one or more team members in the decision making process.");
      JLabel text15 = new JLabel("However, the leader still maintains the final decision making authority. Using this style is not a sign");
      JLabel text16 = new JLabel("of weakness, rather it is a sign of strength that your team will respect. This leadership type is normally used when");
     // JLabel text17= new JLabel(". n");
      JLabel text18 = new JLabel("you have part of the information and your team members have other parts. A leader is not expected to know everything –this ");
      JLabel text19 = new JLabel("is why you have groupmates that are both knowledgable and skilled. Using this style is of mutual benefit");
      JLabel text20 = new JLabel("as it allows them to feel apart of the team and allows you to make better decisions.");
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
      add( text13 );                      
      add( text14 );
      add( text15 );
      add( text16 );
     // add( text17 );
      add( text18);
      add( text19);
      add( text20);
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
