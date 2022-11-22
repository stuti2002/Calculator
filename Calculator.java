/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletsprogrammes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author stuti
 */
public class Calculator extends Frame implements ActionListener{
    Label la,lb,lre;
    TextField ta,tb,tr;
    Button b1;
    Panel p1;
    
    public Calculator()
    {
        super("CALCULATOR");
        
        la = new Label("ENTER A");
        la.setBounds(10,50,150,20);
        lb = new Label("ENTER B");
        lb.setBounds(10,90,150,20);
        lre = new Label("RESULT");
        lre.setBounds(10,130,150,20);
        b1 = new Button("ADD");
        b1.setBounds(50,170,150,20);
        
        
        ta = new TextField(20);
        ta.setBounds(175,50,150,20);
        tb = new TextField(20);
        tb.setBounds(175,90,150,20);
        tr = new TextField(20);
        tr.setBounds(175,130,150,20);
       
        
    
        p1 = new Panel(null);
        add(p1);
        p1.add(la); p1.add(ta);
        p1.add(lb);p1.add(tb);
        p1.add(lre);p1.add(tr);
        p1.add(b1);
        
         setSize(800,600);
         setVisible(true);
         p1.setBackground(Color.CYAN);
         
         
         b1.addActionListener(this);
          }
        
         public void actionPerformed(ActionEvent  e)
         {
             Object obj = e.getSource();
             int a,b,rs;
             
             a= Integer.parseInt(ta.getText());
             b=Integer.parseInt(tb.getText());
             if(obj==b1)
             {
                  rs=a+b;
                  tr.setText(String.valueOf(rs));
             }
             
         }
    
    
    public static void main(String args[])
    {
        Calculator c = new Calculator();
    }

}
