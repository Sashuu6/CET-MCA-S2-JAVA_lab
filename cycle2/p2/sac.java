import squareandcube.square;
import squareandcube.cube;
import java.lang.*;
import java.io.*;
import java.util.*;

public class sac
{
 public static void main(String args[])
 {
  int x,n;
  square a = new square();
  cube b = new cube();
  Scanner sc=new Scanner(System.in);
  do
  {
   System.out.println("1.Square");
   System.out.println("2.Cube");
   System.out.println("3.Exit");
   System.out.print("Enter your choice: ");
   x=sc.nextInt();
   if(x==1)
   {
    System.out.print("Enter a number: ");
    n=sc.nextInt();
    a.sq(n);
   }
   else if(x==2)
   {
    System.out.print("Enter a number: ");
    n=sc.nextInt();
    b.cu(n);
   }
  }
  while(x<=2);
  System.out.println("Thank you");
 }
}
