import java.lang.*;
import java.io.*;
import java.util.*;
class Bank
{
int id,bal,amt;
Bank(int id,int bal)
{
this.id=id;
this.bal=bal;
}
void balance()
{
System.out.println("ID = "+id);
System.out.println("BALANCE = "+bal);
}
void deposit()
{
Scanner sc=new Scanner(System.in);
try
{
System.out.println("Enter the amount to be deposited");
amt=sc.nextInt();
if(amt<0)
{
throw new NegativeAmountException("The entered value is negative "+amt);
}
else
{
bal=bal+amt;
System.out.println("Transaction successfull Balance = "+bal);
}
}
catch(NegativeAmountException e)
{
System.out.println(e);
}
}
void withdraw()
{
Scanner sc=new Scanner(System.in);
try
{
System.out.println("Enter the amount to be withdrawn");
amt=sc.nextInt();
if(amt<0)
{
throw new NegativeAmountException("The entered value is negative "+amt);
}
else if(amt>bal)
{
throw new InsufficientAmountException("The entered amount is insufficient "+amt);
}
else
{
bal=bal-amt;
System.out.println("Transaction successfull Balance = "+bal);
}
}
catch(NegativeAmountException e)
{
System.out.println(e);
}
catch(InsufficientAmountException e)
{
System.out.println(e);
}
}
}
class s7 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,c;
System.out.println("\tEnter your id");
n=sc.nextInt();
Bank b= new Bank(n,10000);
do
{
System.out.println("\t1.Deposit\n\t2.Withdraw\n\t3.Balance\n\t4.Exit");
c=sc.nextInt();
if(c==1)
{
b.deposit();
}
else if(c==2)
{
b.withdraw();
}
else if(c==3)
{
b.balance();
}
}while(c!=4);
}
}
class NegativeAmountException extends Exception
{
	String s;
	NegativeAmountException( String s)
	{
		this.s=s;
	}
	public String toString()
	{
		return "NegativeAmountException  "+s;
	}
}
class InsufficientAmountException extends Exception
{
	String s;
	InsufficientAmountException( String s)
	{
		this.s=s;
	}
	public String toString()
	{
		return "InsufficientAmountException  "+s;
	}
}
