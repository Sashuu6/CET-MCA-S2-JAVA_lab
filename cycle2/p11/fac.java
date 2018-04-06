import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class fac  extends Applet implements ActionListener
{
  TextField t1,t2,t3;
  Button add,sub,mul,div;
  int i;
  public void init()
  {
 
    t1=new TextField(20);
    
    add(t1);
     
  
    t3=new TextField(20);
    add(t3);
     add=new Button("Result");
     add(add);
    
     
     add.addActionListener(this);
   
    
  }
  public void actionPerformed(ActionEvent e)
  {
    int a,b,i,fac=1;
    a=Integer.parseInt(t1.getText());
   
    for(i=1;i<=a;++i)
    {
      fac*=i;
    }
    if(e.getSource()==add)
    {
      t3.setText("Factorial = "+fac+"");
    }
   
    
  }

}
