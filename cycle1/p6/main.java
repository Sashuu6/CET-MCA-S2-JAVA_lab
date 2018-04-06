import java.util.*;
public class main
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  str str=new str();
  int ch;
  String a,b;
  char[] c; 
  System.out.print("Input string1: ");
  a=sc.nextLine();
  System.out.print("Input string2: ");
  b=sc.nextLine();
  System.out.println("STRING FUNCTIONS:-");
  System.out.println("1. String space removal");
  System.out.println("2. String concatination");
  System.out.println("3. String reversal");
  System.out.print("Input choice: ");
  ch=sc.nextInt();
  switch(ch)
  {
   case 1: str.str_op(a);
     	   break;
   case 2: System.out.println(str.str_op(a,b));
    	   break;
   case 3: c=a.toCharArray();
           str.str_op(c);
    	   break;
   default: System.out.println("Wrong choice");
            break;
  }
 }
}
