import java.awt.*; 
import java.io.*;
import java.util.*;
class file 
{
	Frame f;
	int x,y,i;
	file()
	{
		f = new Frame();
		x=0;
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("t16.txt"));
			String s;
			do
			{
				s=br.readLine();
				String[] a= s.split(",");
				y=a.length;
				for(i=0;i<(a.length);i++)
				{
					Label l = new Label(a[i]);
					f.add(l);
				}
				x++;
			}while(s!=null);
		}
		catch (Exception e )
		{
		}
		f.setSize(500,500);    
		f.setLayout(new GridLayout(x,y));    
		f.setVisible(true);    
	}
}
class s16
{
	public static void main(String[] args) 
	{    
		file f= new file();
	}    
}
