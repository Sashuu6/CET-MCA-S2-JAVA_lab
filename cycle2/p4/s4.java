import java.util.*;
import java.io.*; 
interface EMPInterface
	{
 		 public void displayEMP();
 		 public void giveBonus(double amount);
	}
abstract class Employee
	{
		  int empID;
 		 String fName,lName;
 		 double salary;
                 public Employee(int a,String b,String c,float d)
                 {  
                    empID=a;fName=b;lName=c;salary=d;
                 }
	}
public class s4 extends Employee implements EMPInterface
	{
  		public void displayEMP()
 			{
  				 System.out.println("Emp Id:"+empID+"\nEmp Name:"+fName+" "+lName+"\nSalary:"+salary);
 			}
 		 public void giveBonus(double amount)
 			{
                              try
                               {
 				  if(amount<=0)
  				    throw new BonusException();
  				 else
   				   salary=salary+amount;
                                }
  				 catch(BonusException e)
     					  {
     				           System.out.println(e);
     					  }
			 }

                 public s4(int a,String b,String c,float d)
                        {
                              super(a,b,c,d);
                        }

 		public static void main(String args[])
 			{         

                                  Scanner s = new Scanner(System.in);
 				  s4 m = new s4(911,"Sashwat","K",10000);
                                  double bonus;
                                  System.out.print("Enter the bonous amount:");
                                  bonus=s.nextDouble();
                                  m.giveBonus(bonus);
                                  m.displayEMP();
 			 }

	}
class BonusException extends Exception
	{
   		public String toString()
 			 {
  				   return ("Bonus Exception !\nBonus Amount Can't Be Zero or Negative !\n") ;
  			}

	}
   
