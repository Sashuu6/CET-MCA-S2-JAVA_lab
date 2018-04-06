import stringeasy.stringfunctions;
import java.io.*;
import java.util.*;

public class se
{
 public static void main(String args[])
 {
  int x,n,p,l;
  char c;
  String s;
  stringfunctions a = new stringfunctions();
  Scanner sc=new Scanner(System.in);
  do
  {
   System.out.println("Enter your choice");
   System.out.println("1.Replicate");
   System.out.println("2.To Uppercase");
   System.out.println("3.To Lowercase");
   System.out.println("4.Substring");
   System.out.println("5.Exit");
   System.out.print("Enter your choice: ");
   x=sc.nextInt();
   if(x==1)
   {
    System.out.println("Enter a character : ");
    c=sc.next().charAt(0);
    System.out.println("Enter number of times: ");
    n=sc.nextInt();
    a.replicate(c,n);
   }
   else if(x==2)
   {
    System.out.println("Enter a lowercase character : ");
    c=sc.next().charAt(0);
    a.upper(c);
   }
   else if(x==3)
   {
    System.out.println("Enter a uppercase character : ");
    c=sc.next().charAt(0);
    a.lower(c);
   }
   else if(x==4)
   {
    s=sc.nextLine();
    System.out.println("Enter a string: ");
    s=sc.nextLine();
    System.out.println("Enter starting position: ");
    p=sc.nextInt();
    System.out.println("Enter length: ");
    l=sc.nextInt();
    a.subst(s,p-1,l);
   }
  }
  while(x<5);
  System.out.println("Thank you");
 }
}
