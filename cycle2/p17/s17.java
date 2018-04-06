import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
public class s17
{
	public static void main(String args[])
	{
		int ch=0,line=0,word=0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("t17.txt"));
			String lin; 
			int c;
			do 
			{
				lin = br.readLine();
				ch+=lin.length();
				String[] wo = lin.split(" ");
				word+=wo.length;
				++line;
			}while(lin != null);
		}
		catch(Exception e) 
		{	
		}
		System.out.println("Charecter : "+ch);
		System.out.println("Line : "+line);
		System.out.println("Word : "+word);
	}
}
