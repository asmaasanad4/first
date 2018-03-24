  
package calculate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calculate extends JFrame {

    JButton count[];
    JTextField jt ;
    JPanel p1 , p2;
    double num1 ;
    double num2 ;
    double result ;
    String operator ;
    
    public Calculate(){
         String [] s ={ "1","2","3","4","5","6","7","8","9","C","0","=","+","*","/","-"};
        count =new JButton[16];
        p1 = new JPanel();
        jt = new JTextField();
        p2 = new JPanel(new BorderLayout());
         p1.setLayout(new GridLayout(4, 4));
        for(int i =0;i<16;i++){
            
             p1.add(count[i] = new JButton(s[i]));
        }
       
        
        count[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[0].getText();
             jt.setText(a);   
            }
        });
        
        count[1].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[1].getText();
             jt.setText(a);   
            }
        });
        count[2].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[2].getText();
             jt.setText(a);   
            }
        });
        count[3].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[3].getText();
             jt.setText(a);   
            }
        });
        count[4].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[4].getText();
             jt.setText(a);   
            }
        });
        count[5].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[5].getText();
             jt.setText(a);   
            }
        });
        count[6].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[6].getText();
             jt.setText(a);   
            }
        });
        count[7].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[7].getText();
             jt.setText(a);   
            }
        });
        count[8].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[8].getText();
             jt.setText(a);   
            }
        });
               ////////////clear/////////
        count[9].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                  jt.setText("");
             }
         });
        ///////////zero//////////
        count[10].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             String a ;
             a = jt.getText()+ count[10].getText();
             jt.setText(a);   
            }
        });
      /////////////////equal//////////
        count[11].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
            String answer ;
                   num2 = Double.parseDouble(jt.getText());
                   jt.setText("");
                   
                   jt.setText(""+num2);
                   if (operator == "+"){
                       result = num1 + num2 ;
                     jt.setText(""+result);
                 }
                   else if (operator == "/"){
                       result = num1 / num2 ;
                     jt.setText(""+result);
                   }
                   else if (operator == "*"){
                     result = num1 * num2 ;
                     jt.setText(""+result);
                   }
                   else if (operator == "-"){
                     result = num1 - num2 ;
                     jt.setText(""+result);
                   }
             }
         });
        count[12].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
              num1 = Double.parseDouble(jt.getText());
                jt.setText("");
                operator = "+";
             }
         });
        count[13].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
              num1 = Double.parseDouble(jt.getText());
                jt.setText("");
                operator = "*";
               
             }
         });
        count[14].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
               num1 = Double.parseDouble(jt.getText());
                jt.setText("");
                operator = "/";
             
             }
         });
        count[15].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
               num1 = Double.parseDouble(jt.getText());
                jt.setText("");
                operator = "-";
             
             }
         });
        
        p2.add(jt , BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.CENTER);
      
    }


    public static void main(String[] args) {

        Calculate d = new Calculate();

        d.setSize(350, 300);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setTitle("calculator");
        d.setLocationRelativeTo(null);

    }
  
}


