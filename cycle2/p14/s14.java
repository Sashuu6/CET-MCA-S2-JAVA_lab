import javax.swing.*; 
import java.awt.event.*;   
import java.awt.Color;     
class s14 implements ActionListener   
{    
	JFrame f; 
	JLabel l; 
	JRadioButton p,q,r;  
	s14()
	{    
		f=new JFrame();  
		l=new JLabel("");  
		l.setBounds(75,50, 100,30);     
		p=new JRadioButton(" RED");    
		q=new JRadioButton(" ORANGE");
		r=new JRadioButton(" GREEN");        
		p.setBounds(75,100,100,30);    
		q.setBounds(75,150,100,30); 
		r.setBounds(75,200,100,30);       
		ButtonGroup bg=new ButtonGroup();    
		bg.add(p);bg.add(q); bg.add(r);     
		f.add(p);f.add(q); f.add(r);f.add(l); 
		p.addActionListener(this); 
		q.addActionListener(this);      
		r.addActionListener(this);           
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
	}    
	public void actionPerformed(ActionEvent e)
	{  
		if(p.isSelected()==true)
		{
			l.setText("STOP");  
			l.setForeground(Color.red); 
		}
		if(q.isSelected()==true)
		{
			l.setText("READY");   
			l.setForeground(Color.orange);
		}
		if(r.isSelected()==true)
		{
			l.setText("GO"); 
			l.setForeground(Color.green);   
		}
	}
	public static void main(String[] args) 
	{    
		new s14();    
	}    
}   
