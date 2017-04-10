/*
author : Mayank Kumar Jha
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/* 
<applet code="calculator.class" width=300 height=300>
</applet>
*/
public class calculator extends Applet implements ActionListener, TextListener

{
 String s="",s1="",s2="",s3="",s4="";
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ok;
 Button add,sub,eq,cl,mul,div;
 TextField t1,t2,t3;
 double a,b,c;int lock=0;
 
 public void init()
 {
  t1=new TextField(10);
  t2=new TextField(10);
  t3=new TextField(15);
  b1=new Button("1");
  b2=new Button("2");
  b3=new Button("3");
  b4=new Button("4");
  b5=new Button("5");
  b6=new Button("6");
  b7=new Button("7");
  b8=new Button("8");
  b9=new Button("9");
  b0=new Button("0");
  add=new Button("+");
  sub=new Button("-");
  mul=new Button("*");
  div=new Button("/");
  eq=new Button("=");
  cl=new Button("Clear");
  ok=new Button("OK");
  
  
  
  GridLayout gb=new GridLayout(4,5);
  setLayout(gb);
  

  add(t1);
  add(t2);
  add(t3);
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
  add(b6);
  add(b7);
  add(b8);
  add(b9);
  add(b0);
  add(add);
  add(sub);
  add(mul);
  add(div);
  add(eq);
  add(cl);
  add(ok);
  
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b0.addActionListener(this);
  add.addActionListener(this);
  sub.addActionListener(this);
  mul.addActionListener(this);
  div.addActionListener(this);
  eq.addActionListener(this);
  cl.addActionListener(this);
  ok.addActionListener(this);
  paint();
  
  
  
  
 }
 public void paint()
 {
  setBackground(Color.green);
 }
 
 public void actionPerformed(ActionEvent e)
 {
  s=e.getActionCommand();
  if(s.equals("0")||s.equals("1")||s.equals("2")||
s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||
s.equals("9")||s.equals("0")||s.equals("OK"))
  { 
  if(s.equals("OK")){lock=1;}
   if(lock==0){
	   s1=s1+s;
	 t1.setText(s1);
   }
   else if(!s.equals("OK")){
	   s2=s2+s;
	   t2.setText(s2);
   }
  }
  if(s.equals("+"))
  {
          s3="+";
  }
  else if(s.equals("-"))
  {
     s3="-";
  }
  else if(s.equals("*"))
  {
     s3="*";
  }
  else if(s.equals("/"))
  {
     s3="/";
  }
  else if(s.equals("="))
  {
	if(!s3.equals("")){
   a=Double.parseDouble(t1.getText());
   b=Double.parseDouble(t2.getText());
   if(s3.equals("+"))
    c=a+b;
   else if(s3.equals("-"))
    c=a-b;
   else if(s3.equals("*"))
    c=a*b;
   else if(s3.equals("/"))
    c=a/b;
   
	t3.setText(String.valueOf(c));}
   else{t3.setText("No operation");}
  }
  
  if(s.equals("Clear"))
  {
   t1.setText("");
   t2.setText("");
   t3.setText("");
   s1="";
   s2="";
   s3="";
   lock=0;
  }
 }
 public void textValueChanged(TextEvent e)
 {
  
 }
}
