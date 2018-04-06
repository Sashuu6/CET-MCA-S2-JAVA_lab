import java.lang.*;
import java.io.*;
import java.util.*;
abstract class abs
{
	double a,b;
	abstract void shape();
}
class circle extends abs
{
	double area;
	void shape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		a=sc.nextDouble();
		area=3.14*a*a;
		System.out.println("Arae of circle= "+area);
	}
}
class rectangle extends abs
{
	double area;
	void shape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		a=sc.nextDouble();
		System.out.println("Enter the breadth");
		b=sc.nextDouble();
		area=a*b;
		System.out.println("Arae of Rectangle= "+area);
	}
}
class triangle extends abs
{
	double area;
	void shape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base length");
		a=sc.nextDouble();
		System.out.println("Enter the height from base to the corner");
		b=sc.nextDouble();
		area=a*b/2;
		System.out.println("Arae of Triangle= "+area);
	}
}
public class s8
{
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\tEnter your choice");
			System.out.println("\t1.Area of Circle\n\t2.Area of Recatangle\n\t3.Area of Triangle\n\t4.Exit");
			x=sc.nextInt();
			if(x==1)
			{
				circle c = new circle();
				c.shape();
			}
			else if(x==2)
			{
				rectangle r = new rectangle();
				r.shape();
			}
			else if(x==3)
			{
				triangle t= new triangle();
				t.shape();
			}
		}while(x<=3);
	}
}
