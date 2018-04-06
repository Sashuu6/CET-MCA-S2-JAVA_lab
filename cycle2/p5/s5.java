import java.lang.*;
import java.io.*;
import java.util.*;
class s5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,c;
		String x;
		System.out.println("\tEnter number of elements");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("\tEnter the elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		do
		{
			System.out.println("\t1.view element\n\t2.Exit");
			c=sc.nextInt();
			sc.nextLine();
			if(c==1)
			{
				System.out.println("\tEnter the index of element which is to be displayed");
				x=sc.nextLine();
				try
				{
					System.out.println("\telement = "+a[Integer.parseInt(x)]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e.toString());
				}
				catch(NumberFormatException e)
				{
					System.out.println(e.toString());
				}
			}
		}while(c!=2);
	}
}
