import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calc extends Applet 
{
 TextField t1,t2,t3;
 Button add,sub,mul,div,b[]=new Button[10];
 int i;
 public void init()
 {
  t1=new TextField(20);
  add(t1);
  t2=new TextField(20);
  add(t2);
  t3=new TextField(20);
  add(t3);
  add=new Button("+");
  add(add);
  add.setPreferredSize(new Dimension(50, 50));
  sub=new Button("-");
  add(sub);
  sub.setPreferredSize(new Dimension(50, 50));
  mul=new Button("*");
  add(mul);
  mul.setPreferredSize(new Dimension(50, 50));
  div=new Button("/");
  add(div);
  div.setPreferredSize(new Dimension(50, 50));
  for(i=0;i<10;++i)
  {
   b[i]=new Button(i+"");
   b[i].setPreferredSize(new Dimension(50, 50));
   add(b[i]);
  } 
 }
}
