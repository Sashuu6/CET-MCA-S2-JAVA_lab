import java.util.Scanner;
public class arith
{
 private int x,y,ch1,ch2;
 private float r;
 Scanner sc=new Scanner(System.in);	
 public arith()
 {
  do
  {
   System.out.print("Enter x= ");
   x=sc.nextInt();
   System.out.print("Enter y= ");
   y=sc.nextInt();
   System.out.println("Calculator:-");
   System.out.println("1. Addition");
   System.out.println("2. Subtraction");
   System.out.println("3. Multiplication");
   System.out.println("4. Division");
   System.out.println("Enter your choice: ");
   ch1=sc.nextInt();
   switch(ch1)
   {
    case 1: add();
            break;
    case 2: sub();
     	    break;
    case 3: mul();
    	    break;
    case 4: div();
            break;
    default: System.out.println("Wrong choice");
             break;
   }
   System.out.println("Do you wish to continue? y==1 : n==0");
   ch2=sc.nextInt();
  }
  while(ch2==1);
 }
 public void add()
 {
   System.out.println("Addition:-");
   r=(float)(x+y);
   System.out.println("Result: "+r);
 }
 public void sub()
 {
  System.out.println("Subtraction:-");
   r=(float)(x-y);
   System.out.println("Result: "+r);
 }
 public void mul()
 {
  System.out.println("Multiplicaton:-");
   r=(float)(x*y);
   System.out.println("Result: "+r);
 }
 public void div()
 {
  System.out.println("Division:-");
   r=(float)(x/y);
   System.out.println("Result: "+r);
 } 
 public void finalize()
 {
 }
}
