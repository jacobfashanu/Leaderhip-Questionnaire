import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Instructions extends JFrame implements ActionListener
{
   JButton contButton ;
   


   // constructor for TwoButtons
   public Instructions(String title)                           
   {
      super( title );
      JLabel text = new JLabel("This questionnaire contains statements that assess your leadership");
      JLabel text1 = new JLabel("style beliefs. After reading each statement you will select");
      JLabel text2 = new JLabel("one of five options that best describes your personal views about that");
      JLabel text3 = new JLabel("sentence. Note that once you select an answer, you AUTOMATICALLY go to the next");
      JLabel text4 = new JLabel("question. You cannot change answers once they have been selected so choose carefully.");
      JLabel text5 = new JLabel("                                                                                                                                                             ");
   
   
      contButton = new JButton("I understand");
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
         setVisible(false);
         Question1 num12 = new Question1 ("Question #1");
         num12.setVisible(true);
         num12.setBounds(500, 300, 400, 200);
      }
   }

}
