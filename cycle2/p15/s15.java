import javax.swing.*;  
import java.awt.event.*;  
public class s15 implements ActionListener
{  
	JTextField tf1;  
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,c1,c2,c3,c4,c5,c0;
	/*JButton b[10],c[6];*/
	String s1; 
	int a,x,m,n,p,q;
	s15()
	{  
		JFrame f= new JFrame();  
		tf1=new JTextField("0");  
		tf1.setBounds(20,20,260,40); 
		/*for(i=1;i<10;i++) */
		b1=new JButton("1");  
		b1.setBounds(20,220,50,50);  
		b2=new JButton("2");  
		b2.setBounds(90,220,50,50);
		b3=new JButton("3");  
		b3.setBounds(160,220,50,50); 
		b4=new JButton("4");  
		b4.setBounds(20,150,50,50); 
		b5=new JButton("5");  
		b5.setBounds(90,150,50,50); 
		b6=new JButton("6");  
		b6.setBounds(160,150,50,50); 
		b7=new JButton("7");  
		b7.setBounds(20,80,50,50); 
		b8=new JButton("8");  
		b8.setBounds(90,80,50,50); 
		b9=new JButton("9");  
		b9.setBounds(160,80,50,50); 
		b0=new JButton("0");  
		b0.setBounds(20,290,50,50); 
		c1=new JButton("/");  
		c1.setBounds(230,80,50,50); 
		c2=new JButton("*");  
		c2.setBounds(230,150,50,50); 
		c3=new JButton("-");  
		c3.setBounds(230,220,50,50); 
		c4=new JButton("C");  
		c4.setBounds(90,290,50,50); 
		c5=new JButton("+");  
		c5.setBounds(160,290,50,50); 
		c0=new JButton("=");  
		c0.setBounds(230,290,50,50); 
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
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		c5.addActionListener(this);
		c0.addActionListener(this);  
		f.add(tf1);
		f.add(b7);f.add(b8);f.add(b9);f.add(c1);
		f.add(b4);f.add(b5);f.add(b6);f.add(c2);
		f.add(b1);f.add(b2);f.add(b3);f.add(c3);
		f.add(b0);f.add(c4);f.add(c5);f.add(c0);
		f.setSize(300,360);  
		f.setLayout(null);  
		f.setVisible(true);  
	}         
	public void actionPerformed(ActionEvent e)
	{  
		if(e.getSource()==b1)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+1;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b2)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+2;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b3)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+3;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b4)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+4;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b5)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+5;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b6)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+6;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b7)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+7;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b8)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+8;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b9)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10+9;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==b0)
		{
			s1=tf1.getText();
			a=Integer.parseInt(s1);
			x=a*10;
			tf1.setText(x+"");    
		}
		else if(e.getSource()==c1)
		{
			s1=tf1.getText();
			m=Integer.parseInt(s1);
			p=1;
			tf1.setText("0");    
		}
		else if(e.getSource()==c2)
		{
			s1=tf1.getText();
			m=Integer.parseInt(s1);
			p=2;
			tf1.setText("0");    
		}
		else if(e.getSource()==c3)
		{
			s1=tf1.getText();
			m=Integer.parseInt(s1);
			p=3;
			tf1.setText("0");    
		}
		else if(e.getSource()==c4)
		{
			tf1.setText("0");    
		}
		else if(e.getSource()==c5)
		{
			s1=tf1.getText();
			m=Integer.parseInt(s1);
			p=5;
			tf1.setText("0");    
		}
		else if(e.getSource()==c0)
		{
			s1=tf1.getText();
			n=Integer.parseInt(s1);
			if(p==1)
			{
				if(n==0)
				{
					tf1.setText("MATH ERROR");
				}
				else
				{
					q=m/n;
					tf1.setText(q+"");
				}    
			}
			else if(p==2)
			{
				q=m*n;
				tf1.setText(q+""); 
			}
			else if(p==3)
			{
				q=m-n;
				tf1.setText(q+""); 
			}
			else if(p==5)
			{
				q=m+n;
				tf1.setText(q+""); 
			}
		}
	}  
	public static void main(String[] args) 
	{  
		new s15();  
	}
}
