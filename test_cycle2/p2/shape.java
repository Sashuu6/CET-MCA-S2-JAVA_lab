import java.applet.Applet;  
import java.awt.*;  

public class shape extends Applet
{   
 public void paint(Graphics g)
 {  
  g.setColor(Color.black);
  g.fillRect(0,0,500,500);     
  g.setColor(Color.green);      
  g.drawRect(100,100,60,60);
  g.drawOval(200,100,60,60);
  g.drawOval(300,100,120,60);
 }  
}
