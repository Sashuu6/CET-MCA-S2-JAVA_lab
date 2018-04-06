import java.applet.Applet;  
import java.awt.*;  

public class house extends Applet
{   
 public void paint(Graphics g)
 {  
  g.setColor(Color.blue);
  g.fillRect(0,0,500,500);
  
  g.setColor(Color.green);
  g.fillRect(0,250,500,500);     
  
  g.setColor(Color.white);      
  g.fillRect(100,150,200,100);
  g.drawLine(100,150,200,50);
  g.drawLine(200,50,300,150);
 }  
}
