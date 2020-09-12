import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Results1 extends JFrame implements ActionListener
{
   JButton one = new JButton("Ok");
     
   public Results1 (String title)                           
   {
      super( title );
      JLabel text = new JLabel(" Thats the end of the questionnaire.");
      JLabel text0 = new JLabel("Here are your results");
      JLabel text1 = new JLabel("                                                                                                                                               ");
  
      one.addActionListener( this );
        
           
   
      setLayout( new FlowLayout() ); 
      add( text ); 
      add( text0);
      add( text1 );                   
      add( one );
      setVisible(true);
      setBounds(0, 0,400, 200 );     
     
   
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

   public void actionPerformed( ActionEvent evt)
   {
      
         setVisible(false);
         Results2 confirm = new Results2 ("Here is what you've been waiting for!");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
      
                  
   }
   
   public static void main(String [] args)
   {
   
      Results1 demo  = new Results1 ( "Organizational Design Preference" ) ;
      demo.setBounds(0, 0,400, 200 );     
      demo.setVisible( true ); 
   }
  
}