import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Results2 extends JFrame implements ActionListener
{
   static int authoritarianTally = 0;
   static int participativeTally = 0;
   static int delegativeTally = 0;
   static String result = "";
  
   JLabel text1;
   JLabel text2;
   JLabel text3;
   JLabel text4;
   JButton contA = new JButton("continue");
   JButton contD = new JButton("continue");
   JButton contDEM = new JButton("continue");
   JButton ALL3 = new JButton("continue");
   JButton DelandA = new JButton("continue");
   JButton DelandDEM = new JButton("continue");
   JButton AandDEM = new JButton("continue");
     

     
   public Results2 (String title)                           
   {
      super( title );
      if((authoritarianTally > participativeTally) && (authoritarianTally > delegativeTally))
      {
         result = "authoritarian leader";
      }
      
      else if((authoritarianTally < participativeTally) && (participativeTally > delegativeTally))
      {
         result = "democratic leader";
      }
      
      else if((authoritarianTally < delegativeTally) && (participativeTally < delegativeTally))
      {
         result = "delegative leader";
      }
      else if((authoritarianTally == participativeTally && delegativeTally== participativeTally))
      {
         result = "authoritarian leader, a democratic leader, and also a delegative leader.";
      }
      
      else if((authoritarianTally == delegativeTally))
      {
         result = "a delegative leader and an authoritarian leader";
      }
      else if((authoritarianTally == participativeTally))
      {
         result = "authoritarian leader and a democratic leader";
      }
      else
      {
         result = "delegative leader and a democratic leader";
      }
            
      if(result.equals("authoritarian leader"))
      {     
         text1 = new JLabel("You are an " + result);
         text2 = new JLabel("Click the button to learn more about your leadership style");
         text3 = new JLabel("                                                                                                                                         ");
         add( text1);
         add (text2);
         add(text3 );
         add(contA);
      }
       
      else if(result.equals("delegative leader"))
      {     
         text1 = new JLabel("You are a " + result);
         text2 = new JLabel("Click the button to learn more about your leadership style");
         text3 = new JLabel("                                                                                                                                                     ");
         add( text1);
         add (text2);
         add(text3 );
         add(contD);
      
      }
       
      else if(result.equals("democratic leader"))
      {
         text1 = new JLabel("You are a " + result);
         text2 = new JLabel("Click the button to learn more about your leadership style");
         text3 = new JLabel("                                                                                                                                        ");
         add( text1);
         add (text2);
         add(text3 );
         add(contDEM);
      
      }
      
      else if(result.equals("authoritarian leader, a democratic leader, and also a delegative leader."))
      {
         text1 = new JLabel("You fit in to all the leadership styles which");
         text2 = new JLabel("include authoritarian leader, democratic leader, and");
         text3 = new JLabel("a delegative leader.");
         text4 = new JLabel("                                                                                                                                                                                                     ");
         add( text1);
         add (text2);
         add(text3 );
         
         add(text4);
         add(ALL3);
      }
      
      else if(result.equals("a delegative leader and an authoritarian leader"))
      {
         text1 = new JLabel("You exhibit characteristics of both ");
         text2 = new JLabel(result + "             ");
         text3 = new JLabel("");
         add( text1);
         add (text2);
         add(text3 );
         add(DelandA);
      
      }
      
      else if(result.equals("authoritarian leader and a democratic leader"))
      {
         text1 = new JLabel("You exhibit characteristics of both an ");
         text2 = new JLabel(result + "             ");
         text3 = new JLabel("");
         add( text1);
         add (text2);
         add(text3 );
         add(AandDEM);
      
      }
      
      else
      {
         text1 = new JLabel("You exhibit characteristics of both a ");
         text2 = new JLabel(result + "                 ");
         text3 = new JLabel("");
         add( text1);
         add (text2);
         add(text3 );
         add(DelandDEM);
      
      }
       
   
      
                                                                                                                 
   
      contA.setActionCommand("contA");
      contD.setActionCommand("contD");
      contDEM.setActionCommand("contDEM");
      ALL3.setActionCommand("ALL3");
      DelandA.setActionCommand("DelandA");
      DelandDEM.setActionCommand("DelandDEM");
      AandDEM.setActionCommand("AandDEM");
   
      contA.addActionListener(this);
      contD.addActionListener(this);
      contDEM.addActionListener(this);
      ALL3.addActionListener(this);
      DelandA.addActionListener(this);
      DelandDEM.addActionListener(this);
      AandDEM.addActionListener(this);
   
           
   
      setLayout( new FlowLayout() ); 
      
      setVisible(true);
      setBounds(0, 0,400, 200 );     
     
   
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

   public void actionPerformed( ActionEvent evt)
   {
      if ( evt.getActionCommand().equals( "contA" ) )
      {
         setVisible(false);
         Authoritarian confirm = new Authoritarian ("Authoritarian");
         confirm.setVisible(true);
         confirm.setBounds(400,100,800,400);
        
      }
      else if ( evt.getActionCommand().equals( "contD" ) )
      {
         setVisible(false);
         Delegative confirm = new Delegative ("Delegative");
      
         confirm.setVisible(true);
         confirm.setBounds(400,100,800,400);
      
      
      
      
      }
      else if ( evt.getActionCommand().equals( "contDEM" ) )
      {
         setVisible(false);
         Democratic confirm = new Democratic ("Democratic");
         confirm.setVisible(true);
         confirm.setBounds(400,100,800,400);
      
      
        
      }
      
      else if ( evt.getActionCommand().equals( "ALL3" ) )
      {
         setVisible(false);
         ALL3 confirm = new ALL3 ("ALL");
      
         confirm.setVisible(true);
         confirm.setBounds(400,150,750,550);
      
      
      
      
      }
      else if ( evt.getActionCommand().equals( "DelandA" ) )
      {
         setVisible(false);
         DelandA confirm = new DelandA ("Democratic and Authoritarian");
         confirm.setVisible(true);
         confirm.setBounds(400,150,800,400);
      
      
      }
      
      else if ( evt.getActionCommand().equals( "DelandDEM" ) )
      {
         setVisible(false);
         DelandDEM confirm = new DelandDEM ("Delegative and Democratic");
      
         confirm.setVisible(true);
         confirm.setBounds(400,150,800,400);
      
      
      
      
      
      }
      else 
      {
         setVisible(false);
         AandDEM confirm = new AandDEM ("Authoritarian and Democratic");
         confirm.setVisible(true);
         confirm.setBounds(400,150,750,400);
      
      
      
      }
   
   
                  
   }
  
     

}