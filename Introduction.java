import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Introduction extends JFrame implements ActionListener
{
   JButton yesButton ;
   JButton noButton ;



   // constructor for TwoButtons
   public Introduction(String title)                           
   {
      super( title );
      JLabel text = new JLabel("Are you ready to take a questionnaire that");
      JLabel text1 = new JLabel("tells you the leadership style you naturally operate out of?");
      JLabel text2 = new JLabel("                                                                                                             ");
   
      yesButton = new JButton("Yeah");
      noButton = new JButton("Nope");
      yesButton.setActionCommand( "yes" );   // set the  command 
      noButton.setActionCommand( "no" ); // set the  command   
   
   
   
      // register the buttonDemo frame
      // as the listener for both Buttons.
      yesButton.addActionListener( this );
      noButton.addActionListener( this );     
   
      setLayout( new FlowLayout() ); 
      add( text );
      add( text1 ); 
      add( text2 ); 
      add( yesButton );                      
      add( noButton );
            
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

   public void actionPerformed( ActionEvent evt)
   {
      // check which command has been sent
      if ( evt.getActionCommand().equals( "yes" ) )
      {
         setVisible(false);
         Instructions num1 = new Instructions("Instructions");
         num1.setVisible(true);
         num1.setBounds(400, 300, 650, 200);
      }
      else
      {
         System.exit(0);
      }
   }
   

}